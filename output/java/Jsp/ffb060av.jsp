<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>合同可见部门管理</title>
  
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
      //getButtion("dynamic-buttons","ffb060av");
      $('#icon-add').bind("click",function(){newFfb060avEntity();});
      $('#icon-edit').bind("click",function(){editFfb060avEntity();});
      $('#icon-remove').bind("click",function(){deleteFfb060avEntity();});
      $('#icon-search').bind("click",function(){queryFfb060avEntity();});
      $('#icon-cancel').bind("click",function(){resetFfb060avQuery();});
      $('#icon-export').bind("click",function(){exportFfb060avEntities();});
      $('#icon-file-lock').bind("click",function(){archiveFfb060avEntities();});
      $('#icon-file-unlock').bind("click",function(){activeFfb060avEntities();});
      
    });
    
    function newFfb060avEntity(){
      $('#dlgFfb060avEntity').dialog('open').dialog('setTitle', '新建');
      $('#frmFfb060avEntity').form('clear');
    }
    
    function editFfb060avEntity(){
      var r = $('#dgFfb060av').datagrid('getSelected');
      if(r==null){
        $.messager.alert('系统提示', '请选中要编辑的行!', 'warning');
        return;
      }
      loadFfb060avEntity(r);
      
      $('#dlgFfb060avEntity').dialog('open').dialog('setTitle', '编辑');
    }
    
    function saveFfb060avEntity(){
      if (!$("#frmFfb060avEntity").form("validate")){
        $.messager.alert("系统提示", "请确保录入字段都符合正确的格式或录入了所有的必填字段，查找表单中红色部分并修改。")
        return;
      }
      var row = $("#dgFfb060av").datagrid("getSelected")
      if (($("dlgFfb060avEntity input[name='entity.f0']").val() == "")) row = {};
      var entity = createEntityData("frmFfb060avEntity", row)
      $.post("ffb060av.action?reqtype=save", entity, function(data){
        if (data.success){
          $("#frmFfb060avEntity").form("clear");
          $("#dlgFfb060avEntity").dialog("close");
          $("#dgFfb060av").datagrid("reload");
        }else{
          $.messager.alert("系统提示", data.message);
        }
      }, "JSON");
    }
    
    function deleteFfb060avEntity(){
      executeCommand("ffb060av", "delete", "dgFfb060av", "请选择要删除的行!", true, "确认删除吗？")
    }
    
    function archiveFfb060avEntities(){ 
      executeCommand("ffb060av", "archive", "dgFfb060av", "请选择要归档的行!")
    }
    
    function activeFfb060avEntities(){
      executeCommand("ffb060av", "active", "dgFfb060av", "请选择要激活的行!") 
    }
    
    function exportFfb060avEntities(){
      var queryParams = createFfb060avQueryParams();
      queryParams.selectedColumns = getColumnDescriptions($('#dgFfb060av'));
      
      $.ajax({
        url: "ffb060av.action?reqtype=export",
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

    function onFfb060avDblClickRow(rowIndex, rowData){
      if ($('#icon-edit').length == 0) return;
      editFfb060avEntity();
    }
    
    function onFfb060avClickRow(rowIndex, rowData){
      var r = $('#dgFfb060av').datagrid('getSelected');
      loadFfb060avEntity(r);
      
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
      <jsp:include page="ffb060av_segments/ffb060av_query.jsp" >
        <jsp:param name="displayQueryFields" value="contractNumber, visibleDepartment" />
        <jsp:param name="targetDataGridId" value="dgFfb060av" />
      </jsp:include>
    </div>
    <div class="easyui-panel" title="合同可见部门" data-options="iconCls:'icon-edit',collapsible:true">
      <jsp:include page="ffb060av_segments/ffb060av_grid.jsp" >
        <jsp:param name="displayTableFields" value="contractNumber, visibleDepartment" />
        <jsp:param name="onDblClickRow" value="function(rowIndex, rowData){ onFfb060avDblClickRow(rowIndex, rowData); }" />
        <jsp:param name="onClickRow" value="function(rowIndex, rowData){ onFfb060avClickRow(rowIndex, rowData); }" />
        <jsp:param name="dataGridId" value="dgFfb060av" />
        <jsp:param name="hiddenCheckboxColumn" value="false" />
      </jsp:include> 
    </div>

    <div id="dlgFfb060avEntity" class="easyui-dialog edit-dialog" buttons="#dlg-buttons" title="新建" closed="true" >
      <jsp:include page="ffb060av_segments/ffb060av_edit.jsp" >
        <jsp:param name="displayEditFields" value="contractNumber, visibleDepartment" />
        <jsp:param name="formId" value="frmEntity" />
      </jsp:include> 
      <div id="dlg-buttons">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveFfb060avEntity()">保存</a> 
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlgFfb060avEntity').dialog('close')">取消</a>
      </div>
    </div>
    
    
  </body>
</html>
