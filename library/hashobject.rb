#encoding:utf-8
class HashObject < Hash
  def object name
    self[name] = HashObject.new
  end
  def property name, value
    self[name] = value
  end
  def array name, arr
    self[name] = arr
  end
  def method_missing method, *args, &block
    return self[method.to_s.delete '='] = args[0] if method.to_s =~ /_*\w+\=/
    return self[method.to_s.delete '='] if method.to_s =~ /_*\w+/
  end
end
