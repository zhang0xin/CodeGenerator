<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" import="com.ysusoft.Util.*"%>
<%@ page language="java" import="com.ysusoft.ui.purchase.Ffb010tUi"%>
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
Ffb010tUi ui = (Ffb010tUi) ctx.getBean("ffb010tUi");

%>

<script type="text/javascript">
<%if(!"".equals(selectFunction)) {%>
function <%=selectFunction%>(){
  $('#dlg-ffb010t').dialog('open');
  dlgFfb010tReset();
}
<%}%>
function dlgFfb010tSelected(){
  var rows = $('#dlg-dg-ffb010t').datagrid('getSelections');
  if (rows.length == 0){
    $.messager.alert('系统提示', '没有选择任何行，请选择行。');
    return;
  }

  <%if (!"".equals(onSelected)) {%><%=onSelected%>(rows[0]); <%}%>
  <%if (!"".equals(valueField)) {%>textboxClickSender.textbox('setValue', rows[0].<%=valueField%>); <%}%>
  <%if (!"".equals(selectedHandler)) {%><%=selectedHandler%>(rows);<%}%>
  
  $('#dlg-ffb010t').dialog('close');
}
$(function(){
  if ($('#dlg-ffb010t').length == 0) return;
<%
  String[] targets = bindTargets.split(",");
  for(int i=0; i<targets.length; i++){
%>  bindTextboxClick('#<%= targets[i].trim()%>', '#dlg-ffb010t');
<%}%>
});
</script>
<div id="dlg-ffb010t" class="easyui-dialog pop-dialog" buttons="#dlg-ffb010t-selector-buttons" title="选择" closed="true"
data-options="
onOpen: function(){
  <%if(!"".equals(onOpen)) {%><%=onOpen%>(textboxClickSender);
  <%}else{%>dlgFfb010tReset();<%}%>
}"
>
  <div class="easyui-panel query-panel" title="查询选项" data-options="iconCls:'icon-search',collapsible:true,collapsed:true">
    <script type="text/javascript">
    function dlgFfb010tQuery(){
      var queryParams = createFfb010tQueryParams();
      $('#dlg-dg-ffb010t').datagrid('reload', queryParams);
    }
    function createFfb010tQueryParams(){
      var params = createQueryParams("dlg_ffb010t_query");
      params['query.f0.isNotNullValue'] = 'true';
      return params;
    }
    function dlgFfb010tReset(){
      resetQueryInputs("dlg_ffb010t_query");
      dlgFfb010tQuery();
    }
    </script>
    <div id="dlg_ffb010t_query" class="query">
<%= displayQueryFields!=null? ui.createQueryInputs(displayQueryFields, true) : "" %>
<%= hiddenQueryFields!=null? ui.createQueryInputs(hiddenQueryFields, false) : "" %>
      <div>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" onclick="dlgFfb010tQuery()">查询</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="dlgFfb010tReset()">重置</a>
      </div>
    </div>
  </div>
  <div class="easyui-panel result-panel" title="查询结果" data-options="iconCls:'icon-edit',collapsible:true">
    <script type="text/javascript">
    $(function(){
      $('#dlg-dg-ffb010t').datagrid({
        url: 'ffb010t.action?reqtype=query',
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
            dlg_ffb010t_selected();
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
    <table id="dlg-dg-ffb010t"></table>
  </div>
  <div id="dlg-ffb010t-selector-buttons">
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="dlgFfb010tSelected()">确定</a> 
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="$('#dlg-ffb010t').dialog('close')">取消</a>
  </div>
</div>

