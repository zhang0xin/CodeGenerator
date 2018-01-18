#encoding:utf-8
require File.join(File.dirname(__FILE__),'hashobject')
require File.join(File.dirname(__FILE__),'table')
require File.join(File.dirname(__FILE__),'entity')
require File.join(File.dirname(__FILE__),'page')
require File.join(File.dirname(__FILE__),'nameformatter')
require File.join(File.dirname(__FILE__),'typeconvertor')

class ParamLoader
  def self.create_table(param)
    table = Table.new
    field_name_formatter = DbFieldNameFormatter.new
    table_name_formatter = DbTableNameFormatter.new
    param.each do |key, value|
      if value.key == 'table' or value.key == 'view'
        table.name = table_name_formatter.format(value.name)
        table.comment = value.comment
        table.comment += "(#{param.long_comment})" if !param.long_comment.to_s.empty?
      elsif value.key == 'id' or value.key == 'field'
        field = Field.new
        field.name = field_name_formatter.format(value.name)
        field.type = TypeConvertor.get_database_type(value.type)
        field.type_length = value.type_length
        field.comment = value.comment
        field.comment += "(#{value.long_comment})" if !value.long_comment.to_s.empty?
        field.comment = "#{value.category}: " + field.comment if !value.category.to_s.empty?
        field.is_key = value.key == 'id'
        field.tags = value.tags.to_s.chomp.split(",").each(){|s| s.strip!}
        table.fields.push field
      end
    end
    table
  end
  
  def self.create_entity(param)
    entity = Entity.new
    class_name_formatter = ClassNameFormatter.new
    property_name_formatter = PropertyNameFormatter.new
    
    param.each do |key, value|
      if value.key == 'table' or value.key == 'view'
        entity.class_name = class_name_formatter.format(value.name)
        entity.class_comment = value.comment
      elsif value.key == 'id' or value.key == 'field'
        objprop = Property.new
        objprop.name = property_name_formatter.format(value.name)
        objprop.comment = value.comment
        objprop.type = value.type
        objprop.java_type = TypeConvertor.get_java_type(value.type)
        objprop.generic_type = TypeConvertor.get_generic_type(value.type)
        objprop.type_length = value.type_length
        objprop.range = value.range.to_s.chomp.split(",").each(){|s| s.strip!}
        objprop.range_code = value.range_code.nil? ? '' : value.range_code
        objprop.reference = class_name_formatter.format(value.reference)
        objprop.details = class_name_formatter.format(value.details)
        objprop.tags = value.tags.to_s.chomp.split(",").each(){|s| s.strip!}
        objprop.is_key = value.key == 'id'
        entity.properties.push objprop
      end
    end
    entity
  end
  
  def self.create_page_from_entity(entity)
    page = Page.new
    page.page_name = entity.class_name; 
    page.page_comment = entity.class_comment
    page.class_name = entity.class_name
    page.class_comment = entity.class_comment
    entity.properties.each do |property|
      input = InputItem.new
      input.name = property.name
      input.comment = property.comment
      input.type = property.type
      input.java_type =  property.java_type
      input.type_length = property.type_length
      input.range = property.range
      input.reference = property.reference
      input.details = property.details
      input.tags = property.tags
      input.is_key = property.is_key
      page.input_items.push input
    end
    page
  end
  
  def self.create_page_from_config(pages, param)
    class_name_formatter = ClassNameFormatter.new
    property_name_formatter = PropertyNameFormatter.new
    
    base_page = nil
    param.each {|key, value| base_page = pages[value.name.downcase].deep_clone if value.key == 'base_page'}
    page = base_page.deep_clone if !base_page.nil?
    
    queryable_config = Hash.new
    tableable_config = Hash.new
    editable_config = Hash.new
    
    param.each do |key, value|
      if value.key == 'page'
        page.page_name = class_name_formatter.format(value.name)
        page.page_comment = value.comment
      elsif value.key == 'field'
        name = property_name_formatter.format(value.name)
        queryable_config[name] = value.query.to_s.upcase.strip[0] == 'T'
        tableable_config[name] = value.table.to_s.upcase.strip[0] == 'T'
        editable_config[name] = value.edit.to_s.upcase.strip[0] == 'T'
      end
    end
    page.set_queryable queryable_config
    page.set_tableable tableable_config
    page.set_editable editable_config
    page
  end
  
  def self.load_from_text(dir)
    paramDir = HashObject.new
    Dir[dir].each() do |file|
      file_name = file.split(".")[0].split("/").last.downcase
      paramDir[file_name] = read_file file
    end
    paramDir
  end
  
  def self.read_file file
    paramFile = HashObject.new
    lines = IO.readlines file
    col_names = lines[0].chomp.split("\t")
    
    lines.each_with_index do |line, idx|
      next if idx == 0
      paramFile["#{idx-1}"] = read_line col_names, line
    end
    paramFile
  end
  
  def self.read_line name_defs, line
    paramLine = HashObject.new
    line.chomp.split("\t").each_with_index do |cell, idx_cell|
      paramLine[name_defs[idx_cell]] = cell.to_s.strip.gsub(/^\"|\"$/, '')
    end
    paramLine
  end
end