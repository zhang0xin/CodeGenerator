<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" import="com.ysusoft.Util.*"%>
<%@ page language="java" import="com.ysusoft.ui.purchase.DepartmentUi"%>

<%
// parameters define
String targetMainGridId = "";
String targetProperty = "";
String reloadDetailsFunction = "reloadDetailsDepartment";
String addDetailsFunction = "addDetailsDepartment";
String removeDetailsFunction = "removeDetailsDepartment";
String displayQueryFields = request.getParameter("displayQueryFields");
String hiddenQueryFields = request.getParameter("hiddenQueryFields");
String displayTableFields = request.getParameter("displayTableFields");
String hiddenTableFields = request.getParameter("hiddenTableFields");

// parameters initialize
if (request.getParameter("targetMainGridId") != null) targetMainGridId = request.getParameter("targetMainGridId");
if (request.getParameter("targetProperty") != null) targetProperty = request.getParameter("targetProperty");
if (request.getParameter("reloadDetailsFunction") != null) reloadDetailsFunction = request.getParameter("reloadDetailsFunction");
if (request.getParameter("addDetailsFunction") != null) addDetailsFunction = request.getParameter("addDetailsFunction");
if (request.getParameter("removeDetailsFunction") != null) removeDetailsFunction = request.getParameter("removeDetailsFunction");

// varibles
ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
DepartmentUi ui = (DepartmentUi) ctx.getBean("departmentUi");

%>

<script type="text/javascript">
function popDlgDepartment(){
  $('#dlgDepartment').dialog('open');
  dlgDepartmentReset();
}

function <%= reloadDetailsFunction%>(params){
  $('#dgDetailsDepartment').datagrid('reload', params);
}

function dlgDepartmentSelected(){
  rows = $('#dgDetailsQueryDepartment').datagrid('getSelections');
  if (rows.length == 0){
    $.messager.alert('系统提示', '没有选择部门，请选择行。');
    return;
  }

  selectedDepartment(rows);
  
  $('#dlgDepartment').dialog('close');
}

function <%=addDetailsFunction%>(){
  var r = $('#<%= targetMainGridId%>').datagrid('getSelected');
  if (r == null) {
    $.messager.alert('系统提示', '请选择装港信息。');
    return;
  }
  popDlgDepartment();
}
function <%=removeDetailsFunction%>(){
  var rows = $('#dgDetailsDepartment').datagrid('getSelections');
  if (rows.length == 0) {
    $.messager.alert('系统提示', '请选择部门。');
    return;
  }
  $.messager.confirm('系统提示', '是否确认删除？', function(r){
    if (!r) return;
    setProperty('department', getDepartmentIds(rows), '<%= targetProperty%>', '');
  });
}
function selectedDepartment(rows){
  var value = $('#<%= targetMainGridId%>').datagrid('getSelected').<%= targetProperty%>;
  setProperty('department', getDepartmentIds(rows), '<%= targetProperty%>', value);
}
function getDepartmentIds(rows){
  var ids = '';
  for (i=0; i<rows.length; i++){
    ids += rows[i].f0;
    if (i != rows.length-1) ids += ',';
  }
  return ids;
}
$(function(){
  $('#dgDetailsDepartment').datagrid({
    url: 'department.action?reqtype=queryRequireParams',
    pagination: true,
    pageSize: 5,
    pageList: [5,10,20,30,40,50],
    rownumbers: true, 
    fitColumns: false, 
    columns: [[
      {field: 'ck', title: '复选框', checkbox: true, hidden: true },
<%= displayTableFields!=null? ui.createDataGridColumn(displayTableFields, true) : "" %>
<%= hiddenTableFields!=null? ui.createDataGridColumn(hiddenTableFields, false) : "" %>
    ]]
  });
});
</script>
<div id="dlgDepartment" class="easyui-dialog pop-dialog" buttons="#dlgDepartmentButtons" title="选择" closed="true">
  <div class="easyui-panel query-panel" title="查询选项" data-options="iconCls:'icon-search',collapsible:true,collapsed:true">
    <script type="text/javascript">
    function dlgDepartmentQuery(){
      var queryParams = createDepartmentQueryParams();
      $('#dgDetailsQueryDepartment').datagrid('reload', queryParams);
    }
    function createDepartmentQueryParams(){
      var params = createQueryParams("detail_department_query");
      params['query.f0.isNotNullValue'] = 'true';
      return params;
    }
    function dlgDepartmentReset(){
      resetQueryInputs("detail_department_query");
      dlgDepartmentQuery();
    }
    </script>
    <div id="detail_department_query" class="query">
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
      $('#dgDetailsQueryDepartment').datagrid({
        url: 'department.action?reqtype=query',
        singleSelect: false,
        selectOnCheck: false,
        checkOnSelect: false,
        pagination: true,
        pageSize: 5,
        pageList: [5,10,20,30,40,50],
        rownumbers: true, 
        fitColumns: false,
        fit: true,
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
    <table id="dgDetailsQueryDepartment"></table>
  </div>
  <div id="dlgDepartmentButtons">
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="dlgDepartmentSelected()">确定</a> 
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlgDepartment').dialog('close')">取消</a>
  </div>
</div>
<table id="dgDetailsDepartment"></table>