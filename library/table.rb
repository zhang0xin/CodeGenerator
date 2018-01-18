#encoding:utf-8
class Table
  attr_accessor :fields, :name, :comment
  
  def initialize
    @fields = []
  end 
end

class Field
  attr_accessor :name, :full_type, :type, :type_length, :comment, :category, :is_key, :tags
  
  def get_full_type()
    return @type if @type_length.empty?
    return "#{@type}(#{@type_length})"
  end
end