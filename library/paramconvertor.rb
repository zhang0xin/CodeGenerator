#encoding:utf-8
require 'oci8'
require 'dbi'
require File.join(File.dirname(__FILE__),'hashobject')
class ParamConvertor
  def get_table_define username, password, tnsname
    tables = []

    dbh = DBI.connect('DBI:OCI8:' +  tnsname, username, password)
    sth = dbh.execute 'select * from user_tab_columns order by table_name'

    curr_table = ''
    param_table = HashObject.new
    sth.fetch do | row |
      if curr_table != row['TABLE_NAME']
        curr_table = row['TABLE_NAME']
        param_table = HashObject.new
        param_table.table_name = curr_table
        param_table.fields = []
      else
        field = HashObject.new
        field.field_name = row['COLUMN_NAME']
        param_table.fields.push field
        puts field
      end
    end
    sth.finish
    return tables
  end
end
