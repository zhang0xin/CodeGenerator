<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" import="com.ysusoft.Util.*"%>
<%@ page language="java" import="com.ysusoft.ui.purchase.DepartmentUi"%>
<% 
// parameters define
String targetDataGridId = "dgDepartment";
String displayQueryFields = request.getParameter("displayQueryFields");
String hiddenQueryFields = request.getParameter("hiddenQueryFields");

// parameters initialize
if (request.getParameter("targetDataGridId") != null) targetDataGridId = request.getParameter("targetDataGridId");

// varibles
ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
DepartmentUi ui = (DepartmentUi) ctx.getBean("departmentUi");
%>
<script type="text/javascript">
function queryDepartmentEntity(){
  var queryParams = createDepartmentQueryParams();
  $('#<%= targetDataGridId%>').datagrid('reload', queryParams);
}
function createDepartmentQueryParams(){
  return createQueryParams("department_query");
}
function resetDepartmentQuery(){
  resetQueryInputs("department_query");
  queryDepartmentEntity();
}
</script>
<div id="department_query" class="query">
  <%= displayQueryFields!=null? ui.createQueryInputs(displayQueryFields, true) : "" %>
  <%= hiddenQueryFields!=null? ui.createQueryInputs(hiddenQueryFields, false) : "" %>
  <div>
    <a id="icon-search" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" >查询</a>
    <a id="icon-cancel" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" >重置</a>
  </div>
</div>