<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>采购审批管理</title>
  
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
      $('#icon-add').bind("click",function(){newFfb011v010pEntity();});
      $('#icon-edit').bind("click",function(){editFfb011v010pEntity();});
      $('#icon-remove').bind("click",function(){deleteFfb011v010pEntity();});
      $('#icon-search').bind("click",function(){queryFfb011vEntity();});
      $('#icon-cancel').bind("click",function(){resetFfb011vQuery();});
      $('#icon-export').bind("click",function(){exportFfb011v010pEntities();});
      $('#icon-file-lock').bind("click",function(){archiveFfb011v010pEntities();});
      $('#icon-file-unlock').bind("click",function(){activeFfb011v010pEntities();});
      
    });
    
    function newFfb011v010pEntity(){
      $('#dlgFfb011v010pEntity').dialog('open').dialog('setTitle', '新建');
      $('#frmFfb011vEntity').form('clear');
    }
    
    function editFfb011v010pEntity(){
      var r = $('#dgFfb011v010p').datagrid('getSelected');
      if(r==null){
        $.messager.alert('系统提示', '请选中要编辑的行!', 'warning');
        return;
      }
      loadFfb011vEntity(r);
      
      $('#dlgFfb011v010pEntity').dialog('open').dialog('setTitle', '编辑');
    }
    
    function saveFfb011v010pEntity(){
      if (!$("#frmFfb011vEntity").form("validate")){
        $.messager.alert("系统提示", "请确保录入字段都符合正确的格式或录入了所有的必填字段，查找表单中红色部分并修改。")
        return;
      }
      var row = $("#dgFfb011v010p").datagrid("getSelected")
      if (($("dlgFfb011v010pEntity input[name='entity.f0']").val() == "")) row = {};
      var entity = createEntityData("frmFfb011vEntity", row)
      $.post("ffb011v010p.action?reqtype=save", entity, function(data){
        if (data.success){
          $("#frmFfb011vEntity").form("clear");
          $("#dlgFfb011v010pEntity").dialog("close");
          $("#dgFfb011v010p").datagrid("reload");
        }else{
          $.messager.alert("系统提示", data.message);
        }
      }, "JSON");
    }
    
    function deleteFfb011v010pEntity(){
      executeCommand("ffb011v", "delete", "dgFfb011v010p", "请选择要删除的行!", true, "确认删除吗？")
    }
    
    function archiveFfb011v010pEntities(){ 
      executeCommand("ffb011v010p", "archive", "dgFfb011v010p", "请选择要归档的行!")
    }
    
    function activeFfb011v010pEntities(){
      executeCommand("ffb011v010p", "active", "dgFfb011v010p", "请选择要激活的行!") 
    }
    
    function exportFfb011v010pEntities(){
      var queryParams = createFfb011vQueryParams();
      queryParams.selectedColumns = getColumnDescriptions($('#dgFfb011v010p'));
      
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

    function onFfb011v010pDblClickRow(rowIndex, rowData){
      if ($('#icon-edit').length == 0) return;
      editFfb011v010pEntity();
    }
    
    function onFfb011v010pClickRow(rowIndex, rowData){
      var r = $('#dgFfb011v010p').datagrid('getSelected');
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
        <jsp:param name="displayQueryFields" value="prevState, nextOrder, purchaseBatchId, tradeType, oreArea, materialId, unit, portLoadDate, portLoadName, portArrivedDate, portArrivedName, buyer, seller, resourceLocation, auditState, createBy, createDate, updateBy, updateDate" />
        <jsp:param name="targetDataGridId" value="dgFfb011v010p" />
      </jsp:include>
    </div>
    <div class="easyui-panel" title="采购审批" data-options="iconCls:'icon-edit',collapsible:true">
      <jsp:include page="ffb011v_segments/ffb011v_grid.jsp" >
        <jsp:param name="displayTableFields" value="prevState, nextOrder, purchaseBatchId, tradeType, oreArea, materialId, tfe, h2o, sio2, al2o3, p, s, other, price, purchaseQuantity, unit, portLoadDate, portLoadName, portArrivedDate, portArrivedName, buyer, seller, resourceLocation, auditState, createBy, createDate, updateBy, updateDate" />
        <jsp:param name="onDblClickRow" value="function(rowIndex, rowData){ onFfb011v010pDblClickRow(rowIndex, rowData); }" />
        <jsp:param name="onClickRow" value="function(rowIndex, rowData){ onFfb011v010pClickRow(rowIndex, rowData); }" />
        <jsp:param name="dataGridId" value="dgFfb011v010p" />
        <jsp:param name="hiddenCheckboxColumn" value="false" />
      </jsp:include> 
    </div>

    <div id="dlgFfb011v010pEntity" class="easyui-dialog edit-dialog" buttons="#dlg-buttons" title="新建" closed="true" >
      <jsp:include page="ffb011v_segments/ffb011v_edit.jsp" >
        <jsp:param name="displayEditFields" value="" />
        <jsp:param name="formId" value="frmEntity" />
      </jsp:include> 
      <div id="dlg-buttons">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveFfb011v010pEntity()">保存</a> 
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlgFfb011v010pEntity').dialog('close')">取消</a>
      </div>
    </div>
    
    
  </body>
</html>
