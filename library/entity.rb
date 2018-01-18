class Entity
  attr_accessor :class_name, :class_comment, :properties
  
  def initialize
    @properties = []
  end
end

class Property
  attr_accessor :name, :comment, :type, :java_type, :generic_type, :type_length, :range, :range_code, :reference, :details, :tags, :is_key
  def get_digits_length
    return @type_length.split(",").each(){|s| s.strip!}[0]
  end
  def get_precision_length
    precision = @type_length.split(",").each(){|s| s.strip!}[1]
    precision = (precision.nil? or precision.empty?)? "3" : precision
    return precision
  end
end