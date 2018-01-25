#encoding:utf-8
require 'oci8'
require "test/unit"
require_relative 'library/hashobject'

class TestOracle < Test::Unit::TestCase
  def test_oracle
    session = OCI8.new('tgacdxj', 'tgacdxj', 'tgacetm')
    cursor = session.exec('select * from jx_spec')
    row = cursor.fetch
    puts row
    cursor.close
    session.logoff
  end
end
