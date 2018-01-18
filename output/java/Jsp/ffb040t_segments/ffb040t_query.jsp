<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" import="com.ysusoft.Util.*"%>
<%@ page language="java" import="com.ysusoft.ui.purchase.Ffb040tUi"%>
<% 
// parameters define
String targetDataGridId = "dgFfb040t";
String displayQueryFields = request.getParameter("displayQueryFields");
String hiddenQueryFields = request.getParameter("hiddenQueryFields");

// parameters initialize
if (request.getParameter("targetDataGridId") != null) targetDataGridId = request.getParameter("targetDataGridId");

// varibles
ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
Ffb040tUi ui = (Ffb040tUi) ctx.getBean("ffb040tUi");
%>
<script type="text/javascript">
function queryFfb040tEntity(){
  var queryParams = createFfb040tQueryParams();
  $('#<%= targetDataGridId%>').datagrid('reload', queryParams);
}
function createFfb040tQueryParams(){
  return createQueryParams("ffb040t_query");
}
function resetFfb040tQuery(){
  resetQueryInputs("ffb040t_query");
  queryFfb040tEntity();
}
</script>
<div id="ffb040t_query" class="query">
  <%= displayQueryFields!=null? ui.createQueryInputs(displayQueryFields, true) : "" %>
  <%= hiddenQueryFields!=null? ui.createQueryInputs(hiddenQueryFields, false) : "" %>
  <div>
    <a id="icon-search" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" >查询</a>
    <a id="icon-cancel" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" >重置</a>
  </div>
</div>