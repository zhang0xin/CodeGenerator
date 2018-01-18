<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" import="com.ysusoft.Util.*"%>
<%@ page language="java" import="com.ysusoft.ui.purchase.Ffb020avUi"%>

<%
// parameters define
String targetMainGridId = "";
String targetProperty = "";
String reloadDetailsFunction = "reloadDetailsFfb020av";
String addDetailsFunction = "addDetailsFfb020av";
String removeDetailsFunction = "removeDetailsFfb020av";
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
Ffb020avUi ui = (Ffb020avUi) ctx.getBean("ffb020avUi");

%>

<script type="text/javascript">
function popDlgFfb020av(){
  $('#dlgFfb020av').dialog('open');
  dlgFfb020avReset();
}

function <%= reloadDetailsFunction%>(params){
  $('#dgDetailsFfb020av').datagrid('reload', params);
}

function dlgFfb020avSelected(){
  rows = $('#dgDetailsQueryFfb020av').datagrid('getSelections');
  if (rows.length == 0){
    $.messager.alert('系统提示', '没有选择船运可见部门，请选择行。');
    return;
  }

  selectedFfb020av(rows);
  
  $('#dlgFfb020av').dialog('close');
}

function <%=addDetailsFunction%>(){
  var r = $('#<%= targetMainGridId%>').datagrid('getSelected');
  if (r == null) {
    $.messager.alert('系统提示', '请选择装港信息。');
    return;
  }
  popDlgFfb020av();
}
function <%=removeDetailsFunction%>(){
  var rows = $('#dgDetailsFfb020av').datagrid('getSelections');
  if (rows.length == 0) {
    $.messager.alert('系统提示', '请选择船运可见部门。');
    return;
  }
  $.messager.confirm('系统提示', '是否确认删除？', function(r){
    if (!r) return;
    setProperty('ffb020av', getFfb020avIds(rows), '<%= targetProperty%>', '');
  });
}
function selectedFfb020av(rows){
  var value = $('#<%= targetMainGridId%>').datagrid('getSelected').<%= targetProperty%>;
  setProperty('ffb020av', getFfb020avIds(rows), '<%= targetProperty%>', value);
}
function getFfb020avIds(rows){
  var ids = '';
  for (i=0; i<rows.length; i++){
    ids += rows[i].f0;
    if (i != rows.length-1) ids += ',';
  }
  return ids;
}
$(function(){
  $('#dgDetailsFfb020av').datagrid({
    url: 'ffb020av.action?reqtype=queryRequireParams',
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
<div id="dlgFfb020av" class="easyui-dialog pop-dialog" buttons="#dlgFfb020avButtons" title="选择" closed="true">
  <div class="easyui-panel query-panel" title="查询选项" data-options="iconCls:'icon-search',collapsible:true,collapsed:true">
    <script type="text/javascript">
    function dlgFfb020avQuery(){
      var queryParams = createFfb020avQueryParams();
      $('#dgDetailsQueryFfb020av').datagrid('reload', queryParams);
    }
    function createFfb020avQueryParams(){
      var params = createQueryParams("detail_ffb020av_query");
      params['query.f0.isNotNullValue'] = 'true';
      return params;
    }
    function dlgFfb020avReset(){
      resetQueryInputs("detail_ffb020av_query");
      dlgFfb020avQuery();
    }
    </script>
    <div id="detail_ffb020av_query" class="query">
<%= displayQueryFields!=null? ui.createQueryInputs(displayQueryFields, true) : "" %>
<%= hiddenQueryFields!=null? ui.createQueryInputs(hiddenQueryFields, false) : "" %>
      <div>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" onclick="dlgFfb020avQuery()">查询</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="dlgFfb020avReset()">重置</a>
      </div>
    </div>
  </div>
  <div class="easyui-panel result-panel" title="查询结果" data-options="iconCls:'icon-edit',collapsible:true">
    <script type="text/javascript">
    $(function(){
      $('#dgDetailsQueryFfb020av').datagrid({
        url: 'ffb020av.action?reqtype=query',
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
    <table id="dgDetailsQueryFfb020av"></table>
  </div>
  <div id="dlgFfb020avButtons">
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="dlgFfb020avSelected()">确定</a> 
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlgFfb020av').dialog('close')">取消</a>
  </div>
</div>
<table id="dgDetailsFfb020av"></table>