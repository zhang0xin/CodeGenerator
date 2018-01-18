<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" import="com.ysusoft.Util.*"%>
<%@ page language="java" import="com.ysusoft.ui.purchase.Ffb070tUi"%>

<%
// parameters define
String targetMainGridId = "";
String targetProperty = "";
String reloadDetailsFunction = "reloadDetailsFfb070t";
String addDetailsFunction = "addDetailsFfb070t";
String removeDetailsFunction = "removeDetailsFfb070t";
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
Ffb070tUi ui = (Ffb070tUi) ctx.getBean("ffb070tUi");

%>

<script type="text/javascript">
function popDlgFfb070t(){
  $('#dlgFfb070t').dialog('open');
  dlgFfb070tReset();
}

function <%= reloadDetailsFunction%>(params){
  $('#dgDetailsFfb070t').datagrid('reload', params);
}

function dlgFfb070tSelected(){
  rows = $('#dgDetailsQueryFfb070t').datagrid('getSelections');
  if (rows.length == 0){
    $.messager.alert('系统提示', '没有选择信用证，请选择行。');
    return;
  }

  selectedFfb070t(rows);
  
  $('#dlgFfb070t').dialog('close');
}

function <%=addDetailsFunction%>(){
  var r = $('#<%= targetMainGridId%>').datagrid('getSelected');
  if (r == null) {
    $.messager.alert('系统提示', '请选择装港信息。');
    return;
  }
  popDlgFfb070t();
}
function <%=removeDetailsFunction%>(){
  var rows = $('#dgDetailsFfb070t').datagrid('getSelections');
  if (rows.length == 0) {
    $.messager.alert('系统提示', '请选择信用证。');
    return;
  }
  $.messager.confirm('系统提示', '是否确认删除？', function(r){
    if (!r) return;
    setProperty('ffb070t', getFfb070tIds(rows), '<%= targetProperty%>', '');
  });
}
function selectedFfb070t(rows){
  var value = $('#<%= targetMainGridId%>').datagrid('getSelected').<%= targetProperty%>;
  setProperty('ffb070t', getFfb070tIds(rows), '<%= targetProperty%>', value);
}
function getFfb070tIds(rows){
  var ids = '';
  for (i=0; i<rows.length; i++){
    ids += rows[i].f0;
    if (i != rows.length-1) ids += ',';
  }
  return ids;
}
$(function(){
  $('#dgDetailsFfb070t').datagrid({
    url: 'ffb070t.action?reqtype=queryRequireParams',
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
<div id="dlgFfb070t" class="easyui-dialog pop-dialog" buttons="#dlgFfb070tButtons" title="选择" closed="true">
  <div class="easyui-panel query-panel" title="查询选项" data-options="iconCls:'icon-search',collapsible:true,collapsed:true">
    <script type="text/javascript">
    function dlgFfb070tQuery(){
      var queryParams = createFfb070tQueryParams();
      $('#dgDetailsQueryFfb070t').datagrid('reload', queryParams);
    }
    function createFfb070tQueryParams(){
      var params = createQueryParams("detail_ffb070t_query");
      params['query.f0.isNotNullValue'] = 'true';
      return params;
    }
    function dlgFfb070tReset(){
      resetQueryInputs("detail_ffb070t_query");
      dlgFfb070tQuery();
    }
    </script>
    <div id="detail_ffb070t_query" class="query">
<%= displayQueryFields!=null? ui.createQueryInputs(displayQueryFields, true) : "" %>
<%= hiddenQueryFields!=null? ui.createQueryInputs(hiddenQueryFields, false) : "" %>
      <div>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" onclick="dlgFfb070tQuery()">查询</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="dlgFfb070tReset()">重置</a>
      </div>
    </div>
  </div>
  <div class="easyui-panel result-panel" title="查询结果" data-options="iconCls:'icon-edit',collapsible:true">
    <script type="text/javascript">
    $(function(){
      $('#dgDetailsQueryFfb070t').datagrid({
        url: 'ffb070t.action?reqtype=query',
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
    <table id="dgDetailsQueryFfb070t"></table>
  </div>
  <div id="dlgFfb070tButtons">
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="dlgFfb070tSelected()">确定</a> 
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlgFfb070t').dialog('close')">取消</a>
  </div>
</div>
<table id="dgDetailsFfb070t"></table>