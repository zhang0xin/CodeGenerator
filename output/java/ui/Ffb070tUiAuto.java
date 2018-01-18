package com.ysusoft.ui.purchase;

import com.ysusoft.ui.codehelper.HtmlTag;
import com.ysusoft.ui.codehelper.JsCode;
import com.ysusoft.ui.codehelper.JsType;
import com.ysusoft.ui.FieldCodes;
import com.ysusoft.ui.EntityUiBase;

public class Ffb070tUiAuto extends EntityUiBase {
  
  protected FieldCodes f0 = new FieldCodes("f0", "主键", "ffb070t", "entity", "query");
  protected FieldCodes lcNumber = new FieldCodes("lcNumber", "L/C号码", "ffb070t", "entity", "query");
  protected FieldCodes shipBatchId = new FieldCodes("shipBatchId", "船运批次", "ffb070t", "entity", "query");
  protected FieldCodes issueProperty = new FieldCodes("issueProperty", "开证性质", "ffb070t", "entity", "query");
  protected FieldCodes issueBank = new FieldCodes("issueBank", "开证行", "ffb070t", "entity", "query");
  protected FieldCodes beneficiary = new FieldCodes("beneficiary", "受益人", "ffb070t", "entity", "query");
  protected FieldCodes issueAmount = new FieldCodes("issueAmount", "开证金额", "ffb070t", "entity", "query");
  protected FieldCodes issueAmountWithUnit = new FieldCodes("issueAmount", "开证金额", "ffb070t", "entity", "query");
  protected FieldCodes issueAmountUnit = new FieldCodes("issueAmountUnit", "开证金额币种", "ffb070t", "entity", "query");
  protected FieldCodes issuePrice = new FieldCodes("issuePrice", "开证单价", "ffb070t", "entity", "query");
  protected FieldCodes issuePriceWithUnit = new FieldCodes("issuePrice", "开证单价", "ffb070t", "entity", "query");
  protected FieldCodes issuePriceUnit = new FieldCodes("issuePriceUnit", "开证单价币种", "ffb070t", "entity", "query");
  protected FieldCodes issueDate = new FieldCodes("issueDate", "开证日期", "ffb070t", "entity", "query");
  protected FieldCodes dryTonPrice = new FieldCodes("dryTonPrice", "吨度价", "ffb070t", "entity", "query");
  protected FieldCodes tfe = new FieldCodes("tfe", "TFe", "ffb070t", "entity", "query");
  protected FieldCodes pobPrice = new FieldCodes("pobPrice", "FOB价", "ffb070t", "entity", "query");
  protected FieldCodes cfrPrice = new FieldCodes("cfrPrice", "CFR价", "ffb070t", "entity", "query");
  protected FieldCodes tonSeaFeeEqualize = new FieldCodes("tonSeaFeeEqualize", "吨矿海运费", "ffb070t", "entity", "query");
  protected FieldCodes tonSeaFeeEqualizeWithUnit = new FieldCodes("tonSeaFeeEqualize", "吨矿海运费", "ffb070t", "entity", "query");
  protected FieldCodes tonSeaFeeEqualizeUnit = new FieldCodes("tonSeaFeeEqualizeUnit", "吨矿海运费币种", "ffb070t", "entity", "query");
  protected FieldCodes valuationMonth = new FieldCodes("valuationMonth", "计价月份", "ffb070t", "entity", "query");
  protected FieldCodes seeFeeEqualize = new FieldCodes("seeFeeEqualize", "海运费补偿", "ffb070t", "entity", "query");
  protected FieldCodes seeFeeEqualizeWithUnit = new FieldCodes("seeFeeEqualize", "海运费补偿", "ffb070t", "entity", "query");
  protected FieldCodes seeFeeEqualizeUnit = new FieldCodes("seeFeeEqualizeUnit", "海运费补偿币种", "ffb070t", "entity", "query");
  protected FieldCodes commission = new FieldCodes("commission", "佣金", "ffb070t", "entity", "query");
  protected FieldCodes commissionWithUnit = new FieldCodes("commission", "佣金", "ffb070t", "entity", "query");
  protected FieldCodes commissionUnit = new FieldCodes("commissionUnit", "佣金币种", "ffb070t", "entity", "query");
  protected FieldCodes issueTon = new FieldCodes("issueTon", "开证吨数", "ffb070t", "entity", "query");
  protected FieldCodes expireDays = new FieldCodes("expireDays", "信用证效期日", "ffb070t", "entity", "query");
  protected FieldCodes extensionPeriod = new FieldCodes("extensionPeriod", "展期期限/天", "ffb070t", "entity", "query");
  protected FieldCodes extensionDate = new FieldCodes("extensionDate", "展期到期日", "ffb070t", "entity", "query");
  protected FieldCodes extensionAmount = new FieldCodes("extensionAmount", "展期金额", "ffb070t", "entity", "query");
  protected FieldCodes extensionRate = new FieldCodes("extensionRate", "展期利率", "ffb070t", "entity", "query");
  protected FieldCodes extensionInterest = new FieldCodes("extensionInterest", "展期利息", "ffb070t", "entity", "query");
  protected FieldCodes extensionExecuteUnit = new FieldCodes("extensionExecuteUnit", "展期执行单位", "ffb070t", "entity", "query");
  protected FieldCodes remark = new FieldCodes("remark", "备注", "ffb070t", "entity", "query");
  protected FieldCodes createBy = new FieldCodes("createBy", "创建人", "ffb070t", "entity", "query");
  protected FieldCodes createDate = new FieldCodes("createDate", "创建日期", "ffb070t", "entity", "query");
  protected FieldCodes updateBy = new FieldCodes("updateBy", "更新人", "ffb070t", "entity", "query");
  protected FieldCodes updateDate = new FieldCodes("updateDate", "更新日期", "ffb070t", "entity", "query");
  protected FieldCodes archived = new FieldCodes("archived", "归档", "ffb070t", "entity", "query");
  
  public Ffb070tUiAuto(){
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
  
  // L/C号码
  public FieldCodes lcNumber() {
    if (lcNumber.getInput() == null) lcNumber.setInput(createLcNumberInput());
    if (lcNumber.getQueryInput() == null) lcNumber.setQueryInput(createLcNumberQueryInput());
    if (lcNumber.getDataGridColumn() == null) lcNumber.setDataGridColumn(createLcNumberDataGridColumn());
    return lcNumber;
  }
  public HtmlTag createLcNumberInput(){
    return lcNumber.textInput(30);
  }
  public HtmlTag createLcNumberQueryInput(){
    return lcNumber.textQueryInput();
  }
  public JsType createLcNumberDataGridColumn(){
    return lcNumber.textColumn();
  }
  
  // 船运批次
  public FieldCodes shipBatchId() {
    if (shipBatchId.getInput() == null) shipBatchId.setInput(createShipBatchIdInput());
    if (shipBatchId.getQueryInput() == null) shipBatchId.setQueryInput(createShipBatchIdQueryInput());
    if (shipBatchId.getDataGridColumn() == null) shipBatchId.setDataGridColumn(createShipBatchIdDataGridColumn());
    return shipBatchId;
  }
  public HtmlTag createShipBatchIdInput(){
    return shipBatchId.textInput(36);
  }
  public HtmlTag createShipBatchIdQueryInput(){
    return shipBatchId.textQueryInput();
  }
  public JsType createShipBatchIdDataGridColumn(){
    return shipBatchId.textColumn();
  }
  
  // 开证性质
  public FieldCodes issueProperty() {
    if (issueProperty.getInput() == null) issueProperty.setInput(createIssuePropertyInput());
    if (issueProperty.getQueryInput() == null) issueProperty.setQueryInput(createIssuePropertyQueryInput());
    if (issueProperty.getDataGridColumn() == null) issueProperty.setDataGridColumn(createIssuePropertyDataGridColumn());
    return issueProperty;
  }
  public HtmlTag createIssuePropertyInput(){
    return issueProperty.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=5001");
  }
  public HtmlTag createIssuePropertyQueryInput(){
    return issueProperty.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=5001");
  }
  public JsType createIssuePropertyDataGridColumn(){
    return issueProperty.textColumn();
  }
  
  // 开证行
  public FieldCodes issueBank() {
    if (issueBank.getInput() == null) issueBank.setInput(createIssueBankInput());
    if (issueBank.getQueryInput() == null) issueBank.setQueryInput(createIssueBankQueryInput());
    if (issueBank.getDataGridColumn() == null) issueBank.setDataGridColumn(createIssueBankDataGridColumn());
    return issueBank;
  }
  public HtmlTag createIssueBankInput(){
    return issueBank.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=5003");
  }
  public HtmlTag createIssueBankQueryInput(){
    return issueBank.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=5003");
  }
  public JsType createIssueBankDataGridColumn(){
    return issueBank.textColumn();
  }
  
  // 受益人
  public FieldCodes beneficiary() {
    if (beneficiary.getInput() == null) beneficiary.setInput(createBeneficiaryInput());
    if (beneficiary.getQueryInput() == null) beneficiary.setQueryInput(createBeneficiaryQueryInput());
    if (beneficiary.getDataGridColumn() == null) beneficiary.setDataGridColumn(createBeneficiaryDataGridColumn());
    return beneficiary;
  }
  public HtmlTag createBeneficiaryInput(){
    return beneficiary.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=5004");
  }
  public HtmlTag createBeneficiaryQueryInput(){
    return beneficiary.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=5004");
  }
  public JsType createBeneficiaryDataGridColumn(){
    return beneficiary.textColumn();
  }
  
  // 开证金额
  public FieldCodes issueAmount() {
    if (issueAmount.getInput() == null) issueAmount.setInput(createIssueAmountInput());
    if (issueAmount.getQueryInput() == null) issueAmount.setQueryInput(createIssueAmountQueryInput());
    if (issueAmount.getDataGridColumn() == null) issueAmount.setDataGridColumn(createIssueAmountDataGridColumn());
    return issueAmount;
  }
  public HtmlTag createIssueAmountInput(){
    return issueAmount.numberInput(2);
  }
  public HtmlTag createIssueAmountQueryInput(){
    return issueAmount.numberQueryInput();
  }
  public JsType createIssueAmountDataGridColumn(){
    return issueAmount.textColumn();
  }
  
  // 开证金额（带单位）
  public FieldCodes issueAmountWithUnit() {
    if (issueAmountWithUnit.getInput() == null) issueAmountWithUnit.setInput(createIssueAmountWithUnitInput());
    if (issueAmountWithUnit.getQueryInput() == null) issueAmountWithUnit.setQueryInput(createIssueAmountWithUnitQueryInput());
    if (issueAmountWithUnit.getDataGridColumn() == null) issueAmountWithUnit.setDataGridColumn(createIssueAmountWithUnitDataGridColumn());
    return issueAmountWithUnit;
  }
  public HtmlTag createIssueAmountWithUnitInput(){
    return issueAmountWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createIssueAmountWithUnitQueryInput(){
    return issueAmount.numberQueryInput();
  }
  public JsType createIssueAmountWithUnitDataGridColumn(){
    return issueAmount.textColumn();
  }
  
  // 开证金额币种
  public FieldCodes issueAmountUnit() {
    if (issueAmountUnit.getInput() == null) issueAmountUnit.setInput(createIssueAmountUnitInput());
    if (issueAmountUnit.getQueryInput() == null) issueAmountUnit.setQueryInput(createIssueAmountUnitQueryInput());
    if (issueAmountUnit.getDataGridColumn() == null) issueAmountUnit.setDataGridColumn(createIssueAmountUnitDataGridColumn());
    return issueAmountUnit;
  }
  public HtmlTag createIssueAmountUnitInput(){
    return issueAmountUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createIssueAmountUnitQueryInput(){
    return issueAmountUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createIssueAmountUnitDataGridColumn(){
    return issueAmountUnit.textColumn();
  }
  
  // 开证单价
  public FieldCodes issuePrice() {
    if (issuePrice.getInput() == null) issuePrice.setInput(createIssuePriceInput());
    if (issuePrice.getQueryInput() == null) issuePrice.setQueryInput(createIssuePriceQueryInput());
    if (issuePrice.getDataGridColumn() == null) issuePrice.setDataGridColumn(createIssuePriceDataGridColumn());
    return issuePrice;
  }
  public HtmlTag createIssuePriceInput(){
    return issuePrice.numberInput(4);
  }
  public HtmlTag createIssuePriceQueryInput(){
    return issuePrice.numberQueryInput();
  }
  public JsType createIssuePriceDataGridColumn(){
    return issuePrice.textColumn();
  }
  
  // 开证单价（带单位）
  public FieldCodes issuePriceWithUnit() {
    if (issuePriceWithUnit.getInput() == null) issuePriceWithUnit.setInput(createIssuePriceWithUnitInput());
    if (issuePriceWithUnit.getQueryInput() == null) issuePriceWithUnit.setQueryInput(createIssuePriceWithUnitQueryInput());
    if (issuePriceWithUnit.getDataGridColumn() == null) issuePriceWithUnit.setDataGridColumn(createIssuePriceWithUnitDataGridColumn());
    return issuePriceWithUnit;
  }
  public HtmlTag createIssuePriceWithUnitInput(){
    return issuePriceWithUnit.quantityWithUnitInput(4, "2003"); 
  }
  public HtmlTag createIssuePriceWithUnitQueryInput(){
    return issuePrice.numberQueryInput();
  }
  public JsType createIssuePriceWithUnitDataGridColumn(){
    return issuePrice.textColumn();
  }
  
  // 开证单价币种
  public FieldCodes issuePriceUnit() {
    if (issuePriceUnit.getInput() == null) issuePriceUnit.setInput(createIssuePriceUnitInput());
    if (issuePriceUnit.getQueryInput() == null) issuePriceUnit.setQueryInput(createIssuePriceUnitQueryInput());
    if (issuePriceUnit.getDataGridColumn() == null) issuePriceUnit.setDataGridColumn(createIssuePriceUnitDataGridColumn());
    return issuePriceUnit;
  }
  public HtmlTag createIssuePriceUnitInput(){
    return issuePriceUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createIssuePriceUnitQueryInput(){
    return issuePriceUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createIssuePriceUnitDataGridColumn(){
    return issuePriceUnit.textColumn();
  }
  
  // 开证日期
  public FieldCodes issueDate() {
    if (issueDate.getInput() == null) issueDate.setInput(createIssueDateInput());
    if (issueDate.getQueryInput() == null) issueDate.setQueryInput(createIssueDateQueryInput());
    if (issueDate.getDataGridColumn() == null) issueDate.setDataGridColumn(createIssueDateDataGridColumn());
    return issueDate;
  }
  public HtmlTag createIssueDateInput(){
    return issueDate.dateInput();
  }
  public HtmlTag createIssueDateQueryInput(){
    return issueDate.dateQueryInput();
  }
  public JsType createIssueDateDataGridColumn(){
    return issueDate.dateColumn();
  }
  
  // 吨度价
  public FieldCodes dryTonPrice() {
    if (dryTonPrice.getInput() == null) dryTonPrice.setInput(createDryTonPriceInput());
    if (dryTonPrice.getQueryInput() == null) dryTonPrice.setQueryInput(createDryTonPriceQueryInput());
    if (dryTonPrice.getDataGridColumn() == null) dryTonPrice.setDataGridColumn(createDryTonPriceDataGridColumn());
    return dryTonPrice;
  }
  public HtmlTag createDryTonPriceInput(){
    return dryTonPrice.textInput(50);
  }
  public HtmlTag createDryTonPriceQueryInput(){
    return dryTonPrice.textQueryInput();
  }
  public JsType createDryTonPriceDataGridColumn(){
    return dryTonPrice.textColumn();
  }
  
  // TFe
  public FieldCodes tfe() {
    if (tfe.getInput() == null) tfe.setInput(createTfeInput());
    if (tfe.getQueryInput() == null) tfe.setQueryInput(createTfeQueryInput());
    if (tfe.getDataGridColumn() == null) tfe.setDataGridColumn(createTfeDataGridColumn());
    return tfe;
  }
  public HtmlTag createTfeInput(){
    return tfe.textInput(50);
  }
  public HtmlTag createTfeQueryInput(){
    return tfe.textQueryInput();
  }
  public JsType createTfeDataGridColumn(){
    return tfe.textColumn();
  }
  
  // FOB价
  public FieldCodes pobPrice() {
    if (pobPrice.getInput() == null) pobPrice.setInput(createPobPriceInput());
    if (pobPrice.getQueryInput() == null) pobPrice.setQueryInput(createPobPriceQueryInput());
    if (pobPrice.getDataGridColumn() == null) pobPrice.setDataGridColumn(createPobPriceDataGridColumn());
    return pobPrice;
  }
  public HtmlTag createPobPriceInput(){
    return pobPrice.textInput(50);
  }
  public HtmlTag createPobPriceQueryInput(){
    return pobPrice.textQueryInput();
  }
  public JsType createPobPriceDataGridColumn(){
    return pobPrice.textColumn();
  }
  
  // CFR价
  public FieldCodes cfrPrice() {
    if (cfrPrice.getInput() == null) cfrPrice.setInput(createCfrPriceInput());
    if (cfrPrice.getQueryInput() == null) cfrPrice.setQueryInput(createCfrPriceQueryInput());
    if (cfrPrice.getDataGridColumn() == null) cfrPrice.setDataGridColumn(createCfrPriceDataGridColumn());
    return cfrPrice;
  }
  public HtmlTag createCfrPriceInput(){
    return cfrPrice.textInput(50);
  }
  public HtmlTag createCfrPriceQueryInput(){
    return cfrPrice.textQueryInput();
  }
  public JsType createCfrPriceDataGridColumn(){
    return cfrPrice.textColumn();
  }
  
  // 吨矿海运费
  public FieldCodes tonSeaFeeEqualize() {
    if (tonSeaFeeEqualize.getInput() == null) tonSeaFeeEqualize.setInput(createTonSeaFeeEqualizeInput());
    if (tonSeaFeeEqualize.getQueryInput() == null) tonSeaFeeEqualize.setQueryInput(createTonSeaFeeEqualizeQueryInput());
    if (tonSeaFeeEqualize.getDataGridColumn() == null) tonSeaFeeEqualize.setDataGridColumn(createTonSeaFeeEqualizeDataGridColumn());
    return tonSeaFeeEqualize;
  }
  public HtmlTag createTonSeaFeeEqualizeInput(){
    return tonSeaFeeEqualize.numberInput(2);
  }
  public HtmlTag createTonSeaFeeEqualizeQueryInput(){
    return tonSeaFeeEqualize.numberQueryInput();
  }
  public JsType createTonSeaFeeEqualizeDataGridColumn(){
    return tonSeaFeeEqualize.textColumn();
  }
  
  // 吨矿海运费（带单位）
  public FieldCodes tonSeaFeeEqualizeWithUnit() {
    if (tonSeaFeeEqualizeWithUnit.getInput() == null) tonSeaFeeEqualizeWithUnit.setInput(createTonSeaFeeEqualizeWithUnitInput());
    if (tonSeaFeeEqualizeWithUnit.getQueryInput() == null) tonSeaFeeEqualizeWithUnit.setQueryInput(createTonSeaFeeEqualizeWithUnitQueryInput());
    if (tonSeaFeeEqualizeWithUnit.getDataGridColumn() == null) tonSeaFeeEqualizeWithUnit.setDataGridColumn(createTonSeaFeeEqualizeWithUnitDataGridColumn());
    return tonSeaFeeEqualizeWithUnit;
  }
  public HtmlTag createTonSeaFeeEqualizeWithUnitInput(){
    return tonSeaFeeEqualizeWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createTonSeaFeeEqualizeWithUnitQueryInput(){
    return tonSeaFeeEqualize.numberQueryInput();
  }
  public JsType createTonSeaFeeEqualizeWithUnitDataGridColumn(){
    return tonSeaFeeEqualize.textColumn();
  }
  
  // 吨矿海运费币种
  public FieldCodes tonSeaFeeEqualizeUnit() {
    if (tonSeaFeeEqualizeUnit.getInput() == null) tonSeaFeeEqualizeUnit.setInput(createTonSeaFeeEqualizeUnitInput());
    if (tonSeaFeeEqualizeUnit.getQueryInput() == null) tonSeaFeeEqualizeUnit.setQueryInput(createTonSeaFeeEqualizeUnitQueryInput());
    if (tonSeaFeeEqualizeUnit.getDataGridColumn() == null) tonSeaFeeEqualizeUnit.setDataGridColumn(createTonSeaFeeEqualizeUnitDataGridColumn());
    return tonSeaFeeEqualizeUnit;
  }
  public HtmlTag createTonSeaFeeEqualizeUnitInput(){
    return tonSeaFeeEqualizeUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createTonSeaFeeEqualizeUnitQueryInput(){
    return tonSeaFeeEqualizeUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createTonSeaFeeEqualizeUnitDataGridColumn(){
    return tonSeaFeeEqualizeUnit.textColumn();
  }
  
  // 计价月份
  public FieldCodes valuationMonth() {
    if (valuationMonth.getInput() == null) valuationMonth.setInput(createValuationMonthInput());
    if (valuationMonth.getQueryInput() == null) valuationMonth.setQueryInput(createValuationMonthQueryInput());
    if (valuationMonth.getDataGridColumn() == null) valuationMonth.setDataGridColumn(createValuationMonthDataGridColumn());
    return valuationMonth;
  }
  public HtmlTag createValuationMonthInput(){
    return valuationMonth.textInput(10);
  }
  public HtmlTag createValuationMonthQueryInput(){
    return valuationMonth.textQueryInput();
  }
  public JsType createValuationMonthDataGridColumn(){
    return valuationMonth.textColumn();
  }
  
  // 海运费补偿
  public FieldCodes seeFeeEqualize() {
    if (seeFeeEqualize.getInput() == null) seeFeeEqualize.setInput(createSeeFeeEqualizeInput());
    if (seeFeeEqualize.getQueryInput() == null) seeFeeEqualize.setQueryInput(createSeeFeeEqualizeQueryInput());
    if (seeFeeEqualize.getDataGridColumn() == null) seeFeeEqualize.setDataGridColumn(createSeeFeeEqualizeDataGridColumn());
    return seeFeeEqualize;
  }
  public HtmlTag createSeeFeeEqualizeInput(){
    return seeFeeEqualize.numberInput(2);
  }
  public HtmlTag createSeeFeeEqualizeQueryInput(){
    return seeFeeEqualize.numberQueryInput();
  }
  public JsType createSeeFeeEqualizeDataGridColumn(){
    return seeFeeEqualize.textColumn();
  }
  
  // 海运费补偿（带单位）
  public FieldCodes seeFeeEqualizeWithUnit() {
    if (seeFeeEqualizeWithUnit.getInput() == null) seeFeeEqualizeWithUnit.setInput(createSeeFeeEqualizeWithUnitInput());
    if (seeFeeEqualizeWithUnit.getQueryInput() == null) seeFeeEqualizeWithUnit.setQueryInput(createSeeFeeEqualizeWithUnitQueryInput());
    if (seeFeeEqualizeWithUnit.getDataGridColumn() == null) seeFeeEqualizeWithUnit.setDataGridColumn(createSeeFeeEqualizeWithUnitDataGridColumn());
    return seeFeeEqualizeWithUnit;
  }
  public HtmlTag createSeeFeeEqualizeWithUnitInput(){
    return seeFeeEqualizeWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createSeeFeeEqualizeWithUnitQueryInput(){
    return seeFeeEqualize.numberQueryInput();
  }
  public JsType createSeeFeeEqualizeWithUnitDataGridColumn(){
    return seeFeeEqualize.textColumn();
  }
  
  // 海运费补偿币种
  public FieldCodes seeFeeEqualizeUnit() {
    if (seeFeeEqualizeUnit.getInput() == null) seeFeeEqualizeUnit.setInput(createSeeFeeEqualizeUnitInput());
    if (seeFeeEqualizeUnit.getQueryInput() == null) seeFeeEqualizeUnit.setQueryInput(createSeeFeeEqualizeUnitQueryInput());
    if (seeFeeEqualizeUnit.getDataGridColumn() == null) seeFeeEqualizeUnit.setDataGridColumn(createSeeFeeEqualizeUnitDataGridColumn());
    return seeFeeEqualizeUnit;
  }
  public HtmlTag createSeeFeeEqualizeUnitInput(){
    return seeFeeEqualizeUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createSeeFeeEqualizeUnitQueryInput(){
    return seeFeeEqualizeUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createSeeFeeEqualizeUnitDataGridColumn(){
    return seeFeeEqualizeUnit.textColumn();
  }
  
  // 佣金
  public FieldCodes commission() {
    if (commission.getInput() == null) commission.setInput(createCommissionInput());
    if (commission.getQueryInput() == null) commission.setQueryInput(createCommissionQueryInput());
    if (commission.getDataGridColumn() == null) commission.setDataGridColumn(createCommissionDataGridColumn());
    return commission;
  }
  public HtmlTag createCommissionInput(){
    return commission.numberInput(2);
  }
  public HtmlTag createCommissionQueryInput(){
    return commission.numberQueryInput();
  }
  public JsType createCommissionDataGridColumn(){
    return commission.textColumn();
  }
  
  // 佣金（带单位）
  public FieldCodes commissionWithUnit() {
    if (commissionWithUnit.getInput() == null) commissionWithUnit.setInput(createCommissionWithUnitInput());
    if (commissionWithUnit.getQueryInput() == null) commissionWithUnit.setQueryInput(createCommissionWithUnitQueryInput());
    if (commissionWithUnit.getDataGridColumn() == null) commissionWithUnit.setDataGridColumn(createCommissionWithUnitDataGridColumn());
    return commissionWithUnit;
  }
  public HtmlTag createCommissionWithUnitInput(){
    return commissionWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createCommissionWithUnitQueryInput(){
    return commission.numberQueryInput();
  }
  public JsType createCommissionWithUnitDataGridColumn(){
    return commission.textColumn();
  }
  
  // 佣金币种
  public FieldCodes commissionUnit() {
    if (commissionUnit.getInput() == null) commissionUnit.setInput(createCommissionUnitInput());
    if (commissionUnit.getQueryInput() == null) commissionUnit.setQueryInput(createCommissionUnitQueryInput());
    if (commissionUnit.getDataGridColumn() == null) commissionUnit.setDataGridColumn(createCommissionUnitDataGridColumn());
    return commissionUnit;
  }
  public HtmlTag createCommissionUnitInput(){
    return commissionUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createCommissionUnitQueryInput(){
    return commissionUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createCommissionUnitDataGridColumn(){
    return commissionUnit.textColumn();
  }
  
  // 开证吨数
  public FieldCodes issueTon() {
    if (issueTon.getInput() == null) issueTon.setInput(createIssueTonInput());
    if (issueTon.getQueryInput() == null) issueTon.setQueryInput(createIssueTonQueryInput());
    if (issueTon.getDataGridColumn() == null) issueTon.setDataGridColumn(createIssueTonDataGridColumn());
    return issueTon;
  }
  public HtmlTag createIssueTonInput(){
    return issueTon.numberInput(5);
  }
  public HtmlTag createIssueTonQueryInput(){
    return issueTon.numberQueryInput();
  }
  public JsType createIssueTonDataGridColumn(){
    return issueTon.textColumn();
  }
  
  // 信用证效期日
  public FieldCodes expireDays() {
    if (expireDays.getInput() == null) expireDays.setInput(createExpireDaysInput());
    if (expireDays.getQueryInput() == null) expireDays.setQueryInput(createExpireDaysQueryInput());
    if (expireDays.getDataGridColumn() == null) expireDays.setDataGridColumn(createExpireDaysDataGridColumn());
    return expireDays;
  }
  public HtmlTag createExpireDaysInput(){
    return expireDays.dateInput();
  }
  public HtmlTag createExpireDaysQueryInput(){
    return expireDays.dateQueryInput();
  }
  public JsType createExpireDaysDataGridColumn(){
    return expireDays.dateColumn();
  }
  
  // 展期期限/天
  public FieldCodes extensionPeriod() {
    if (extensionPeriod.getInput() == null) extensionPeriod.setInput(createExtensionPeriodInput());
    if (extensionPeriod.getQueryInput() == null) extensionPeriod.setQueryInput(createExtensionPeriodQueryInput());
    if (extensionPeriod.getDataGridColumn() == null) extensionPeriod.setDataGridColumn(createExtensionPeriodDataGridColumn());
    return extensionPeriod;
  }
  public HtmlTag createExtensionPeriodInput(){
    return extensionPeriod.numberInput(0);
  }
  public HtmlTag createExtensionPeriodQueryInput(){
    return extensionPeriod.numberQueryInput();
  }
  public JsType createExtensionPeriodDataGridColumn(){
    return extensionPeriod.textColumn();
  }
  
  // 展期到期日
  public FieldCodes extensionDate() {
    if (extensionDate.getInput() == null) extensionDate.setInput(createExtensionDateInput());
    if (extensionDate.getQueryInput() == null) extensionDate.setQueryInput(createExtensionDateQueryInput());
    if (extensionDate.getDataGridColumn() == null) extensionDate.setDataGridColumn(createExtensionDateDataGridColumn());
    return extensionDate;
  }
  public HtmlTag createExtensionDateInput(){
    return extensionDate.dateInput();
  }
  public HtmlTag createExtensionDateQueryInput(){
    return extensionDate.dateQueryInput();
  }
  public JsType createExtensionDateDataGridColumn(){
    return extensionDate.dateColumn();
  }
  
  // 展期金额
  public FieldCodes extensionAmount() {
    if (extensionAmount.getInput() == null) extensionAmount.setInput(createExtensionAmountInput());
    if (extensionAmount.getQueryInput() == null) extensionAmount.setQueryInput(createExtensionAmountQueryInput());
    if (extensionAmount.getDataGridColumn() == null) extensionAmount.setDataGridColumn(createExtensionAmountDataGridColumn());
    return extensionAmount;
  }
  public HtmlTag createExtensionAmountInput(){
    return extensionAmount.numberInput(5);
  }
  public HtmlTag createExtensionAmountQueryInput(){
    return extensionAmount.numberQueryInput();
  }
  public JsType createExtensionAmountDataGridColumn(){
    return extensionAmount.textColumn();
  }
  
  // 展期利率
  public FieldCodes extensionRate() {
    if (extensionRate.getInput() == null) extensionRate.setInput(createExtensionRateInput());
    if (extensionRate.getQueryInput() == null) extensionRate.setQueryInput(createExtensionRateQueryInput());
    if (extensionRate.getDataGridColumn() == null) extensionRate.setDataGridColumn(createExtensionRateDataGridColumn());
    return extensionRate;
  }
  public HtmlTag createExtensionRateInput(){
    return extensionRate.numberInput(5);
  }
  public HtmlTag createExtensionRateQueryInput(){
    return extensionRate.numberQueryInput();
  }
  public JsType createExtensionRateDataGridColumn(){
    return extensionRate.textColumn();
  }
  
  // 展期利息
  public FieldCodes extensionInterest() {
    if (extensionInterest.getInput() == null) extensionInterest.setInput(createExtensionInterestInput());
    if (extensionInterest.getQueryInput() == null) extensionInterest.setQueryInput(createExtensionInterestQueryInput());
    if (extensionInterest.getDataGridColumn() == null) extensionInterest.setDataGridColumn(createExtensionInterestDataGridColumn());
    return extensionInterest;
  }
  public HtmlTag createExtensionInterestInput(){
    return extensionInterest.numberInput(5);
  }
  public HtmlTag createExtensionInterestQueryInput(){
    return extensionInterest.numberQueryInput();
  }
  public JsType createExtensionInterestDataGridColumn(){
    return extensionInterest.textColumn();
  }
  
  // 展期执行单位
  public FieldCodes extensionExecuteUnit() {
    if (extensionExecuteUnit.getInput() == null) extensionExecuteUnit.setInput(createExtensionExecuteUnitInput());
    if (extensionExecuteUnit.getQueryInput() == null) extensionExecuteUnit.setQueryInput(createExtensionExecuteUnitQueryInput());
    if (extensionExecuteUnit.getDataGridColumn() == null) extensionExecuteUnit.setDataGridColumn(createExtensionExecuteUnitDataGridColumn());
    return extensionExecuteUnit;
  }
  public HtmlTag createExtensionExecuteUnitInput(){
    return extensionExecuteUnit.textInput(30);
  }
  public HtmlTag createExtensionExecuteUnitQueryInput(){
    return extensionExecuteUnit.textQueryInput();
  }
  public JsType createExtensionExecuteUnitDataGridColumn(){
    return extensionExecuteUnit.textColumn();
  }
  
  // 备注
  public FieldCodes remark() {
    if (remark.getInput() == null) remark.setInput(createRemarkInput());
    if (remark.getQueryInput() == null) remark.setQueryInput(createRemarkQueryInput());
    if (remark.getDataGridColumn() == null) remark.setDataGridColumn(createRemarkDataGridColumn());
    return remark;
  }
  public HtmlTag createRemarkInput(){
    return remark.textInput(300);
  }
  public HtmlTag createRemarkQueryInput(){
    return remark.textQueryInput();
  }
  public JsType createRemarkDataGridColumn(){
    return remark.textColumn();
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
