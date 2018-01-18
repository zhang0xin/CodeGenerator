<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" import="com.ysusoft.Util.*"%>
<%@ page language="java" import="com.ysusoft.ui.purchase.Ffb030tUi"%>
<% 
// parameters define
String targetDataGridId = "dgFfb030t";
String displayQueryFields = request.getParameter("displayQueryFields");
String hiddenQueryFields = request.getParameter("hiddenQueryFields");

// parameters initialize
if (request.getParameter("targetDataGridId") != null) targetDataGridId = request.getParameter("targetDataGridId");

// varibles
ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
Ffb030tUi ui = (Ffb030tUi) ctx.getBean("ffb030tUi");
%>
<script type="text/javascript">
function queryFfb030tEntity(){
  var queryParams = createFfb030tQueryParams();
  $('#<%= targetDataGridId%>').datagrid('reload', queryParams);
}
function createFfb030tQueryParams(){
  return createQueryParams("ffb030t_query");
}
function resetFfb030tQuery(){
  resetQueryInputs("ffb030t_query");
  queryFfb030tEntity();
}
</script>
<div id="ffb030t_query" class="query">
  <%= displayQueryFields!=null? ui.createQueryInputs(displayQueryFields, true) : "" %>
  <%= hiddenQueryFields!=null? ui.createQueryInputs(hiddenQueryFields, false) : "" %>
  <div>
    <a id="icon-search" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" >查询</a>
    <a id="icon-cancel" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" >重置</a>
  </div>
</div>