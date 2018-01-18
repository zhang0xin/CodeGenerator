class NameFormatter
  def lower_camel_case(original_str)
    return original_str.to_s.downcase.gsub(/\s\w/) {|s| s.upcase.lstrip }
  end
  def upper_camel_case(original_str)
    return original_str.to_s.downcase.gsub(/^\w|\s\w/) {|s| s.upcase.lstrip }
  end
  def under_score_case(original_str)
    return original_str.to_s.downcase.gsub(/\s/) {|s| s='_' }
  end
end
class DbFieldNameFormatter < NameFormatter
  def format(original_str)
    return original_str if original_str.downcase == 'f0'
    return 'f' + under_score_case(original_str)
  end
end
class DbTableNameFormatter < NameFormatter
  def format(original_str)
    return under_score_case(original_str)
  end
end
class ClassNameFormatter < NameFormatter
  def format(original_str)
    return upper_camel_case(original_str)
  end
end
class PropertyNameFormatter < NameFormatter
  def format(original_str)
    return lower_camel_case(original_str)
  end
end