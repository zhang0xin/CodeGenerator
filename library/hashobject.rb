#encoding:utf-8
class HashObject < Hash
  def child name
    self[name] = HashObject.new
  end
  def method_missing method, *args, &block
    return self[method.to_s.delete '='] = args[0] if method.to_s =~ /_*\w+\=/
    return self[method.to_s.delete '='] if method.to_s =~ /_*\w+/
  end
end
