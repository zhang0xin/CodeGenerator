#encoding:utf-8
class Page
  attr_accessor :page_name, :page_comment, :class_name, :class_comment, :input_items
  
  def initialize
    @input_items = []
  end
  
  def input_items_with_details()
    @input_items.collect {|item| item if !item.details.to_s.empty?}.compact
  end
  
  def input_items_with_reference()
    @input_items.collect {|item| item if !item.reference.to_s.empty?}.compact
  end
  
  def has_details?()
    if @has_details.nil? then
      @has_details = input_items_with_details.size > 0
    end
    @has_details
  end
  
  def has_reference?()
    if @has_reference.nil? then
      @has_reference = input_items_with_reference.size > 0
    end
    @has_reference
  end
  
  def has_currency_input?
    if @has_currency.nil? then
      currItems = @input_items.collect {|item| item.type == 'currency'}
      @has_currency = currItems.size > 0
    end
    @has_currency
  end
  
  def deep_clone
    Marshal::load(Marshal.dump(self))
  end
  
  def concat_names
    names = ''
    @input_items.each do |item|
      concat_it = true
      concat_it = yield item if block_given?
      names += item.name + ", " if concat_it
    end
    names[0, names.length-2]
  end
  
  def queryable_fields
    concat_names{|item| item.queryable}
  end
  
  def tableable_fields
    concat_names{|item| item.tableable }
  end
  
  def editable_fields
    names = ''
    @input_items.each do |item|
      next if !item.editable
      names += item.name
      names += "WithUnit" if item.tags.include? 'has_unit'
      names += ", "
    end
    names[0, names.length-2]
  end
  
  def set_queryable queryable_config
    @input_items.each do |item|
      item.queryable = false
      if queryable_config.has_key? item.name then
        item.queryable = queryable_config[item.name]
      end
    end
  end
  
  def set_tableable tableable_config
    @input_items.each do |item|
      item.tableable = false
      item.tableable = tableable_config[item.name] if tableable_config.has_key? item.name
    end
  end
  
  def set_editable editable_config
    @input_items.each do |item|
      item.editable = false
      item.editable = editable_config[item.name] if editable_config.has_key? item.name
    end
  end
end

class InputItem
  attr_accessor :name, :comment, :type, :java_type, :type_length, :range, :reference, :details, :tags, \
    :queryable, :tableable, :editable
  
  def initialize
    @queryable = true
    @tableable = true
    @editable = true
    @is_key = false;
  end
  
  def is_key
    @is_key
  end
  def is_key=(value)
    @is_key = value
    if @is_key
      @queryable = false
      @tableable = false
      @editable = false
    end
  end
  
  def get_digits_length
    return @type_length.split(",").each(){|s| s.strip!}[0]
  end
  def get_precision_length
    return @type_length.split(",").each(){|s| s.strip!}[1]
  end
end