<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>卸港管理</title>
  
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
      //getButtion("dynamic-buttons","ffb030t");
      $('#icon-add').bind("click",function(){newFfb030tEntity();});
      $('#icon-edit').bind("click",function(){editFfb030tEntity();});
      $('#icon-remove').bind("click",function(){deleteFfb030tEntity();});
      $('#icon-search').bind("click",function(){queryFfb030tEntity();});
      $('#icon-cancel').bind("click",function(){resetFfb030tQuery();});
      $('#icon-export').bind("click",function(){exportFfb030tEntities();});
      $('#icon-file-lock').bind("click",function(){archiveFfb030tEntities();});
      $('#icon-file-unlock').bind("click",function(){activeFfb030tEntities();});
      
    });
    
    function newFfb030tEntity(){
      $('#dlgFfb030tEntity').dialog('open').dialog('setTitle', '新建');
      $('#frmFfb030tEntity').form('clear');
    }
    
    function editFfb030tEntity(){
      var r = $('#dgFfb030t').datagrid('getSelected');
      if(r==null){
        $.messager.alert('系统提示', '请选中要编辑的行!', 'warning');
        return;
      }
      loadFfb030tEntity(r);
      
      $('#dlgFfb030tEntity').dialog('open').dialog('setTitle', '编辑');
    }
    
    function saveFfb030tEntity(){
      if (!$("#frmFfb030tEntity").form("validate")){
        $.messager.alert("系统提示", "请确保录入字段都符合正确的格式或录入了所有的必填字段，查找表单中红色部分并修改。")
        return;
      }
      var row = $("#dgFfb030t").datagrid("getSelected")
      if (($("dlgFfb030tEntity input[name='entity.f0']").val() == "")) row = {};
      var entity = createEntityData("frmFfb030tEntity", row)
      $.post("ffb030t.action?reqtype=save", entity, function(data){
        if (data.success){
          $("#frmFfb030tEntity").form("clear");
          $("#dlgFfb030tEntity").dialog("close");
          $("#dgFfb030t").datagrid("reload");
        }else{
          $.messager.alert("系统提示", data.message);
        }
      }, "JSON");
    }
    
    function deleteFfb030tEntity(){
      executeCommand("ffb030t", "delete", "dgFfb030t", "请选择要删除的行!", true, "确认删除吗？")
    }
    
    function archiveFfb030tEntities(){ 
      executeCommand("ffb030t", "archive", "dgFfb030t", "请选择要归档的行!")
    }
    
    function activeFfb030tEntities(){
      executeCommand("ffb030t", "active", "dgFfb030t", "请选择要激活的行!") 
    }
    
    function exportFfb030tEntities(){
      var queryParams = createFfb030tQueryParams();
      queryParams.selectedColumns = getColumnDescriptions($('#dgFfb030t'));
      
      $.ajax({
        url: "ffb030t.action?reqtype=export",
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

    function onFfb030tDblClickRow(rowIndex, rowData){
      if ($('#icon-edit').length == 0) return;
      editFfb030tEntity();
    }
    
    function onFfb030tClickRow(rowIndex, rowData){
      var r = $('#dgFfb030t').datagrid('getSelected');
      loadFfb030tEntity(r);
      
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
      <jsp:include page="ffb030t_segments/ffb030t_query.jsp" >
        <jsp:param name="displayQueryFields" value="unloadPortId, unloadPort, shipBatchId, arrivedPortDate, berthDate, unloadedDate, departPortDate, finalReceiver, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="targetDataGridId" value="dgFfb030t" />
      </jsp:include>
    </div>
    <div class="easyui-panel" title="卸港" data-options="iconCls:'icon-edit',collapsible:true">
      <jsp:include page="ffb030t_segments/ffb030t_grid.jsp" >
        <jsp:param name="displayTableFields" value="unloadPortId, unloadPort, shipBatchId, arrivedPortDate, berthDate, unloadedDate, departPortDate, finalReceiver, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="onDblClickRow" value="function(rowIndex, rowData){ onFfb030tDblClickRow(rowIndex, rowData); }" />
        <jsp:param name="onClickRow" value="function(rowIndex, rowData){ onFfb030tClickRow(rowIndex, rowData); }" />
        <jsp:param name="dataGridId" value="dgFfb030t" />
        <jsp:param name="hiddenCheckboxColumn" value="false" />
      </jsp:include> 
    </div>

    <div id="dlgFfb030tEntity" class="easyui-dialog edit-dialog" buttons="#dlg-buttons" title="新建" closed="true" >
      <jsp:include page="ffb030t_segments/ffb030t_edit.jsp" >
        <jsp:param name="displayEditFields" value="unloadPortId, unloadPort, shipBatchId, arrivedPortDate, berthDate, unloadedDate, departPortDate, finalReceiver, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="formId" value="frmEntity" />
      </jsp:include> 
      <div id="dlg-buttons">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveFfb030tEntity()">保存</a> 
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlgFfb030tEntity').dialog('close')">取消</a>
      </div>
    </div>
    
    <jsp:include page="ffb020t_segments/ffb020t_dialog_selector.jsp" >
      <jsp:param name="bindTargets" value="query_ffb030t_shipBatchId, form_ffb030t_shipBatchId" />
      <jsp:param name="valueField" value="shipBatchId" />
      <jsp:param name="displayQueryFields" value="shipBatchId, shipNumber, lcNumber, portLoadName, portLoadShipAgent, sellerDelayDays, sellerDelayFee, sellerDelayFeeUnit, portLoadDelayFee, portLoadDelayFeeUnit, portLoadStartDate, portLoadEndDate, seaFirstSingleFee, seaFirstSingleFeeUnit, seaLastSingleFee, seaLastSingleFeeUnit, oilAdjustSingleFee, oilAdjustSingleFeeUnit, baseFee, baseFeeUnit, portAdjust, portAdjustUnit, oilAdjustFee, oilAdjustFeeUnit, transportFee, transportFeeUnit, transportFirstFee, transportFirstFeeUnit, shipownerFirstFeeDate, transportLastFee, transportLastFeeUnit, shipownerLastFeeDate, rentShipFirstFee, transportFirstFeeDate, seaLastFee, lastIssueDate, unitSeaFee, loadUnloadAdjust, uintOilAdjustFee, seaFirstFee, voyageShipownerFee, voyageRentFee, unitTransportFee, lastTransportFee, settlementDate, coaDifference, exchangeRate, finalReceiver, ffb020t050pArchived, currentLocation, arrivedSingaporeDate, unloadDate, createBy, createDate, updateBy, updateDate, archived" />  
      <jsp:param name="displayTableFields" value="shipBatchId, shipNumber, lcNumber, portLoadName, portLoadShipAgent, sellerDelayDays, sellerDelayFee, sellerDelayFeeUnit, portLoadDelayFee, portLoadDelayFeeUnit, portLoadStartDate, portLoadEndDate, seaFirstSingleFee, seaFirstSingleFeeUnit, seaLastSingleFee, seaLastSingleFeeUnit, oilAdjustSingleFee, oilAdjustSingleFeeUnit, baseFee, baseFeeUnit, portAdjust, portAdjustUnit, oilAdjustFee, oilAdjustFeeUnit, transportFee, transportFeeUnit, transportFirstFee, transportFirstFeeUnit, shipownerFirstFeeDate, transportLastFee, transportLastFeeUnit, shipownerLastFeeDate, rentShipFirstFee, transportFirstFeeDate, seaLastFee, lastIssueDate, unitSeaFee, loadUnloadAdjust, uintOilAdjustFee, seaFirstFee, voyageShipownerFee, voyageRentFee, unitTransportFee, lastTransportFee, settlementDate, coaDifference, exchangeRate, finalReceiver, ffb020t050pArchived, currentLocation, arrivedSingaporeDate, unloadDate, createBy, createDate, updateBy, updateDate, archived" />
    </jsp:include>
    
  </body>
</html>
