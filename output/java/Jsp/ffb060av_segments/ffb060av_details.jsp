<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" import="com.ysusoft.Util.*"%>
<%@ page language="java" import="com.ysusoft.ui.purchase.Ffb060avUi"%>

<%
// parameters define
String targetProperty = "";
String suffix = "";
String reloadDetailsFunction = "reloadDetailsFfb060av";
String displayTableFields = request.getParameter("displayTableFields");
String hiddenTableFields = request.getParameter("hiddenTableFields");

// parameters initialize
if (request.getParameter("targetProperty") != null) targetProperty = request.getParameter("targetProperty");
if (request.getParameter("suffix") != null) suffix = request.getParameter("suffix");
if (request.getParameter("reloadDetailsFunction") != null) reloadDetailsFunction = request.getParameter("reloadDetailsFunction");

// varibles
ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
Ffb060avUi ui = (Ffb060avUi) ctx.getBean("ffb060avUi");

%>

<script type="text/javascript">
function <%= reloadDetailsFunction%>(params){
  $('#dgDetailsFfb060av<%= suffix %>').datagrid('reload', params);
}

$(function(){
  $('#dgDetailsFfb060av<%= suffix %>').datagrid({
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

<table id="dgDetailsFfb060av<%= suffix %>"></table>