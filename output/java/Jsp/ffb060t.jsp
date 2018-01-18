<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>合同管理</title>
  
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
      //getButtion("dynamic-buttons","ffb060t");
      $('#icon-add').bind("click",function(){newFfb060tEntity();});
      $('#icon-edit').bind("click",function(){editFfb060tEntity();});
      $('#icon-remove').bind("click",function(){deleteFfb060tEntity();});
      $('#icon-search').bind("click",function(){queryFfb060tEntity();});
      $('#icon-cancel').bind("click",function(){resetFfb060tQuery();});
      $('#icon-export').bind("click",function(){exportFfb060tEntities();});
      $('#icon-file-lock').bind("click",function(){archiveFfb060tEntities();});
      $('#icon-file-unlock').bind("click",function(){activeFfb060tEntities();});
      
      $('#icon-details-add').bind("click",function(){addDetailsFfb010t();});
      $('#icon-details-remove').bind("click",function(){removeDetailsFfb010t();});
    });
    
    function newFfb060tEntity(){
      $('#dlgFfb060tEntity').dialog('open').dialog('setTitle', '新建');
      $('#frmFfb060tEntity').form('clear');
    }
    
    function editFfb060tEntity(){
      var r = $('#dgFfb060t').datagrid('getSelected');
      if(r==null){
        $.messager.alert('系统提示', '请选中要编辑的行!', 'warning');
        return;
      }
      loadFfb060tEntity(r);
      
      $('#dlgFfb060tEntity').dialog('open').dialog('setTitle', '编辑');
    }
    
    function saveFfb060tEntity(){
      if (!$("#frmFfb060tEntity").form("validate")){
        $.messager.alert("系统提示", "请确保录入字段都符合正确的格式或录入了所有的必填字段，查找表单中红色部分并修改。")
        return;
      }
      var row = $("#dgFfb060t").datagrid("getSelected")
      if (($("dlgFfb060tEntity input[name='entity.f0']").val() == "")) row = {};
      var entity = createEntityData("frmFfb060tEntity", row)
      $.post("ffb060t.action?reqtype=save", entity, function(data){
        if (data.success){
          $("#frmFfb060tEntity").form("clear");
          $("#dlgFfb060tEntity").dialog("close");
          $("#dgFfb060t").datagrid("reload");
        }else{
          $.messager.alert("系统提示", data.message);
        }
      }, "JSON");
    }
    
    function deleteFfb060tEntity(){
      executeCommand("ffb060t", "delete", "dgFfb060t", "请选择要删除的行!", true, "确认删除吗？")
    }
    
    function archiveFfb060tEntities(){ 
      executeCommand("ffb060t", "archive", "dgFfb060t", "请选择要归档的行!")
    }
    
    function activeFfb060tEntities(){
      executeCommand("ffb060t", "active", "dgFfb060t", "请选择要激活的行!") 
    }
    
    function exportFfb060tEntities(){
      var queryParams = createFfb060tQueryParams();
      queryParams.selectedColumns = getColumnDescriptions($('#dgFfb060t'));
      
      $.ajax({
        url: "ffb060t.action?reqtype=export",
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

    function onFfb060tDblClickRow(rowIndex, rowData){
      if ($('#icon-edit').length == 0) return;
      editFfb060tEntity();
    }
    
    function onFfb060tClickRow(rowIndex, rowData){
      var r = $('#dgFfb060t').datagrid('getSelected');
      loadFfb060tEntity(r);
      
      if (rowData.contractNumber == '') return;
      var params = {
        'query.contractNumber.eqValue' : rowData.contractNumber
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
      <jsp:include page="ffb060t_segments/ffb060t_query.jsp" >
        <jsp:param name="displayQueryFields" value="contractNumber, contractSign, contractNature, contractQuantity, contractMoney, contractMoneyUnit, unit, mine, materialId, tradeType, purchasePriceMode, salePriceMode, seller, finalUser, loadDateStart, loadDateEnd, exerciseDate, exerciseDescription, signDate, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="targetDataGridId" value="dgFfb060t" />
      </jsp:include>
    </div>
    <div class="easyui-panel" title="合同" data-options="iconCls:'icon-edit',collapsible:true">
      <jsp:include page="ffb060t_segments/ffb060t_grid.jsp" >
        <jsp:param name="displayTableFields" value="contractNumber, contractSign, contractNature, contractQuantity, contractMoney, contractMoneyUnit, unit, mine, materialId, tradeType, purchasePriceMode, salePriceMode, seller, finalUser, loadDateStart, loadDateEnd, exerciseDate, exerciseDescription, signDate, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="onDblClickRow" value="function(rowIndex, rowData){ onFfb060tDblClickRow(rowIndex, rowData); }" />
        <jsp:param name="onClickRow" value="function(rowIndex, rowData){ onFfb060tClickRow(rowIndex, rowData); }" />
        <jsp:param name="dataGridId" value="dgFfb060t" />
        <jsp:param name="hiddenCheckboxColumn" value="false" />
      </jsp:include> 
    </div>

    <div id="dlgFfb060tEntity" class="easyui-dialog edit-dialog" buttons="#dlg-buttons" title="新建" closed="true" >
      <jsp:include page="ffb060t_segments/ffb060t_edit.jsp" >
        <jsp:param name="displayEditFields" value="contractNumber, contractSign, contractNature, contractQuantity, contractMoneyWithUnit, contractMoneyUnit, unit, mine, materialId, tradeType, purchasePriceMode, salePriceMode, seller, finalUser, loadDateStart, loadDateEnd, exerciseDate, exerciseDescription, signDate, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="formId" value="frmEntity" />
      </jsp:include> 
      <div id="dlg-buttons">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveFfb060tEntity()">保存</a> 
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlgFfb060tEntity').dialog('close')">取消</a>
      </div>
    </div>
    
    
    <div class="easyui-panel" title="采购资源" data-options="iconCls:'icon-note',collapsible:true">
      <jsp:include page="ffb010t_segments/ffb010t_details_editor.jsp" >
        <jsp:param name="displayQueryFields" value="contractNumber, shipBatchId, purchaseBatchId, tradeType, oreArea, materialCategory, materialId, tfe, h2o, sio2, al2o3, sio2Al2o3, p, s, other, price, purchaseQuantity, unit, portLoadDate, portLoadName, portArrivedDate, portArrivedName, buyer, seller, resourceLocation, auditState, visibleDepartment, blAmount, blDate, settlementPrice, settlementPriceUnit, shipSettlementPrice, shipSettlementPriceUnit, finalFe, finalH2o, settlementStartDate, settlementQuantity, lcFirstFee, lcFirstFeeUnit, companyFirstRate, companyFirstRmb, interestRate, futureAccrual, futureAccrualUnit, firstPayDate, firstIssueDate, firstDryQuantity, companyFirstFee, companyFirstFeeUnit, transportEqualize, transportEqualizeUnit, finalTransportFee, finalTransportFeeUnit, secondPay, secondPayUnit, secondPayRate, secondPayRmb, secondPayDate, settlementTailFee, settlementTailFeeUnit, settlementTailRate, settlementTailRmb, tailFeeDate, gaugeDiscount, gaugeDiscountUnit, settlementAssessmentCycle, drainEqualize, drainEqualizeUnit, oceanFreightPrice, remarks, ffb010t020pArchived, insuranceCompany, insuranceFee, insuranceFeeUnit, ffb010t030pArchived, lcNumber, documentaryBillsInterest, documentaryBillsHike, capitalOccupationFee, openingCharge, acceptingCharge, customsGuaranteeFee, agentServiceFee, extensionPeriod, extensionDate, extensionAmount, extensionRate, extensionInterest, extensionExecuteUnit, issuePrice, issuePriceUnit, dryTonPrice, creditTfe, pobPrice, cfrPrice, createBy, createDate, updateBy, updateDate, archived" />  
        <jsp:param name="displayTableFields" value="contractNumber, shipBatchId, purchaseBatchId, tradeType, oreArea, materialCategory, materialId, tfe, h2o, sio2, al2o3, sio2Al2o3, p, s, other, price, purchaseQuantity, unit, portLoadDate, portLoadName, portArrivedDate, portArrivedName, buyer, seller, resourceLocation, auditState, visibleDepartment, blAmount, blDate, settlementPrice, settlementPriceUnit, shipSettlementPrice, shipSettlementPriceUnit, finalFe, finalH2o, settlementStartDate, settlementQuantity, lcFirstFee, lcFirstFeeUnit, companyFirstRate, companyFirstRmb, interestRate, futureAccrual, futureAccrualUnit, firstPayDate, firstIssueDate, firstDryQuantity, companyFirstFee, companyFirstFeeUnit, transportEqualize, transportEqualizeUnit, finalTransportFee, finalTransportFeeUnit, secondPay, secondPayUnit, secondPayRate, secondPayRmb, secondPayDate, settlementTailFee, settlementTailFeeUnit, settlementTailRate, settlementTailRmb, tailFeeDate, gaugeDiscount, gaugeDiscountUnit, settlementAssessmentCycle, drainEqualize, drainEqualizeUnit, oceanFreightPrice, remarks, ffb010t020pArchived, insuranceCompany, insuranceFee, insuranceFeeUnit, ffb010t030pArchived, lcNumber, documentaryBillsInterest, documentaryBillsHike, capitalOccupationFee, openingCharge, acceptingCharge, customsGuaranteeFee, agentServiceFee, extensionPeriod, extensionDate, extensionAmount, extensionRate, extensionInterest, extensionExecuteUnit, issuePrice, issuePriceUnit, dryTonPrice, creditTfe, pobPrice, cfrPrice, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="targetMainGridId" value="dgFfb060t" />
        <jsp:param name="targetProperty" value="contractNumber" />
        <jsp:param name="reloadDetailsFunction" value="reloadDetailsFfb010t" />
        <jsp:param name="addDetailsFunction" value="addDetailsFfb010t" />
        <jsp:param name="removeDetailsFunction" value="removeDetailsFfb010t" />
      </jsp:include>
    </div>
  </body>
</html>
