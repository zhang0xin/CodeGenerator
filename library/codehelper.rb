#encoding:gbk
class CodeHelper
  def self.genernate_datagrid_column(property)
    str_column = ""
    #str_visible = ", hidden: true" if property.is_key
    str_visible = ""
    if property.type == 'date' then
      str_column = "{field: '#{property.name}', title : '#{property.comment}', sortable: true, formatter: dateFormatter }#{str_visible}"
    elsif property.type == 'datetime' then
      str_column = "{field: '#{property.name}', title : '#{property.comment}', sortable: true, formatter: datetimeFormatter }#{str_visible}"
    elsif property.type == 'currency' then
      str_column = "{field: '#{property.name}Value', title : '#{property.comment}', sortable: true }#{str_visible},"
      str_column += "{field: '#{property.name}CurrencyType', title : '#{property.comment}币种', sortable: true, formatter : function(value, row) {return currencyTypeDict[value];} }#{str_visible}"
    else
      str_column = "{field: '#{property.name}', title : '#{property.comment}', sortable: true#{str_visible} }"
    end
    return str_column
  end
  
  def self.genernate_form_set(property)
    str_set = ""
    if property.type == 'date' then
      str_set = "$('##{property.name}').datebox('setValue', jsonDateToString(r.#{property.name}));"
    elsif property.type == 'datetime' then
      str_set = "$('##{property.name}').datetimebox('setValue', jsonDatetimeToString(r.#{property.name}));"
    elsif property.type == 'currency' then
      str_set = "$('##{property.name}Value').textbox('setValue', r.#{property.name}Value); $('##{property.name}CurrencyType').combobox('setValue', r.#{property.name}CurrencyType);"
    else
      str_set = "$('##{property.name}').textbox('setValue', r.#{property.name});"
    end
    return str_set
  end
  
  def self.genernate_query_param(property, prefix='')
    str_query_param = ""
    if property.range.size != 0 then
      str_query_param = "'query.#{property.name}.eqValue' : $('##{prefix}query_#{property.name}').combobox('getValue')"
    elsif property.type == 'string' or property.type == 'currency' then
      str_query_param = "'query.#{property.name}.likeValue' : $('##{prefix}query_#{property.name}').val()"
    elsif property.type == 'number' or property.type == 'digits' then
      str_query_param = "'query.#{property.name}.eqValue' : $('##{prefix}query_#{property.name}').val()"
    elsif property.type == 'date' then
      str_query_param = "'query.#{property.name}.geValue' : $('##{prefix}query_min_#{property.name}').datebox('getValue'), "
      str_query_param += "'query.#{property.name}.leValue' : $('##{prefix}query_max_#{property.name}').datebox('getValue')"
    elsif property.type == 'datetime' then
      str_query_param = "'query.#{property.name}.geValue' : $('##{prefix}query_min_#{property.name}').datetimebox('getValue'), "
      str_query_param += "'query.#{property.name}.leValue' : $('##{prefix}query_max_#{property.name}').datetimebox('getValue')"
    end
    return str_query_param
  end
  
  def self.genernate_query_param_clear(property, prefix='')
    str_query_param_clear = ""
    if property.range.size != 0 then
      str_query_param_clear = "$('##{prefix}query_#{property.name}').combobox('clear');"
    elsif property.type == 'string' or property.type == 'currency' then
      str_query_param_clear = "$('##{prefix}query_#{property.name}').textbox('clear');"
    elsif property.type == 'number' or property.type == 'digits' then
      str_query_param_clear = "$('##{prefix}query_#{property.name}').textbox('clear');"
    elsif property.type == 'date' then
      str_query_param_clear = "$('##{prefix}query_min_#{property.name}').datebox('setValue', '');"
      str_query_param_clear += "$('##{prefix}query_max_#{property.name}').datebox('setValue', '');"
    elsif property.type == 'datetime' then
      str_query_param_clear = "$('##{prefix}query_min_#{property.name}').datetimebox('setValue', '');"
      str_query_param_clear += "$('##{prefix}query_max_#{property.name}').datetimebox('setValue', '');"
    end
    return str_query_param_clear
  end
  
  def self.genernate_query_input(property, prefix='')
    str_query_input = ""
    if property.range.size != 0 then
      str_data = "{label: '',value: '&nbsp;'}"
      property.range.each(){|item| str_data += ", {label: '#{item}',value: '#{item}'}" }
      str_query_input = "<label>#{property.comment}：<input id='#{prefix}query_#{property.name}' class='easyui-combobox' data-options=\"valueField: 'label', textField: 'value', data: [#{str_data}]\" /></label>"
    elsif property.type == 'string' or property.type == 'currency' then
      str_query_input = "<label>#{property.comment}：<input id='#{prefix}query_#{property.name}' class='easyui-textbox' data-options='' /></label>"
    elsif property.type == 'number' or property.type == 'digits' then
      str_query_input = "<label>#{property.comment}：<input id='#{prefix}query_#{property.name}' class='easyui-textbox' data-options='' /></label>"
    elsif property.type == 'date' then
      str_query_input = "<label>#{property.comment}：<input id='#{prefix}query_min_#{property.name}' class='query-datebox easyui-datebox' />到"
      str_query_input += "<input id='#{prefix}query_max_#{property.name}' class='query-datebox easyui-datebox' /></label>"
    elsif property.type == 'datetime' then
      str_query_input = "<label>#{property.comment}：<input id='#{prefix}query_min_#{property.name}' class='query-datebox easyui-datetimebox' />到"
      str_query_input += "<input id='#{prefix}query_max_#{property.name}' class='query-datebox easyui-datetimebox' /></label>"
    end
    return str_query_input
  end
  
  def self.genernate_view_item(property, prefix='')
    "<label>#{property.comment}：<span id='#{prefix}#{property.name}' class='field-text'>&nbsp;</span></label>"
  end
  
  def self.genernate_form_input(property, attributes='')
    str_form_input = ""
    if property.range.size != 0 then
      str_data = "{label: '&nbsp;',value: ''}"
      property.range.each(){|item| str_data += ", {label: '#{item}',value: '#{item}'}" }
      str_form_input = "<label>#{property.comment}：<input id='#{property.name}' name='entity.#{property.name}' class='easyui-combobox' data-options=\"valueField: 'value', textField: 'label', data: [#{str_data}]\" #{attributes}/></label>"
    elsif property.type == 'currency' then 
      str_form_input = "<label>#{property.comment}：<span class='pair'>
          <input id='#{property.name}Value' style='width: 65%;' name='entity.#{property.name}Value' class='easyui-numberbox easyui-textbox' data-options='precision:3' #{attributes}
          /><input id='#{property.name}CurrencyType' style='width: 35%;' name='entity.#{property.name}CurrencyType' class='easyui-combobox' url= 'zaa010t.action?req.type=getListOnCategory&category=2003' valueField= 'fminCd' textField= 'fcdNm' #{attributes}/>
          </span></label>"
    elsif property.type == 'string' then
      str_form_input = "<label>#{property.comment}：<input id='#{property.name}' name='entity.#{property.name}' class='easyui-validatebox easyui-textbox' data-options=\"validType:'length[0,#{property.type_length}]'\" #{attributes}/></label>"
    elsif property.type == 'number' then
      str_form_input = "<label>#{property.comment}：<input id='#{property.name}' name='entity.#{property.name}' class='easyui-numberbox easyui-textbox' data-options='precision:#{property.get_precision_length()}' #{attributes}/></label>"
    elsif property.type == 'digits' then
      str_form_input = "<label>#{property.comment}：<input id='#{property.name}' name='entity.#{property.name}' class='easyui-numberbox easyui-textbox' data-options='precision:0' #{attributes}/></label>"
    elsif property.type == 'date' then
      str_form_input = "<label>#{property.comment}：<input id='#{property.name}' name='entity.#{property.name}' class='easyui-validatebox easyui-datebox' data-options='' #{attributes}/></label>"
    elsif property.type == 'datetime' then
      str_form_input = "<label>#{property.comment}：<input id='#{property.name}' name='entity.#{property.name}' class='easyui-validatebox easyui-datetimebox' data-options='' #{attributes}/></label>"
    end
    return str_form_input
  end
  
  def self.form_field_input(property)
    str_field_input = "";
    if property.range.size != 0 then
      str_data = "{label: '&nbsp;',value: ''}"
      property.range.each(){|item| str_data += ", {label: '#{item}', value: '#{item}'}" }
      str_field_input = "#{property.name}.comboboxInput(\"value\", \"label\", \"[#{str_data}]\")"
    elsif property.range_code.size != 0 then
      str_url = "zaa010t.action?req.type=getListOnCategory&category="+property.range_code
      str_field_input = "#{property.name}.comboboxInputWithUrl(\"fcdNm\", \"fcdNm\", \"#{str_url}\")"
    elsif property.type == 'currency' then 
      str_field_input = "#{property.name}.currencyInput(#{property.get_precision_length})"
    elsif property.type == 'string' then
      str_field_input = "#{property.name}.textInput(#{property.type_length})"
    elsif property.type == 'number' then
      str_field_input = "#{property.name}.numberInput(#{property.get_precision_length})"
    elsif property.type == 'digits' then
      str_field_input = "#{property.name}.numberInput(0)"
    elsif property.type == 'date' then
      str_field_input = "#{property.name}.dateInput()"
    elsif property.type == 'datetime' then
      str_field_input = "#{property.name}.datetimeInput()"
    end
    
    return str_field_input;
  end
  def self.query_field_input(property)
    str_field_input = "";
    if property.range.size != 0 then
      str_data = "{label: '&nbsp;',value: ''}"
      property.range.each(){|item| str_data += ", {label: '#{item}', value: '#{item}'}" }
      str_field_input = "#{property.name}.comboboxQueryInput(\"value\", \"label\", \"[#{str_data}]\")"
    elsif property.range_code.size != 0 then
      str_url = "zaa010t.action?req.type=getListOnCategory&category="+property.range_code
      str_field_input = "#{property.name}.comboboxQueryInputWithUrl(\"fcdNm\", \"fcdNm\", \"#{str_url}\")"
    elsif property.type == 'currency' or property.type == 'string' then
      str_field_input = "#{property.name}.textQueryInput()"
    elsif property.type == 'number' or property.type == 'digits' then
      str_field_input = "#{property.name}.numberQueryInput()"
    elsif property.type == 'date' then
      str_field_input = "#{property.name}.dateQueryInput()"
    elsif property.type == 'datetime' then
      str_field_input = "#{property.name}.datetimeQueryInput()"
    end
    
    return str_field_input;
  end
  def self.datagrid_column(property)
    str_column = ""
    if property.type == 'date' then
      str_column = "#{property.name}.dateColumn()"
    elsif property.type == 'datetime' then
      str_column = "#{property.name}.datetimeColumn()"
    elsif property.type == 'currency' then
      str_column = ""
      str_column += "JsCode.create(#{property.name}.currencyValueColumn() + \", \" +\n      "
      str_column += "#{property.name}.currencyTypeColumn(\"50\"))"
    else
      str_column = "#{property.name}.textColumn()"
    end
    return str_column
  end
end