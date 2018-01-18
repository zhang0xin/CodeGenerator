package com.ysusoft.ui.purchase;

import com.ysusoft.ui.codehelper.HtmlTag;
import com.ysusoft.ui.codehelper.JsCode;
import com.ysusoft.ui.codehelper.JsType;
import com.ysusoft.ui.FieldCodes;
import com.ysusoft.ui.EntityUiBase;

public class Ffb060tUiAuto extends EntityUiBase {
  
  protected FieldCodes f0 = new FieldCodes("f0", "主键", "ffb060t", "entity", "query");
  protected FieldCodes contractNumber = new FieldCodes("contractNumber", "合同号", "ffb060t", "entity", "query");
  protected FieldCodes contractSign = new FieldCodes("contractSign", "国内合同签订方", "ffb060t", "entity", "query");
  protected FieldCodes contractNature = new FieldCodes("contractNature", "合同性质", "ffb060t", "entity", "query");
  protected FieldCodes contractQuantity = new FieldCodes("contractQuantity", "合同量", "ffb060t", "entity", "query");
  protected FieldCodes contractMoney = new FieldCodes("contractMoney", "合同金额", "ffb060t", "entity", "query");
  protected FieldCodes contractMoneyWithUnit = new FieldCodes("contractMoney", "合同金额", "ffb060t", "entity", "query");
  protected FieldCodes contractMoneyUnit = new FieldCodes("contractMoneyUnit", "合同金额币种", "ffb060t", "entity", "query");
  protected FieldCodes unit = new FieldCodes("unit", "计量单位", "ffb060t", "entity", "query");
  protected FieldCodes mine = new FieldCodes("mine", "矿山", "ffb060t", "entity", "query");
  protected FieldCodes materialId = new FieldCodes("materialId", "物料名称", "ffb060t", "entity", "query");
  protected FieldCodes tradeType = new FieldCodes("tradeType", "贸易类型", "ffb060t", "entity", "query");
  protected FieldCodes purchasePriceMode = new FieldCodes("purchasePriceMode", "北京采购定价模式", "ffb060t", "entity", "query");
  protected FieldCodes salePriceMode = new FieldCodes("salePriceMode", "北京销售定价模式", "ffb060t", "entity", "query");
  protected FieldCodes seller = new FieldCodes("seller", "卖方", "ffb060t", "entity", "query");
  protected FieldCodes finalUser = new FieldCodes("finalUser", "最终用户", "ffb060t", "entity", "query");
  protected FieldCodes loadDateStart = new FieldCodes("loadDateStart", "装期（始）", "ffb060t", "entity", "query");
  protected FieldCodes loadDateEnd = new FieldCodes("loadDateEnd", "装期（终）", "ffb060t", "entity", "query");
  protected FieldCodes exerciseDate = new FieldCodes("exerciseDate", "合同执行完毕日", "ffb060t", "entity", "query");
  protected FieldCodes exerciseDescription = new FieldCodes("exerciseDescription", "合同执行情况说明", "ffb060t", "entity", "query");
  protected FieldCodes signDate = new FieldCodes("signDate", "签订日期", "ffb060t", "entity", "query");
  protected FieldCodes createBy = new FieldCodes("createBy", "创建人", "ffb060t", "entity", "query");
  protected FieldCodes createDate = new FieldCodes("createDate", "创建日期", "ffb060t", "entity", "query");
  protected FieldCodes updateBy = new FieldCodes("updateBy", "更新人", "ffb060t", "entity", "query");
  protected FieldCodes updateDate = new FieldCodes("updateDate", "更新日期", "ffb060t", "entity", "query");
  protected FieldCodes archived = new FieldCodes("archived", "归档", "ffb060t", "entity", "query");
  
  public Ffb060tUiAuto(){
  }

  // 主键
  public FieldCodes f0() {
    if (f0.getInput() == null) f0.setInput(createF0Input());
    if (f0.getQueryInput() == null) f0.setQueryInput(createF0QueryInput());
    if (f0.getDataGridColumn() == null) f0.setDataGridColumn(createF0DataGridColumn());
    return f0;
  }
  public HtmlTag createF0Input(){
    return f0.textInput(36);
  }
  public HtmlTag createF0QueryInput(){
    return f0.textQueryInput();
  }
  public JsType createF0DataGridColumn(){
    return f0.textColumn();
  }
  
  // 合同号
  public FieldCodes contractNumber() {
    if (contractNumber.getInput() == null) contractNumber.setInput(createContractNumberInput());
    if (contractNumber.getQueryInput() == null) contractNumber.setQueryInput(createContractNumberQueryInput());
    if (contractNumber.getDataGridColumn() == null) contractNumber.setDataGridColumn(createContractNumberDataGridColumn());
    return contractNumber;
  }
  public HtmlTag createContractNumberInput(){
    return contractNumber.textInput(36);
  }
  public HtmlTag createContractNumberQueryInput(){
    return contractNumber.textQueryInput();
  }
  public JsType createContractNumberDataGridColumn(){
    return contractNumber.textColumn();
  }
  
  // 国内合同签订方
  public FieldCodes contractSign() {
    if (contractSign.getInput() == null) contractSign.setInput(createContractSignInput());
    if (contractSign.getQueryInput() == null) contractSign.setQueryInput(createContractSignQueryInput());
    if (contractSign.getDataGridColumn() == null) contractSign.setDataGridColumn(createContractSignDataGridColumn());
    return contractSign;
  }
  public HtmlTag createContractSignInput(){
    return contractSign.comboboxInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '河北钢铁集团', value: '河北钢铁集团'}, {label: '北京冀钢联公司', value: '北京冀钢联公司'}, {label: '北京国贸公司', value: '北京国贸公司'}]");
  }
  public HtmlTag createContractSignQueryInput(){
    return contractSign.comboboxQueryInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '河北钢铁集团', value: '河北钢铁集团'}, {label: '北京冀钢联公司', value: '北京冀钢联公司'}, {label: '北京国贸公司', value: '北京国贸公司'}]");
  }
  public JsType createContractSignDataGridColumn(){
    return contractSign.textColumn();
  }
  
  // 合同性质
  public FieldCodes contractNature() {
    if (contractNature.getInput() == null) contractNature.setInput(createContractNatureInput());
    if (contractNature.getQueryInput() == null) contractNature.setQueryInput(createContractNatureQueryInput());
    if (contractNature.getDataGridColumn() == null) contractNature.setDataGridColumn(createContractNatureDataGridColumn());
    return contractNature;
  }
  public HtmlTag createContractNatureInput(){
    return contractNature.comboboxInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '销售合同', value: '销售合同'}, {label: '代理合同', value: '代理合同'}]");
  }
  public HtmlTag createContractNatureQueryInput(){
    return contractNature.comboboxQueryInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '销售合同', value: '销售合同'}, {label: '代理合同', value: '代理合同'}]");
  }
  public JsType createContractNatureDataGridColumn(){
    return contractNature.textColumn();
  }
  
  // 合同量
  public FieldCodes contractQuantity() {
    if (contractQuantity.getInput() == null) contractQuantity.setInput(createContractQuantityInput());
    if (contractQuantity.getQueryInput() == null) contractQuantity.setQueryInput(createContractQuantityQueryInput());
    if (contractQuantity.getDataGridColumn() == null) contractQuantity.setDataGridColumn(createContractQuantityDataGridColumn());
    return contractQuantity;
  }
  public HtmlTag createContractQuantityInput(){
    return contractQuantity.numberInput(5);
  }
  public HtmlTag createContractQuantityQueryInput(){
    return contractQuantity.numberQueryInput();
  }
  public JsType createContractQuantityDataGridColumn(){
    return contractQuantity.textColumn();
  }
  
  // 合同金额
  public FieldCodes contractMoney() {
    if (contractMoney.getInput() == null) contractMoney.setInput(createContractMoneyInput());
    if (contractMoney.getQueryInput() == null) contractMoney.setQueryInput(createContractMoneyQueryInput());
    if (contractMoney.getDataGridColumn() == null) contractMoney.setDataGridColumn(createContractMoneyDataGridColumn());
    return contractMoney;
  }
  public HtmlTag createContractMoneyInput(){
    return contractMoney.numberInput(2);
  }
  public HtmlTag createContractMoneyQueryInput(){
    return contractMoney.numberQueryInput();
  }
  public JsType createContractMoneyDataGridColumn(){
    return contractMoney.textColumn();
  }
  
  // 合同金额（带单位）
  public FieldCodes contractMoneyWithUnit() {
    if (contractMoneyWithUnit.getInput() == null) contractMoneyWithUnit.setInput(createContractMoneyWithUnitInput());
    if (contractMoneyWithUnit.getQueryInput() == null) contractMoneyWithUnit.setQueryInput(createContractMoneyWithUnitQueryInput());
    if (contractMoneyWithUnit.getDataGridColumn() == null) contractMoneyWithUnit.setDataGridColumn(createContractMoneyWithUnitDataGridColumn());
    return contractMoneyWithUnit;
  }
  public HtmlTag createContractMoneyWithUnitInput(){
    return contractMoneyWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createContractMoneyWithUnitQueryInput(){
    return contractMoney.numberQueryInput();
  }
  public JsType createContractMoneyWithUnitDataGridColumn(){
    return contractMoney.textColumn();
  }
  
  // 合同金额币种
  public FieldCodes contractMoneyUnit() {
    if (contractMoneyUnit.getInput() == null) contractMoneyUnit.setInput(createContractMoneyUnitInput());
    if (contractMoneyUnit.getQueryInput() == null) contractMoneyUnit.setQueryInput(createContractMoneyUnitQueryInput());
    if (contractMoneyUnit.getDataGridColumn() == null) contractMoneyUnit.setDataGridColumn(createContractMoneyUnitDataGridColumn());
    return contractMoneyUnit;
  }
  public HtmlTag createContractMoneyUnitInput(){
    return contractMoneyUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createContractMoneyUnitQueryInput(){
    return contractMoneyUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createContractMoneyUnitDataGridColumn(){
    return contractMoneyUnit.textColumn();
  }
  
  // 计量单位
  public FieldCodes unit() {
    if (unit.getInput() == null) unit.setInput(createUnitInput());
    if (unit.getQueryInput() == null) unit.setQueryInput(createUnitQueryInput());
    if (unit.getDataGridColumn() == null) unit.setDataGridColumn(createUnitDataGridColumn());
    return unit;
  }
  public HtmlTag createUnitInput(){
    return unit.comboboxInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '干吨', value: '干吨'}, {label: '湿吨', value: '湿吨'}]");
  }
  public HtmlTag createUnitQueryInput(){
    return unit.comboboxQueryInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '干吨', value: '干吨'}, {label: '湿吨', value: '湿吨'}]");
  }
  public JsType createUnitDataGridColumn(){
    return unit.textColumn();
  }
  
  // 矿山
  public FieldCodes mine() {
    if (mine.getInput() == null) mine.setInput(createMineInput());
    if (mine.getQueryInput() == null) mine.setQueryInput(createMineQueryInput());
    if (mine.getDataGridColumn() == null) mine.setDataGridColumn(createMineDataGridColumn());
    return mine;
  }
  public HtmlTag createMineInput(){
    return mine.textInput(36);
  }
  public HtmlTag createMineQueryInput(){
    return mine.textQueryInput();
  }
  public JsType createMineDataGridColumn(){
    return mine.textColumn();
  }
  
  // 物料名称
  public FieldCodes materialId() {
    if (materialId.getInput() == null) materialId.setInput(createMaterialIdInput());
    if (materialId.getQueryInput() == null) materialId.setQueryInput(createMaterialIdQueryInput());
    if (materialId.getDataGridColumn() == null) materialId.setDataGridColumn(createMaterialIdDataGridColumn());
    return materialId;
  }
  public HtmlTag createMaterialIdInput(){
    return materialId.textInput(36);
  }
  public HtmlTag createMaterialIdQueryInput(){
    return materialId.textQueryInput();
  }
  public JsType createMaterialIdDataGridColumn(){
    return materialId.textColumn();
  }
  
  // 贸易类型
  public FieldCodes tradeType() {
    if (tradeType.getInput() == null) tradeType.setInput(createTradeTypeInput());
    if (tradeType.getQueryInput() == null) tradeType.setQueryInput(createTradeTypeQueryInput());
    if (tradeType.getDataGridColumn() == null) tradeType.setDataGridColumn(createTradeTypeDataGridColumn());
    return tradeType;
  }
  public HtmlTag createTradeTypeInput(){
    return tradeType.comboboxInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '长期协议矿', value: '长期协议矿'}, {label: '远期现货矿', value: '远期现货矿'}, {label: '即期现货矿', value: '即期现货矿'}]");
  }
  public HtmlTag createTradeTypeQueryInput(){
    return tradeType.comboboxQueryInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '长期协议矿', value: '长期协议矿'}, {label: '远期现货矿', value: '远期现货矿'}, {label: '即期现货矿', value: '即期现货矿'}]");
  }
  public JsType createTradeTypeDataGridColumn(){
    return tradeType.textColumn();
  }
  
  // 北京采购定价模式
  public FieldCodes purchasePriceMode() {
    if (purchasePriceMode.getInput() == null) purchasePriceMode.setInput(createPurchasePriceModeInput());
    if (purchasePriceMode.getQueryInput() == null) purchasePriceMode.setQueryInput(createPurchasePriceModeQueryInput());
    if (purchasePriceMode.getDataGridColumn() == null) purchasePriceMode.setDataGridColumn(createPurchasePriceModeDataGridColumn());
    return purchasePriceMode;
  }
  public HtmlTag createPurchasePriceModeInput(){
    return purchasePriceMode.textInput(20);
  }
  public HtmlTag createPurchasePriceModeQueryInput(){
    return purchasePriceMode.textQueryInput();
  }
  public JsType createPurchasePriceModeDataGridColumn(){
    return purchasePriceMode.textColumn();
  }
  
  // 北京销售定价模式
  public FieldCodes salePriceMode() {
    if (salePriceMode.getInput() == null) salePriceMode.setInput(createSalePriceModeInput());
    if (salePriceMode.getQueryInput() == null) salePriceMode.setQueryInput(createSalePriceModeQueryInput());
    if (salePriceMode.getDataGridColumn() == null) salePriceMode.setDataGridColumn(createSalePriceModeDataGridColumn());
    return salePriceMode;
  }
  public HtmlTag createSalePriceModeInput(){
    return salePriceMode.textInput(20);
  }
  public HtmlTag createSalePriceModeQueryInput(){
    return salePriceMode.textQueryInput();
  }
  public JsType createSalePriceModeDataGridColumn(){
    return salePriceMode.textColumn();
  }
  
  // 卖方
  public FieldCodes seller() {
    if (seller.getInput() == null) seller.setInput(createSellerInput());
    if (seller.getQueryInput() == null) seller.setQueryInput(createSellerQueryInput());
    if (seller.getDataGridColumn() == null) seller.setDataGridColumn(createSellerDataGridColumn());
    return seller;
  }
  public HtmlTag createSellerInput(){
    return seller.textInput(30);
  }
  public HtmlTag createSellerQueryInput(){
    return seller.textQueryInput();
  }
  public JsType createSellerDataGridColumn(){
    return seller.textColumn();
  }
  
  // 最终用户
  public FieldCodes finalUser() {
    if (finalUser.getInput() == null) finalUser.setInput(createFinalUserInput());
    if (finalUser.getQueryInput() == null) finalUser.setQueryInput(createFinalUserQueryInput());
    if (finalUser.getDataGridColumn() == null) finalUser.setDataGridColumn(createFinalUserDataGridColumn());
    return finalUser;
  }
  public HtmlTag createFinalUserInput(){
    return finalUser.textInput(30);
  }
  public HtmlTag createFinalUserQueryInput(){
    return finalUser.textQueryInput();
  }
  public JsType createFinalUserDataGridColumn(){
    return finalUser.textColumn();
  }
  
  // 装期（始）
  public FieldCodes loadDateStart() {
    if (loadDateStart.getInput() == null) loadDateStart.setInput(createLoadDateStartInput());
    if (loadDateStart.getQueryInput() == null) loadDateStart.setQueryInput(createLoadDateStartQueryInput());
    if (loadDateStart.getDataGridColumn() == null) loadDateStart.setDataGridColumn(createLoadDateStartDataGridColumn());
    return loadDateStart;
  }
  public HtmlTag createLoadDateStartInput(){
    return loadDateStart.dateInput();
  }
  public HtmlTag createLoadDateStartQueryInput(){
    return loadDateStart.dateQueryInput();
  }
  public JsType createLoadDateStartDataGridColumn(){
    return loadDateStart.dateColumn();
  }
  
  // 装期（终）
  public FieldCodes loadDateEnd() {
    if (loadDateEnd.getInput() == null) loadDateEnd.setInput(createLoadDateEndInput());
    if (loadDateEnd.getQueryInput() == null) loadDateEnd.setQueryInput(createLoadDateEndQueryInput());
    if (loadDateEnd.getDataGridColumn() == null) loadDateEnd.setDataGridColumn(createLoadDateEndDataGridColumn());
    return loadDateEnd;
  }
  public HtmlTag createLoadDateEndInput(){
    return loadDateEnd.dateInput();
  }
  public HtmlTag createLoadDateEndQueryInput(){
    return loadDateEnd.dateQueryInput();
  }
  public JsType createLoadDateEndDataGridColumn(){
    return loadDateEnd.dateColumn();
  }
  
  // 合同执行完毕日
  public FieldCodes exerciseDate() {
    if (exerciseDate.getInput() == null) exerciseDate.setInput(createExerciseDateInput());
    if (exerciseDate.getQueryInput() == null) exerciseDate.setQueryInput(createExerciseDateQueryInput());
    if (exerciseDate.getDataGridColumn() == null) exerciseDate.setDataGridColumn(createExerciseDateDataGridColumn());
    return exerciseDate;
  }
  public HtmlTag createExerciseDateInput(){
    return exerciseDate.dateInput();
  }
  public HtmlTag createExerciseDateQueryInput(){
    return exerciseDate.dateQueryInput();
  }
  public JsType createExerciseDateDataGridColumn(){
    return exerciseDate.dateColumn();
  }
  
  // 合同执行情况说明
  public FieldCodes exerciseDescription() {
    if (exerciseDescription.getInput() == null) exerciseDescription.setInput(createExerciseDescriptionInput());
    if (exerciseDescription.getQueryInput() == null) exerciseDescription.setQueryInput(createExerciseDescriptionQueryInput());
    if (exerciseDescription.getDataGridColumn() == null) exerciseDescription.setDataGridColumn(createExerciseDescriptionDataGridColumn());
    return exerciseDescription;
  }
  public HtmlTag createExerciseDescriptionInput(){
    return exerciseDescription.textInput(300);
  }
  public HtmlTag createExerciseDescriptionQueryInput(){
    return exerciseDescription.textQueryInput();
  }
  public JsType createExerciseDescriptionDataGridColumn(){
    return exerciseDescription.textColumn();
  }
  
  // 签订日期
  public FieldCodes signDate() {
    if (signDate.getInput() == null) signDate.setInput(createSignDateInput());
    if (signDate.getQueryInput() == null) signDate.setQueryInput(createSignDateQueryInput());
    if (signDate.getDataGridColumn() == null) signDate.setDataGridColumn(createSignDateDataGridColumn());
    return signDate;
  }
  public HtmlTag createSignDateInput(){
    return signDate.dateInput();
  }
  public HtmlTag createSignDateQueryInput(){
    return signDate.dateQueryInput();
  }
  public JsType createSignDateDataGridColumn(){
    return signDate.dateColumn();
  }
  
  // 创建人
  public FieldCodes createBy() {
    if (createBy.getInput() == null) createBy.setInput(createCreateByInput());
    if (createBy.getQueryInput() == null) createBy.setQueryInput(createCreateByQueryInput());
    if (createBy.getDataGridColumn() == null) createBy.setDataGridColumn(createCreateByDataGridColumn());
    return createBy;
  }
  public HtmlTag createCreateByInput(){
    return createBy.textInput(30);
  }
  public HtmlTag createCreateByQueryInput(){
    return createBy.textQueryInput();
  }
  public JsType createCreateByDataGridColumn(){
    return createBy.textColumn();
  }
  
  // 创建日期
  public FieldCodes createDate() {
    if (createDate.getInput() == null) createDate.setInput(createCreateDateInput());
    if (createDate.getQueryInput() == null) createDate.setQueryInput(createCreateDateQueryInput());
    if (createDate.getDataGridColumn() == null) createDate.setDataGridColumn(createCreateDateDataGridColumn());
    return createDate;
  }
  public HtmlTag createCreateDateInput(){
    return createDate.datetimeInput();
  }
  public HtmlTag createCreateDateQueryInput(){
    return createDate.datetimeQueryInput();
  }
  public JsType createCreateDateDataGridColumn(){
    return createDate.datetimeColumn();
  }
  
  // 更新人
  public FieldCodes updateBy() {
    if (updateBy.getInput() == null) updateBy.setInput(createUpdateByInput());
    if (updateBy.getQueryInput() == null) updateBy.setQueryInput(createUpdateByQueryInput());
    if (updateBy.getDataGridColumn() == null) updateBy.setDataGridColumn(createUpdateByDataGridColumn());
    return updateBy;
  }
  public HtmlTag createUpdateByInput(){
    return updateBy.textInput(30);
  }
  public HtmlTag createUpdateByQueryInput(){
    return updateBy.textQueryInput();
  }
  public JsType createUpdateByDataGridColumn(){
    return updateBy.textColumn();
  }
  
  // 更新日期
  public FieldCodes updateDate() {
    if (updateDate.getInput() == null) updateDate.setInput(createUpdateDateInput());
    if (updateDate.getQueryInput() == null) updateDate.setQueryInput(createUpdateDateQueryInput());
    if (updateDate.getDataGridColumn() == null) updateDate.setDataGridColumn(createUpdateDateDataGridColumn());
    return updateDate;
  }
  public HtmlTag createUpdateDateInput(){
    return updateDate.datetimeInput();
  }
  public HtmlTag createUpdateDateQueryInput(){
    return updateDate.datetimeQueryInput();
  }
  public JsType createUpdateDateDataGridColumn(){
    return updateDate.datetimeColumn();
  }
  
  // 归档
  public FieldCodes archived() {
    if (archived.getInput() == null) archived.setInput(createArchivedInput());
    if (archived.getQueryInput() == null) archived.setQueryInput(createArchivedQueryInput());
    if (archived.getDataGridColumn() == null) archived.setDataGridColumn(createArchivedDataGridColumn());
    return archived;
  }
  public HtmlTag createArchivedInput(){
    return archived.comboboxInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '已归档', value: '已归档'}, {label: '未归档', value: '未归档'}]");
  }
  public HtmlTag createArchivedQueryInput(){
    return archived.comboboxQueryInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '已归档', value: '已归档'}, {label: '未归档', value: '未归档'}]");
  }
  public JsType createArchivedDataGridColumn(){
    return archived.textColumn();
  }
  
  
}
