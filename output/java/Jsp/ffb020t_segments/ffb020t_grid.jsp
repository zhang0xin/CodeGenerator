<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" import="com.ysusoft.Util.*"%>
<%@ page language="java" import="com.ysusoft.ui.purchase.Ffb020tUi"%>
<!-- Ffb020t_grid start  -->
<% 
// parameters define
Map<String,Boolean> tableFields = new HashMap<String,Boolean>();
String onDblClickRow = "function(){/*do nothing*/}";
String onClickRow = "function(){/*do nothing*/}";
String dataGridId = "dgFfb020t";
String hiddenCheckboxColumn = "false";
String reqtype = "query";
String displayTableFields = request.getParameter("displayTableFields");
String hiddenTableFields = request.getParameter("hiddenTableFields");

// parameters initialize
if (request.getParameter("onDblClickRow") != null) onDblClickRow = request.getParameter("onDblClickRow");
if (request.getParameter("onClickRow") != null) onClickRow = request.getParameter("onClickRow");
if (request.getParameter("dataGridId") != null) dataGridId = request.getParameter("dataGridId");
if (request.getParameter("hiddenCheckboxColumn") != null) hiddenCheckboxColumn = request.getParameter("hiddenCheckboxColumn");
if (request.getParameter("reqtype") != null) reqtype = request.getParameter("reqtype");

// varibles
ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
Ffb020tUi ui = (Ffb020tUi) ctx.getBean("ffb020tUi");
%>
<script type="text/javascript">
$(function(){
  var params = {}
  if (typeof createFfb020tQueryParams != 'undefined')
    params = createFfb020tQueryParams()
  $('#<%= dataGridId %>').datagrid({
    url: 'ffb020t.action?reqtype=<%=reqtype%>',
    queryParams: params,
    singleSelect: true,
    selectOnCheck: false,
    checkOnSelect: false,
    pagination: true,
    pageSize: 5,
    pageList: [5,10,20,30,40,50],
    rownumbers: true, 
    fitColumns: false,
    onClickRow: <%= onClickRow %>,
    onDblClickRow:  <%= onDblClickRow %>,
    onHeaderContextMenu: function(e, field){
      e.preventDefault();
      if (typeof columnSelectMenu == 'undefined') 
        columnSelectMenu = createColumnMenu($('#<%= dataGridId %>'));
      columnSelectMenu.menu('show', {left : e.pageX, top : e.pageY});
    },
    columns: [[
      {field: 'ck', title: '复选框', checkbox: true, hidden: <%= hiddenCheckboxColumn%> },
<%= displayTableFields!=null? ui.createDataGridColumn(displayTableFields, true) : "" %>
<%= hiddenTableFields!=null? ui.createDataGridColumn(hiddenTableFields, false) : "" %>
    ]]
  });
})
</script>
<table id="<%= dataGridId %>"></table>
<!-- Ffb020t_grid end  -->