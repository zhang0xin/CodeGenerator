<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" import="com.ysusoft.Util.*"%>
<%@ page language="java" import="com.ysusoft.ui.purchase.DepartmentUi"%>
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
DepartmentUi ui = (DepartmentUi) ctx.getBean("departmentUi");

%>

<script type="text/javascript">
<%if(!"".equals(selectFunction)) {%>
function <%=selectFunction%>(){
  $('#dlg-department').dialog('open');
  dlgDepartmentReset();
}
<%}%>
function dlgDepartmentSelected(){
  var rows = $('#dlg-dg-department').datagrid('getSelections');
  if (rows.length == 0){
    $.messager.alert('系统提示', '没有选择任何行，请选择行。');
    return;
  }

  <%if (!"".equals(onSelected)) {%><%=onSelected%>(rows[0]); <%}%>
  <%if (!"".equals(valueField)) {%>textboxClickSender.textbox('setValue', rows[0].<%=valueField%>); <%}%>
  <%if (!"".equals(selectedHandler)) {%><%=selectedHandler%>(rows);<%}%>
  
  $('#dlg-department').dialog('close');
}
$(function(){
  if ($('#dlg-department').length == 0) return;
<%
  String[] targets = bindTargets.split(",");
  for(int i=0; i<targets.length; i++){
%>  bindTextboxClick('#<%= targets[i].trim()%>', '#dlg-department');
<%}%>
});
</script>
<div id="dlg-department" class="easyui-dialog pop-dialog" buttons="#dlg-department-selector-buttons" title="选择" closed="true"
data-options="
onOpen: function(){
  <%if(!"".equals(onOpen)) {%><%=onOpen%>(textboxClickSender);
  <%}else{%>dlgDepartmentReset();<%}%>
}"
>
  <div class="easyui-panel query-panel" title="查询选项" data-options="iconCls:'icon-search',collapsible:true,collapsed:true">
    <script type="text/javascript">
    function dlgDepartmentQuery(){
      var queryParams = createDepartmentQueryParams();
      $('#dlg-dg-department').datagrid('reload', queryParams);
    }
    function createDepartmentQueryParams(){
      var params = createQueryParams("dlg_department_query");
      params['query.f0.isNotNullValue'] = 'true';
      return params;
    }
    function dlgDepartmentReset(){
      resetQueryInputs("dlg_department_query");
      dlgDepartmentQuery();
    }
    </script>
    <div id="dlg_department_query" class="query">
<%= displayQueryFields!=null? ui.createQueryInputs(displayQueryFields, true) : "" %>
<%= hiddenQueryFields!=null? ui.createQueryInputs(hiddenQueryFields, false) : "" %>
      <div>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" onclick="dlgDepartmentQuery()">查询</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="dlgDepartmentReset()">重置</a>
      </div>
    </div>
  </div>
  <div class="easyui-panel result-panel" title="查询结果" data-options="iconCls:'icon-edit',collapsible:true">
    <script type="text/javascript">
    $(function(){
      $('#dlg-dg-department').datagrid({
        url: 'department.action?reqtype=query',
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
            dlg_department_selected();
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
    <table id="dlg-dg-department"></table>
  </div>
  <div id="dlg-department-selector-buttons">
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="dlgDepartmentSelected()">确定</a> 
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="$('#dlg-department').dialog('close')">取消</a>
  </div>
</div>

