<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>信用证管理</title>
  
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
      //getButtion("dynamic-buttons","ffb070t");
      $('#icon-add').bind("click",function(){newFfb070tEntity();});
      $('#icon-edit').bind("click",function(){editFfb070tEntity();});
      $('#icon-remove').bind("click",function(){deleteFfb070tEntity();});
      $('#icon-search').bind("click",function(){queryFfb070tEntity();});
      $('#icon-cancel').bind("click",function(){resetFfb070tQuery();});
      $('#icon-export').bind("click",function(){exportFfb070tEntities();});
      $('#icon-file-lock').bind("click",function(){archiveFfb070tEntities();});
      $('#icon-file-unlock').bind("click",function(){activeFfb070tEntities();});
      
      $('#icon-details-add').bind("click",function(){addDetailsFfb010t();});
      $('#icon-details-remove').bind("click",function(){removeDetailsFfb010t();});
    });
    
    function newFfb070tEntity(){
      $('#dlgFfb070tEntity').dialog('open').dialog('setTitle', '新建');
      $('#frmFfb070tEntity').form('clear');
    }
    
    function editFfb070tEntity(){
      var r = $('#dgFfb070t').datagrid('getSelected');
      if(r==null){
        $.messager.alert('系统提示', '请选中要编辑的行!', 'warning');
        return;
      }
      loadFfb070tEntity(r);
      
      $('#dlgFfb070tEntity').dialog('open').dialog('setTitle', '编辑');
    }
    
    function saveFfb070tEntity(){
      if (!$("#frmFfb070tEntity").form("validate")){
        $.messager.alert("系统提示", "请确保录入字段都符合正确的格式或录入了所有的必填字段，查找表单中红色部分并修改。")
        return;
      }
      var row = $("#dgFfb070t").datagrid("getSelected")
      if (($("dlgFfb070tEntity input[name='entity.f0']").val() == "")) row = {};
      var entity = createEntityData("frmFfb070tEntity", row)
      $.post("ffb070t.action?reqtype=save", entity, function(data){
        if (data.success){
          $("#frmFfb070tEntity").form("clear");
          $("#dlgFfb070tEntity").dialog("close");
          $("#dgFfb070t").datagrid("reload");
        }else{
          $.messager.alert("系统提示", data.message);
        }
      }, "JSON");
    }
    
    function deleteFfb070tEntity(){
      executeCommand("ffb070t", "delete", "dgFfb070t", "请选择要删除的行!", true, "确认删除吗？")
    }
    
    function archiveFfb070tEntities(){ 
      executeCommand("ffb070t", "archive", "dgFfb070t", "请选择要归档的行!")
    }
    
    function activeFfb070tEntities(){
      executeCommand("ffb070t", "active", "dgFfb070t", "请选择要激活的行!") 
    }
    
    function exportFfb070tEntities(){
      var queryParams = createFfb070tQueryParams();
      queryParams.selectedColumns = getColumnDescriptions($('#dgFfb070t'));
      
      $.ajax({
        url: "ffb070t.action?reqtype=export",
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

    function onFfb070tDblClickRow(rowIndex, rowData){
      if ($('#icon-edit').length == 0) return;
      editFfb070tEntity();
    }
    
    function onFfb070tClickRow(rowIndex, rowData){
      var r = $('#dgFfb070t').datagrid('getSelected');
      loadFfb070tEntity(r);
      
      if (rowData.lcNumber == '') return;
      var params = {
        'query.lcNumber.eqValue' : rowData.lcNumber
      };
      reloadDetailsFfb010t(params);
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
      
      <a id="icon-addDetails" href="javascript:void(0)"  class="easyui-linkbutton"  iconCls="icon-add" plain="true">添加采购资源</a>
      <a id="icon-removeDetails" href="javascript:void(0)"  class="easyui-linkbutton"  iconCls="icon-remove" plain="true">删除采购资源</a>
      
      <a id="icon-file-lock" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-file-lock" plain="true" >归档</a>
      <a id="icon-file-unlock" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-file-unlock" plain="true" >激活</a>
    </div>
    <div class="easyui-panel" title="查询选项" data-options="iconCls:'icon-search',collapsible:true,collapsed:true">
      <jsp:include page="ffb070t_segments/ffb070t_query.jsp" >
        <jsp:param name="displayQueryFields" value="lcNumber, shipBatchId, issueProperty, issueBank, beneficiary, issueAmount, issueAmountUnit, issuePrice, issuePriceUnit, issueDate, dryTonPrice, tfe, pobPrice, cfrPrice, tonSeaFeeEqualize, tonSeaFeeEqualizeUnit, valuationMonth, seeFeeEqualize, seeFeeEqualizeUnit, commission, commissionUnit, issueTon, expireDays, extensionPeriod, extensionDate, extensionAmount, extensionRate, extensionInterest, extensionExecuteUnit, remark, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="targetDataGridId" value="dgFfb070t" />
      </jsp:include>
    </div>
    <div class="easyui-panel" title="信用证" data-options="iconCls:'icon-edit',collapsible:true">
      <jsp:include page="ffb070t_segments/ffb070t_grid.jsp" >
        <jsp:param name="displayTableFields" value="lcNumber, shipBatchId, issueProperty, issueBank, beneficiary, issueAmount, issueAmountUnit, issuePrice, issuePriceUnit, issueDate, dryTonPrice, tfe, pobPrice, cfrPrice, tonSeaFeeEqualize, tonSeaFeeEqualizeUnit, valuationMonth, seeFeeEqualize, seeFeeEqualizeUnit, commission, commissionUnit, issueTon, expireDays, extensionPeriod, extensionDate, extensionAmount, extensionRate, extensionInterest, extensionExecuteUnit, remark, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="onDblClickRow" value="function(rowIndex, rowData){ onFfb070tDblClickRow(rowIndex, rowData); }" />
        <jsp:param name="onClickRow" value="function(rowIndex, rowData){ onFfb070tClickRow(rowIndex, rowData); }" />
        <jsp:param name="dataGridId" value="dgFfb070t" />
        <jsp:param name="hiddenCheckboxColumn" value="false" />
      </jsp:include> 
    </div>

    <div id="dlgFfb070tEntity" class="easyui-dialog edit-dialog" buttons="#dlg-buttons" title="新建" closed="true" >
      <jsp:include page="ffb070t_segments/ffb070t_edit.jsp" >
        <jsp:param name="displayEditFields" value="lcNumber, shipBatchId, issueProperty, issueBank, beneficiary, issueAmountWithUnit, issueAmountUnit, issuePriceWithUnit, issuePriceUnit, issueDate, dryTonPrice, tfe, pobPrice, cfrPrice, tonSeaFeeEqualizeWithUnit, tonSeaFeeEqualizeUnit, valuationMonth, seeFeeEqualizeWithUnit, seeFeeEqualizeUnit, commissionWithUnit, commissionUnit, issueTon, expireDays, extensionPeriod, extensionDate, extensionAmount, extensionRate, extensionInterest, extensionExecuteUnit, remark, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="formId" value="frmEntity" />
      </jsp:include> 
      <div id="dlg-buttons">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveFfb070tEntity()">保存</a> 
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlgFfb070tEntity').dialog('close')">取消</a>
      </div>
    </div>
    
    
    <div class="easyui-panel" title="采购资源" data-options="iconCls:'icon-note',collapsible:true">
      <jsp:include page="ffb010t_segments/ffb010t_details_editor.jsp" >
        <jsp:param name="displayQueryFields" value="contractNumber, shipBatchId, purchaseBatchId, tradeType, oreArea, materialCategory, materialId, tfe, h2o, sio2, al2o3, sio2Al2o3, p, s, other, price, purchaseQuantity, unit, portLoadDate, portLoadName, portArrivedDate, portArrivedName, buyer, seller, resourceLocation, auditState, visibleDepartment, blAmount, blDate, settlementPrice, settlementPriceUnit, shipSettlementPrice, shipSettlementPriceUnit, finalFe, finalH2o, settlementStartDate, settlementQuantity, lcFirstFee, lcFirstFeeUnit, companyFirstRate, companyFirstRmb, interestRate, futureAccrual, futureAccrualUnit, firstPayDate, firstIssueDate, firstDryQuantity, companyFirstFee, companyFirstFeeUnit, transportEqualize, transportEqualizeUnit, finalTransportFee, finalTransportFeeUnit, secondPay, secondPayUnit, secondPayRate, secondPayRmb, secondPayDate, settlementTailFee, settlementTailFeeUnit, settlementTailRate, settlementTailRmb, tailFeeDate, gaugeDiscount, gaugeDiscountUnit, settlementAssessmentCycle, drainEqualize, drainEqualizeUnit, oceanFreightPrice, remarks, ffb010t020pArchived, insuranceCompany, insuranceFee, insuranceFeeUnit, ffb010t030pArchived, lcNumber, documentaryBillsInterest, documentaryBillsHike, capitalOccupationFee, openingCharge, acceptingCharge, customsGuaranteeFee, agentServiceFee, extensionPeriod, extensionDate, extensionAmount, extensionRate, extensionInterest, extensionExecuteUnit, issuePrice, issuePriceUnit, dryTonPrice, creditTfe, pobPrice, cfrPrice, createBy, createDate, updateBy, updateDate, archived" />  
        <jsp:param name="displayTableFields" value="contractNumber, shipBatchId, purchaseBatchId, tradeType, oreArea, materialCategory, materialId, tfe, h2o, sio2, al2o3, sio2Al2o3, p, s, other, price, purchaseQuantity, unit, portLoadDate, portLoadName, portArrivedDate, portArrivedName, buyer, seller, resourceLocation, auditState, visibleDepartment, blAmount, blDate, settlementPrice, settlementPriceUnit, shipSettlementPrice, shipSettlementPriceUnit, finalFe, finalH2o, settlementStartDate, settlementQuantity, lcFirstFee, lcFirstFeeUnit, companyFirstRate, companyFirstRmb, interestRate, futureAccrual, futureAccrualUnit, firstPayDate, firstIssueDate, firstDryQuantity, companyFirstFee, companyFirstFeeUnit, transportEqualize, transportEqualizeUnit, finalTransportFee, finalTransportFeeUnit, secondPay, secondPayUnit, secondPayRate, secondPayRmb, secondPayDate, settlementTailFee, settlementTailFeeUnit, settlementTailRate, settlementTailRmb, tailFeeDate, gaugeDiscount, gaugeDiscountUnit, settlementAssessmentCycle, drainEqualize, drainEqualizeUnit, oceanFreightPrice, remarks, ffb010t020pArchived, insuranceCompany, insuranceFee, insuranceFeeUnit, ffb010t030pArchived, lcNumber, documentaryBillsInterest, documentaryBillsHike, capitalOccupationFee, openingCharge, acceptingCharge, customsGuaranteeFee, agentServiceFee, extensionPeriod, extensionDate, extensionAmount, extensionRate, extensionInterest, extensionExecuteUnit, issuePrice, issuePriceUnit, dryTonPrice, creditTfe, pobPrice, cfrPrice, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="targetMainGridId" value="dgFfb070t" />
        <jsp:param name="targetProperty" value="lcNumber" />
        <jsp:param name="reloadDetailsFunction" value="reloadDetailsFfb010t" />
        <jsp:param name="addDetailsFunction" value="addDetailsFfb010t" />
        <jsp:param name="removeDetailsFunction" value="removeDetailsFfb010t" />
      </jsp:include>
    </div>
  </body>
</html>
