require "test/unit"
require_relative 'library/hashobject'

class TestHastable < Test::Unit::TestCase
   def test_methods
     hobj = HashObject.new
     hobj['prop1'] = 'property 1'
     assert_equal 'property 1', hobj['prop1']

     hobj.prop1 = 'pppp'
     assert_equal 'pppp', hobj.prop1
     hobj.prop2 = 'property 2'
     assert_equal 'property 2', hobj['prop2']

     hobj.arr1 = [1, 2, 3]
     assert_equal [1, 2, 3], hobj.arr1

     hobj.child('iobj').iprop0 = 'iprop0 value'
     assert_equal 'iprop0 value', hobj.iobj.iprop0
     hobj.iobj.iprop1 = 'inner prop1'
     assert_equal 'inner prop1', hobj.iobj.iprop1
   end
end
