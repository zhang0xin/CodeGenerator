<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" import="com.ysusoft.Util.*"%>
<%@ page language="java" import="com.ysusoft.ui.purchase.Ffb050tUi"%>
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
Ffb050tUi ui = (Ffb050tUi) ctx.getBean("ffb050tUi");

%>

<script type="text/javascript">
<%if(!"".equals(selectFunction)) {%>
function <%=selectFunction%>(){
  $('#dlg-ffb050t').dialog('open');
  dlgFfb050tReset();
}
<%}%>
function dlgFfb050tSelected(){
  var rows = $('#dlg-dg-ffb050t').datagrid('getSelections');
  if (rows.length == 0){
    $.messager.alert('系统提示', '没有选择任何行，请选择行。');
    return;
  }

  <%if (!"".equals(onSelected)) {%><%=onSelected%>(rows[0]); <%}%>
  <%if (!"".equals(valueField)) {%>textboxClickSender.textbox('setValue', rows[0].<%=valueField%>); <%}%>
  <%if (!"".equals(selectedHandler)) {%><%=selectedHandler%>(rows);<%}%>
  
  $('#dlg-ffb050t').dialog('close');
}
$(function(){
  if ($('#dlg-ffb050t').length == 0) return;
<%
  String[] targets = bindTargets.split(",");
  for(int i=0; i<targets.length; i++){
%>  bindTextboxClick('#<%= targets[i].trim()%>', '#dlg-ffb050t');
<%}%>
});
</script>
<div id="dlg-ffb050t" class="easyui-dialog pop-dialog" buttons="#dlg-ffb050t-selector-buttons" title="选择" closed="true"
data-options="
onOpen: function(){
  <%if(!"".equals(onOpen)) {%><%=onOpen%>(textboxClickSender);
  <%}else{%>dlgFfb050tReset();<%}%>
}"
>
  <div class="easyui-panel query-panel" title="查询选项" data-options="iconCls:'icon-search',collapsible:true,collapsed:true">
    <script type="text/javascript">
    function dlgFfb050tQuery(){
      var queryParams = createFfb050tQueryParams();
      $('#dlg-dg-ffb050t').datagrid('reload', queryParams);
    }
    function createFfb050tQueryParams(){
      var params = createQueryParams("dlg_ffb050t_query");
      params['query.f0.isNotNullValue'] = 'true';
      return params;
    }
    function dlgFfb050tReset(){
      resetQueryInputs("dlg_ffb050t_query");
      dlgFfb050tQuery();
    }
    </script>
    <div id="dlg_ffb050t_query" class="query">
<%= displayQueryFields!=null? ui.createQueryInputs(displayQueryFields, true) : "" %>
<%= hiddenQueryFields!=null? ui.createQueryInputs(hiddenQueryFields, false) : "" %>
      <div>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" onclick="dlgFfb050tQuery()">查询</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="dlgFfb050tReset()">重置</a>
      </div>
    </div>
  </div>
  <div class="easyui-panel result-panel" title="查询结果" data-options="iconCls:'icon-edit',collapsible:true">
    <script type="text/javascript">
    $(function(){
      $('#dlg-dg-ffb050t').datagrid({
        url: 'ffb050t.action?reqtype=query',
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
            dlg_ffb050t_selected();
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
    <table id="dlg-dg-ffb050t"></table>
  </div>
  <div id="dlg-ffb050t-selector-buttons">
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="dlgFfb050tSelected()">确定</a> 
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="$('#dlg-ffb050t').dialog('close')">取消</a>
  </div>
</div>

