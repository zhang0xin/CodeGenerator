class TypeConvertor
  @@java_types = Hash[
    'string' => 'java.lang.String',
    'currency' => 'java.lang.String',
    'digits' => 'java.lang.Long',
    'number' => 'java.lang.Double',
    'date' => 'java.util.Date',
    'datetime' => 'java.util.Date'
  ]
  @@database_types = Hash[
    'string' => 'NVARCHAR2',
    'currency' => 'NVARCHAR2',
    'digits' => 'NUMBER',
    'number' => 'NUMBER',
    'date' => 'DATE',
    'datetime' => 'DATE'
  ]
  
  @@generic_types = Hash[
    'string' => 'TString',
    'currency' => 'TString',
    'digits' => 'TLong',
    'number' => 'TDecimal',
    'date' => 'TDate',
    'datetime' => 'TDate'
  ]
  
  def self.get_java_type(original_type)
    return @@java_types[original_type.downcase]
  end
  
  def self.get_database_type(original_type)
    return @@database_types[original_type.downcase]
  end
  
  def self.get_generic_type(original_type)
    return @@generic_types[original_type.downcase]
  end
  
  def self.get_database_type_with_length(original_type, type_length)
    return get_database_type(original_type) if @type_length.nil? or @type_length.empty?
    return "#{original_type}(#{type_length})"
  end
end