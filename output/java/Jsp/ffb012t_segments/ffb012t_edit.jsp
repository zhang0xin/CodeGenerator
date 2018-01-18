<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" import="com.ysusoft.Util.*"%>
<%@ page language="java" import="com.ysusoft.ui.purchase.Ffb012tUi"%>
<% 
// parameters define
String targetDataGridId = "dgFfb012t";
String displayEditFields = request.getParameter("displayEditFields");
String hiddenEditFields = request.getParameter("hiddenEditFields");

// parameters initialize
if (request.getParameter("targetDataGridId") != null) targetDataGridId = request.getParameter("targetDataGridId");

// varibles
ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
Ffb012tUi ui = (Ffb012tUi) ctx.getBean("ffb012tUi");
%>
<script type="text/javascript">
function loadFfb012tEntity(r){
  loadFormData("frmFfb012tEntity", r);
}
</script>
<form id="frmFfb012tEntity" method="post" enctype="multipart/form-data">
<%= displayEditFields!=null? ui.createFormInputs(displayEditFields, true) : "" %>
<%= hiddenEditFields!=null? ui.createFormInputs(hiddenEditFields, false) : "" %>
</form>