class HashObject
  def initialize
    @props = Hash.new
  end
  def method_missing(method, *args, &block)
    #���Ϊ��������ת��Ϊ�ַ���
    args[0] = args[0].to_s if (method == :[] or method == :[]=) && args[0].is_a?(Integer)

    # �ֵ��[], []= ����
    return @props.send method, *args, &block if method == :[] or method == :[]=
    # �ֵ��each, each_key����
    return @props.send method, *args, &block if [:each, :each_key, :each_value, :each_pair].include? method 
    
    # ӳ������_1��['1'], ['1']= ����
    return @props[method.to_s.split('=').first.split('_').last] = args[0] if method.to_s =~ /_+\d+\=/
    return @props[method.to_s.split('_').last] if method.to_s =~ /_+\d+/
    
    # ӳ�����Ե�[], []=����
    return @props[method.to_s.split('=').first] = args[0] if method.to_s =~ /_*\w+\=/
    return @props[method.to_s] if method.to_s =~ /_*\w+/
    
    super
  end
end