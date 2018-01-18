<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" import="com.ysusoft.Util.*"%>
<%@ page language="java" import="com.ysusoft.ui.purchase.Ffb060tUi"%>
<% 
// parameters define
String targetDataGridId = "dgFfb060t";
String displayQueryFields = request.getParameter("displayQueryFields");
String hiddenQueryFields = request.getParameter("hiddenQueryFields");

// parameters initialize
if (request.getParameter("targetDataGridId") != null) targetDataGridId = request.getParameter("targetDataGridId");

// varibles
ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
Ffb060tUi ui = (Ffb060tUi) ctx.getBean("ffb060tUi");
%>
<script type="text/javascript">
function queryFfb060tEntity(){
  var queryParams = createFfb060tQueryParams();
  $('#<%= targetDataGridId%>').datagrid('reload', queryParams);
}
function createFfb060tQueryParams(){
  return createQueryParams("ffb060t_query");
}
function resetFfb060tQuery(){
  resetQueryInputs("ffb060t_query");
  queryFfb060tEntity();
}
</script>
<div id="ffb060t_query" class="query">
  <%= displayQueryFields!=null? ui.createQueryInputs(displayQueryFields, true) : "" %>
  <%= hiddenQueryFields!=null? ui.createQueryInputs(hiddenQueryFields, false) : "" %>
  <div>
    <a id="icon-search" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" >查询</a>
    <a id="icon-cancel" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" >重置</a>
  </div>
</div>