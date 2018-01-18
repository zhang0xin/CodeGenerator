<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>船运可见部门管理</title>
  
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
      //getButtion("dynamic-buttons","ffb020av");
      $('#icon-add').bind("click",function(){newFfb020avEntity();});
      $('#icon-edit').bind("click",function(){editFfb020avEntity();});
      $('#icon-remove').bind("click",function(){deleteFfb020avEntity();});
      $('#icon-search').bind("click",function(){queryFfb020avEntity();});
      $('#icon-cancel').bind("click",function(){resetFfb020avQuery();});
      $('#icon-export').bind("click",function(){exportFfb020avEntities();});
      $('#icon-file-lock').bind("click",function(){archiveFfb020avEntities();});
      $('#icon-file-unlock').bind("click",function(){activeFfb020avEntities();});
      
    });
    
    function newFfb020avEntity(){
      $('#dlgFfb020avEntity').dialog('open').dialog('setTitle', '新建');
      $('#frmFfb020avEntity').form('clear');
    }
    
    function editFfb020avEntity(){
      var r = $('#dgFfb020av').datagrid('getSelected');
      if(r==null){
        $.messager.alert('系统提示', '请选中要编辑的行!', 'warning');
        return;
      }
      loadFfb020avEntity(r);
      
      $('#dlgFfb020avEntity').dialog('open').dialog('setTitle', '编辑');
    }
    
    function saveFfb020avEntity(){
      if (!$("#frmFfb020avEntity").form("validate")){
        $.messager.alert("系统提示", "请确保录入字段都符合正确的格式或录入了所有的必填字段，查找表单中红色部分并修改。")
        return;
      }
      var row = $("#dgFfb020av").datagrid("getSelected")
      if (($("dlgFfb020avEntity input[name='entity.f0']").val() == "")) row = {};
      var entity = createEntityData("frmFfb020avEntity", row)
      $.post("ffb020av.action?reqtype=save", entity, function(data){
        if (data.success){
          $("#frmFfb020avEntity").form("clear");
          $("#dlgFfb020avEntity").dialog("close");
          $("#dgFfb020av").datagrid("reload");
        }else{
          $.messager.alert("系统提示", data.message);
        }
      }, "JSON");
    }
    
    function deleteFfb020avEntity(){
      executeCommand("ffb020av", "delete", "dgFfb020av", "请选择要删除的行!", true, "确认删除吗？")
    }
    
    function archiveFfb020avEntities(){ 
      executeCommand("ffb020av", "archive", "dgFfb020av", "请选择要归档的行!")
    }
    
    function activeFfb020avEntities(){
      executeCommand("ffb020av", "active", "dgFfb020av", "请选择要激活的行!") 
    }
    
    function exportFfb020avEntities(){
      var queryParams = createFfb020avQueryParams();
      queryParams.selectedColumns = getColumnDescriptions($('#dgFfb020av'));
      
      $.ajax({
        url: "ffb020av.action?reqtype=export",
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

    function onFfb020avDblClickRow(rowIndex, rowData){
      if ($('#icon-edit').length == 0) return;
      editFfb020avEntity();
    }
    
    function onFfb020avClickRow(rowIndex, rowData){
      var r = $('#dgFfb020av').datagrid('getSelected');
      loadFfb020avEntity(r);
      
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
      <jsp:include page="ffb020av_segments/ffb020av_query.jsp" >
        <jsp:param name="displayQueryFields" value="shipBatchId, visibleDepartment" />
        <jsp:param name="targetDataGridId" value="dgFfb020av" />
      </jsp:include>
    </div>
    <div class="easyui-panel" title="船运可见部门" data-options="iconCls:'icon-edit',collapsible:true">
      <jsp:include page="ffb020av_segments/ffb020av_grid.jsp" >
        <jsp:param name="displayTableFields" value="shipBatchId, visibleDepartment" />
        <jsp:param name="onDblClickRow" value="function(rowIndex, rowData){ onFfb020avDblClickRow(rowIndex, rowData); }" />
        <jsp:param name="onClickRow" value="function(rowIndex, rowData){ onFfb020avClickRow(rowIndex, rowData); }" />
        <jsp:param name="dataGridId" value="dgFfb020av" />
        <jsp:param name="hiddenCheckboxColumn" value="false" />
      </jsp:include> 
    </div>

    <div id="dlgFfb020avEntity" class="easyui-dialog edit-dialog" buttons="#dlg-buttons" title="新建" closed="true" >
      <jsp:include page="ffb020av_segments/ffb020av_edit.jsp" >
        <jsp:param name="displayEditFields" value="shipBatchId, visibleDepartment" />
        <jsp:param name="formId" value="frmEntity" />
      </jsp:include> 
      <div id="dlg-buttons">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveFfb020avEntity()">保存</a> 
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlgFfb020avEntity').dialog('close')">取消</a>
      </div>
    </div>
    
    
  </body>
</html>
