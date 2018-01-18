<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>装港品质管理</title>
  
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
      //getButtion("dynamic-buttons","ffb040t");
      $('#icon-add').bind("click",function(){newFfb040t010pEntity();});
      $('#icon-edit').bind("click",function(){editFfb040t010pEntity();});
      $('#icon-remove').bind("click",function(){deleteFfb040t010pEntity();});
      $('#icon-search').bind("click",function(){queryFfb040tEntity();});
      $('#icon-cancel').bind("click",function(){resetFfb040tQuery();});
      $('#icon-export').bind("click",function(){exportFfb040t010pEntities();});
      $('#icon-file-lock').bind("click",function(){archiveFfb040t010pEntities();});
      $('#icon-file-unlock').bind("click",function(){activeFfb040t010pEntities();});
      
    });
    
    function newFfb040t010pEntity(){
      $('#dlgFfb040t010pEntity').dialog('open').dialog('setTitle', '新建');
      $('#frmFfb040tEntity').form('clear');
    }
    
    function editFfb040t010pEntity(){
      var r = $('#dgFfb040t010p').datagrid('getSelected');
      if(r==null){
        $.messager.alert('系统提示', '请选中要编辑的行!', 'warning');
        return;
      }
      loadFfb040tEntity(r);
      
      $('#dlgFfb040t010pEntity').dialog('open').dialog('setTitle', '编辑');
    }
    
    function saveFfb040t010pEntity(){
      if (!$("#frmFfb040tEntity").form("validate")){
        $.messager.alert("系统提示", "请确保录入字段都符合正确的格式或录入了所有的必填字段，查找表单中红色部分并修改。")
        return;
      }
      var row = $("#dgFfb040t010p").datagrid("getSelected")
      if (($("dlgFfb040t010pEntity input[name='entity.f0']").val() == "")) row = {};
      var entity = createEntityData("frmFfb040tEntity", row)
      $.post("ffb040t010p.action?reqtype=save", entity, function(data){
        if (data.success){
          $("#frmFfb040tEntity").form("clear");
          $("#dlgFfb040t010pEntity").dialog("close");
          $("#dgFfb040t010p").datagrid("reload");
        }else{
          $.messager.alert("系统提示", data.message);
        }
      }, "JSON");
    }
    
    function deleteFfb040t010pEntity(){
      executeCommand("ffb040t", "delete", "dgFfb040t010p", "请选择要删除的行!", true, "确认删除吗？")
    }
    
    function archiveFfb040t010pEntities(){ 
      executeCommand("ffb040t010p", "archive", "dgFfb040t010p", "请选择要归档的行!")
    }
    
    function activeFfb040t010pEntities(){
      executeCommand("ffb040t010p", "active", "dgFfb040t010p", "请选择要激活的行!") 
    }
    
    function exportFfb040t010pEntities(){
      var queryParams = createFfb040tQueryParams();
      queryParams.selectedColumns = getColumnDescriptions($('#dgFfb040t010p'));
      
      $.ajax({
        url: "ffb040t.action?reqtype=export",
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

    function onFfb040t010pDblClickRow(rowIndex, rowData){
      if ($('#icon-edit').length == 0) return;
      editFfb040t010pEntity();
    }
    
    function onFfb040t010pClickRow(rowIndex, rowData){
      var r = $('#dgFfb040t010p').datagrid('getSelected');
      loadFfb040tEntity(r);
      
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
      <jsp:include page="ffb040t_segments/ffb040t_query.jsp" >
        <jsp:param name="displayQueryFields" value="purchaseBatchId, grainSize, remark, createBy, createDate, updateBy, updateDate" />
        <jsp:param name="targetDataGridId" value="dgFfb040t010p" />
      </jsp:include>
    </div>
    <div class="easyui-panel" title="装港品质" data-options="iconCls:'icon-edit',collapsible:true">
      <jsp:include page="ffb040t_segments/ffb040t_grid.jsp" >
        <jsp:param name="displayTableFields" value="purchaseBatchId, tfe, sio2, cao, mgo, al2o3, tio2, k2o, na2o, zno, as, pbo, cr, ni, cu, mn, h2o, feo, p, s, burnLose, grainSize, remark, createBy, createDate, updateBy, updateDate" />
        <jsp:param name="onDblClickRow" value="function(rowIndex, rowData){ onFfb040t010pDblClickRow(rowIndex, rowData); }" />
        <jsp:param name="onClickRow" value="function(rowIndex, rowData){ onFfb040t010pClickRow(rowIndex, rowData); }" />
        <jsp:param name="dataGridId" value="dgFfb040t010p" />
        <jsp:param name="hiddenCheckboxColumn" value="false" />
      </jsp:include> 
    </div>

    <div id="dlgFfb040t010pEntity" class="easyui-dialog edit-dialog" buttons="#dlg-buttons" title="新建" closed="true" >
      <jsp:include page="ffb040t_segments/ffb040t_edit.jsp" >
        <jsp:param name="displayEditFields" value="purchaseBatchId, tfe, sio2, cao, mgo, al2o3, tio2, k2o, na2o, zno, as, pbo, cr, ni, cu, mn, h2o, feo, p, s, burnLose, grainSize, remark" />
        <jsp:param name="formId" value="frmEntity" />
      </jsp:include> 
      <div id="dlg-buttons">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveFfb040t010pEntity()">保存</a> 
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlgFfb040t010pEntity').dialog('close')">取消</a>
      </div>
    </div>
    
    <jsp:include page="ffb010t_segments/ffb010t_dialog_selector.jsp" >
      <jsp:param name="bindTargets" value="query_ffb040t_purchaseBatchId, form_ffb040t_purchaseBatchId" />
      <jsp:param name="valueField" value="purchaseBatchId" />
      <jsp:param name="displayQueryFields" value="contractNumber, shipBatchId, purchaseBatchId, tradeType, oreArea, materialCategory, materialId, tfe, h2o, sio2, al2o3, sio2Al2o3, p, s, other, price, purchaseQuantity, unit, portLoadDate, portLoadName, portArrivedDate, portArrivedName, buyer, seller, resourceLocation, auditState, visibleDepartment, blAmount, blDate, settlementPrice, settlementPriceUnit, shipSettlementPrice, shipSettlementPriceUnit, finalFe, finalH2o, settlementStartDate, settlementQuantity, lcFirstFee, lcFirstFeeUnit, companyFirstRate, companyFirstRmb, interestRate, futureAccrual, futureAccrualUnit, firstPayDate, firstIssueDate, firstDryQuantity, companyFirstFee, companyFirstFeeUnit, transportEqualize, transportEqualizeUnit, finalTransportFee, finalTransportFeeUnit, secondPay, secondPayUnit, secondPayRate, secondPayRmb, secondPayDate, settlementTailFee, settlementTailFeeUnit, settlementTailRate, settlementTailRmb, tailFeeDate, gaugeDiscount, gaugeDiscountUnit, settlementAssessmentCycle, drainEqualize, drainEqualizeUnit, oceanFreightPrice, remarks, ffb010t020pArchived, insuranceCompany, insuranceFee, insuranceFeeUnit, ffb010t030pArchived, lcNumber, documentaryBillsInterest, documentaryBillsHike, capitalOccupationFee, openingCharge, acceptingCharge, customsGuaranteeFee, agentServiceFee, extensionPeriod, extensionDate, extensionAmount, extensionRate, extensionInterest, extensionExecuteUnit, issuePrice, issuePriceUnit, dryTonPrice, creditTfe, pobPrice, cfrPrice, createBy, createDate, updateBy, updateDate, archived" />  
      <jsp:param name="displayTableFields" value="contractNumber, shipBatchId, purchaseBatchId, tradeType, oreArea, materialCategory, materialId, tfe, h2o, sio2, al2o3, sio2Al2o3, p, s, other, price, purchaseQuantity, unit, portLoadDate, portLoadName, portArrivedDate, portArrivedName, buyer, seller, resourceLocation, auditState, visibleDepartment, blAmount, blDate, settlementPrice, settlementPriceUnit, shipSettlementPrice, shipSettlementPriceUnit, finalFe, finalH2o, settlementStartDate, settlementQuantity, lcFirstFee, lcFirstFeeUnit, companyFirstRate, companyFirstRmb, interestRate, futureAccrual, futureAccrualUnit, firstPayDate, firstIssueDate, firstDryQuantity, companyFirstFee, companyFirstFeeUnit, transportEqualize, transportEqualizeUnit, finalTransportFee, finalTransportFeeUnit, secondPay, secondPayUnit, secondPayRate, secondPayRmb, secondPayDate, settlementTailFee, settlementTailFeeUnit, settlementTailRate, settlementTailRmb, tailFeeDate, gaugeDiscount, gaugeDiscountUnit, settlementAssessmentCycle, drainEqualize, drainEqualizeUnit, oceanFreightPrice, remarks, ffb010t020pArchived, insuranceCompany, insuranceFee, insuranceFeeUnit, ffb010t030pArchived, lcNumber, documentaryBillsInterest, documentaryBillsHike, capitalOccupationFee, openingCharge, acceptingCharge, customsGuaranteeFee, agentServiceFee, extensionPeriod, extensionDate, extensionAmount, extensionRate, extensionInterest, extensionExecuteUnit, issuePrice, issuePriceUnit, dryTonPrice, creditTfe, pobPrice, cfrPrice, createBy, createDate, updateBy, updateDate, archived" />
    </jsp:include>
    <jsp:include page="ffb030t_segments/ffb030t_dialog_selector.jsp" >
      <jsp:param name="bindTargets" value="query_ffb040t_unloadPortId, form_ffb040t_unloadPortId" />
      <jsp:param name="valueField" value="unloadPortId" />
      <jsp:param name="displayQueryFields" value="unloadPortId, unloadPort, shipBatchId, arrivedPortDate, berthDate, unloadedDate, departPortDate, finalReceiver, createBy, createDate, updateBy, updateDate, archived" />  
      <jsp:param name="displayTableFields" value="unloadPortId, unloadPort, shipBatchId, arrivedPortDate, berthDate, unloadedDate, departPortDate, finalReceiver, createBy, createDate, updateBy, updateDate, archived" />
    </jsp:include>
    
  </body>
</html>
