<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>海运付款管理</title>
  
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
      //getButtion("dynamic-buttons","ffb020t");
      $('#icon-add').bind("click",function(){newFfb020t040pEntity();});
      $('#icon-edit').bind("click",function(){editFfb020t040pEntity();});
      $('#icon-remove').bind("click",function(){deleteFfb020t040pEntity();});
      $('#icon-search').bind("click",function(){queryFfb020tEntity();});
      $('#icon-cancel').bind("click",function(){resetFfb020tQuery();});
      $('#icon-export').bind("click",function(){exportFfb020t040pEntities();});
      $('#icon-file-lock').bind("click",function(){archiveFfb020t040pEntities();});
      $('#icon-file-unlock').bind("click",function(){activeFfb020t040pEntities();});
      
      $('#icon-details-add').bind("click",function(){addDetailsFfb010t();});
      $('#icon-details-remove').bind("click",function(){removeDetailsFfb010t();});
      $('#icon-details-add').bind("click",function(){addDetailsFfb070t();});
      $('#icon-details-remove').bind("click",function(){removeDetailsFfb070t();});
    });
    
    function newFfb020t040pEntity(){
      $('#dlgFfb020t040pEntity').dialog('open').dialog('setTitle', '新建');
      $('#frmFfb020tEntity').form('clear');
    }
    
    function editFfb020t040pEntity(){
      var r = $('#dgFfb020t040p').datagrid('getSelected');
      if(r==null){
        $.messager.alert('系统提示', '请选中要编辑的行!', 'warning');
        return;
      }
      loadFfb020tEntity(r);
      
      $('#dlgFfb020t040pEntity').dialog('open').dialog('setTitle', '编辑');
    }
    
    function saveFfb020t040pEntity(){
      if (!$("#frmFfb020tEntity").form("validate")){
        $.messager.alert("系统提示", "请确保录入字段都符合正确的格式或录入了所有的必填字段，查找表单中红色部分并修改。")
        return;
      }
      var row = $("#dgFfb020t040p").datagrid("getSelected")
      if (($("dlgFfb020t040pEntity input[name='entity.f0']").val() == "")) row = {};
      var entity = createEntityData("frmFfb020tEntity", row)
      $.post("ffb020t040p.action?reqtype=save", entity, function(data){
        if (data.success){
          $("#frmFfb020tEntity").form("clear");
          $("#dlgFfb020t040pEntity").dialog("close");
          $("#dgFfb020t040p").datagrid("reload");
        }else{
          $.messager.alert("系统提示", data.message);
        }
      }, "JSON");
    }
    
    function deleteFfb020t040pEntity(){
      executeCommand("ffb020t", "delete", "dgFfb020t040p", "请选择要删除的行!", true, "确认删除吗？")
    }
    
    function archiveFfb020t040pEntities(){ 
      executeCommand("ffb020t040p", "archive", "dgFfb020t040p", "请选择要归档的行!")
    }
    
    function activeFfb020t040pEntities(){
      executeCommand("ffb020t040p", "active", "dgFfb020t040p", "请选择要激活的行!") 
    }
    
    function exportFfb020t040pEntities(){
      var queryParams = createFfb020tQueryParams();
      queryParams.selectedColumns = getColumnDescriptions($('#dgFfb020t040p'));
      
      $.ajax({
        url: "ffb020t.action?reqtype=export",
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

    function onFfb020t040pDblClickRow(rowIndex, rowData){
      if ($('#icon-edit').length == 0) return;
      editFfb020t040pEntity();
    }
    
    function onFfb020t040pClickRow(rowIndex, rowData){
      var r = $('#dgFfb020t040p').datagrid('getSelected');
      loadFfb020tEntity(r);
      
      if (rowData.shipBatchId == '') return;
      var params = {
        'query.shipBatchId.eqValue' : rowData.shipBatchId
      };
      reloadDetailsFfb010t(params);
      if (rowData.lcNumber == '') return;
      var params = {
        'query.lcNumber.eqValue' : rowData.lcNumber
      };
      reloadDetailsFfb070t(params);
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
      
      <a id="icon-addDetails" href="javascript:void(0)"  class="easyui-linkbutton"  iconCls="icon-add" plain="true">添加信用证</a>
      <a id="icon-removeDetails" href="javascript:void(0)"  class="easyui-linkbutton"  iconCls="icon-remove" plain="true">删除信用证</a>
      
      <a id="icon-file-lock" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-file-lock" plain="true" >归档</a>
      <a id="icon-file-unlock" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-file-unlock" plain="true" >激活</a>
    </div>
    <div class="easyui-panel" title="查询选项" data-options="iconCls:'icon-search',collapsible:true,collapsed:true">
      <jsp:include page="ffb020t_segments/ffb020t_query.jsp" >
        <jsp:param name="displayQueryFields" value="shipBatchId, shipNumber, shipownerFirstFeeDate, shipownerLastFeeDate" />
        <jsp:param name="targetDataGridId" value="dgFfb020t040p" />
      </jsp:include>
    </div>
    <div class="easyui-panel" title="海运付款" data-options="iconCls:'icon-edit',collapsible:true">
      <jsp:include page="ffb020t_segments/ffb020t_grid.jsp" >
        <jsp:param name="displayTableFields" value="shipBatchId, shipNumber, seaFirstSingleFee, seaLastSingleFee, oilAdjustSingleFee, baseFee, portAdjust, oilAdjustFee, transportFee, transportFirstFee, shipownerFirstFeeDate, transportLastFee, shipownerLastFeeDate" />
        <jsp:param name="onDblClickRow" value="function(rowIndex, rowData){ onFfb020t040pDblClickRow(rowIndex, rowData); }" />
        <jsp:param name="onClickRow" value="function(rowIndex, rowData){ onFfb020t040pClickRow(rowIndex, rowData); }" />
        <jsp:param name="dataGridId" value="dgFfb020t040p" />
        <jsp:param name="hiddenCheckboxColumn" value="false" />
      </jsp:include> 
    </div>

    <div id="dlgFfb020t040pEntity" class="easyui-dialog edit-dialog" buttons="#dlg-buttons" title="新建" closed="true" >
      <jsp:include page="ffb020t_segments/ffb020t_edit.jsp" >
        <jsp:param name="displayEditFields" value="seaFirstSingleFeeWithUnit, seaLastSingleFeeWithUnit, oilAdjustSingleFeeWithUnit, baseFeeWithUnit, portAdjustWithUnit, oilAdjustFeeWithUnit, transportFeeWithUnit, transportFirstFeeWithUnit, shipownerFirstFeeDate, transportLastFeeWithUnit, shipownerLastFeeDate" />
        <jsp:param name="formId" value="frmEntity" />
      </jsp:include> 
      <div id="dlg-buttons">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveFfb020t040pEntity()">保存</a> 
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlgFfb020t040pEntity').dialog('close')">取消</a>
      </div>
    </div>
    
    <jsp:include page="ffb050t_segments/ffb050t_dialog_selector.jsp" >
      <jsp:param name="bindTargets" value="query_ffb020t_shipNumber, form_ffb020t_shipNumber" />
      <jsp:param name="valueField" value="shipNumber" />
      <jsp:param name="displayQueryFields" value="shipNumber, shipCompany, shipOwner, shipName, shipChineseName, createBy, createDate, updateBy, updateDate, archived" />  
      <jsp:param name="displayTableFields" value="shipNumber, shipCompany, shipOwner, shipName, shipChineseName, createBy, createDate, updateBy, updateDate, archived" />
    </jsp:include>
    
    <div class="easyui-panel" title="采购资源" data-options="iconCls:'icon-note',collapsible:true">
      <jsp:include page="ffb010t_segments/ffb010t_details_editor.jsp" >
        <jsp:param name="displayQueryFields" value="contractNumber, shipBatchId, purchaseBatchId, tradeType, oreArea, materialCategory, materialId, tfe, h2o, sio2, al2o3, sio2Al2o3, p, s, other, price, purchaseQuantity, unit, portLoadDate, portLoadName, portArrivedDate, portArrivedName, buyer, seller, resourceLocation, auditState, visibleDepartment, blAmount, blDate, settlementPrice, settlementPriceUnit, shipSettlementPrice, shipSettlementPriceUnit, finalFe, finalH2o, settlementStartDate, settlementQuantity, lcFirstFee, lcFirstFeeUnit, companyFirstRate, companyFirstRmb, interestRate, futureAccrual, futureAccrualUnit, firstPayDate, firstIssueDate, firstDryQuantity, companyFirstFee, companyFirstFeeUnit, transportEqualize, transportEqualizeUnit, finalTransportFee, finalTransportFeeUnit, secondPay, secondPayUnit, secondPayRate, secondPayRmb, secondPayDate, settlementTailFee, settlementTailFeeUnit, settlementTailRate, settlementTailRmb, tailFeeDate, gaugeDiscount, gaugeDiscountUnit, settlementAssessmentCycle, drainEqualize, drainEqualizeUnit, oceanFreightPrice, remarks, ffb010t020pArchived, insuranceCompany, insuranceFee, insuranceFeeUnit, ffb010t030pArchived, lcNumber, documentaryBillsInterest, documentaryBillsHike, capitalOccupationFee, openingCharge, acceptingCharge, customsGuaranteeFee, agentServiceFee, extensionPeriod, extensionDate, extensionAmount, extensionRate, extensionInterest, extensionExecuteUnit, issuePrice, issuePriceUnit, dryTonPrice, creditTfe, pobPrice, cfrPrice, createBy, createDate, updateBy, updateDate, archived" />  
        <jsp:param name="displayTableFields" value="contractNumber, shipBatchId, purchaseBatchId, tradeType, oreArea, materialCategory, materialId, tfe, h2o, sio2, al2o3, sio2Al2o3, p, s, other, price, purchaseQuantity, unit, portLoadDate, portLoadName, portArrivedDate, portArrivedName, buyer, seller, resourceLocation, auditState, visibleDepartment, blAmount, blDate, settlementPrice, settlementPriceUnit, shipSettlementPrice, shipSettlementPriceUnit, finalFe, finalH2o, settlementStartDate, settlementQuantity, lcFirstFee, lcFirstFeeUnit, companyFirstRate, companyFirstRmb, interestRate, futureAccrual, futureAccrualUnit, firstPayDate, firstIssueDate, firstDryQuantity, companyFirstFee, companyFirstFeeUnit, transportEqualize, transportEqualizeUnit, finalTransportFee, finalTransportFeeUnit, secondPay, secondPayUnit, secondPayRate, secondPayRmb, secondPayDate, settlementTailFee, settlementTailFeeUnit, settlementTailRate, settlementTailRmb, tailFeeDate, gaugeDiscount, gaugeDiscountUnit, settlementAssessmentCycle, drainEqualize, drainEqualizeUnit, oceanFreightPrice, remarks, ffb010t020pArchived, insuranceCompany, insuranceFee, insuranceFeeUnit, ffb010t030pArchived, lcNumber, documentaryBillsInterest, documentaryBillsHike, capitalOccupationFee, openingCharge, acceptingCharge, customsGuaranteeFee, agentServiceFee, extensionPeriod, extensionDate, extensionAmount, extensionRate, extensionInterest, extensionExecuteUnit, issuePrice, issuePriceUnit, dryTonPrice, creditTfe, pobPrice, cfrPrice, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="targetMainGridId" value="dgFfb020t040p" />
        <jsp:param name="targetProperty" value="shipBatchId" />
        <jsp:param name="reloadDetailsFunction" value="reloadDetailsFfb010t" />
        <jsp:param name="addDetailsFunction" value="addDetailsFfb010t" />
        <jsp:param name="removeDetailsFunction" value="removeDetailsFfb010t" />
      </jsp:include>
    </div>
    <div class="easyui-panel" title="信用证" data-options="iconCls:'icon-note',collapsible:true">
      <jsp:include page="ffb070t_segments/ffb070t_details_editor.jsp" >
        <jsp:param name="displayQueryFields" value="lcNumber, shipBatchId, issueProperty, issueBank, beneficiary, issueAmount, issueAmountUnit, issuePrice, issuePriceUnit, issueDate, dryTonPrice, tfe, pobPrice, cfrPrice, tonSeaFeeEqualize, tonSeaFeeEqualizeUnit, valuationMonth, seeFeeEqualize, seeFeeEqualizeUnit, commission, commissionUnit, issueTon, expireDays, extensionPeriod, extensionDate, extensionAmount, extensionRate, extensionInterest, extensionExecuteUnit, remark, createBy, createDate, updateBy, updateDate, archived" />  
        <jsp:param name="displayTableFields" value="lcNumber, shipBatchId, issueProperty, issueBank, beneficiary, issueAmount, issueAmountUnit, issuePrice, issuePriceUnit, issueDate, dryTonPrice, tfe, pobPrice, cfrPrice, tonSeaFeeEqualize, tonSeaFeeEqualizeUnit, valuationMonth, seeFeeEqualize, seeFeeEqualizeUnit, commission, commissionUnit, issueTon, expireDays, extensionPeriod, extensionDate, extensionAmount, extensionRate, extensionInterest, extensionExecuteUnit, remark, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="targetMainGridId" value="dgFfb020t040p" />
        <jsp:param name="targetProperty" value="lcNumber" />
        <jsp:param name="reloadDetailsFunction" value="reloadDetailsFfb070t" />
        <jsp:param name="addDetailsFunction" value="addDetailsFfb070t" />
        <jsp:param name="removeDetailsFunction" value="removeDetailsFfb070t" />
      </jsp:include>
    </div>
  </body>
</html>
