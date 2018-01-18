<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" import="com.ysusoft.Util.*"%>
<%@ page language="java" import="com.ysusoft.ui.purchase.Ffb012tUi"%>

<%
// parameters define
String targetMainGridId = "";
String targetProperty = "";
String reloadDetailsFunction = "reloadDetailsFfb012t";
String addDetailsFunction = "addDetailsFfb012t";
String removeDetailsFunction = "removeDetailsFfb012t";
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
Ffb012tUi ui = (Ffb012tUi) ctx.getBean("ffb012tUi");

%>

<script type="text/javascript">
function popDlgFfb012t(){
  $('#dlgFfb012t').dialog('open');
  dlgFfb012tReset();
}

function <%= reloadDetailsFunction%>(params){
  $('#dgDetailsFfb012t').datagrid('reload', params);
}

function dlgFfb012tSelected(){
  rows = $('#dgDetailsQueryFfb012t').datagrid('getSelections');
  if (rows.length == 0){
    $.messager.alert('系统提示', '没有选择审核记录，请选择行。');
    return;
  }

  selectedFfb012t(rows);
  
  $('#dlgFfb012t').dialog('close');
}

function <%=addDetailsFunction%>(){
  var r = $('#<%= targetMainGridId%>').datagrid('getSelected');
  if (r == null) {
    $.messager.alert('系统提示', '请选择装港信息。');
    return;
  }
  popDlgFfb012t();
}
function <%=removeDetailsFunction%>(){
  var rows = $('#dgDetailsFfb012t').datagrid('getSelections');
  if (rows.length == 0) {
    $.messager.alert('系统提示', '请选择审核记录。');
    return;
  }
  $.messager.confirm('系统提示', '是否确认删除？', function(r){
    if (!r) return;
    setProperty('ffb012t', getFfb012tIds(rows), '<%= targetProperty%>', '');
  });
}
function selectedFfb012t(rows){
  var value = $('#<%= targetMainGridId%>').datagrid('getSelected').<%= targetProperty%>;
  setProperty('ffb012t', getFfb012tIds(rows), '<%= targetProperty%>', value);
}
function getFfb012tIds(rows){
  var ids = '';
  for (i=0; i<rows.length; i++){
    ids += rows[i].f0;
    if (i != rows.length-1) ids += ',';
  }
  return ids;
}
$(function(){
  $('#dgDetailsFfb012t').datagrid({
    url: 'ffb012t.action?reqtype=queryRequireParams',
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
<div id="dlgFfb012t" class="easyui-dialog pop-dialog" buttons="#dlgFfb012tButtons" title="选择" closed="true">
  <div class="easyui-panel query-panel" title="查询选项" data-options="iconCls:'icon-search',collapsible:true,collapsed:true">
    <script type="text/javascript">
    function dlgFfb012tQuery(){
      var queryParams = createFfb012tQueryParams();
      $('#dgDetailsQueryFfb012t').datagrid('reload', queryParams);
    }
    function createFfb012tQueryParams(){
      var params = createQueryParams("detail_ffb012t_query");
      params['query.f0.isNotNullValue'] = 'true';
      return params;
    }
    function dlgFfb012tReset(){
      resetQueryInputs("detail_ffb012t_query");
      dlgFfb012tQuery();
    }
    </script>
    <div id="detail_ffb012t_query" class="query">
<%= displayQueryFields!=null? ui.createQueryInputs(displayQueryFields, true) : "" %>
<%= hiddenQueryFields!=null? ui.createQueryInputs(hiddenQueryFields, false) : "" %>
      <div>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" onclick="dlgFfb012tQuery()">查询</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="dlgFfb012tReset()">重置</a>
      </div>
    </div>
  </div>
  <div class="easyui-panel result-panel" title="查询结果" data-options="iconCls:'icon-edit',collapsible:true">
    <script type="text/javascript">
    $(function(){
      $('#dgDetailsQueryFfb012t').datagrid({
        url: 'ffb012t.action?reqtype=query',
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
    <table id="dgDetailsQueryFfb012t"></table>
  </div>
  <div id="dlgFfb012tButtons">
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="dlgFfb012tSelected()">确定</a> 
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlgFfb012t').dialog('close')">取消</a>
  </div>
</div>
<table id="dgDetailsFfb012t"></table>