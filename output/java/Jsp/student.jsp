<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>学生管理</title>
  
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
      //getButtion("dynamic-buttons","student");
      $('#icon-add').bind("click",function(){newStudentEntity();});
      $('#icon-edit').bind("click",function(){editStudentEntity();});
      $('#icon-remove').bind("click",function(){deleteStudentEntity();});
      $('#icon-search').bind("click",function(){queryStudentEntity();});
      $('#icon-cancel').bind("click",function(){resetStudentQuery();});
      $('#icon-export').bind("click",function(){exportStudentEntities();});
      $('#icon-file-lock').bind("click",function(){archiveStudentEntities();});
      $('#icon-file-unlock').bind("click",function(){activeStudentEntities();});
      
    });
    
    function newStudentEntity(){
      $('#dlgStudentEntity').dialog('open').dialog('setTitle', '新建');
      $('#frmStudentEntity').form('clear');
    }
    
    function editStudentEntity(){
      var r = $('#dgStudent').datagrid('getSelected');
      if(r==null){
        $.messager.alert('系统提示', '请选中要编辑的行!', 'warning');
        return;
      }
      loadStudentEntity(r);
      
      $('#dlgStudentEntity').dialog('open').dialog('setTitle', '编辑');
    }
    
    function saveStudentEntity(){
      if (!$("#frmStudentEntity").form("validate")){
        $.messager.alert("系统提示", "请确保录入字段都符合正确的格式或录入了所有的必填字段，查找表单中红色部分并修改。")
        return;
      }
      var row = $("#dgStudent").datagrid("getSelected")
      if (($("dlgStudentEntity input[name='entity.f0']").val() == "")) row = {};
      var entity = createEntityData("frmStudentEntity", row)
      $.post("student.action?reqtype=save", entity, function(data){
        if (data.success){
          $("#frmStudentEntity").form("clear");
          $("#dlgStudentEntity").dialog("close");
          $("#dgStudent").datagrid("reload");
        }else{
          $.messager.alert("系统提示", data.message);
        }
      }, "JSON");
    }
    
    function deleteStudentEntity(){
      executeCommand("student", "delete", "dgStudent", "请选择要删除的行!", true, "确认删除吗？")
    }
    
    function archiveStudentEntities(){ 
      executeCommand("student", "archive", "dgStudent", "请选择要归档的行!")
    }
    
    function activeStudentEntities(){
      executeCommand("student", "active", "dgStudent", "请选择要激活的行!") 
    }
    
    function exportStudentEntities(){
      var queryParams = createStudentQueryParams();
      queryParams.selectedColumns = getColumnDescriptions($('#dgStudent'));
      
      $.ajax({
        url: "student.action?reqtype=export",
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

    function onStudentDblClickRow(rowIndex, rowData){
      if ($('#icon-edit').length == 0) return;
      editStudentEntity();
    }
    
    function onStudentClickRow(rowIndex, rowData){
      var r = $('#dgStudent').datagrid('getSelected');
      loadStudentEntity(r);
      
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
      <jsp:include page="student_segments/student_query.jsp" >
        <jsp:param name="displayQueryFields" value="departmentId, name, inDate, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="targetDataGridId" value="dgStudent" />
      </jsp:include>
    </div>
    <div class="easyui-panel" title="学生" data-options="iconCls:'icon-edit',collapsible:true">
      <jsp:include page="student_segments/student_grid.jsp" >
        <jsp:param name="displayTableFields" value="departmentId, name, inDate, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="onDblClickRow" value="function(rowIndex, rowData){ onStudentDblClickRow(rowIndex, rowData); }" />
        <jsp:param name="onClickRow" value="function(rowIndex, rowData){ onStudentClickRow(rowIndex, rowData); }" />
        <jsp:param name="dataGridId" value="dgStudent" />
        <jsp:param name="hiddenCheckboxColumn" value="false" />
      </jsp:include> 
    </div>

    <div id="dlgStudentEntity" class="easyui-dialog edit-dialog" buttons="#dlg-buttons" title="新建" closed="true" >
      <jsp:include page="student_segments/student_edit.jsp" >
        <jsp:param name="displayEditFields" value="departmentId, name, inDate, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="formId" value="frmEntity" />
      </jsp:include> 
      <div id="dlg-buttons">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveStudentEntity()">保存</a> 
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlgStudentEntity').dialog('close')">取消</a>
      </div>
    </div>
    
    <jsp:include page="department_segments/department_dialog_selector.jsp" >
      <jsp:param name="bindTargets" value="query_student_departmentId, form_student_departmentId" />
      <jsp:param name="valueField" value="departmentId" />
      <jsp:param name="displayQueryFields" value="departmentId, studentCount, name, dt, createBy, createDate, updateBy, updateDate, archived" />  
      <jsp:param name="displayTableFields" value="departmentId, studentCount, name, dt, createBy, createDate, updateBy, updateDate, archived" />
    </jsp:include>
    
  </body>
</html>
