#encoding:utf-8
class HashObject
  def initialize
    @props = Hash.new
  end
  def method_missing(method, *args, &block)
    #如果为数字索引转换为字符串
    args[0] = args[0].to_s if (method == :[] or method == :[]=) && args[0].is_a?(Integer)

    # 字典的[], []= 方法
    return @props.send method, *args, &block if method == :[] or method == :[]=
    # 字典的each, each_key方法
    return @props.send method, *args, &block if [:each, :each_key, :each_value, :each_pair].include? method 
    
    # 映射属性_1到['1'], ['1']= 方法
    return @props[method.to_s.split('=').first.split('_').last] = args[0] if method.to_s =~ /_+\d+\=/
    return @props[method.to_s.split('_').last] if method.to_s =~ /_+\d+/
    
    # 映射属性到[], []=方法
    return @props[method.to_s.split('=').first] = args[0] if method.to_s =~ /_*\w+\=/
    return @props[method.to_s] if method.to_s =~ /_*\w+/
    
    super
  end
end