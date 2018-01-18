<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" import="com.ysusoft.Util.*"%>
<%@ page language="java" import="com.ysusoft.ui.purchase.Ffb060avUi"%>

<%
// parameters define
String targetMainGridId = "";
String targetProperty = "";
String reloadDetailsFunction = "reloadDetailsFfb060av";
String addDetailsFunction = "addDetailsFfb060av";
String removeDetailsFunction = "removeDetailsFfb060av";
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
Ffb060avUi ui = (Ffb060avUi) ctx.getBean("ffb060avUi");

%>

<script type="text/javascript">
function popDlgFfb060av(){
  $('#dlgFfb060av').dialog('open');
  dlgFfb060avReset();
}

function <%= reloadDetailsFunction%>(params){
  $('#dgDetailsFfb060av').datagrid('reload', params);
}

function dlgFfb060avSelected(){
  rows = $('#dgDetailsQueryFfb060av').datagrid('getSelections');
  if (rows.length == 0){
    $.messager.alert('系统提示', '没有选择合同可见部门，请选择行。');
    return;
  }

  selectedFfb060av(rows);
  
  $('#dlgFfb060av').dialog('close');
}

function <%=addDetailsFunction%>(){
  var r = $('#<%= targetMainGridId%>').datagrid('getSelected');
  if (r == null) {
    $.messager.alert('系统提示', '请选择装港信息。');
    return;
  }
  popDlgFfb060av();
}
function <%=removeDetailsFunction%>(){
  var rows = $('#dgDetailsFfb060av').datagrid('getSelections');
  if (rows.length == 0) {
    $.messager.alert('系统提示', '请选择合同可见部门。');
    return;
  }
  $.messager.confirm('系统提示', '是否确认删除？', function(r){
    if (!r) return;
    setProperty('ffb060av', getFfb060avIds(rows), '<%= targetProperty%>', '');
  });
}
function selectedFfb060av(rows){
  var value = $('#<%= targetMainGridId%>').datagrid('getSelected').<%= targetProperty%>;
  setProperty('ffb060av', getFfb060avIds(rows), '<%= targetProperty%>', value);
}
function getFfb060avIds(rows){
  var ids = '';
  for (i=0; i<rows.length; i++){
    ids += rows[i].f0;
    if (i != rows.length-1) ids += ',';
  }
  return ids;
}
$(function(){
  $('#dgDetailsFfb060av').datagrid({
    url: 'ffb060av.action?reqtype=queryRequireParams',
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
<div id="dlgFfb060av" class="easyui-dialog pop-dialog" buttons="#dlgFfb060avButtons" title="选择" closed="true">
  <div class="easyui-panel query-panel" title="查询选项" data-options="iconCls:'icon-search',collapsible:true,collapsed:true">
    <script type="text/javascript">
    function dlgFfb060avQuery(){
      var queryParams = createFfb060avQueryParams();
      $('#dgDetailsQueryFfb060av').datagrid('reload', queryParams);
    }
    function createFfb060avQueryParams(){
      var params = createQueryParams("detail_ffb060av_query");
      params['query.f0.isNotNullValue'] = 'true';
      return params;
    }
    function dlgFfb060avReset(){
      resetQueryInputs("detail_ffb060av_query");
      dlgFfb060avQuery();
    }
    </script>
    <div id="detail_ffb060av_query" class="query">
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
      $('#dgDetailsQueryFfb060av').datagrid({
        url: 'ffb060av.action?reqtype=query',
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
    <table id="dgDetailsQueryFfb060av"></table>
  </div>
  <div id="dlgFfb060avButtons">
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="dlgFfb060avSelected()">确定</a> 
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlgFfb060av').dialog('close')">取消</a>
  </div>
</div>
<table id="dgDetailsFfb060av"></table>