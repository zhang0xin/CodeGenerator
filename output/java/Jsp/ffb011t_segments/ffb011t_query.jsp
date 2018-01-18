<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" import="com.ysusoft.Util.*"%>
<%@ page language="java" import="com.ysusoft.ui.purchase.Ffb011tUi"%>
<% 
// parameters define
String targetDataGridId = "dgFfb011t";
String displayQueryFields = request.getParameter("displayQueryFields");
String hiddenQueryFields = request.getParameter("hiddenQueryFields");

// parameters initialize
if (request.getParameter("targetDataGridId") != null) targetDataGridId = request.getParameter("targetDataGridId");

// varibles
ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
Ffb011tUi ui = (Ffb011tUi) ctx.getBean("ffb011tUi");
%>
<script type="text/javascript">
function queryFfb011tEntity(){
  var queryParams = createFfb011tQueryParams();
  $('#<%= targetDataGridId%>').datagrid('reload', queryParams);
}
function createFfb011tQueryParams(){
  return createQueryParams("ffb011t_query");
}
function resetFfb011tQuery(){
  resetQueryInputs("ffb011t_query");
  queryFfb011tEntity();
}
</script>
<div id="ffb011t_query" class="query">
  <%= displayQueryFields!=null? ui.createQueryInputs(displayQueryFields, true) : "" %>
  <%= hiddenQueryFields!=null? ui.createQueryInputs(hiddenQueryFields, false) : "" %>
  <div>
    <a id="icon-search" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" >查询</a>
    <a id="icon-cancel" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" >重置</a>
  </div>
</div>