<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>采购申请管理</title>
  
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
      //getButtion("dynamic-buttons","ffb011v");
      $('#icon-add').bind("click",function(){newFfb011vEntity();});
      $('#icon-edit').bind("click",function(){editFfb011vEntity();});
      $('#icon-remove').bind("click",function(){deleteFfb011vEntity();});
      $('#icon-search').bind("click",function(){queryFfb011vEntity();});
      $('#icon-cancel').bind("click",function(){resetFfb011vQuery();});
      $('#icon-export').bind("click",function(){exportFfb011vEntities();});
      $('#icon-file-lock').bind("click",function(){archiveFfb011vEntities();});
      $('#icon-file-unlock').bind("click",function(){activeFfb011vEntities();});
      
    });
    
    function newFfb011vEntity(){
      $('#dlgFfb011vEntity').dialog('open').dialog('setTitle', '新建');
      $('#frmFfb011vEntity').form('clear');
    }
    
    function editFfb011vEntity(){
      var r = $('#dgFfb011v').datagrid('getSelected');
      if(r==null){
        $.messager.alert('系统提示', '请选中要编辑的行!', 'warning');
        return;
      }
      loadFfb011vEntity(r);
      
      $('#dlgFfb011vEntity').dialog('open').dialog('setTitle', '编辑');
    }
    
    function saveFfb011vEntity(){
      if (!$("#frmFfb011vEntity").form("validate")){
        $.messager.alert("系统提示", "请确保录入字段都符合正确的格式或录入了所有的必填字段，查找表单中红色部分并修改。")
        return;
      }
      var row = $("#dgFfb011v").datagrid("getSelected")
      if (($("dlgFfb011vEntity input[name='entity.f0']").val() == "")) row = {};
      var entity = createEntityData("frmFfb011vEntity", row)
      $.post("ffb011v.action?reqtype=save", entity, function(data){
        if (data.success){
          $("#frmFfb011vEntity").form("clear");
          $("#dlgFfb011vEntity").dialog("close");
          $("#dgFfb011v").datagrid("reload");
        }else{
          $.messager.alert("系统提示", data.message);
        }
      }, "JSON");
    }
    
    function deleteFfb011vEntity(){
      executeCommand("ffb011v", "delete", "dgFfb011v", "请选择要删除的行!", true, "确认删除吗？")
    }
    
    function archiveFfb011vEntities(){ 
      executeCommand("ffb011v", "archive", "dgFfb011v", "请选择要归档的行!")
    }
    
    function activeFfb011vEntities(){
      executeCommand("ffb011v", "active", "dgFfb011v", "请选择要激活的行!") 
    }
    
    function exportFfb011vEntities(){
      var queryParams = createFfb011vQueryParams();
      queryParams.selectedColumns = getColumnDescriptions($('#dgFfb011v'));
      
      $.ajax({
        url: "ffb011v.action?reqtype=export",
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

    function onFfb011vDblClickRow(rowIndex, rowData){
      if ($('#icon-edit').length == 0) return;
      editFfb011vEntity();
    }
    
    function onFfb011vClickRow(rowIndex, rowData){
      var r = $('#dgFfb011v').datagrid('getSelected');
      loadFfb011vEntity(r);
      
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
      <jsp:include page="ffb011v_segments/ffb011v_query.jsp" >
        <jsp:param name="displayQueryFields" value="bizId, whereId, prevState, nextOrder, purchaseBatchId, tradeType, oreArea, materialId, tfe, h2o, sio2, al2o3, p, s, other, price, purchaseQuantity, unit, portLoadDate, portLoadName, portArrivedDate, portArrivedName, buyer, seller, resourceLocation, auditState, visibleDepartment, createBy, createDate, updateBy, updateDate, flowcd, endorder, checkpost, cd_nm, checkuserid, user_nm" />
        <jsp:param name="targetDataGridId" value="dgFfb011v" />
      </jsp:include>
    </div>
    <div class="easyui-panel" title="采购申请" data-options="iconCls:'icon-edit',collapsible:true">
      <jsp:include page="ffb011v_segments/ffb011v_grid.jsp" >
        <jsp:param name="displayTableFields" value="bizId, whereId, prevState, nextOrder, purchaseBatchId, tradeType, oreArea, materialId, tfe, h2o, sio2, al2o3, p, s, other, price, purchaseQuantity, unit, portLoadDate, portLoadName, portArrivedDate, portArrivedName, buyer, seller, resourceLocation, auditState, visibleDepartment, createBy, createDate, updateBy, updateDate, flowcd, endorder, checkpost, cd_nm, checkuserid, user_nm" />
        <jsp:param name="onDblClickRow" value="function(rowIndex, rowData){ onFfb011vDblClickRow(rowIndex, rowData); }" />
        <jsp:param name="onClickRow" value="function(rowIndex, rowData){ onFfb011vClickRow(rowIndex, rowData); }" />
        <jsp:param name="dataGridId" value="dgFfb011v" />
        <jsp:param name="hiddenCheckboxColumn" value="false" />
      </jsp:include> 
    </div>

    <div id="dlgFfb011vEntity" class="easyui-dialog edit-dialog" buttons="#dlg-buttons" title="新建" closed="true" >
      <jsp:include page="ffb011v_segments/ffb011v_edit.jsp" >
        <jsp:param name="displayEditFields" value="bizId, whereId, prevState, nextOrder, purchaseBatchId, tradeType, oreArea, materialId, tfe, h2o, sio2, al2o3, p, s, other, price, purchaseQuantity, unit, portLoadDate, portLoadName, portArrivedDate, portArrivedName, buyer, seller, resourceLocation, auditState, visibleDepartment, createBy, createDate, updateBy, updateDate, flowcd, endorder, checkpost, cd_nm, checkuserid, user_nm" />
        <jsp:param name="formId" value="frmEntity" />
      </jsp:include> 
      <div id="dlg-buttons">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveFfb011vEntity()">保存</a> 
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlgFfb011vEntity').dialog('close')">取消</a>
      </div>
    </div>
    
    
  </body>
</html>
