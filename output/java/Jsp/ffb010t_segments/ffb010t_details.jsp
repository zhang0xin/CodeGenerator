<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" import="com.ysusoft.Util.*"%>
<%@ page language="java" import="com.ysusoft.ui.purchase.Ffb010tUi"%>

<%
// parameters define
String targetProperty = "";
String suffix = "";
String reloadDetailsFunction = "reloadDetailsFfb010t";
String displayTableFields = request.getParameter("displayTableFields");
String hiddenTableFields = request.getParameter("hiddenTableFields");

// parameters initialize
if (request.getParameter("targetProperty") != null) targetProperty = request.getParameter("targetProperty");
if (request.getParameter("suffix") != null) suffix = request.getParameter("suffix");
if (request.getParameter("reloadDetailsFunction") != null) reloadDetailsFunction = request.getParameter("reloadDetailsFunction");

// varibles
ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
Ffb010tUi ui = (Ffb010tUi) ctx.getBean("ffb010tUi");

%>

<script type="text/javascript">
function <%= reloadDetailsFunction%>(params){
  $('#dgDetailsFfb010t<%= suffix %>').datagrid('reload', params);
}

$(function(){
  $('#dgDetailsFfb010t<%= suffix %>').datagrid({
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

<table id="dgDetailsFfb010t<%= suffix %>"></table>