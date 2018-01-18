<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>部门管理</title>
  
    <link rel="stylesheet" type="text/css" href="../../jquery-easyui-1.4.1/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../jquery-easyui-1.4.1/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="../../jquery-easyui-1.4.1/demo/demo.css">
    <link rel="stylesheet" type="text/css" href="../../css/common.css">
    <script type="text/javascript" src="../../jquery-easyui-1.4.1/jquery.min.js"></script>
    <script type="text/javascript" src="../../jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../../jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="../../js/common-purchase.js"></script>
  
  <script type="text/javascript">
    
    var currencyTypeDict = 
    <s:action name="zaa010t" executeResult="true">
      <s:param name="req.type">getDictOnCategory</s:param>
      <s:param name="category">2003</s:param>
    </s:action>;
    
    
    $(function(){
      //getButtion("dynamic-buttons","department");
      $('#icon-add').bind("click",function(){newDepartmentEntity();});
      $('#icon-edit').bind("click",function(){editDepartmentEntity();});
      $('#icon-remove').bind("click",function(){deleteDepartmentEntity();});
      $('#icon-search').bind("click",function(){queryDepartmentEntity();});
      $('#icon-cancel').bind("click",function(){resetDepartmentQuery();});
      $('#icon-export').bind("click",function(){exportDepartmentEntities();});
      $('#icon-file-lock').bind("click",function(){archiveDepartmentEntities();});
      $('#icon-file-unlock').bind("click",function(){activeDepartmentEntities();});
      
    });
    
    function newDepartmentEntity(){
      $('#dlgDepartmentEntity').dialog('open').dialog('setTitle', '新建');
      $('#frmDepartmentEntity').form('clear');
    }
    
    function editDepartmentEntity(){
      var r = $('#dgDepartment').datagrid('getSelected');
      if(r==null){
        $.messager.alert('系统提示', '请选中要编辑的行!', 'warning');
        return;
      }
      loadDepartmentEntity(r);
      
      $('#dlgDepartmentEntity').dialog('open').dialog('setTitle', '编辑');
    }
    
    function saveDepartmentEntity(){
      if (!$("#frmDepartmentEntity").form("validate")){
        $.messager.alert("系统提示", "请确保录入字段都符合正确的格式或录入了所有的必填字段，查找表单中红色部分并修改。")
        return;
      }
      var row = $("#dgDepartment").datagrid("getSelected")
      if (($("dlgDepartmentEntity input[name='entity.f0']").val() == "")) row = {};
      var entity = createEntityData("frmDepartmentEntity", row)
      $.post("department.action?reqtype=save", entity, function(data){
        if (data.success){
          $("#frmDepartmentEntity").form("clear");
          $("#dlgDepartmentEntity").dialog("close");
          $("#dgDepartment").datagrid("reload");
        }else{
          $.messager.alert("系统提示", data.message);
        }
      }, "JSON");
    }
    
    function deleteDepartmentEntity(){
      executeCommand("department", "delete", "dgDepartment", "请选择要删除的行!", true, "确认删除吗？")
    }
    
    function archiveDepartmentEntities(){ 
      executeCommand("department", "archive", "dgDepartment", "请选择要归档的行!")
    }
    
    function activeDepartmentEntities(){
      executeCommand("department", "active", "dgDepartment", "请选择要激活的行!") 
    }
    
    function exportDepartmentEntities(){
      var queryParams = createDepartmentQueryParams();
      queryParams.selectedColumns = getColumnDescriptions($('#dgDepartment'));
      
      $.ajax({
        url: "department.action?reqtype=export",
        type: "POST",
        beforeSend:$.ajaxLoading,
        dataType: 'json',
        data: queryParams,
        success: function(data) {
          $.ajaxLoadEnd();
          if (data.success == true) {
            download('download.xlsx', data.serverFileName);
          }else{
            $.messager.alert('系统提示', '导出失败!', 'error');
          }
        }
      });
    }

    function onDepartmentDblClickRow(rowIndex, rowData){
      if ($('#icon-edit').length == 0) return;
      editDepartmentEntity();
    }
    
    function onDepartmentClickRow(rowIndex, rowData){
      var r = $('#dgDepartment').datagrid('getSelected');
      loadDepartmentEntity(r);
      
    }
  </script>
  </head>
  
  <body style="margin:0;padding:0px;">
    <div id="dynamic-buttons"></div>
    <div>
      <a id="icon-add" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" >新建</a>
      <a id="icon-edit" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" >编辑</a>
      <a id="icon-remove" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" >删除</a>
      <a id="icon-export" href="javascript:void(0)"  class="easyui-linkbutton"  iconCls="icon-export" plain="true">导出</a>
      
      <a id="icon-file-lock" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-file-lock" plain="true" >归档</a>
      <a id="icon-file-unlock" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-file-unlock" plain="true" >激活</a>
    </div>
    <div class="easyui-panel" title="查询选项" data-options="iconCls:'icon-search',collapsible:true,collapsed:true">
      <jsp:include page="department_segments/department_query.jsp" >
        <jsp:param name="displayQueryFields" value="departmentId, studentCount, name, dt, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="targetDataGridId" value="dgDepartment" />
      </jsp:include>
    </div>
    <div class="easyui-panel" title="部门" data-options="iconCls:'icon-edit',collapsible:true">
      <jsp:include page="department_segments/department_grid.jsp" >
        <jsp:param name="displayTableFields" value="departmentId, studentCount, name, dt, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="onDblClickRow" value="function(rowIndex, rowData){ onDepartmentDblClickRow(rowIndex, rowData); }" />
        <jsp:param name="onClickRow" value="function(rowIndex, rowData){ onDepartmentClickRow(rowIndex, rowData); }" />
        <jsp:param name="dataGridId" value="dgDepartment" />
        <jsp:param name="hiddenCheckboxColumn" value="false" />
      </jsp:include> 
    </div>

    <div id="dlgDepartmentEntity" class="easyui-dialog edit-dialog" buttons="#dlg-buttons" title="新建" closed="true" >
      <jsp:include page="department_segments/department_edit.jsp" >
        <jsp:param name="displayEditFields" value="departmentId, studentCount, name, dt, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="formId" value="frmEntity" />
      </jsp:include> 
      <div id="dlg-buttons">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveDepartmentEntity()">保存</a> 
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlgDepartmentEntity').dialog('close')">取消</a>
      </div>
    </div>
    
    
  </body>
</html>
