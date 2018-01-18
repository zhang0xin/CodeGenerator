<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" import="com.ysusoft.Util.*"%>
<%@ page language="java" import="com.ysusoft.ui.purchase.Ffb060avUi"%>
<%
// parameters define
String selectFunction = "";
String selectedHandler = "";
String onSelected = "";
String onOpen = "";
String bindTargets = "";
String valueField = "";
String singleSelect = "true";
String displayQueryFields = request.getParameter("displayQueryFields");
String hiddenQueryFields = request.getParameter("hiddenQueryFields");
String displayTableFields = request.getParameter("displayTableFields");
String hiddenTableFields = request.getParameter("hiddenTableFields");

// parameters initialize
if (request.getParameter("onSelected") != null) onSelected = request.getParameter("onSelected");
if (request.getParameter("onOpen") != null) onOpen = request.getParameter("onOpen");
if (request.getParameter("bindTargets") != null) bindTargets = request.getParameter("bindTargets");
if (request.getParameter("valueField") != null) valueField = request.getParameter("valueField");
if (request.getParameter("singleSelect") != null) singleSelect = request.getParameter("singleSelect");
if (request.getParameter("selectFunction") != null) selectFunction = request.getParameter("selectFunction");
if (request.getParameter("selectedHandler") != null) selectedHandler = request.getParameter("selectedHandler");

// varibles
ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
Ffb060avUi ui = (Ffb060avUi) ctx.getBean("ffb060avUi");

%>

<script type="text/javascript">
<%if(!"".equals(selectFunction)) {%>
function <%=selectFunction%>(){
  $('#dlg-ffb060av').dialog('open');
  dlgFfb060avReset();
}
<%}%>
function dlgFfb060avSelected(){
  var rows = $('#dlg-dg-ffb060av').datagrid('getSelections');
  if (rows.length == 0){
    $.messager.alert('系统提示', '没有选择任何行，请选择行。');
    return;
  }

  <%if (!"".equals(onSelected)) {%><%=onSelected%>(rows[0]); <%}%>
  <%if (!"".equals(valueField)) {%>textboxClickSender.textbox('setValue', rows[0].<%=valueField%>); <%}%>
  <%if (!"".equals(selectedHandler)) {%><%=selectedHandler%>(rows);<%}%>
  
  $('#dlg-ffb060av').dialog('close');
}
$(function(){
  if ($('#dlg-ffb060av').length == 0) return;
<%
  String[] targets = bindTargets.split(",");
  for(int i=0; i<targets.length; i++){
%>  bindTextboxClick('#<%= targets[i].trim()%>', '#dlg-ffb060av');
<%}%>
});
</script>
<div id="dlg-ffb060av" class="easyui-dialog pop-dialog" buttons="#dlg-ffb060av-selector-buttons" title="选择" closed="true"
data-options="
onOpen: function(){
  <%if(!"".equals(onOpen)) {%><%=onOpen%>(textboxClickSender);
  <%}else{%>dlgFfb060avReset();<%}%>
}"
>
  <div class="easyui-panel query-panel" title="查询选项" data-options="iconCls:'icon-search',collapsible:true,collapsed:true">
    <script type="text/javascript">
    function dlgFfb060avQuery(){
      var queryParams = createFfb060avQueryParams();
      $('#dlg-dg-ffb060av').datagrid('reload', queryParams);
    }
    function createFfb060avQueryParams(){
      var params = createQueryParams("dlg_ffb060av_query");
      params['query.f0.isNotNullValue'] = 'true';
      return params;
    }
    function dlgFfb060avReset(){
      resetQueryInputs("dlg_ffb060av_query");
      dlgFfb060avQuery();
    }
    </script>
    <div id="dlg_ffb060av_query" class="query">
<%= displayQueryFields!=null? ui.createQueryInputs(displayQueryFields, true) : "" %>
<%= hiddenQueryFields!=null? ui.createQueryInputs(hiddenQueryFields, false) : "" %>
      <div>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" onclick="dlgFfb060avQuery()">查询</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="dlgFfb060avReset()">重置</a>
      </div>
    </div>
  </div>
  <div class="easyui-panel result-panel" title="查询结果" data-options="iconCls:'icon-edit',collapsible:true">
    <script type="text/javascript">
    $(function(){
      $('#dlg-dg-ffb060av').datagrid({
        url: 'ffb060av.action?reqtype=query',
        singleSelect: <%=singleSelect%>,
        selectOnCheck: false,
        checkOnSelect: false,
        pagination: true,
        pageSize: 5,
        pageList: [5,10,20,30,40,50],
        rownumbers: true, 
        fitColumns: false,
        fit: true,
        onDblClickRow: function(rowIndex, rowData){
          if (<%=singleSelect%> == 'true')
            dlg_ffb060av_selected();
        },
        onHeaderContextMenu: function(e, field){
          e.preventDefault();
          if (typeof columnSelectMenu == 'undefined') 
            columnSelectMenu = createColumnMenu($('#dg'));
          columnSelectMenu.menu('show', {left : e.pageX, top : e.pageY});
        },
        columns: [[
          {field: 'ck', title: '复选框', checkbox: true, hidden: true },
<%= displayTableFields!=null? ui.createDataGridColumn(displayTableFields, true) : "" %>
<%= hiddenTableFields!=null? ui.createDataGridColumn(hiddenTableFields, false) : "" %>
        ]]
      });
    })
    </script>
    <table id="dlg-dg-ffb060av"></table>
  </div>
  <div id="dlg-ffb060av-selector-buttons">
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="dlgFfb060avSelected()">确定</a> 
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="$('#dlg-ffb060av').dialog('close')">取消</a>
  </div>
</div>

