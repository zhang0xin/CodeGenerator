package com.ysusoft.ui.purchase;

import com.ysusoft.ui.codehelper.HtmlTag;
import com.ysusoft.ui.codehelper.JsCode;
import com.ysusoft.ui.codehelper.JsType;
import com.ysusoft.ui.FieldCodes;
import com.ysusoft.ui.EntityUiBase;

public class Ffb010tUiAuto extends EntityUiBase {
  
  protected FieldCodes f0 = new FieldCodes("f0", "主键", "ffb010t", "entity", "query");
  protected FieldCodes contractNumber = new FieldCodes("contractNumber", "合同号", "ffb010t", "entity", "query");
  protected FieldCodes shipBatchId = new FieldCodes("shipBatchId", "船运批次", "ffb010t", "entity", "query");
  protected FieldCodes purchaseBatchId = new FieldCodes("purchaseBatchId", "采购批次", "ffb010t", "entity", "query");
  protected FieldCodes tradeType = new FieldCodes("tradeType", "贸易类型", "ffb010t", "entity", "query");
  protected FieldCodes oreArea = new FieldCodes("oreArea", "矿石产区", "ffb010t", "entity", "query");
  protected FieldCodes materialCategory = new FieldCodes("materialCategory", "资源种类", "ffb010t", "entity", "query");
  protected FieldCodes materialId = new FieldCodes("materialId", "物料名称", "ffb010t", "entity", "query");
  protected FieldCodes tfe = new FieldCodes("tfe", "TFe", "ffb010t", "entity", "query");
  protected FieldCodes h2o = new FieldCodes("h2o", "H2O", "ffb010t", "entity", "query");
  protected FieldCodes sio2 = new FieldCodes("sio2", "SiO2", "ffb010t", "entity", "query");
  protected FieldCodes al2o3 = new FieldCodes("al2o3", "Al2O3", "ffb010t", "entity", "query");
  protected FieldCodes sio2Al2o3 = new FieldCodes("sio2Al2o3", "SiO2+Al2O3", "ffb010t", "entity", "query");
  protected FieldCodes p = new FieldCodes("p", "P", "ffb010t", "entity", "query");
  protected FieldCodes s = new FieldCodes("s", "S", "ffb010t", "entity", "query");
  protected FieldCodes other = new FieldCodes("other", "粒度", "ffb010t", "entity", "query");
  protected FieldCodes price = new FieldCodes("price", "定价模式", "ffb010t", "entity", "query");
  protected FieldCodes purchaseQuantity = new FieldCodes("purchaseQuantity", "采购量", "ffb010t", "entity", "query");
  protected FieldCodes unit = new FieldCodes("unit", "单位", "ffb010t", "entity", "query");
  protected FieldCodes portLoadDate = new FieldCodes("portLoadDate", "装港日期", "ffb010t", "entity", "query");
  protected FieldCodes portLoadName = new FieldCodes("portLoadName", "装港名称", "ffb010t", "entity", "query");
  protected FieldCodes portArrivedDate = new FieldCodes("portArrivedDate", "到港日期", "ffb010t", "entity", "query");
  protected FieldCodes portArrivedName = new FieldCodes("portArrivedName", "到港名称", "ffb010t", "entity", "query");
  protected FieldCodes buyer = new FieldCodes("buyer", "买方（最终用户）", "ffb010t", "entity", "query");
  protected FieldCodes seller = new FieldCodes("seller", "卖方（矿山/供应商）", "ffb010t", "entity", "query");
  protected FieldCodes resourceLocation = new FieldCodes("resourceLocation", "资源位置", "ffb010t", "entity", "query");
  protected FieldCodes auditState = new FieldCodes("auditState", "审批状态", "ffb010t", "entity", "query");
  protected FieldCodes visibleDepartment = new FieldCodes("visibleDepartment", "可见部门", "ffb010t", "entity", "query");
  protected FieldCodes blAmount = new FieldCodes("blAmount", "B/L量", "ffb010t", "entity", "query");
  protected FieldCodes blDate = new FieldCodes("blDate", "B/L日", "ffb010t", "entity", "query");
  protected FieldCodes settlementPrice = new FieldCodes("settlementPrice", "结算吨度价", "ffb010t", "entity", "query");
  protected FieldCodes settlementPriceWithUnit = new FieldCodes("settlementPrice", "结算吨度价", "ffb010t", "entity", "query");
  protected FieldCodes settlementPriceUnit = new FieldCodes("settlementPriceUnit", "结算吨度价币种", "ffb010t", "entity", "query");
  protected FieldCodes shipSettlementPrice = new FieldCodes("shipSettlementPrice", "单船结算价", "ffb010t", "entity", "query");
  protected FieldCodes shipSettlementPriceWithUnit = new FieldCodes("shipSettlementPrice", "单船结算价", "ffb010t", "entity", "query");
  protected FieldCodes shipSettlementPriceUnit = new FieldCodes("shipSettlementPriceUnit", "单船结算价币种", "ffb010t", "entity", "query");
  protected FieldCodes finalFe = new FieldCodes("finalFe", "结算Fe", "ffb010t", "entity", "query");
  protected FieldCodes finalH2o = new FieldCodes("finalH2o", "结算H2O", "ffb010t", "entity", "query");
  protected FieldCodes settlementStartDate = new FieldCodes("settlementStartDate", "结算开始日", "ffb010t", "entity", "query");
  protected FieldCodes settlementQuantity = new FieldCodes("settlementQuantity", "结算重量", "ffb010t", "entity", "query");
  protected FieldCodes lcFirstFee = new FieldCodes("lcFirstFee", "LC或托收首款（含息）", "ffb010t", "entity", "query");
  protected FieldCodes lcFirstFeeWithUnit = new FieldCodes("lcFirstFee", "LC或托收首款（含息）", "ffb010t", "entity", "query");
  protected FieldCodes lcFirstFeeUnit = new FieldCodes("lcFirstFeeUnit", "LC或托收首款（含息）币种", "ffb010t", "entity", "query");
  protected FieldCodes companyFirstRate = new FieldCodes("companyFirstRate", "首款汇率", "ffb010t", "entity", "query");
  protected FieldCodes companyFirstRmb = new FieldCodes("companyFirstRmb", "首款人民币", "ffb010t", "entity", "query");
  protected FieldCodes interestRate = new FieldCodes("interestRate", "信用证利率", "ffb010t", "entity", "query");
  protected FieldCodes futureAccrual = new FieldCodes("futureAccrual", "远期利息", "ffb010t", "entity", "query");
  protected FieldCodes futureAccrualWithUnit = new FieldCodes("futureAccrual", "远期利息", "ffb010t", "entity", "query");
  protected FieldCodes futureAccrualUnit = new FieldCodes("futureAccrualUnit", "远期利息币种", "ffb010t", "entity", "query");
  protected FieldCodes firstPayDate = new FieldCodes("firstPayDate", "首款付款日", "ffb010t", "entity", "query");
  protected FieldCodes firstIssueDate = new FieldCodes("firstIssueDate", "首款到单日", "ffb010t", "entity", "query");
  protected FieldCodes firstDryQuantity = new FieldCodes("firstDryQuantity", "首款干吨", "ffb010t", "entity", "query");
  protected FieldCodes companyFirstFee = new FieldCodes("companyFirstFee", "矿山公司首款金额", "ffb010t", "entity", "query");
  protected FieldCodes companyFirstFeeWithUnit = new FieldCodes("companyFirstFee", "矿山公司首款金额", "ffb010t", "entity", "query");
  protected FieldCodes companyFirstFeeUnit = new FieldCodes("companyFirstFeeUnit", "矿山公司首款金额币种", "ffb010t", "entity", "query");
  protected FieldCodes transportEqualize = new FieldCodes("transportEqualize", "运费补偿", "ffb010t", "entity", "query");
  protected FieldCodes transportEqualizeWithUnit = new FieldCodes("transportEqualize", "运费补偿", "ffb010t", "entity", "query");
  protected FieldCodes transportEqualizeUnit = new FieldCodes("transportEqualizeUnit", "运费补偿币种", "ffb010t", "entity", "query");
  protected FieldCodes finalTransportFee = new FieldCodes("finalTransportFee", "最终运费", "ffb010t", "entity", "query");
  protected FieldCodes finalTransportFeeWithUnit = new FieldCodes("finalTransportFee", "最终运费", "ffb010t", "entity", "query");
  protected FieldCodes finalTransportFeeUnit = new FieldCodes("finalTransportFeeUnit", "最终运费币种", "ffb010t", "entity", "query");
  protected FieldCodes secondPay = new FieldCodes("secondPay", "二次货款额", "ffb010t", "entity", "query");
  protected FieldCodes secondPayWithUnit = new FieldCodes("secondPay", "二次货款额", "ffb010t", "entity", "query");
  protected FieldCodes secondPayUnit = new FieldCodes("secondPayUnit", "二次货款额币种", "ffb010t", "entity", "query");
  protected FieldCodes secondPayRate = new FieldCodes("secondPayRate", "二次货款汇率", "ffb010t", "entity", "query");
  protected FieldCodes secondPayRmb = new FieldCodes("secondPayRmb", "二次货款额人民币", "ffb010t", "entity", "query");
  protected FieldCodes secondPayDate = new FieldCodes("secondPayDate", "二次货款付款日", "ffb010t", "entity", "query");
  protected FieldCodes settlementTailFee = new FieldCodes("settlementTailFee", "结算尾款（含滞期速遣费）", "ffb010t", "entity", "query");
  protected FieldCodes settlementTailFeeWithUnit = new FieldCodes("settlementTailFee", "结算尾款（含滞期速遣费）", "ffb010t", "entity", "query");
  protected FieldCodes settlementTailFeeUnit = new FieldCodes("settlementTailFeeUnit", "结算尾款（含滞期速遣费）币种", "ffb010t", "entity", "query");
  protected FieldCodes settlementTailRate = new FieldCodes("settlementTailRate", "尾款汇率", "ffb010t", "entity", "query");
  protected FieldCodes settlementTailRmb = new FieldCodes("settlementTailRmb", "尾款人民币", "ffb010t", "entity", "query");
  protected FieldCodes tailFeeDate = new FieldCodes("tailFeeDate", "尾款付款日", "ffb010t", "entity", "query");
  protected FieldCodes gaugeDiscount = new FieldCodes("gaugeDiscount", "水尺优惠", "ffb010t", "entity", "query");
  protected FieldCodes gaugeDiscountWithUnit = new FieldCodes("gaugeDiscount", "水尺优惠", "ffb010t", "entity", "query");
  protected FieldCodes gaugeDiscountUnit = new FieldCodes("gaugeDiscountUnit", "水尺优惠币种", "ffb010t", "entity", "query");
  protected FieldCodes settlementAssessmentCycle = new FieldCodes("settlementAssessmentCycle", "结算考核周期", "ffb010t", "entity", "query");
  protected FieldCodes drainEqualize = new FieldCodes("drainEqualize", "FOB排水运费补偿", "ffb010t", "entity", "query");
  protected FieldCodes drainEqualizeWithUnit = new FieldCodes("drainEqualize", "FOB排水运费补偿", "ffb010t", "entity", "query");
  protected FieldCodes drainEqualizeUnit = new FieldCodes("drainEqualizeUnit", "FOB排水运费补偿币种", "ffb010t", "entity", "query");
  protected FieldCodes oceanFreightPrice = new FieldCodes("oceanFreightPrice", "海运费单价", "ffb010t", "entity", "query");
  protected FieldCodes remarks = new FieldCodes("remarks", "备注", "ffb010t", "entity", "query");
  protected FieldCodes ffb010t020pArchived = new FieldCodes("ffb010t020pArchived", "归档", "ffb010t", "entity", "query");
  protected FieldCodes insuranceCompany = new FieldCodes("insuranceCompany", "保险公司", "ffb010t", "entity", "query");
  protected FieldCodes insuranceFee = new FieldCodes("insuranceFee", "保险费", "ffb010t", "entity", "query");
  protected FieldCodes insuranceFeeWithUnit = new FieldCodes("insuranceFee", "保险费", "ffb010t", "entity", "query");
  protected FieldCodes insuranceFeeUnit = new FieldCodes("insuranceFeeUnit", "保险费币种", "ffb010t", "entity", "query");
  protected FieldCodes ffb010t030pArchived = new FieldCodes("ffb010t030pArchived", "归档", "ffb010t", "entity", "query");
  protected FieldCodes lcNumber = new FieldCodes("lcNumber", "L/C号码", "ffb010t", "entity", "query");
  protected FieldCodes documentaryBillsInterest = new FieldCodes("documentaryBillsInterest", "押汇利息", "ffb010t", "entity", "query");
  protected FieldCodes documentaryBillsHike = new FieldCodes("documentaryBillsHike", "押汇加息", "ffb010t", "entity", "query");
  protected FieldCodes capitalOccupationFee = new FieldCodes("capitalOccupationFee", "资金占用费", "ffb010t", "entity", "query");
  protected FieldCodes openingCharge = new FieldCodes("openingCharge", "开证费", "ffb010t", "entity", "query");
  protected FieldCodes acceptingCharge = new FieldCodes("acceptingCharge", "承兑费", "ffb010t", "entity", "query");
  protected FieldCodes customsGuaranteeFee = new FieldCodes("customsGuaranteeFee", "关税保函费", "ffb010t", "entity", "query");
  protected FieldCodes agentServiceFee = new FieldCodes("agentServiceFee", "代理服务费", "ffb010t", "entity", "query");
  protected FieldCodes extensionPeriod = new FieldCodes("extensionPeriod", "展期期限/天", "ffb010t", "entity", "query");
  protected FieldCodes extensionDate = new FieldCodes("extensionDate", "展期到期日", "ffb010t", "entity", "query");
  protected FieldCodes extensionAmount = new FieldCodes("extensionAmount", "展期金额", "ffb010t", "entity", "query");
  protected FieldCodes extensionRate = new FieldCodes("extensionRate", "展期利率", "ffb010t", "entity", "query");
  protected FieldCodes extensionInterest = new FieldCodes("extensionInterest", "展期利息", "ffb010t", "entity", "query");
  protected FieldCodes extensionExecuteUnit = new FieldCodes("extensionExecuteUnit", "展期执行单位", "ffb010t", "entity", "query");
  protected FieldCodes issuePrice = new FieldCodes("issuePrice", "开证单价", "ffb010t", "entity", "query");
  protected FieldCodes issuePriceWithUnit = new FieldCodes("issuePrice", "开证单价", "ffb010t", "entity", "query");
  protected FieldCodes issuePriceUnit = new FieldCodes("issuePriceUnit", "开证单价币种", "ffb010t", "entity", "query");
  protected FieldCodes dryTonPrice = new FieldCodes("dryTonPrice", "吨度价", "ffb010t", "entity", "query");
  protected FieldCodes creditTfe = new FieldCodes("creditTfe", "TFe", "ffb010t", "entity", "query");
  protected FieldCodes pobPrice = new FieldCodes("pobPrice", "FOB价", "ffb010t", "entity", "query");
  protected FieldCodes cfrPrice = new FieldCodes("cfrPrice", "CFR价", "ffb010t", "entity", "query");
  protected FieldCodes createBy = new FieldCodes("createBy", "创建人", "ffb010t", "entity", "query");
  protected FieldCodes createDate = new FieldCodes("createDate", "创建日期", "ffb010t", "entity", "query");
  protected FieldCodes updateBy = new FieldCodes("updateBy", "更新人", "ffb010t", "entity", "query");
  protected FieldCodes updateDate = new FieldCodes("updateDate", "更新日期", "ffb010t", "entity", "query");
  protected FieldCodes archived = new FieldCodes("archived", "归档", "ffb010t", "entity", "query");
  
  public Ffb010tUiAuto(){
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
  
  // 采购批次
  public FieldCodes purchaseBatchId() {
    if (purchaseBatchId.getInput() == null) purchaseBatchId.setInput(createPurchaseBatchIdInput());
    if (purchaseBatchId.getQueryInput() == null) purchaseBatchId.setQueryInput(createPurchaseBatchIdQueryInput());
    if (purchaseBatchId.getDataGridColumn() == null) purchaseBatchId.setDataGridColumn(createPurchaseBatchIdDataGridColumn());
    return purchaseBatchId;
  }
  public HtmlTag createPurchaseBatchIdInput(){
    return purchaseBatchId.textInput(36);
  }
  public HtmlTag createPurchaseBatchIdQueryInput(){
    return purchaseBatchId.textQueryInput();
  }
  public JsType createPurchaseBatchIdDataGridColumn(){
    return purchaseBatchId.textColumn();
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
  
  // 矿石产区
  public FieldCodes oreArea() {
    if (oreArea.getInput() == null) oreArea.setInput(createOreAreaInput());
    if (oreArea.getQueryInput() == null) oreArea.setQueryInput(createOreAreaQueryInput());
    if (oreArea.getDataGridColumn() == null) oreArea.setDataGridColumn(createOreAreaDataGridColumn());
    return oreArea;
  }
  public HtmlTag createOreAreaInput(){
    return oreArea.comboboxInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '澳洲', value: '澳洲'}, {label: '巴西', value: '巴西'}, {label: '非洲', value: '非洲'}, {label: '亚洲', value: '亚洲'}, {label: '其他', value: '其他'}]");
  }
  public HtmlTag createOreAreaQueryInput(){
    return oreArea.comboboxQueryInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '澳洲', value: '澳洲'}, {label: '巴西', value: '巴西'}, {label: '非洲', value: '非洲'}, {label: '亚洲', value: '亚洲'}, {label: '其他', value: '其他'}]");
  }
  public JsType createOreAreaDataGridColumn(){
    return oreArea.textColumn();
  }
  
  // 资源种类
  public FieldCodes materialCategory() {
    if (materialCategory.getInput() == null) materialCategory.setInput(createMaterialCategoryInput());
    if (materialCategory.getQueryInput() == null) materialCategory.setQueryInput(createMaterialCategoryQueryInput());
    if (materialCategory.getDataGridColumn() == null) materialCategory.setDataGridColumn(createMaterialCategoryDataGridColumn());
    return materialCategory;
  }
  public HtmlTag createMaterialCategoryInput(){
    return materialCategory.textInput(30);
  }
  public HtmlTag createMaterialCategoryQueryInput(){
    return materialCategory.textQueryInput();
  }
  public JsType createMaterialCategoryDataGridColumn(){
    return materialCategory.textColumn();
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
  
  // TFe
  public FieldCodes tfe() {
    if (tfe.getInput() == null) tfe.setInput(createTfeInput());
    if (tfe.getQueryInput() == null) tfe.setQueryInput(createTfeQueryInput());
    if (tfe.getDataGridColumn() == null) tfe.setDataGridColumn(createTfeDataGridColumn());
    return tfe;
  }
  public HtmlTag createTfeInput(){
    return tfe.textInput(20);
  }
  public HtmlTag createTfeQueryInput(){
    return tfe.textQueryInput();
  }
  public JsType createTfeDataGridColumn(){
    return tfe.textColumn();
  }
  
  // H2O
  public FieldCodes h2o() {
    if (h2o.getInput() == null) h2o.setInput(createH2oInput());
    if (h2o.getQueryInput() == null) h2o.setQueryInput(createH2oQueryInput());
    if (h2o.getDataGridColumn() == null) h2o.setDataGridColumn(createH2oDataGridColumn());
    return h2o;
  }
  public HtmlTag createH2oInput(){
    return h2o.textInput(20);
  }
  public HtmlTag createH2oQueryInput(){
    return h2o.textQueryInput();
  }
  public JsType createH2oDataGridColumn(){
    return h2o.textColumn();
  }
  
  // SiO2
  public FieldCodes sio2() {
    if (sio2.getInput() == null) sio2.setInput(createSio2Input());
    if (sio2.getQueryInput() == null) sio2.setQueryInput(createSio2QueryInput());
    if (sio2.getDataGridColumn() == null) sio2.setDataGridColumn(createSio2DataGridColumn());
    return sio2;
  }
  public HtmlTag createSio2Input(){
    return sio2.textInput(20);
  }
  public HtmlTag createSio2QueryInput(){
    return sio2.textQueryInput();
  }
  public JsType createSio2DataGridColumn(){
    return sio2.textColumn();
  }
  
  // Al2O3
  public FieldCodes al2o3() {
    if (al2o3.getInput() == null) al2o3.setInput(createAl2o3Input());
    if (al2o3.getQueryInput() == null) al2o3.setQueryInput(createAl2o3QueryInput());
    if (al2o3.getDataGridColumn() == null) al2o3.setDataGridColumn(createAl2o3DataGridColumn());
    return al2o3;
  }
  public HtmlTag createAl2o3Input(){
    return al2o3.textInput(20);
  }
  public HtmlTag createAl2o3QueryInput(){
    return al2o3.textQueryInput();
  }
  public JsType createAl2o3DataGridColumn(){
    return al2o3.textColumn();
  }
  
  // SiO2+Al2O3
  public FieldCodes sio2Al2o3() {
    if (sio2Al2o3.getInput() == null) sio2Al2o3.setInput(createSio2Al2o3Input());
    if (sio2Al2o3.getQueryInput() == null) sio2Al2o3.setQueryInput(createSio2Al2o3QueryInput());
    if (sio2Al2o3.getDataGridColumn() == null) sio2Al2o3.setDataGridColumn(createSio2Al2o3DataGridColumn());
    return sio2Al2o3;
  }
  public HtmlTag createSio2Al2o3Input(){
    return sio2Al2o3.textInput(20);
  }
  public HtmlTag createSio2Al2o3QueryInput(){
    return sio2Al2o3.textQueryInput();
  }
  public JsType createSio2Al2o3DataGridColumn(){
    return sio2Al2o3.textColumn();
  }
  
  // P
  public FieldCodes p() {
    if (p.getInput() == null) p.setInput(createPInput());
    if (p.getQueryInput() == null) p.setQueryInput(createPQueryInput());
    if (p.getDataGridColumn() == null) p.setDataGridColumn(createPDataGridColumn());
    return p;
  }
  public HtmlTag createPInput(){
    return p.textInput(20);
  }
  public HtmlTag createPQueryInput(){
    return p.textQueryInput();
  }
  public JsType createPDataGridColumn(){
    return p.textColumn();
  }
  
  // S
  public FieldCodes s() {
    if (s.getInput() == null) s.setInput(createSInput());
    if (s.getQueryInput() == null) s.setQueryInput(createSQueryInput());
    if (s.getDataGridColumn() == null) s.setDataGridColumn(createSDataGridColumn());
    return s;
  }
  public HtmlTag createSInput(){
    return s.textInput(20);
  }
  public HtmlTag createSQueryInput(){
    return s.textQueryInput();
  }
  public JsType createSDataGridColumn(){
    return s.textColumn();
  }
  
  // 粒度
  public FieldCodes other() {
    if (other.getInput() == null) other.setInput(createOtherInput());
    if (other.getQueryInput() == null) other.setQueryInput(createOtherQueryInput());
    if (other.getDataGridColumn() == null) other.setDataGridColumn(createOtherDataGridColumn());
    return other;
  }
  public HtmlTag createOtherInput(){
    return other.textInput(200);
  }
  public HtmlTag createOtherQueryInput(){
    return other.textQueryInput();
  }
  public JsType createOtherDataGridColumn(){
    return other.textColumn();
  }
  
  // 定价模式
  public FieldCodes price() {
    if (price.getInput() == null) price.setInput(createPriceInput());
    if (price.getQueryInput() == null) price.setQueryInput(createPriceQueryInput());
    if (price.getDataGridColumn() == null) price.setDataGridColumn(createPriceDataGridColumn());
    return price;
  }
  public HtmlTag createPriceInput(){
    return price.textInput(50);
  }
  public HtmlTag createPriceQueryInput(){
    return price.textQueryInput();
  }
  public JsType createPriceDataGridColumn(){
    return price.textColumn();
  }
  
  // 采购量
  public FieldCodes purchaseQuantity() {
    if (purchaseQuantity.getInput() == null) purchaseQuantity.setInput(createPurchaseQuantityInput());
    if (purchaseQuantity.getQueryInput() == null) purchaseQuantity.setQueryInput(createPurchaseQuantityQueryInput());
    if (purchaseQuantity.getDataGridColumn() == null) purchaseQuantity.setDataGridColumn(createPurchaseQuantityDataGridColumn());
    return purchaseQuantity;
  }
  public HtmlTag createPurchaseQuantityInput(){
    return purchaseQuantity.numberInput(5);
  }
  public HtmlTag createPurchaseQuantityQueryInput(){
    return purchaseQuantity.numberQueryInput();
  }
  public JsType createPurchaseQuantityDataGridColumn(){
    return purchaseQuantity.textColumn();
  }
  
  // 单位
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
  
  // 装港日期
  public FieldCodes portLoadDate() {
    if (portLoadDate.getInput() == null) portLoadDate.setInput(createPortLoadDateInput());
    if (portLoadDate.getQueryInput() == null) portLoadDate.setQueryInput(createPortLoadDateQueryInput());
    if (portLoadDate.getDataGridColumn() == null) portLoadDate.setDataGridColumn(createPortLoadDateDataGridColumn());
    return portLoadDate;
  }
  public HtmlTag createPortLoadDateInput(){
    return portLoadDate.dateInput();
  }
  public HtmlTag createPortLoadDateQueryInput(){
    return portLoadDate.dateQueryInput();
  }
  public JsType createPortLoadDateDataGridColumn(){
    return portLoadDate.dateColumn();
  }
  
  // 装港名称
  public FieldCodes portLoadName() {
    if (portLoadName.getInput() == null) portLoadName.setInput(createPortLoadNameInput());
    if (portLoadName.getQueryInput() == null) portLoadName.setQueryInput(createPortLoadNameQueryInput());
    if (portLoadName.getDataGridColumn() == null) portLoadName.setDataGridColumn(createPortLoadNameDataGridColumn());
    return portLoadName;
  }
  public HtmlTag createPortLoadNameInput(){
    return portLoadName.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2006");
  }
  public HtmlTag createPortLoadNameQueryInput(){
    return portLoadName.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2006");
  }
  public JsType createPortLoadNameDataGridColumn(){
    return portLoadName.textColumn();
  }
  
  // 到港日期
  public FieldCodes portArrivedDate() {
    if (portArrivedDate.getInput() == null) portArrivedDate.setInput(createPortArrivedDateInput());
    if (portArrivedDate.getQueryInput() == null) portArrivedDate.setQueryInput(createPortArrivedDateQueryInput());
    if (portArrivedDate.getDataGridColumn() == null) portArrivedDate.setDataGridColumn(createPortArrivedDateDataGridColumn());
    return portArrivedDate;
  }
  public HtmlTag createPortArrivedDateInput(){
    return portArrivedDate.dateInput();
  }
  public HtmlTag createPortArrivedDateQueryInput(){
    return portArrivedDate.dateQueryInput();
  }
  public JsType createPortArrivedDateDataGridColumn(){
    return portArrivedDate.dateColumn();
  }
  
  // 到港名称
  public FieldCodes portArrivedName() {
    if (portArrivedName.getInput() == null) portArrivedName.setInput(createPortArrivedNameInput());
    if (portArrivedName.getQueryInput() == null) portArrivedName.setQueryInput(createPortArrivedNameQueryInput());
    if (portArrivedName.getDataGridColumn() == null) portArrivedName.setDataGridColumn(createPortArrivedNameDataGridColumn());
    return portArrivedName;
  }
  public HtmlTag createPortArrivedNameInput(){
    return portArrivedName.textInput(30);
  }
  public HtmlTag createPortArrivedNameQueryInput(){
    return portArrivedName.textQueryInput();
  }
  public JsType createPortArrivedNameDataGridColumn(){
    return portArrivedName.textColumn();
  }
  
  // 买方（最终用户）
  public FieldCodes buyer() {
    if (buyer.getInput() == null) buyer.setInput(createBuyerInput());
    if (buyer.getQueryInput() == null) buyer.setQueryInput(createBuyerQueryInput());
    if (buyer.getDataGridColumn() == null) buyer.setDataGridColumn(createBuyerDataGridColumn());
    return buyer;
  }
  public HtmlTag createBuyerInput(){
    return buyer.textInput(30);
  }
  public HtmlTag createBuyerQueryInput(){
    return buyer.textQueryInput();
  }
  public JsType createBuyerDataGridColumn(){
    return buyer.textColumn();
  }
  
  // 卖方（矿山/供应商）
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
  
  // 资源位置
  public FieldCodes resourceLocation() {
    if (resourceLocation.getInput() == null) resourceLocation.setInput(createResourceLocationInput());
    if (resourceLocation.getQueryInput() == null) resourceLocation.setQueryInput(createResourceLocationQueryInput());
    if (resourceLocation.getDataGridColumn() == null) resourceLocation.setDataGridColumn(createResourceLocationDataGridColumn());
    return resourceLocation;
  }
  public HtmlTag createResourceLocationInput(){
    return resourceLocation.textInput(30);
  }
  public HtmlTag createResourceLocationQueryInput(){
    return resourceLocation.textQueryInput();
  }
  public JsType createResourceLocationDataGridColumn(){
    return resourceLocation.textColumn();
  }
  
  // 审批状态
  public FieldCodes auditState() {
    if (auditState.getInput() == null) auditState.setInput(createAuditStateInput());
    if (auditState.getQueryInput() == null) auditState.setQueryInput(createAuditStateQueryInput());
    if (auditState.getDataGridColumn() == null) auditState.setDataGridColumn(createAuditStateDataGridColumn());
    return auditState;
  }
  public HtmlTag createAuditStateInput(){
    return auditState.comboboxInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '未提交', value: '未提交'}, {label: '提交', value: '提交'}, {label: '通过', value: '通过'}, {label: '未通过', value: '未通过'}]");
  }
  public HtmlTag createAuditStateQueryInput(){
    return auditState.comboboxQueryInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '未提交', value: '未提交'}, {label: '提交', value: '提交'}, {label: '通过', value: '通过'}, {label: '未通过', value: '未通过'}]");
  }
  public JsType createAuditStateDataGridColumn(){
    return auditState.textColumn();
  }
  
  // 可见部门
  public FieldCodes visibleDepartment() {
    if (visibleDepartment.getInput() == null) visibleDepartment.setInput(createVisibleDepartmentInput());
    if (visibleDepartment.getQueryInput() == null) visibleDepartment.setQueryInput(createVisibleDepartmentQueryInput());
    if (visibleDepartment.getDataGridColumn() == null) visibleDepartment.setDataGridColumn(createVisibleDepartmentDataGridColumn());
    return visibleDepartment;
  }
  public HtmlTag createVisibleDepartmentInput(){
    return visibleDepartment.textInput(30);
  }
  public HtmlTag createVisibleDepartmentQueryInput(){
    return visibleDepartment.textQueryInput();
  }
  public JsType createVisibleDepartmentDataGridColumn(){
    return visibleDepartment.textColumn();
  }
  
  // B/L量
  public FieldCodes blAmount() {
    if (blAmount.getInput() == null) blAmount.setInput(createBlAmountInput());
    if (blAmount.getQueryInput() == null) blAmount.setQueryInput(createBlAmountQueryInput());
    if (blAmount.getDataGridColumn() == null) blAmount.setDataGridColumn(createBlAmountDataGridColumn());
    return blAmount;
  }
  public HtmlTag createBlAmountInput(){
    return blAmount.numberInput(5);
  }
  public HtmlTag createBlAmountQueryInput(){
    return blAmount.numberQueryInput();
  }
  public JsType createBlAmountDataGridColumn(){
    return blAmount.textColumn();
  }
  
  // B/L日
  public FieldCodes blDate() {
    if (blDate.getInput() == null) blDate.setInput(createBlDateInput());
    if (blDate.getQueryInput() == null) blDate.setQueryInput(createBlDateQueryInput());
    if (blDate.getDataGridColumn() == null) blDate.setDataGridColumn(createBlDateDataGridColumn());
    return blDate;
  }
  public HtmlTag createBlDateInput(){
    return blDate.dateInput();
  }
  public HtmlTag createBlDateQueryInput(){
    return blDate.dateQueryInput();
  }
  public JsType createBlDateDataGridColumn(){
    return blDate.dateColumn();
  }
  
  // 结算吨度价
  public FieldCodes settlementPrice() {
    if (settlementPrice.getInput() == null) settlementPrice.setInput(createSettlementPriceInput());
    if (settlementPrice.getQueryInput() == null) settlementPrice.setQueryInput(createSettlementPriceQueryInput());
    if (settlementPrice.getDataGridColumn() == null) settlementPrice.setDataGridColumn(createSettlementPriceDataGridColumn());
    return settlementPrice;
  }
  public HtmlTag createSettlementPriceInput(){
    return settlementPrice.numberInput(4);
  }
  public HtmlTag createSettlementPriceQueryInput(){
    return settlementPrice.numberQueryInput();
  }
  public JsType createSettlementPriceDataGridColumn(){
    return settlementPrice.textColumn();
  }
  
  // 结算吨度价（带单位）
  public FieldCodes settlementPriceWithUnit() {
    if (settlementPriceWithUnit.getInput() == null) settlementPriceWithUnit.setInput(createSettlementPriceWithUnitInput());
    if (settlementPriceWithUnit.getQueryInput() == null) settlementPriceWithUnit.setQueryInput(createSettlementPriceWithUnitQueryInput());
    if (settlementPriceWithUnit.getDataGridColumn() == null) settlementPriceWithUnit.setDataGridColumn(createSettlementPriceWithUnitDataGridColumn());
    return settlementPriceWithUnit;
  }
  public HtmlTag createSettlementPriceWithUnitInput(){
    return settlementPriceWithUnit.quantityWithUnitInput(4, "2003"); 
  }
  public HtmlTag createSettlementPriceWithUnitQueryInput(){
    return settlementPrice.numberQueryInput();
  }
  public JsType createSettlementPriceWithUnitDataGridColumn(){
    return settlementPrice.textColumn();
  }
  
  // 结算吨度价币种
  public FieldCodes settlementPriceUnit() {
    if (settlementPriceUnit.getInput() == null) settlementPriceUnit.setInput(createSettlementPriceUnitInput());
    if (settlementPriceUnit.getQueryInput() == null) settlementPriceUnit.setQueryInput(createSettlementPriceUnitQueryInput());
    if (settlementPriceUnit.getDataGridColumn() == null) settlementPriceUnit.setDataGridColumn(createSettlementPriceUnitDataGridColumn());
    return settlementPriceUnit;
  }
  public HtmlTag createSettlementPriceUnitInput(){
    return settlementPriceUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createSettlementPriceUnitQueryInput(){
    return settlementPriceUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createSettlementPriceUnitDataGridColumn(){
    return settlementPriceUnit.textColumn();
  }
  
  // 单船结算价
  public FieldCodes shipSettlementPrice() {
    if (shipSettlementPrice.getInput() == null) shipSettlementPrice.setInput(createShipSettlementPriceInput());
    if (shipSettlementPrice.getQueryInput() == null) shipSettlementPrice.setQueryInput(createShipSettlementPriceQueryInput());
    if (shipSettlementPrice.getDataGridColumn() == null) shipSettlementPrice.setDataGridColumn(createShipSettlementPriceDataGridColumn());
    return shipSettlementPrice;
  }
  public HtmlTag createShipSettlementPriceInput(){
    return shipSettlementPrice.numberInput(2);
  }
  public HtmlTag createShipSettlementPriceQueryInput(){
    return shipSettlementPrice.numberQueryInput();
  }
  public JsType createShipSettlementPriceDataGridColumn(){
    return shipSettlementPrice.textColumn();
  }
  
  // 单船结算价（带单位）
  public FieldCodes shipSettlementPriceWithUnit() {
    if (shipSettlementPriceWithUnit.getInput() == null) shipSettlementPriceWithUnit.setInput(createShipSettlementPriceWithUnitInput());
    if (shipSettlementPriceWithUnit.getQueryInput() == null) shipSettlementPriceWithUnit.setQueryInput(createShipSettlementPriceWithUnitQueryInput());
    if (shipSettlementPriceWithUnit.getDataGridColumn() == null) shipSettlementPriceWithUnit.setDataGridColumn(createShipSettlementPriceWithUnitDataGridColumn());
    return shipSettlementPriceWithUnit;
  }
  public HtmlTag createShipSettlementPriceWithUnitInput(){
    return shipSettlementPriceWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createShipSettlementPriceWithUnitQueryInput(){
    return shipSettlementPrice.numberQueryInput();
  }
  public JsType createShipSettlementPriceWithUnitDataGridColumn(){
    return shipSettlementPrice.textColumn();
  }
  
  // 单船结算价币种
  public FieldCodes shipSettlementPriceUnit() {
    if (shipSettlementPriceUnit.getInput() == null) shipSettlementPriceUnit.setInput(createShipSettlementPriceUnitInput());
    if (shipSettlementPriceUnit.getQueryInput() == null) shipSettlementPriceUnit.setQueryInput(createShipSettlementPriceUnitQueryInput());
    if (shipSettlementPriceUnit.getDataGridColumn() == null) shipSettlementPriceUnit.setDataGridColumn(createShipSettlementPriceUnitDataGridColumn());
    return shipSettlementPriceUnit;
  }
  public HtmlTag createShipSettlementPriceUnitInput(){
    return shipSettlementPriceUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createShipSettlementPriceUnitQueryInput(){
    return shipSettlementPriceUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createShipSettlementPriceUnitDataGridColumn(){
    return shipSettlementPriceUnit.textColumn();
  }
  
  // 结算Fe
  public FieldCodes finalFe() {
    if (finalFe.getInput() == null) finalFe.setInput(createFinalFeInput());
    if (finalFe.getQueryInput() == null) finalFe.setQueryInput(createFinalFeQueryInput());
    if (finalFe.getDataGridColumn() == null) finalFe.setDataGridColumn(createFinalFeDataGridColumn());
    return finalFe;
  }
  public HtmlTag createFinalFeInput(){
    return finalFe.numberInput(4);
  }
  public HtmlTag createFinalFeQueryInput(){
    return finalFe.numberQueryInput();
  }
  public JsType createFinalFeDataGridColumn(){
    return finalFe.textColumn();
  }
  
  // 结算H2O
  public FieldCodes finalH2o() {
    if (finalH2o.getInput() == null) finalH2o.setInput(createFinalH2oInput());
    if (finalH2o.getQueryInput() == null) finalH2o.setQueryInput(createFinalH2oQueryInput());
    if (finalH2o.getDataGridColumn() == null) finalH2o.setDataGridColumn(createFinalH2oDataGridColumn());
    return finalH2o;
  }
  public HtmlTag createFinalH2oInput(){
    return finalH2o.numberInput(4);
  }
  public HtmlTag createFinalH2oQueryInput(){
    return finalH2o.numberQueryInput();
  }
  public JsType createFinalH2oDataGridColumn(){
    return finalH2o.textColumn();
  }
  
  // 结算开始日
  public FieldCodes settlementStartDate() {
    if (settlementStartDate.getInput() == null) settlementStartDate.setInput(createSettlementStartDateInput());
    if (settlementStartDate.getQueryInput() == null) settlementStartDate.setQueryInput(createSettlementStartDateQueryInput());
    if (settlementStartDate.getDataGridColumn() == null) settlementStartDate.setDataGridColumn(createSettlementStartDateDataGridColumn());
    return settlementStartDate;
  }
  public HtmlTag createSettlementStartDateInput(){
    return settlementStartDate.dateInput();
  }
  public HtmlTag createSettlementStartDateQueryInput(){
    return settlementStartDate.dateQueryInput();
  }
  public JsType createSettlementStartDateDataGridColumn(){
    return settlementStartDate.dateColumn();
  }
  
  // 结算重量
  public FieldCodes settlementQuantity() {
    if (settlementQuantity.getInput() == null) settlementQuantity.setInput(createSettlementQuantityInput());
    if (settlementQuantity.getQueryInput() == null) settlementQuantity.setQueryInput(createSettlementQuantityQueryInput());
    if (settlementQuantity.getDataGridColumn() == null) settlementQuantity.setDataGridColumn(createSettlementQuantityDataGridColumn());
    return settlementQuantity;
  }
  public HtmlTag createSettlementQuantityInput(){
    return settlementQuantity.numberInput(5);
  }
  public HtmlTag createSettlementQuantityQueryInput(){
    return settlementQuantity.numberQueryInput();
  }
  public JsType createSettlementQuantityDataGridColumn(){
    return settlementQuantity.textColumn();
  }
  
  // LC或托收首款（含息）
  public FieldCodes lcFirstFee() {
    if (lcFirstFee.getInput() == null) lcFirstFee.setInput(createLcFirstFeeInput());
    if (lcFirstFee.getQueryInput() == null) lcFirstFee.setQueryInput(createLcFirstFeeQueryInput());
    if (lcFirstFee.getDataGridColumn() == null) lcFirstFee.setDataGridColumn(createLcFirstFeeDataGridColumn());
    return lcFirstFee;
  }
  public HtmlTag createLcFirstFeeInput(){
    return lcFirstFee.numberInput(2);
  }
  public HtmlTag createLcFirstFeeQueryInput(){
    return lcFirstFee.numberQueryInput();
  }
  public JsType createLcFirstFeeDataGridColumn(){
    return lcFirstFee.textColumn();
  }
  
  // LC或托收首款（含息）（带单位）
  public FieldCodes lcFirstFeeWithUnit() {
    if (lcFirstFeeWithUnit.getInput() == null) lcFirstFeeWithUnit.setInput(createLcFirstFeeWithUnitInput());
    if (lcFirstFeeWithUnit.getQueryInput() == null) lcFirstFeeWithUnit.setQueryInput(createLcFirstFeeWithUnitQueryInput());
    if (lcFirstFeeWithUnit.getDataGridColumn() == null) lcFirstFeeWithUnit.setDataGridColumn(createLcFirstFeeWithUnitDataGridColumn());
    return lcFirstFeeWithUnit;
  }
  public HtmlTag createLcFirstFeeWithUnitInput(){
    return lcFirstFeeWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createLcFirstFeeWithUnitQueryInput(){
    return lcFirstFee.numberQueryInput();
  }
  public JsType createLcFirstFeeWithUnitDataGridColumn(){
    return lcFirstFee.textColumn();
  }
  
  // LC或托收首款（含息）币种
  public FieldCodes lcFirstFeeUnit() {
    if (lcFirstFeeUnit.getInput() == null) lcFirstFeeUnit.setInput(createLcFirstFeeUnitInput());
    if (lcFirstFeeUnit.getQueryInput() == null) lcFirstFeeUnit.setQueryInput(createLcFirstFeeUnitQueryInput());
    if (lcFirstFeeUnit.getDataGridColumn() == null) lcFirstFeeUnit.setDataGridColumn(createLcFirstFeeUnitDataGridColumn());
    return lcFirstFeeUnit;
  }
  public HtmlTag createLcFirstFeeUnitInput(){
    return lcFirstFeeUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createLcFirstFeeUnitQueryInput(){
    return lcFirstFeeUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createLcFirstFeeUnitDataGridColumn(){
    return lcFirstFeeUnit.textColumn();
  }
  
  // 首款汇率
  public FieldCodes companyFirstRate() {
    if (companyFirstRate.getInput() == null) companyFirstRate.setInput(createCompanyFirstRateInput());
    if (companyFirstRate.getQueryInput() == null) companyFirstRate.setQueryInput(createCompanyFirstRateQueryInput());
    if (companyFirstRate.getDataGridColumn() == null) companyFirstRate.setDataGridColumn(createCompanyFirstRateDataGridColumn());
    return companyFirstRate;
  }
  public HtmlTag createCompanyFirstRateInput(){
    return companyFirstRate.numberInput(5);
  }
  public HtmlTag createCompanyFirstRateQueryInput(){
    return companyFirstRate.numberQueryInput();
  }
  public JsType createCompanyFirstRateDataGridColumn(){
    return companyFirstRate.textColumn();
  }
  
  // 首款人民币
  public FieldCodes companyFirstRmb() {
    if (companyFirstRmb.getInput() == null) companyFirstRmb.setInput(createCompanyFirstRmbInput());
    if (companyFirstRmb.getQueryInput() == null) companyFirstRmb.setQueryInput(createCompanyFirstRmbQueryInput());
    if (companyFirstRmb.getDataGridColumn() == null) companyFirstRmb.setDataGridColumn(createCompanyFirstRmbDataGridColumn());
    return companyFirstRmb;
  }
  public HtmlTag createCompanyFirstRmbInput(){
    return companyFirstRmb.numberInput(2);
  }
  public HtmlTag createCompanyFirstRmbQueryInput(){
    return companyFirstRmb.numberQueryInput();
  }
  public JsType createCompanyFirstRmbDataGridColumn(){
    return companyFirstRmb.textColumn();
  }
  
  // 信用证利率
  public FieldCodes interestRate() {
    if (interestRate.getInput() == null) interestRate.setInput(createInterestRateInput());
    if (interestRate.getQueryInput() == null) interestRate.setQueryInput(createInterestRateQueryInput());
    if (interestRate.getDataGridColumn() == null) interestRate.setDataGridColumn(createInterestRateDataGridColumn());
    return interestRate;
  }
  public HtmlTag createInterestRateInput(){
    return interestRate.numberInput(5);
  }
  public HtmlTag createInterestRateQueryInput(){
    return interestRate.numberQueryInput();
  }
  public JsType createInterestRateDataGridColumn(){
    return interestRate.textColumn();
  }
  
  // 远期利息
  public FieldCodes futureAccrual() {
    if (futureAccrual.getInput() == null) futureAccrual.setInput(createFutureAccrualInput());
    if (futureAccrual.getQueryInput() == null) futureAccrual.setQueryInput(createFutureAccrualQueryInput());
    if (futureAccrual.getDataGridColumn() == null) futureAccrual.setDataGridColumn(createFutureAccrualDataGridColumn());
    return futureAccrual;
  }
  public HtmlTag createFutureAccrualInput(){
    return futureAccrual.numberInput(5);
  }
  public HtmlTag createFutureAccrualQueryInput(){
    return futureAccrual.numberQueryInput();
  }
  public JsType createFutureAccrualDataGridColumn(){
    return futureAccrual.textColumn();
  }
  
  // 远期利息（带单位）
  public FieldCodes futureAccrualWithUnit() {
    if (futureAccrualWithUnit.getInput() == null) futureAccrualWithUnit.setInput(createFutureAccrualWithUnitInput());
    if (futureAccrualWithUnit.getQueryInput() == null) futureAccrualWithUnit.setQueryInput(createFutureAccrualWithUnitQueryInput());
    if (futureAccrualWithUnit.getDataGridColumn() == null) futureAccrualWithUnit.setDataGridColumn(createFutureAccrualWithUnitDataGridColumn());
    return futureAccrualWithUnit;
  }
  public HtmlTag createFutureAccrualWithUnitInput(){
    return futureAccrualWithUnit.quantityWithUnitInput(5, "2003"); 
  }
  public HtmlTag createFutureAccrualWithUnitQueryInput(){
    return futureAccrual.numberQueryInput();
  }
  public JsType createFutureAccrualWithUnitDataGridColumn(){
    return futureAccrual.textColumn();
  }
  
  // 远期利息币种
  public FieldCodes futureAccrualUnit() {
    if (futureAccrualUnit.getInput() == null) futureAccrualUnit.setInput(createFutureAccrualUnitInput());
    if (futureAccrualUnit.getQueryInput() == null) futureAccrualUnit.setQueryInput(createFutureAccrualUnitQueryInput());
    if (futureAccrualUnit.getDataGridColumn() == null) futureAccrualUnit.setDataGridColumn(createFutureAccrualUnitDataGridColumn());
    return futureAccrualUnit;
  }
  public HtmlTag createFutureAccrualUnitInput(){
    return futureAccrualUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createFutureAccrualUnitQueryInput(){
    return futureAccrualUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createFutureAccrualUnitDataGridColumn(){
    return futureAccrualUnit.textColumn();
  }
  
  // 首款付款日
  public FieldCodes firstPayDate() {
    if (firstPayDate.getInput() == null) firstPayDate.setInput(createFirstPayDateInput());
    if (firstPayDate.getQueryInput() == null) firstPayDate.setQueryInput(createFirstPayDateQueryInput());
    if (firstPayDate.getDataGridColumn() == null) firstPayDate.setDataGridColumn(createFirstPayDateDataGridColumn());
    return firstPayDate;
  }
  public HtmlTag createFirstPayDateInput(){
    return firstPayDate.dateInput();
  }
  public HtmlTag createFirstPayDateQueryInput(){
    return firstPayDate.dateQueryInput();
  }
  public JsType createFirstPayDateDataGridColumn(){
    return firstPayDate.dateColumn();
  }
  
  // 首款到单日
  public FieldCodes firstIssueDate() {
    if (firstIssueDate.getInput() == null) firstIssueDate.setInput(createFirstIssueDateInput());
    if (firstIssueDate.getQueryInput() == null) firstIssueDate.setQueryInput(createFirstIssueDateQueryInput());
    if (firstIssueDate.getDataGridColumn() == null) firstIssueDate.setDataGridColumn(createFirstIssueDateDataGridColumn());
    return firstIssueDate;
  }
  public HtmlTag createFirstIssueDateInput(){
    return firstIssueDate.dateInput();
  }
  public HtmlTag createFirstIssueDateQueryInput(){
    return firstIssueDate.dateQueryInput();
  }
  public JsType createFirstIssueDateDataGridColumn(){
    return firstIssueDate.dateColumn();
  }
  
  // 首款干吨
  public FieldCodes firstDryQuantity() {
    if (firstDryQuantity.getInput() == null) firstDryQuantity.setInput(createFirstDryQuantityInput());
    if (firstDryQuantity.getQueryInput() == null) firstDryQuantity.setQueryInput(createFirstDryQuantityQueryInput());
    if (firstDryQuantity.getDataGridColumn() == null) firstDryQuantity.setDataGridColumn(createFirstDryQuantityDataGridColumn());
    return firstDryQuantity;
  }
  public HtmlTag createFirstDryQuantityInput(){
    return firstDryQuantity.numberInput(5);
  }
  public HtmlTag createFirstDryQuantityQueryInput(){
    return firstDryQuantity.numberQueryInput();
  }
  public JsType createFirstDryQuantityDataGridColumn(){
    return firstDryQuantity.textColumn();
  }
  
  // 矿山公司首款金额
  public FieldCodes companyFirstFee() {
    if (companyFirstFee.getInput() == null) companyFirstFee.setInput(createCompanyFirstFeeInput());
    if (companyFirstFee.getQueryInput() == null) companyFirstFee.setQueryInput(createCompanyFirstFeeQueryInput());
    if (companyFirstFee.getDataGridColumn() == null) companyFirstFee.setDataGridColumn(createCompanyFirstFeeDataGridColumn());
    return companyFirstFee;
  }
  public HtmlTag createCompanyFirstFeeInput(){
    return companyFirstFee.numberInput(2);
  }
  public HtmlTag createCompanyFirstFeeQueryInput(){
    return companyFirstFee.numberQueryInput();
  }
  public JsType createCompanyFirstFeeDataGridColumn(){
    return companyFirstFee.textColumn();
  }
  
  // 矿山公司首款金额（带单位）
  public FieldCodes companyFirstFeeWithUnit() {
    if (companyFirstFeeWithUnit.getInput() == null) companyFirstFeeWithUnit.setInput(createCompanyFirstFeeWithUnitInput());
    if (companyFirstFeeWithUnit.getQueryInput() == null) companyFirstFeeWithUnit.setQueryInput(createCompanyFirstFeeWithUnitQueryInput());
    if (companyFirstFeeWithUnit.getDataGridColumn() == null) companyFirstFeeWithUnit.setDataGridColumn(createCompanyFirstFeeWithUnitDataGridColumn());
    return companyFirstFeeWithUnit;
  }
  public HtmlTag createCompanyFirstFeeWithUnitInput(){
    return companyFirstFeeWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createCompanyFirstFeeWithUnitQueryInput(){
    return companyFirstFee.numberQueryInput();
  }
  public JsType createCompanyFirstFeeWithUnitDataGridColumn(){
    return companyFirstFee.textColumn();
  }
  
  // 矿山公司首款金额币种
  public FieldCodes companyFirstFeeUnit() {
    if (companyFirstFeeUnit.getInput() == null) companyFirstFeeUnit.setInput(createCompanyFirstFeeUnitInput());
    if (companyFirstFeeUnit.getQueryInput() == null) companyFirstFeeUnit.setQueryInput(createCompanyFirstFeeUnitQueryInput());
    if (companyFirstFeeUnit.getDataGridColumn() == null) companyFirstFeeUnit.setDataGridColumn(createCompanyFirstFeeUnitDataGridColumn());
    return companyFirstFeeUnit;
  }
  public HtmlTag createCompanyFirstFeeUnitInput(){
    return companyFirstFeeUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createCompanyFirstFeeUnitQueryInput(){
    return companyFirstFeeUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createCompanyFirstFeeUnitDataGridColumn(){
    return companyFirstFeeUnit.textColumn();
  }
  
  // 运费补偿
  public FieldCodes transportEqualize() {
    if (transportEqualize.getInput() == null) transportEqualize.setInput(createTransportEqualizeInput());
    if (transportEqualize.getQueryInput() == null) transportEqualize.setQueryInput(createTransportEqualizeQueryInput());
    if (transportEqualize.getDataGridColumn() == null) transportEqualize.setDataGridColumn(createTransportEqualizeDataGridColumn());
    return transportEqualize;
  }
  public HtmlTag createTransportEqualizeInput(){
    return transportEqualize.numberInput(2);
  }
  public HtmlTag createTransportEqualizeQueryInput(){
    return transportEqualize.numberQueryInput();
  }
  public JsType createTransportEqualizeDataGridColumn(){
    return transportEqualize.textColumn();
  }
  
  // 运费补偿（带单位）
  public FieldCodes transportEqualizeWithUnit() {
    if (transportEqualizeWithUnit.getInput() == null) transportEqualizeWithUnit.setInput(createTransportEqualizeWithUnitInput());
    if (transportEqualizeWithUnit.getQueryInput() == null) transportEqualizeWithUnit.setQueryInput(createTransportEqualizeWithUnitQueryInput());
    if (transportEqualizeWithUnit.getDataGridColumn() == null) transportEqualizeWithUnit.setDataGridColumn(createTransportEqualizeWithUnitDataGridColumn());
    return transportEqualizeWithUnit;
  }
  public HtmlTag createTransportEqualizeWithUnitInput(){
    return transportEqualizeWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createTransportEqualizeWithUnitQueryInput(){
    return transportEqualize.numberQueryInput();
  }
  public JsType createTransportEqualizeWithUnitDataGridColumn(){
    return transportEqualize.textColumn();
  }
  
  // 运费补偿币种
  public FieldCodes transportEqualizeUnit() {
    if (transportEqualizeUnit.getInput() == null) transportEqualizeUnit.setInput(createTransportEqualizeUnitInput());
    if (transportEqualizeUnit.getQueryInput() == null) transportEqualizeUnit.setQueryInput(createTransportEqualizeUnitQueryInput());
    if (transportEqualizeUnit.getDataGridColumn() == null) transportEqualizeUnit.setDataGridColumn(createTransportEqualizeUnitDataGridColumn());
    return transportEqualizeUnit;
  }
  public HtmlTag createTransportEqualizeUnitInput(){
    return transportEqualizeUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createTransportEqualizeUnitQueryInput(){
    return transportEqualizeUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createTransportEqualizeUnitDataGridColumn(){
    return transportEqualizeUnit.textColumn();
  }
  
  // 最终运费
  public FieldCodes finalTransportFee() {
    if (finalTransportFee.getInput() == null) finalTransportFee.setInput(createFinalTransportFeeInput());
    if (finalTransportFee.getQueryInput() == null) finalTransportFee.setQueryInput(createFinalTransportFeeQueryInput());
    if (finalTransportFee.getDataGridColumn() == null) finalTransportFee.setDataGridColumn(createFinalTransportFeeDataGridColumn());
    return finalTransportFee;
  }
  public HtmlTag createFinalTransportFeeInput(){
    return finalTransportFee.numberInput(2);
  }
  public HtmlTag createFinalTransportFeeQueryInput(){
    return finalTransportFee.numberQueryInput();
  }
  public JsType createFinalTransportFeeDataGridColumn(){
    return finalTransportFee.textColumn();
  }
  
  // 最终运费（带单位）
  public FieldCodes finalTransportFeeWithUnit() {
    if (finalTransportFeeWithUnit.getInput() == null) finalTransportFeeWithUnit.setInput(createFinalTransportFeeWithUnitInput());
    if (finalTransportFeeWithUnit.getQueryInput() == null) finalTransportFeeWithUnit.setQueryInput(createFinalTransportFeeWithUnitQueryInput());
    if (finalTransportFeeWithUnit.getDataGridColumn() == null) finalTransportFeeWithUnit.setDataGridColumn(createFinalTransportFeeWithUnitDataGridColumn());
    return finalTransportFeeWithUnit;
  }
  public HtmlTag createFinalTransportFeeWithUnitInput(){
    return finalTransportFeeWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createFinalTransportFeeWithUnitQueryInput(){
    return finalTransportFee.numberQueryInput();
  }
  public JsType createFinalTransportFeeWithUnitDataGridColumn(){
    return finalTransportFee.textColumn();
  }
  
  // 最终运费币种
  public FieldCodes finalTransportFeeUnit() {
    if (finalTransportFeeUnit.getInput() == null) finalTransportFeeUnit.setInput(createFinalTransportFeeUnitInput());
    if (finalTransportFeeUnit.getQueryInput() == null) finalTransportFeeUnit.setQueryInput(createFinalTransportFeeUnitQueryInput());
    if (finalTransportFeeUnit.getDataGridColumn() == null) finalTransportFeeUnit.setDataGridColumn(createFinalTransportFeeUnitDataGridColumn());
    return finalTransportFeeUnit;
  }
  public HtmlTag createFinalTransportFeeUnitInput(){
    return finalTransportFeeUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createFinalTransportFeeUnitQueryInput(){
    return finalTransportFeeUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createFinalTransportFeeUnitDataGridColumn(){
    return finalTransportFeeUnit.textColumn();
  }
  
  // 二次货款额
  public FieldCodes secondPay() {
    if (secondPay.getInput() == null) secondPay.setInput(createSecondPayInput());
    if (secondPay.getQueryInput() == null) secondPay.setQueryInput(createSecondPayQueryInput());
    if (secondPay.getDataGridColumn() == null) secondPay.setDataGridColumn(createSecondPayDataGridColumn());
    return secondPay;
  }
  public HtmlTag createSecondPayInput(){
    return secondPay.numberInput(2);
  }
  public HtmlTag createSecondPayQueryInput(){
    return secondPay.numberQueryInput();
  }
  public JsType createSecondPayDataGridColumn(){
    return secondPay.textColumn();
  }
  
  // 二次货款额（带单位）
  public FieldCodes secondPayWithUnit() {
    if (secondPayWithUnit.getInput() == null) secondPayWithUnit.setInput(createSecondPayWithUnitInput());
    if (secondPayWithUnit.getQueryInput() == null) secondPayWithUnit.setQueryInput(createSecondPayWithUnitQueryInput());
    if (secondPayWithUnit.getDataGridColumn() == null) secondPayWithUnit.setDataGridColumn(createSecondPayWithUnitDataGridColumn());
    return secondPayWithUnit;
  }
  public HtmlTag createSecondPayWithUnitInput(){
    return secondPayWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createSecondPayWithUnitQueryInput(){
    return secondPay.numberQueryInput();
  }
  public JsType createSecondPayWithUnitDataGridColumn(){
    return secondPay.textColumn();
  }
  
  // 二次货款额币种
  public FieldCodes secondPayUnit() {
    if (secondPayUnit.getInput() == null) secondPayUnit.setInput(createSecondPayUnitInput());
    if (secondPayUnit.getQueryInput() == null) secondPayUnit.setQueryInput(createSecondPayUnitQueryInput());
    if (secondPayUnit.getDataGridColumn() == null) secondPayUnit.setDataGridColumn(createSecondPayUnitDataGridColumn());
    return secondPayUnit;
  }
  public HtmlTag createSecondPayUnitInput(){
    return secondPayUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createSecondPayUnitQueryInput(){
    return secondPayUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createSecondPayUnitDataGridColumn(){
    return secondPayUnit.textColumn();
  }
  
  // 二次货款汇率
  public FieldCodes secondPayRate() {
    if (secondPayRate.getInput() == null) secondPayRate.setInput(createSecondPayRateInput());
    if (secondPayRate.getQueryInput() == null) secondPayRate.setQueryInput(createSecondPayRateQueryInput());
    if (secondPayRate.getDataGridColumn() == null) secondPayRate.setDataGridColumn(createSecondPayRateDataGridColumn());
    return secondPayRate;
  }
  public HtmlTag createSecondPayRateInput(){
    return secondPayRate.numberInput(5);
  }
  public HtmlTag createSecondPayRateQueryInput(){
    return secondPayRate.numberQueryInput();
  }
  public JsType createSecondPayRateDataGridColumn(){
    return secondPayRate.textColumn();
  }
  
  // 二次货款额人民币
  public FieldCodes secondPayRmb() {
    if (secondPayRmb.getInput() == null) secondPayRmb.setInput(createSecondPayRmbInput());
    if (secondPayRmb.getQueryInput() == null) secondPayRmb.setQueryInput(createSecondPayRmbQueryInput());
    if (secondPayRmb.getDataGridColumn() == null) secondPayRmb.setDataGridColumn(createSecondPayRmbDataGridColumn());
    return secondPayRmb;
  }
  public HtmlTag createSecondPayRmbInput(){
    return secondPayRmb.numberInput(2);
  }
  public HtmlTag createSecondPayRmbQueryInput(){
    return secondPayRmb.numberQueryInput();
  }
  public JsType createSecondPayRmbDataGridColumn(){
    return secondPayRmb.textColumn();
  }
  
  // 二次货款付款日
  public FieldCodes secondPayDate() {
    if (secondPayDate.getInput() == null) secondPayDate.setInput(createSecondPayDateInput());
    if (secondPayDate.getQueryInput() == null) secondPayDate.setQueryInput(createSecondPayDateQueryInput());
    if (secondPayDate.getDataGridColumn() == null) secondPayDate.setDataGridColumn(createSecondPayDateDataGridColumn());
    return secondPayDate;
  }
  public HtmlTag createSecondPayDateInput(){
    return secondPayDate.dateInput();
  }
  public HtmlTag createSecondPayDateQueryInput(){
    return secondPayDate.dateQueryInput();
  }
  public JsType createSecondPayDateDataGridColumn(){
    return secondPayDate.dateColumn();
  }
  
  // 结算尾款（含滞期速遣费）
  public FieldCodes settlementTailFee() {
    if (settlementTailFee.getInput() == null) settlementTailFee.setInput(createSettlementTailFeeInput());
    if (settlementTailFee.getQueryInput() == null) settlementTailFee.setQueryInput(createSettlementTailFeeQueryInput());
    if (settlementTailFee.getDataGridColumn() == null) settlementTailFee.setDataGridColumn(createSettlementTailFeeDataGridColumn());
    return settlementTailFee;
  }
  public HtmlTag createSettlementTailFeeInput(){
    return settlementTailFee.numberInput(2);
  }
  public HtmlTag createSettlementTailFeeQueryInput(){
    return settlementTailFee.numberQueryInput();
  }
  public JsType createSettlementTailFeeDataGridColumn(){
    return settlementTailFee.textColumn();
  }
  
  // 结算尾款（含滞期速遣费）（带单位）
  public FieldCodes settlementTailFeeWithUnit() {
    if (settlementTailFeeWithUnit.getInput() == null) settlementTailFeeWithUnit.setInput(createSettlementTailFeeWithUnitInput());
    if (settlementTailFeeWithUnit.getQueryInput() == null) settlementTailFeeWithUnit.setQueryInput(createSettlementTailFeeWithUnitQueryInput());
    if (settlementTailFeeWithUnit.getDataGridColumn() == null) settlementTailFeeWithUnit.setDataGridColumn(createSettlementTailFeeWithUnitDataGridColumn());
    return settlementTailFeeWithUnit;
  }
  public HtmlTag createSettlementTailFeeWithUnitInput(){
    return settlementTailFeeWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createSettlementTailFeeWithUnitQueryInput(){
    return settlementTailFee.numberQueryInput();
  }
  public JsType createSettlementTailFeeWithUnitDataGridColumn(){
    return settlementTailFee.textColumn();
  }
  
  // 结算尾款（含滞期速遣费）币种
  public FieldCodes settlementTailFeeUnit() {
    if (settlementTailFeeUnit.getInput() == null) settlementTailFeeUnit.setInput(createSettlementTailFeeUnitInput());
    if (settlementTailFeeUnit.getQueryInput() == null) settlementTailFeeUnit.setQueryInput(createSettlementTailFeeUnitQueryInput());
    if (settlementTailFeeUnit.getDataGridColumn() == null) settlementTailFeeUnit.setDataGridColumn(createSettlementTailFeeUnitDataGridColumn());
    return settlementTailFeeUnit;
  }
  public HtmlTag createSettlementTailFeeUnitInput(){
    return settlementTailFeeUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createSettlementTailFeeUnitQueryInput(){
    return settlementTailFeeUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createSettlementTailFeeUnitDataGridColumn(){
    return settlementTailFeeUnit.textColumn();
  }
  
  // 尾款汇率
  public FieldCodes settlementTailRate() {
    if (settlementTailRate.getInput() == null) settlementTailRate.setInput(createSettlementTailRateInput());
    if (settlementTailRate.getQueryInput() == null) settlementTailRate.setQueryInput(createSettlementTailRateQueryInput());
    if (settlementTailRate.getDataGridColumn() == null) settlementTailRate.setDataGridColumn(createSettlementTailRateDataGridColumn());
    return settlementTailRate;
  }
  public HtmlTag createSettlementTailRateInput(){
    return settlementTailRate.numberInput(5);
  }
  public HtmlTag createSettlementTailRateQueryInput(){
    return settlementTailRate.numberQueryInput();
  }
  public JsType createSettlementTailRateDataGridColumn(){
    return settlementTailRate.textColumn();
  }
  
  // 尾款人民币
  public FieldCodes settlementTailRmb() {
    if (settlementTailRmb.getInput() == null) settlementTailRmb.setInput(createSettlementTailRmbInput());
    if (settlementTailRmb.getQueryInput() == null) settlementTailRmb.setQueryInput(createSettlementTailRmbQueryInput());
    if (settlementTailRmb.getDataGridColumn() == null) settlementTailRmb.setDataGridColumn(createSettlementTailRmbDataGridColumn());
    return settlementTailRmb;
  }
  public HtmlTag createSettlementTailRmbInput(){
    return settlementTailRmb.numberInput(2);
  }
  public HtmlTag createSettlementTailRmbQueryInput(){
    return settlementTailRmb.numberQueryInput();
  }
  public JsType createSettlementTailRmbDataGridColumn(){
    return settlementTailRmb.textColumn();
  }
  
  // 尾款付款日
  public FieldCodes tailFeeDate() {
    if (tailFeeDate.getInput() == null) tailFeeDate.setInput(createTailFeeDateInput());
    if (tailFeeDate.getQueryInput() == null) tailFeeDate.setQueryInput(createTailFeeDateQueryInput());
    if (tailFeeDate.getDataGridColumn() == null) tailFeeDate.setDataGridColumn(createTailFeeDateDataGridColumn());
    return tailFeeDate;
  }
  public HtmlTag createTailFeeDateInput(){
    return tailFeeDate.dateInput();
  }
  public HtmlTag createTailFeeDateQueryInput(){
    return tailFeeDate.dateQueryInput();
  }
  public JsType createTailFeeDateDataGridColumn(){
    return tailFeeDate.dateColumn();
  }
  
  // 水尺优惠
  public FieldCodes gaugeDiscount() {
    if (gaugeDiscount.getInput() == null) gaugeDiscount.setInput(createGaugeDiscountInput());
    if (gaugeDiscount.getQueryInput() == null) gaugeDiscount.setQueryInput(createGaugeDiscountQueryInput());
    if (gaugeDiscount.getDataGridColumn() == null) gaugeDiscount.setDataGridColumn(createGaugeDiscountDataGridColumn());
    return gaugeDiscount;
  }
  public HtmlTag createGaugeDiscountInput(){
    return gaugeDiscount.numberInput(2);
  }
  public HtmlTag createGaugeDiscountQueryInput(){
    return gaugeDiscount.numberQueryInput();
  }
  public JsType createGaugeDiscountDataGridColumn(){
    return gaugeDiscount.textColumn();
  }
  
  // 水尺优惠（带单位）
  public FieldCodes gaugeDiscountWithUnit() {
    if (gaugeDiscountWithUnit.getInput() == null) gaugeDiscountWithUnit.setInput(createGaugeDiscountWithUnitInput());
    if (gaugeDiscountWithUnit.getQueryInput() == null) gaugeDiscountWithUnit.setQueryInput(createGaugeDiscountWithUnitQueryInput());
    if (gaugeDiscountWithUnit.getDataGridColumn() == null) gaugeDiscountWithUnit.setDataGridColumn(createGaugeDiscountWithUnitDataGridColumn());
    return gaugeDiscountWithUnit;
  }
  public HtmlTag createGaugeDiscountWithUnitInput(){
    return gaugeDiscountWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createGaugeDiscountWithUnitQueryInput(){
    return gaugeDiscount.numberQueryInput();
  }
  public JsType createGaugeDiscountWithUnitDataGridColumn(){
    return gaugeDiscount.textColumn();
  }
  
  // 水尺优惠币种
  public FieldCodes gaugeDiscountUnit() {
    if (gaugeDiscountUnit.getInput() == null) gaugeDiscountUnit.setInput(createGaugeDiscountUnitInput());
    if (gaugeDiscountUnit.getQueryInput() == null) gaugeDiscountUnit.setQueryInput(createGaugeDiscountUnitQueryInput());
    if (gaugeDiscountUnit.getDataGridColumn() == null) gaugeDiscountUnit.setDataGridColumn(createGaugeDiscountUnitDataGridColumn());
    return gaugeDiscountUnit;
  }
  public HtmlTag createGaugeDiscountUnitInput(){
    return gaugeDiscountUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createGaugeDiscountUnitQueryInput(){
    return gaugeDiscountUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createGaugeDiscountUnitDataGridColumn(){
    return gaugeDiscountUnit.textColumn();
  }
  
  // 结算考核周期
  public FieldCodes settlementAssessmentCycle() {
    if (settlementAssessmentCycle.getInput() == null) settlementAssessmentCycle.setInput(createSettlementAssessmentCycleInput());
    if (settlementAssessmentCycle.getQueryInput() == null) settlementAssessmentCycle.setQueryInput(createSettlementAssessmentCycleQueryInput());
    if (settlementAssessmentCycle.getDataGridColumn() == null) settlementAssessmentCycle.setDataGridColumn(createSettlementAssessmentCycleDataGridColumn());
    return settlementAssessmentCycle;
  }
  public HtmlTag createSettlementAssessmentCycleInput(){
    return settlementAssessmentCycle.numberInput(5);
  }
  public HtmlTag createSettlementAssessmentCycleQueryInput(){
    return settlementAssessmentCycle.numberQueryInput();
  }
  public JsType createSettlementAssessmentCycleDataGridColumn(){
    return settlementAssessmentCycle.textColumn();
  }
  
  // FOB排水运费补偿
  public FieldCodes drainEqualize() {
    if (drainEqualize.getInput() == null) drainEqualize.setInput(createDrainEqualizeInput());
    if (drainEqualize.getQueryInput() == null) drainEqualize.setQueryInput(createDrainEqualizeQueryInput());
    if (drainEqualize.getDataGridColumn() == null) drainEqualize.setDataGridColumn(createDrainEqualizeDataGridColumn());
    return drainEqualize;
  }
  public HtmlTag createDrainEqualizeInput(){
    return drainEqualize.numberInput(2);
  }
  public HtmlTag createDrainEqualizeQueryInput(){
    return drainEqualize.numberQueryInput();
  }
  public JsType createDrainEqualizeDataGridColumn(){
    return drainEqualize.textColumn();
  }
  
  // FOB排水运费补偿（带单位）
  public FieldCodes drainEqualizeWithUnit() {
    if (drainEqualizeWithUnit.getInput() == null) drainEqualizeWithUnit.setInput(createDrainEqualizeWithUnitInput());
    if (drainEqualizeWithUnit.getQueryInput() == null) drainEqualizeWithUnit.setQueryInput(createDrainEqualizeWithUnitQueryInput());
    if (drainEqualizeWithUnit.getDataGridColumn() == null) drainEqualizeWithUnit.setDataGridColumn(createDrainEqualizeWithUnitDataGridColumn());
    return drainEqualizeWithUnit;
  }
  public HtmlTag createDrainEqualizeWithUnitInput(){
    return drainEqualizeWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createDrainEqualizeWithUnitQueryInput(){
    return drainEqualize.numberQueryInput();
  }
  public JsType createDrainEqualizeWithUnitDataGridColumn(){
    return drainEqualize.textColumn();
  }
  
  // FOB排水运费补偿币种
  public FieldCodes drainEqualizeUnit() {
    if (drainEqualizeUnit.getInput() == null) drainEqualizeUnit.setInput(createDrainEqualizeUnitInput());
    if (drainEqualizeUnit.getQueryInput() == null) drainEqualizeUnit.setQueryInput(createDrainEqualizeUnitQueryInput());
    if (drainEqualizeUnit.getDataGridColumn() == null) drainEqualizeUnit.setDataGridColumn(createDrainEqualizeUnitDataGridColumn());
    return drainEqualizeUnit;
  }
  public HtmlTag createDrainEqualizeUnitInput(){
    return drainEqualizeUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createDrainEqualizeUnitQueryInput(){
    return drainEqualizeUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createDrainEqualizeUnitDataGridColumn(){
    return drainEqualizeUnit.textColumn();
  }
  
  // 海运费单价
  public FieldCodes oceanFreightPrice() {
    if (oceanFreightPrice.getInput() == null) oceanFreightPrice.setInput(createOceanFreightPriceInput());
    if (oceanFreightPrice.getQueryInput() == null) oceanFreightPrice.setQueryInput(createOceanFreightPriceQueryInput());
    if (oceanFreightPrice.getDataGridColumn() == null) oceanFreightPrice.setDataGridColumn(createOceanFreightPriceDataGridColumn());
    return oceanFreightPrice;
  }
  public HtmlTag createOceanFreightPriceInput(){
    return oceanFreightPrice.numberInput(5);
  }
  public HtmlTag createOceanFreightPriceQueryInput(){
    return oceanFreightPrice.numberQueryInput();
  }
  public JsType createOceanFreightPriceDataGridColumn(){
    return oceanFreightPrice.textColumn();
  }
  
  // 备注
  public FieldCodes remarks() {
    if (remarks.getInput() == null) remarks.setInput(createRemarksInput());
    if (remarks.getQueryInput() == null) remarks.setQueryInput(createRemarksQueryInput());
    if (remarks.getDataGridColumn() == null) remarks.setDataGridColumn(createRemarksDataGridColumn());
    return remarks;
  }
  public HtmlTag createRemarksInput(){
    return remarks.textInput(300);
  }
  public HtmlTag createRemarksQueryInput(){
    return remarks.textQueryInput();
  }
  public JsType createRemarksDataGridColumn(){
    return remarks.textColumn();
  }
  
  // 归档
  public FieldCodes ffb010t020pArchived() {
    if (ffb010t020pArchived.getInput() == null) ffb010t020pArchived.setInput(createFfb010t020pArchivedInput());
    if (ffb010t020pArchived.getQueryInput() == null) ffb010t020pArchived.setQueryInput(createFfb010t020pArchivedQueryInput());
    if (ffb010t020pArchived.getDataGridColumn() == null) ffb010t020pArchived.setDataGridColumn(createFfb010t020pArchivedDataGridColumn());
    return ffb010t020pArchived;
  }
  public HtmlTag createFfb010t020pArchivedInput(){
    return ffb010t020pArchived.comboboxInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '已归档', value: '已归档'}, {label: '未归档', value: '未归档'}]");
  }
  public HtmlTag createFfb010t020pArchivedQueryInput(){
    return ffb010t020pArchived.comboboxQueryInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '已归档', value: '已归档'}, {label: '未归档', value: '未归档'}]");
  }
  public JsType createFfb010t020pArchivedDataGridColumn(){
    return ffb010t020pArchived.textColumn();
  }
  
  // 保险公司
  public FieldCodes insuranceCompany() {
    if (insuranceCompany.getInput() == null) insuranceCompany.setInput(createInsuranceCompanyInput());
    if (insuranceCompany.getQueryInput() == null) insuranceCompany.setQueryInput(createInsuranceCompanyQueryInput());
    if (insuranceCompany.getDataGridColumn() == null) insuranceCompany.setDataGridColumn(createInsuranceCompanyDataGridColumn());
    return insuranceCompany;
  }
  public HtmlTag createInsuranceCompanyInput(){
    return insuranceCompany.textInput(30);
  }
  public HtmlTag createInsuranceCompanyQueryInput(){
    return insuranceCompany.textQueryInput();
  }
  public JsType createInsuranceCompanyDataGridColumn(){
    return insuranceCompany.textColumn();
  }
  
  // 保险费
  public FieldCodes insuranceFee() {
    if (insuranceFee.getInput() == null) insuranceFee.setInput(createInsuranceFeeInput());
    if (insuranceFee.getQueryInput() == null) insuranceFee.setQueryInput(createInsuranceFeeQueryInput());
    if (insuranceFee.getDataGridColumn() == null) insuranceFee.setDataGridColumn(createInsuranceFeeDataGridColumn());
    return insuranceFee;
  }
  public HtmlTag createInsuranceFeeInput(){
    return insuranceFee.numberInput(2);
  }
  public HtmlTag createInsuranceFeeQueryInput(){
    return insuranceFee.numberQueryInput();
  }
  public JsType createInsuranceFeeDataGridColumn(){
    return insuranceFee.textColumn();
  }
  
  // 保险费（带单位）
  public FieldCodes insuranceFeeWithUnit() {
    if (insuranceFeeWithUnit.getInput() == null) insuranceFeeWithUnit.setInput(createInsuranceFeeWithUnitInput());
    if (insuranceFeeWithUnit.getQueryInput() == null) insuranceFeeWithUnit.setQueryInput(createInsuranceFeeWithUnitQueryInput());
    if (insuranceFeeWithUnit.getDataGridColumn() == null) insuranceFeeWithUnit.setDataGridColumn(createInsuranceFeeWithUnitDataGridColumn());
    return insuranceFeeWithUnit;
  }
  public HtmlTag createInsuranceFeeWithUnitInput(){
    return insuranceFeeWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createInsuranceFeeWithUnitQueryInput(){
    return insuranceFee.numberQueryInput();
  }
  public JsType createInsuranceFeeWithUnitDataGridColumn(){
    return insuranceFee.textColumn();
  }
  
  // 保险费币种
  public FieldCodes insuranceFeeUnit() {
    if (insuranceFeeUnit.getInput() == null) insuranceFeeUnit.setInput(createInsuranceFeeUnitInput());
    if (insuranceFeeUnit.getQueryInput() == null) insuranceFeeUnit.setQueryInput(createInsuranceFeeUnitQueryInput());
    if (insuranceFeeUnit.getDataGridColumn() == null) insuranceFeeUnit.setDataGridColumn(createInsuranceFeeUnitDataGridColumn());
    return insuranceFeeUnit;
  }
  public HtmlTag createInsuranceFeeUnitInput(){
    return insuranceFeeUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createInsuranceFeeUnitQueryInput(){
    return insuranceFeeUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createInsuranceFeeUnitDataGridColumn(){
    return insuranceFeeUnit.textColumn();
  }
  
  // 归档
  public FieldCodes ffb010t030pArchived() {
    if (ffb010t030pArchived.getInput() == null) ffb010t030pArchived.setInput(createFfb010t030pArchivedInput());
    if (ffb010t030pArchived.getQueryInput() == null) ffb010t030pArchived.setQueryInput(createFfb010t030pArchivedQueryInput());
    if (ffb010t030pArchived.getDataGridColumn() == null) ffb010t030pArchived.setDataGridColumn(createFfb010t030pArchivedDataGridColumn());
    return ffb010t030pArchived;
  }
  public HtmlTag createFfb010t030pArchivedInput(){
    return ffb010t030pArchived.comboboxInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '已归档', value: '已归档'}, {label: '未归档', value: '未归档'}]");
  }
  public HtmlTag createFfb010t030pArchivedQueryInput(){
    return ffb010t030pArchived.comboboxQueryInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '已归档', value: '已归档'}, {label: '未归档', value: '未归档'}]");
  }
  public JsType createFfb010t030pArchivedDataGridColumn(){
    return ffb010t030pArchived.textColumn();
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
  
  // 押汇利息
  public FieldCodes documentaryBillsInterest() {
    if (documentaryBillsInterest.getInput() == null) documentaryBillsInterest.setInput(createDocumentaryBillsInterestInput());
    if (documentaryBillsInterest.getQueryInput() == null) documentaryBillsInterest.setQueryInput(createDocumentaryBillsInterestQueryInput());
    if (documentaryBillsInterest.getDataGridColumn() == null) documentaryBillsInterest.setDataGridColumn(createDocumentaryBillsInterestDataGridColumn());
    return documentaryBillsInterest;
  }
  public HtmlTag createDocumentaryBillsInterestInput(){
    return documentaryBillsInterest.numberInput(2);
  }
  public HtmlTag createDocumentaryBillsInterestQueryInput(){
    return documentaryBillsInterest.numberQueryInput();
  }
  public JsType createDocumentaryBillsInterestDataGridColumn(){
    return documentaryBillsInterest.textColumn();
  }
  
  // 押汇加息
  public FieldCodes documentaryBillsHike() {
    if (documentaryBillsHike.getInput() == null) documentaryBillsHike.setInput(createDocumentaryBillsHikeInput());
    if (documentaryBillsHike.getQueryInput() == null) documentaryBillsHike.setQueryInput(createDocumentaryBillsHikeQueryInput());
    if (documentaryBillsHike.getDataGridColumn() == null) documentaryBillsHike.setDataGridColumn(createDocumentaryBillsHikeDataGridColumn());
    return documentaryBillsHike;
  }
  public HtmlTag createDocumentaryBillsHikeInput(){
    return documentaryBillsHike.numberInput(2);
  }
  public HtmlTag createDocumentaryBillsHikeQueryInput(){
    return documentaryBillsHike.numberQueryInput();
  }
  public JsType createDocumentaryBillsHikeDataGridColumn(){
    return documentaryBillsHike.textColumn();
  }
  
  // 资金占用费
  public FieldCodes capitalOccupationFee() {
    if (capitalOccupationFee.getInput() == null) capitalOccupationFee.setInput(createCapitalOccupationFeeInput());
    if (capitalOccupationFee.getQueryInput() == null) capitalOccupationFee.setQueryInput(createCapitalOccupationFeeQueryInput());
    if (capitalOccupationFee.getDataGridColumn() == null) capitalOccupationFee.setDataGridColumn(createCapitalOccupationFeeDataGridColumn());
    return capitalOccupationFee;
  }
  public HtmlTag createCapitalOccupationFeeInput(){
    return capitalOccupationFee.numberInput(2);
  }
  public HtmlTag createCapitalOccupationFeeQueryInput(){
    return capitalOccupationFee.numberQueryInput();
  }
  public JsType createCapitalOccupationFeeDataGridColumn(){
    return capitalOccupationFee.textColumn();
  }
  
  // 开证费
  public FieldCodes openingCharge() {
    if (openingCharge.getInput() == null) openingCharge.setInput(createOpeningChargeInput());
    if (openingCharge.getQueryInput() == null) openingCharge.setQueryInput(createOpeningChargeQueryInput());
    if (openingCharge.getDataGridColumn() == null) openingCharge.setDataGridColumn(createOpeningChargeDataGridColumn());
    return openingCharge;
  }
  public HtmlTag createOpeningChargeInput(){
    return openingCharge.numberInput(2);
  }
  public HtmlTag createOpeningChargeQueryInput(){
    return openingCharge.numberQueryInput();
  }
  public JsType createOpeningChargeDataGridColumn(){
    return openingCharge.textColumn();
  }
  
  // 承兑费
  public FieldCodes acceptingCharge() {
    if (acceptingCharge.getInput() == null) acceptingCharge.setInput(createAcceptingChargeInput());
    if (acceptingCharge.getQueryInput() == null) acceptingCharge.setQueryInput(createAcceptingChargeQueryInput());
    if (acceptingCharge.getDataGridColumn() == null) acceptingCharge.setDataGridColumn(createAcceptingChargeDataGridColumn());
    return acceptingCharge;
  }
  public HtmlTag createAcceptingChargeInput(){
    return acceptingCharge.numberInput(2);
  }
  public HtmlTag createAcceptingChargeQueryInput(){
    return acceptingCharge.numberQueryInput();
  }
  public JsType createAcceptingChargeDataGridColumn(){
    return acceptingCharge.textColumn();
  }
  
  // 关税保函费
  public FieldCodes customsGuaranteeFee() {
    if (customsGuaranteeFee.getInput() == null) customsGuaranteeFee.setInput(createCustomsGuaranteeFeeInput());
    if (customsGuaranteeFee.getQueryInput() == null) customsGuaranteeFee.setQueryInput(createCustomsGuaranteeFeeQueryInput());
    if (customsGuaranteeFee.getDataGridColumn() == null) customsGuaranteeFee.setDataGridColumn(createCustomsGuaranteeFeeDataGridColumn());
    return customsGuaranteeFee;
  }
  public HtmlTag createCustomsGuaranteeFeeInput(){
    return customsGuaranteeFee.numberInput(2);
  }
  public HtmlTag createCustomsGuaranteeFeeQueryInput(){
    return customsGuaranteeFee.numberQueryInput();
  }
  public JsType createCustomsGuaranteeFeeDataGridColumn(){
    return customsGuaranteeFee.textColumn();
  }
  
  // 代理服务费
  public FieldCodes agentServiceFee() {
    if (agentServiceFee.getInput() == null) agentServiceFee.setInput(createAgentServiceFeeInput());
    if (agentServiceFee.getQueryInput() == null) agentServiceFee.setQueryInput(createAgentServiceFeeQueryInput());
    if (agentServiceFee.getDataGridColumn() == null) agentServiceFee.setDataGridColumn(createAgentServiceFeeDataGridColumn());
    return agentServiceFee;
  }
  public HtmlTag createAgentServiceFeeInput(){
    return agentServiceFee.numberInput(2);
  }
  public HtmlTag createAgentServiceFeeQueryInput(){
    return agentServiceFee.numberQueryInput();
  }
  public JsType createAgentServiceFeeDataGridColumn(){
    return agentServiceFee.textColumn();
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
  public FieldCodes creditTfe() {
    if (creditTfe.getInput() == null) creditTfe.setInput(createCreditTfeInput());
    if (creditTfe.getQueryInput() == null) creditTfe.setQueryInput(createCreditTfeQueryInput());
    if (creditTfe.getDataGridColumn() == null) creditTfe.setDataGridColumn(createCreditTfeDataGridColumn());
    return creditTfe;
  }
  public HtmlTag createCreditTfeInput(){
    return creditTfe.textInput(50);
  }
  public HtmlTag createCreditTfeQueryInput(){
    return creditTfe.textQueryInput();
  }
  public JsType createCreditTfeDataGridColumn(){
    return creditTfe.textColumn();
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
