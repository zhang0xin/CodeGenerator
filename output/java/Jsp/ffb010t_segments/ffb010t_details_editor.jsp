<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" import="com.ysusoft.Util.*"%>
<%@ page language="java" import="com.ysusoft.ui.purchase.Ffb010tUi"%>

<%
// parameters define
String targetMainGridId = "";
String targetProperty = "";
String reloadDetailsFunction = "reloadDetailsFfb010t";
String addDetailsFunction = "addDetailsFfb010t";
String removeDetailsFunction = "removeDetailsFfb010t";
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
Ffb010tUi ui = (Ffb010tUi) ctx.getBean("ffb010tUi");

%>

<script type="text/javascript">
function popDlgFfb010t(){
  $('#dlgFfb010t').dialog('open');
  dlgFfb010tReset();
}

function <%= reloadDetailsFunction%>(params){
  $('#dgDetailsFfb010t').datagrid('reload', params);
}

function dlgFfb010tSelected(){
  rows = $('#dgDetailsQueryFfb010t').datagrid('getSelections');
  if (rows.length == 0){
    $.messager.alert('系统提示', '没有选择采购资源，请选择行。');
    return;
  }

  selectedFfb010t(rows);
  
  $('#dlgFfb010t').dialog('close');
}

function <%=addDetailsFunction%>(){
  var r = $('#<%= targetMainGridId%>').datagrid('getSelected');
  if (r == null) {
    $.messager.alert('系统提示', '请选择装港信息。');
    return;
  }
  popDlgFfb010t();
}
function <%=removeDetailsFunction%>(){
  var rows = $('#dgDetailsFfb010t').datagrid('getSelections');
  if (rows.length == 0) {
    $.messager.alert('系统提示', '请选择采购资源。');
    return;
  }
  $.messager.confirm('系统提示', '是否确认删除？', function(r){
    if (!r) return;
    setProperty('ffb010t', getFfb010tIds(rows), '<%= targetProperty%>', '');
  });
}
function selectedFfb010t(rows){
  var value = $('#<%= targetMainGridId%>').datagrid('getSelected').<%= targetProperty%>;
  setProperty('ffb010t', getFfb010tIds(rows), '<%= targetProperty%>', value);
}
function getFfb010tIds(rows){
  var ids = '';
  for (i=0; i<rows.length; i++){
    ids += rows[i].f0;
    if (i != rows.length-1) ids += ',';
  }
  return ids;
}
$(function(){
  $('#dgDetailsFfb010t').datagrid({
    url: 'ffb010t.action?reqtype=queryRequireParams',
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
<div id="dlgFfb010t" class="easyui-dialog pop-dialog" buttons="#dlgFfb010tButtons" title="选择" closed="true">
  <div class="easyui-panel query-panel" title="查询选项" data-options="iconCls:'icon-search',collapsible:true,collapsed:true">
    <script type="text/javascript">
    function dlgFfb010tQuery(){
      var queryParams = createFfb010tQueryParams();
      $('#dgDetailsQueryFfb010t').datagrid('reload', queryParams);
    }
    function createFfb010tQueryParams(){
      var params = createQueryParams("detail_ffb010t_query");
      params['query.f0.isNotNullValue'] = 'true';
      return params;
    }
    function dlgFfb010tReset(){
      resetQueryInputs("detail_ffb010t_query");
      dlgFfb010tQuery();
    }
    </script>
    <div id="detail_ffb010t_query" class="query">
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
      $('#dgDetailsQueryFfb010t').datagrid({
        url: 'ffb010t.action?reqtype=query',
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
    <table id="dgDetailsQueryFfb010t"></table>
  </div>
  <div id="dlgFfb010tButtons">
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="dlgFfb010tSelected()">确定</a> 
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlgFfb010t').dialog('close')">取消</a>
  </div>
</div>
<table id="dgDetailsFfb010t"></table>