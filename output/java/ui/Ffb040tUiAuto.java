package com.ysusoft.ui.purchase;

import com.ysusoft.ui.codehelper.HtmlTag;
import com.ysusoft.ui.codehelper.JsCode;
import com.ysusoft.ui.codehelper.JsType;
import com.ysusoft.ui.FieldCodes;
import com.ysusoft.ui.EntityUiBase;

public class Ffb040tUiAuto extends EntityUiBase {
  
  protected FieldCodes f0 = new FieldCodes("f0", "主键", "ffb040t", "entity", "query");
  protected FieldCodes purchaseBatchId = new FieldCodes("purchaseBatchId", "采购批次", "ffb040t", "entity", "query");
  protected FieldCodes unloadPortId = new FieldCodes("unloadPortId", "卸港批次", "ffb040t", "entity", "query");
  protected FieldCodes tfe = new FieldCodes("tfe", "TFe", "ffb040t", "entity", "query");
  protected FieldCodes sio2 = new FieldCodes("sio2", "SiO2", "ffb040t", "entity", "query");
  protected FieldCodes cao = new FieldCodes("cao", "CaO", "ffb040t", "entity", "query");
  protected FieldCodes mgo = new FieldCodes("mgo", "MgO", "ffb040t", "entity", "query");
  protected FieldCodes al2o3 = new FieldCodes("al2o3", "Al2O3", "ffb040t", "entity", "query");
  protected FieldCodes sio2Al2o3 = new FieldCodes("sio2Al2o3", "SiO2+Al2O3", "ffb040t", "entity", "query");
  protected FieldCodes tio2 = new FieldCodes("tio2", "TiO2", "ffb040t", "entity", "query");
  protected FieldCodes k2o = new FieldCodes("k2o", "K2O", "ffb040t", "entity", "query");
  protected FieldCodes na2o = new FieldCodes("na2o", "Na2O", "ffb040t", "entity", "query");
  protected FieldCodes zno = new FieldCodes("zno", "ZnO", "ffb040t", "entity", "query");
  protected FieldCodes as = new FieldCodes("as", "As", "ffb040t", "entity", "query");
  protected FieldCodes pbo = new FieldCodes("pbo", "PbO", "ffb040t", "entity", "query");
  protected FieldCodes cr = new FieldCodes("cr", "Cr", "ffb040t", "entity", "query");
  protected FieldCodes ni = new FieldCodes("ni", "Ni", "ffb040t", "entity", "query");
  protected FieldCodes cu = new FieldCodes("cu", "Cu", "ffb040t", "entity", "query");
  protected FieldCodes mn = new FieldCodes("mn", "Mn", "ffb040t", "entity", "query");
  protected FieldCodes h2o = new FieldCodes("h2o", "H2O", "ffb040t", "entity", "query");
  protected FieldCodes feo = new FieldCodes("feo", "FeO", "ffb040t", "entity", "query");
  protected FieldCodes p = new FieldCodes("p", "P", "ffb040t", "entity", "query");
  protected FieldCodes s = new FieldCodes("s", "S", "ffb040t", "entity", "query");
  protected FieldCodes burnLose = new FieldCodes("burnLose", "烧损", "ffb040t", "entity", "query");
  protected FieldCodes wetWeight = new FieldCodes("wetWeight", "湿量", "ffb040t", "entity", "query");
  protected FieldCodes grainSize = new FieldCodes("grainSize", "粒度", "ffb040t", "entity", "query");
  protected FieldCodes remark = new FieldCodes("remark", "备注", "ffb040t", "entity", "query");
  protected FieldCodes createBy = new FieldCodes("createBy", "创建人", "ffb040t", "entity", "query");
  protected FieldCodes createDate = new FieldCodes("createDate", "创建日期", "ffb040t", "entity", "query");
  protected FieldCodes updateBy = new FieldCodes("updateBy", "更新人", "ffb040t", "entity", "query");
  protected FieldCodes updateDate = new FieldCodes("updateDate", "更新日期", "ffb040t", "entity", "query");
  protected FieldCodes archived = new FieldCodes("archived", "归档", "ffb040t", "entity", "query");
  protected FieldCodes portFee = new FieldCodes("portFee", "港口费", "ffb040t", "entity", "query");
  protected FieldCodes portConstructionFee = new FieldCodes("portConstructionFee", "港口建设费", "ffb040t", "entity", "query");
  protected FieldCodes detectFee = new FieldCodes("detectFee", "检测费", "ffb040t", "entity", "query");
  protected FieldCodes inspectionFee = new FieldCodes("inspectionFee", "商检费", "ffb040t", "entity", "query");
  protected FieldCodes portAgentFee = new FieldCodes("portAgentFee", "港口代理费", "ffb040t", "entity", "query");
  protected FieldCodes sampleFee = new FieldCodes("sampleFee", "制取样费", "ffb040t", "entity", "query");
  protected FieldCodes waterGaugeFee = new FieldCodes("waterGaugeFee", "水尺鉴定费", "ffb040t", "entity", "query");
  protected FieldCodes boatFee = new FieldCodes("boatFee", "小船费", "ffb040t", "entity", "query");
  protected FieldCodes declareAgentFee = new FieldCodes("declareAgentFee", "报关代理费", "ffb040t", "entity", "query");
  protected FieldCodes declareInspAgentFee = new FieldCodes("declareInspAgentFee", "报检代理费", "ffb040t", "entity", "query");
  protected FieldCodes declareCustomsAgent = new FieldCodes("declareCustomsAgent", "报关代理", "ffb040t", "entity", "query");
  protected FieldCodes freightAgent = new FieldCodes("freightAgent", "货运代理", "ffb040t", "entity", "query");
  protected FieldCodes finalReceiver = new FieldCodes("finalReceiver", "最终收货人", "ffb040t", "entity", "query");
  protected FieldCodes ffb040t050pArchived = new FieldCodes("ffb040t050pArchived", "归档", "ffb040t", "entity", "query");
  protected FieldCodes unloadDelayDays = new FieldCodes("unloadDelayDays", "卸港滞期天数", "ffb040t", "entity", "query");
  protected FieldCodes unloadDelayFee = new FieldCodes("unloadDelayFee", "卸港对卖方滞速费", "ffb040t", "entity", "query");
  protected FieldCodes unloadDelayFeeWithUnit = new FieldCodes("unloadDelayFee", "卸港对卖方滞速费", "ffb040t", "entity", "query");
  protected FieldCodes unloadDelayFeeUnit = new FieldCodes("unloadDelayFeeUnit", "卸港对卖方滞速费币种", "ffb040t", "entity", "query");
  protected FieldCodes unloadDelayFeeRate = new FieldCodes("unloadDelayFeeRate", "卸港滞速费率", "ffb040t", "entity", "query");
  protected FieldCodes unloadTransportAdjust = new FieldCodes("unloadTransportAdjust", "CFR卸港运费调整", "ffb040t", "entity", "query");
  protected FieldCodes unloadTransportAdjustWithUnit = new FieldCodes("unloadTransportAdjust", "CFR卸港运费调整", "ffb040t", "entity", "query");
  protected FieldCodes unloadTransportAdjustUnit = new FieldCodes("unloadTransportAdjustUnit", "CFR卸港运费调整币种", "ffb040t", "entity", "query");
  protected FieldCodes speedDelayFee = new FieldCodes("speedDelayFee", "卸港与船公司滞速费", "ffb040t", "entity", "query");
  protected FieldCodes speedDelayFeeWithUnit = new FieldCodes("speedDelayFee", "卸港与船公司滞速费", "ffb040t", "entity", "query");
  protected FieldCodes speedDelayFeeUnit = new FieldCodes("speedDelayFeeUnit", "卸港与船公司滞速费币种", "ffb040t", "entity", "query");
  protected FieldCodes shipAgent = new FieldCodes("shipAgent", "船代", "ffb040t", "entity", "query");
  protected FieldCodes ffb040t030pArchived = new FieldCodes("ffb040t030pArchived", "归档", "ffb040t", "entity", "query");
  protected FieldCodes goodsAgent = new FieldCodes("goodsAgent", "货代", "ffb040t", "entity", "query");
  protected FieldCodes declareCustomsCompany = new FieldCodes("declareCustomsCompany", "报关单位", "ffb040t", "entity", "query");
  protected FieldCodes depositFee = new FieldCodes("depositFee", "保证金", "ffb040t", "entity", "query");
  protected FieldCodes depositFeeWithUnit = new FieldCodes("depositFee", "保证金", "ffb040t", "entity", "query");
  protected FieldCodes depositFeeUnit = new FieldCodes("depositFeeUnit", "保证金币种", "ffb040t", "entity", "query");
  protected FieldCodes declareCustoms = new FieldCodes("declareCustoms", "报关海关", "ffb040t", "entity", "query");
  protected FieldCodes customsClearanceLastDate = new FieldCodes("customsClearanceLastDate", "最晚结关日", "ffb040t", "entity", "query");
  protected FieldCodes customsClearanceActualDate = new FieldCodes("customsClearanceActualDate", "实际结关日", "ffb040t", "entity", "query");
  protected FieldCodes safeDeclar = new FieldCodes("safeDeclar", "外管局申报", "ffb040t", "entity", "query");
  protected FieldCodes declareCustomsDate = new FieldCodes("declareCustomsDate", "首次报关日期", "ffb040t", "entity", "query");
  protected FieldCodes declareCustomsBill = new FieldCodes("declareCustomsBill", "报关单号", "ffb040t", "entity", "query");
  protected FieldCodes customsClearanceState = new FieldCodes("customsClearanceState", "结关状态", "ffb040t", "entity", "query");
  protected FieldCodes declareCustomsFee = new FieldCodes("declareCustomsFee", "首次报关金额", "ffb040t", "entity", "query");
  protected FieldCodes declareCustomsFeeWithUnit = new FieldCodes("declareCustomsFee", "首次报关金额", "ffb040t", "entity", "query");
  protected FieldCodes declareCustomsFeeUnit = new FieldCodes("declareCustomsFeeUnit", "首次报关金额币种", "ffb040t", "entity", "query");
  protected FieldCodes licenseNumber = new FieldCodes("licenseNumber", "许可证号", "ffb040t", "entity", "query");
  protected FieldCodes valueAddedTax = new FieldCodes("valueAddedTax", "海关征收增值税", "ffb040t", "entity", "query");
  protected FieldCodes valueAddedTaxWithUnit = new FieldCodes("valueAddedTax", "海关征收增值税", "ffb040t", "entity", "query");
  protected FieldCodes valueAddedTaxUnit = new FieldCodes("valueAddedTaxUnit", "海关征收增值税币种", "ffb040t", "entity", "query");
  protected FieldCodes customsTaxEqualize = new FieldCodes("customsTaxEqualize", "海关补税金额", "ffb040t", "entity", "query");
  protected FieldCodes customsTaxEqualizeWithUnit = new FieldCodes("customsTaxEqualize", "海关补税金额", "ffb040t", "entity", "query");
  protected FieldCodes customsTaxEqualizeUnit = new FieldCodes("customsTaxEqualizeUnit", "海关补税金额币种", "ffb040t", "entity", "query");
  protected FieldCodes ffb040t040pArchived = new FieldCodes("ffb040t040pArchived", "归档", "ffb040t", "entity", "query");
  
  public Ffb040tUiAuto(){
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
  
  // 卸港批次
  public FieldCodes unloadPortId() {
    if (unloadPortId.getInput() == null) unloadPortId.setInput(createUnloadPortIdInput());
    if (unloadPortId.getQueryInput() == null) unloadPortId.setQueryInput(createUnloadPortIdQueryInput());
    if (unloadPortId.getDataGridColumn() == null) unloadPortId.setDataGridColumn(createUnloadPortIdDataGridColumn());
    return unloadPortId;
  }
  public HtmlTag createUnloadPortIdInput(){
    return unloadPortId.textInput(36);
  }
  public HtmlTag createUnloadPortIdQueryInput(){
    return unloadPortId.textQueryInput();
  }
  public JsType createUnloadPortIdDataGridColumn(){
    return unloadPortId.textColumn();
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
  
  // CaO
  public FieldCodes cao() {
    if (cao.getInput() == null) cao.setInput(createCaoInput());
    if (cao.getQueryInput() == null) cao.setQueryInput(createCaoQueryInput());
    if (cao.getDataGridColumn() == null) cao.setDataGridColumn(createCaoDataGridColumn());
    return cao;
  }
  public HtmlTag createCaoInput(){
    return cao.textInput(20);
  }
  public HtmlTag createCaoQueryInput(){
    return cao.textQueryInput();
  }
  public JsType createCaoDataGridColumn(){
    return cao.textColumn();
  }
  
  // MgO
  public FieldCodes mgo() {
    if (mgo.getInput() == null) mgo.setInput(createMgoInput());
    if (mgo.getQueryInput() == null) mgo.setQueryInput(createMgoQueryInput());
    if (mgo.getDataGridColumn() == null) mgo.setDataGridColumn(createMgoDataGridColumn());
    return mgo;
  }
  public HtmlTag createMgoInput(){
    return mgo.textInput(20);
  }
  public HtmlTag createMgoQueryInput(){
    return mgo.textQueryInput();
  }
  public JsType createMgoDataGridColumn(){
    return mgo.textColumn();
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
  
  // TiO2
  public FieldCodes tio2() {
    if (tio2.getInput() == null) tio2.setInput(createTio2Input());
    if (tio2.getQueryInput() == null) tio2.setQueryInput(createTio2QueryInput());
    if (tio2.getDataGridColumn() == null) tio2.setDataGridColumn(createTio2DataGridColumn());
    return tio2;
  }
  public HtmlTag createTio2Input(){
    return tio2.textInput(20);
  }
  public HtmlTag createTio2QueryInput(){
    return tio2.textQueryInput();
  }
  public JsType createTio2DataGridColumn(){
    return tio2.textColumn();
  }
  
  // K2O
  public FieldCodes k2o() {
    if (k2o.getInput() == null) k2o.setInput(createK2oInput());
    if (k2o.getQueryInput() == null) k2o.setQueryInput(createK2oQueryInput());
    if (k2o.getDataGridColumn() == null) k2o.setDataGridColumn(createK2oDataGridColumn());
    return k2o;
  }
  public HtmlTag createK2oInput(){
    return k2o.textInput(20);
  }
  public HtmlTag createK2oQueryInput(){
    return k2o.textQueryInput();
  }
  public JsType createK2oDataGridColumn(){
    return k2o.textColumn();
  }
  
  // Na2O
  public FieldCodes na2o() {
    if (na2o.getInput() == null) na2o.setInput(createNa2oInput());
    if (na2o.getQueryInput() == null) na2o.setQueryInput(createNa2oQueryInput());
    if (na2o.getDataGridColumn() == null) na2o.setDataGridColumn(createNa2oDataGridColumn());
    return na2o;
  }
  public HtmlTag createNa2oInput(){
    return na2o.textInput(20);
  }
  public HtmlTag createNa2oQueryInput(){
    return na2o.textQueryInput();
  }
  public JsType createNa2oDataGridColumn(){
    return na2o.textColumn();
  }
  
  // ZnO
  public FieldCodes zno() {
    if (zno.getInput() == null) zno.setInput(createZnoInput());
    if (zno.getQueryInput() == null) zno.setQueryInput(createZnoQueryInput());
    if (zno.getDataGridColumn() == null) zno.setDataGridColumn(createZnoDataGridColumn());
    return zno;
  }
  public HtmlTag createZnoInput(){
    return zno.textInput(20);
  }
  public HtmlTag createZnoQueryInput(){
    return zno.textQueryInput();
  }
  public JsType createZnoDataGridColumn(){
    return zno.textColumn();
  }
  
  // As
  public FieldCodes as() {
    if (as.getInput() == null) as.setInput(createAsInput());
    if (as.getQueryInput() == null) as.setQueryInput(createAsQueryInput());
    if (as.getDataGridColumn() == null) as.setDataGridColumn(createAsDataGridColumn());
    return as;
  }
  public HtmlTag createAsInput(){
    return as.textInput(20);
  }
  public HtmlTag createAsQueryInput(){
    return as.textQueryInput();
  }
  public JsType createAsDataGridColumn(){
    return as.textColumn();
  }
  
  // PbO
  public FieldCodes pbo() {
    if (pbo.getInput() == null) pbo.setInput(createPboInput());
    if (pbo.getQueryInput() == null) pbo.setQueryInput(createPboQueryInput());
    if (pbo.getDataGridColumn() == null) pbo.setDataGridColumn(createPboDataGridColumn());
    return pbo;
  }
  public HtmlTag createPboInput(){
    return pbo.textInput(20);
  }
  public HtmlTag createPboQueryInput(){
    return pbo.textQueryInput();
  }
  public JsType createPboDataGridColumn(){
    return pbo.textColumn();
  }
  
  // Cr
  public FieldCodes cr() {
    if (cr.getInput() == null) cr.setInput(createCrInput());
    if (cr.getQueryInput() == null) cr.setQueryInput(createCrQueryInput());
    if (cr.getDataGridColumn() == null) cr.setDataGridColumn(createCrDataGridColumn());
    return cr;
  }
  public HtmlTag createCrInput(){
    return cr.textInput(20);
  }
  public HtmlTag createCrQueryInput(){
    return cr.textQueryInput();
  }
  public JsType createCrDataGridColumn(){
    return cr.textColumn();
  }
  
  // Ni
  public FieldCodes ni() {
    if (ni.getInput() == null) ni.setInput(createNiInput());
    if (ni.getQueryInput() == null) ni.setQueryInput(createNiQueryInput());
    if (ni.getDataGridColumn() == null) ni.setDataGridColumn(createNiDataGridColumn());
    return ni;
  }
  public HtmlTag createNiInput(){
    return ni.textInput(20);
  }
  public HtmlTag createNiQueryInput(){
    return ni.textQueryInput();
  }
  public JsType createNiDataGridColumn(){
    return ni.textColumn();
  }
  
  // Cu
  public FieldCodes cu() {
    if (cu.getInput() == null) cu.setInput(createCuInput());
    if (cu.getQueryInput() == null) cu.setQueryInput(createCuQueryInput());
    if (cu.getDataGridColumn() == null) cu.setDataGridColumn(createCuDataGridColumn());
    return cu;
  }
  public HtmlTag createCuInput(){
    return cu.textInput(20);
  }
  public HtmlTag createCuQueryInput(){
    return cu.textQueryInput();
  }
  public JsType createCuDataGridColumn(){
    return cu.textColumn();
  }
  
  // Mn
  public FieldCodes mn() {
    if (mn.getInput() == null) mn.setInput(createMnInput());
    if (mn.getQueryInput() == null) mn.setQueryInput(createMnQueryInput());
    if (mn.getDataGridColumn() == null) mn.setDataGridColumn(createMnDataGridColumn());
    return mn;
  }
  public HtmlTag createMnInput(){
    return mn.textInput(20);
  }
  public HtmlTag createMnQueryInput(){
    return mn.textQueryInput();
  }
  public JsType createMnDataGridColumn(){
    return mn.textColumn();
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
  
  // FeO
  public FieldCodes feo() {
    if (feo.getInput() == null) feo.setInput(createFeoInput());
    if (feo.getQueryInput() == null) feo.setQueryInput(createFeoQueryInput());
    if (feo.getDataGridColumn() == null) feo.setDataGridColumn(createFeoDataGridColumn());
    return feo;
  }
  public HtmlTag createFeoInput(){
    return feo.textInput(20);
  }
  public HtmlTag createFeoQueryInput(){
    return feo.textQueryInput();
  }
  public JsType createFeoDataGridColumn(){
    return feo.textColumn();
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
  
  // 烧损
  public FieldCodes burnLose() {
    if (burnLose.getInput() == null) burnLose.setInput(createBurnLoseInput());
    if (burnLose.getQueryInput() == null) burnLose.setQueryInput(createBurnLoseQueryInput());
    if (burnLose.getDataGridColumn() == null) burnLose.setDataGridColumn(createBurnLoseDataGridColumn());
    return burnLose;
  }
  public HtmlTag createBurnLoseInput(){
    return burnLose.textInput(20);
  }
  public HtmlTag createBurnLoseQueryInput(){
    return burnLose.textQueryInput();
  }
  public JsType createBurnLoseDataGridColumn(){
    return burnLose.textColumn();
  }
  
  // 湿量
  public FieldCodes wetWeight() {
    if (wetWeight.getInput() == null) wetWeight.setInput(createWetWeightInput());
    if (wetWeight.getQueryInput() == null) wetWeight.setQueryInput(createWetWeightQueryInput());
    if (wetWeight.getDataGridColumn() == null) wetWeight.setDataGridColumn(createWetWeightDataGridColumn());
    return wetWeight;
  }
  public HtmlTag createWetWeightInput(){
    return wetWeight.textInput(20);
  }
  public HtmlTag createWetWeightQueryInput(){
    return wetWeight.textQueryInput();
  }
  public JsType createWetWeightDataGridColumn(){
    return wetWeight.textColumn();
  }
  
  // 粒度
  public FieldCodes grainSize() {
    if (grainSize.getInput() == null) grainSize.setInput(createGrainSizeInput());
    if (grainSize.getQueryInput() == null) grainSize.setQueryInput(createGrainSizeQueryInput());
    if (grainSize.getDataGridColumn() == null) grainSize.setDataGridColumn(createGrainSizeDataGridColumn());
    return grainSize;
  }
  public HtmlTag createGrainSizeInput(){
    return grainSize.textInput(500);
  }
  public HtmlTag createGrainSizeQueryInput(){
    return grainSize.textQueryInput();
  }
  public JsType createGrainSizeDataGridColumn(){
    return grainSize.textColumn();
  }
  
  // 备注
  public FieldCodes remark() {
    if (remark.getInput() == null) remark.setInput(createRemarkInput());
    if (remark.getQueryInput() == null) remark.setQueryInput(createRemarkQueryInput());
    if (remark.getDataGridColumn() == null) remark.setDataGridColumn(createRemarkDataGridColumn());
    return remark;
  }
  public HtmlTag createRemarkInput(){
    return remark.textInput(500);
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
  
  // 港口费
  public FieldCodes portFee() {
    if (portFee.getInput() == null) portFee.setInput(createPortFeeInput());
    if (portFee.getQueryInput() == null) portFee.setQueryInput(createPortFeeQueryInput());
    if (portFee.getDataGridColumn() == null) portFee.setDataGridColumn(createPortFeeDataGridColumn());
    return portFee;
  }
  public HtmlTag createPortFeeInput(){
    return portFee.numberInput(2);
  }
  public HtmlTag createPortFeeQueryInput(){
    return portFee.numberQueryInput();
  }
  public JsType createPortFeeDataGridColumn(){
    return portFee.textColumn();
  }
  
  // 港口建设费
  public FieldCodes portConstructionFee() {
    if (portConstructionFee.getInput() == null) portConstructionFee.setInput(createPortConstructionFeeInput());
    if (portConstructionFee.getQueryInput() == null) portConstructionFee.setQueryInput(createPortConstructionFeeQueryInput());
    if (portConstructionFee.getDataGridColumn() == null) portConstructionFee.setDataGridColumn(createPortConstructionFeeDataGridColumn());
    return portConstructionFee;
  }
  public HtmlTag createPortConstructionFeeInput(){
    return portConstructionFee.numberInput(2);
  }
  public HtmlTag createPortConstructionFeeQueryInput(){
    return portConstructionFee.numberQueryInput();
  }
  public JsType createPortConstructionFeeDataGridColumn(){
    return portConstructionFee.textColumn();
  }
  
  // 检测费
  public FieldCodes detectFee() {
    if (detectFee.getInput() == null) detectFee.setInput(createDetectFeeInput());
    if (detectFee.getQueryInput() == null) detectFee.setQueryInput(createDetectFeeQueryInput());
    if (detectFee.getDataGridColumn() == null) detectFee.setDataGridColumn(createDetectFeeDataGridColumn());
    return detectFee;
  }
  public HtmlTag createDetectFeeInput(){
    return detectFee.numberInput(2);
  }
  public HtmlTag createDetectFeeQueryInput(){
    return detectFee.numberQueryInput();
  }
  public JsType createDetectFeeDataGridColumn(){
    return detectFee.textColumn();
  }
  
  // 商检费
  public FieldCodes inspectionFee() {
    if (inspectionFee.getInput() == null) inspectionFee.setInput(createInspectionFeeInput());
    if (inspectionFee.getQueryInput() == null) inspectionFee.setQueryInput(createInspectionFeeQueryInput());
    if (inspectionFee.getDataGridColumn() == null) inspectionFee.setDataGridColumn(createInspectionFeeDataGridColumn());
    return inspectionFee;
  }
  public HtmlTag createInspectionFeeInput(){
    return inspectionFee.numberInput(2);
  }
  public HtmlTag createInspectionFeeQueryInput(){
    return inspectionFee.numberQueryInput();
  }
  public JsType createInspectionFeeDataGridColumn(){
    return inspectionFee.textColumn();
  }
  
  // 港口代理费
  public FieldCodes portAgentFee() {
    if (portAgentFee.getInput() == null) portAgentFee.setInput(createPortAgentFeeInput());
    if (portAgentFee.getQueryInput() == null) portAgentFee.setQueryInput(createPortAgentFeeQueryInput());
    if (portAgentFee.getDataGridColumn() == null) portAgentFee.setDataGridColumn(createPortAgentFeeDataGridColumn());
    return portAgentFee;
  }
  public HtmlTag createPortAgentFeeInput(){
    return portAgentFee.numberInput(2);
  }
  public HtmlTag createPortAgentFeeQueryInput(){
    return portAgentFee.numberQueryInput();
  }
  public JsType createPortAgentFeeDataGridColumn(){
    return portAgentFee.textColumn();
  }
  
  // 制取样费
  public FieldCodes sampleFee() {
    if (sampleFee.getInput() == null) sampleFee.setInput(createSampleFeeInput());
    if (sampleFee.getQueryInput() == null) sampleFee.setQueryInput(createSampleFeeQueryInput());
    if (sampleFee.getDataGridColumn() == null) sampleFee.setDataGridColumn(createSampleFeeDataGridColumn());
    return sampleFee;
  }
  public HtmlTag createSampleFeeInput(){
    return sampleFee.numberInput(2);
  }
  public HtmlTag createSampleFeeQueryInput(){
    return sampleFee.numberQueryInput();
  }
  public JsType createSampleFeeDataGridColumn(){
    return sampleFee.textColumn();
  }
  
  // 水尺鉴定费
  public FieldCodes waterGaugeFee() {
    if (waterGaugeFee.getInput() == null) waterGaugeFee.setInput(createWaterGaugeFeeInput());
    if (waterGaugeFee.getQueryInput() == null) waterGaugeFee.setQueryInput(createWaterGaugeFeeQueryInput());
    if (waterGaugeFee.getDataGridColumn() == null) waterGaugeFee.setDataGridColumn(createWaterGaugeFeeDataGridColumn());
    return waterGaugeFee;
  }
  public HtmlTag createWaterGaugeFeeInput(){
    return waterGaugeFee.numberInput(2);
  }
  public HtmlTag createWaterGaugeFeeQueryInput(){
    return waterGaugeFee.numberQueryInput();
  }
  public JsType createWaterGaugeFeeDataGridColumn(){
    return waterGaugeFee.textColumn();
  }
  
  // 小船费
  public FieldCodes boatFee() {
    if (boatFee.getInput() == null) boatFee.setInput(createBoatFeeInput());
    if (boatFee.getQueryInput() == null) boatFee.setQueryInput(createBoatFeeQueryInput());
    if (boatFee.getDataGridColumn() == null) boatFee.setDataGridColumn(createBoatFeeDataGridColumn());
    return boatFee;
  }
  public HtmlTag createBoatFeeInput(){
    return boatFee.numberInput(2);
  }
  public HtmlTag createBoatFeeQueryInput(){
    return boatFee.numberQueryInput();
  }
  public JsType createBoatFeeDataGridColumn(){
    return boatFee.textColumn();
  }
  
  // 报关代理费
  public FieldCodes declareAgentFee() {
    if (declareAgentFee.getInput() == null) declareAgentFee.setInput(createDeclareAgentFeeInput());
    if (declareAgentFee.getQueryInput() == null) declareAgentFee.setQueryInput(createDeclareAgentFeeQueryInput());
    if (declareAgentFee.getDataGridColumn() == null) declareAgentFee.setDataGridColumn(createDeclareAgentFeeDataGridColumn());
    return declareAgentFee;
  }
  public HtmlTag createDeclareAgentFeeInput(){
    return declareAgentFee.numberInput(2);
  }
  public HtmlTag createDeclareAgentFeeQueryInput(){
    return declareAgentFee.numberQueryInput();
  }
  public JsType createDeclareAgentFeeDataGridColumn(){
    return declareAgentFee.textColumn();
  }
  
  // 报检代理费
  public FieldCodes declareInspAgentFee() {
    if (declareInspAgentFee.getInput() == null) declareInspAgentFee.setInput(createDeclareInspAgentFeeInput());
    if (declareInspAgentFee.getQueryInput() == null) declareInspAgentFee.setQueryInput(createDeclareInspAgentFeeQueryInput());
    if (declareInspAgentFee.getDataGridColumn() == null) declareInspAgentFee.setDataGridColumn(createDeclareInspAgentFeeDataGridColumn());
    return declareInspAgentFee;
  }
  public HtmlTag createDeclareInspAgentFeeInput(){
    return declareInspAgentFee.numberInput(2);
  }
  public HtmlTag createDeclareInspAgentFeeQueryInput(){
    return declareInspAgentFee.numberQueryInput();
  }
  public JsType createDeclareInspAgentFeeDataGridColumn(){
    return declareInspAgentFee.textColumn();
  }
  
  // 报关代理
  public FieldCodes declareCustomsAgent() {
    if (declareCustomsAgent.getInput() == null) declareCustomsAgent.setInput(createDeclareCustomsAgentInput());
    if (declareCustomsAgent.getQueryInput() == null) declareCustomsAgent.setQueryInput(createDeclareCustomsAgentQueryInput());
    if (declareCustomsAgent.getDataGridColumn() == null) declareCustomsAgent.setDataGridColumn(createDeclareCustomsAgentDataGridColumn());
    return declareCustomsAgent;
  }
  public HtmlTag createDeclareCustomsAgentInput(){
    return declareCustomsAgent.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=6005");
  }
  public HtmlTag createDeclareCustomsAgentQueryInput(){
    return declareCustomsAgent.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=6005");
  }
  public JsType createDeclareCustomsAgentDataGridColumn(){
    return declareCustomsAgent.textColumn();
  }
  
  // 货运代理
  public FieldCodes freightAgent() {
    if (freightAgent.getInput() == null) freightAgent.setInput(createFreightAgentInput());
    if (freightAgent.getQueryInput() == null) freightAgent.setQueryInput(createFreightAgentQueryInput());
    if (freightAgent.getDataGridColumn() == null) freightAgent.setDataGridColumn(createFreightAgentDataGridColumn());
    return freightAgent;
  }
  public HtmlTag createFreightAgentInput(){
    return freightAgent.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=6004");
  }
  public HtmlTag createFreightAgentQueryInput(){
    return freightAgent.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=6004");
  }
  public JsType createFreightAgentDataGridColumn(){
    return freightAgent.textColumn();
  }
  
  // 最终收货人
  public FieldCodes finalReceiver() {
    if (finalReceiver.getInput() == null) finalReceiver.setInput(createFinalReceiverInput());
    if (finalReceiver.getQueryInput() == null) finalReceiver.setQueryInput(createFinalReceiverQueryInput());
    if (finalReceiver.getDataGridColumn() == null) finalReceiver.setDataGridColumn(createFinalReceiverDataGridColumn());
    return finalReceiver;
  }
  public HtmlTag createFinalReceiverInput(){
    return finalReceiver.textInput(10);
  }
  public HtmlTag createFinalReceiverQueryInput(){
    return finalReceiver.textQueryInput();
  }
  public JsType createFinalReceiverDataGridColumn(){
    return finalReceiver.textColumn();
  }
  
  // 归档
  public FieldCodes ffb040t050pArchived() {
    if (ffb040t050pArchived.getInput() == null) ffb040t050pArchived.setInput(createFfb040t050pArchivedInput());
    if (ffb040t050pArchived.getQueryInput() == null) ffb040t050pArchived.setQueryInput(createFfb040t050pArchivedQueryInput());
    if (ffb040t050pArchived.getDataGridColumn() == null) ffb040t050pArchived.setDataGridColumn(createFfb040t050pArchivedDataGridColumn());
    return ffb040t050pArchived;
  }
  public HtmlTag createFfb040t050pArchivedInput(){
    return ffb040t050pArchived.comboboxInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '已归档', value: '已归档'}, {label: '未归档', value: '未归档'}]");
  }
  public HtmlTag createFfb040t050pArchivedQueryInput(){
    return ffb040t050pArchived.comboboxQueryInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '已归档', value: '已归档'}, {label: '未归档', value: '未归档'}]");
  }
  public JsType createFfb040t050pArchivedDataGridColumn(){
    return ffb040t050pArchived.textColumn();
  }
  
  // 卸港滞期天数
  public FieldCodes unloadDelayDays() {
    if (unloadDelayDays.getInput() == null) unloadDelayDays.setInput(createUnloadDelayDaysInput());
    if (unloadDelayDays.getQueryInput() == null) unloadDelayDays.setQueryInput(createUnloadDelayDaysQueryInput());
    if (unloadDelayDays.getDataGridColumn() == null) unloadDelayDays.setDataGridColumn(createUnloadDelayDaysDataGridColumn());
    return unloadDelayDays;
  }
  public HtmlTag createUnloadDelayDaysInput(){
    return unloadDelayDays.numberInput(5);
  }
  public HtmlTag createUnloadDelayDaysQueryInput(){
    return unloadDelayDays.numberQueryInput();
  }
  public JsType createUnloadDelayDaysDataGridColumn(){
    return unloadDelayDays.textColumn();
  }
  
  // 卸港对卖方滞速费
  public FieldCodes unloadDelayFee() {
    if (unloadDelayFee.getInput() == null) unloadDelayFee.setInput(createUnloadDelayFeeInput());
    if (unloadDelayFee.getQueryInput() == null) unloadDelayFee.setQueryInput(createUnloadDelayFeeQueryInput());
    if (unloadDelayFee.getDataGridColumn() == null) unloadDelayFee.setDataGridColumn(createUnloadDelayFeeDataGridColumn());
    return unloadDelayFee;
  }
  public HtmlTag createUnloadDelayFeeInput(){
    return unloadDelayFee.numberInput(2);
  }
  public HtmlTag createUnloadDelayFeeQueryInput(){
    return unloadDelayFee.numberQueryInput();
  }
  public JsType createUnloadDelayFeeDataGridColumn(){
    return unloadDelayFee.textColumn();
  }
  
  // 卸港对卖方滞速费（带单位）
  public FieldCodes unloadDelayFeeWithUnit() {
    if (unloadDelayFeeWithUnit.getInput() == null) unloadDelayFeeWithUnit.setInput(createUnloadDelayFeeWithUnitInput());
    if (unloadDelayFeeWithUnit.getQueryInput() == null) unloadDelayFeeWithUnit.setQueryInput(createUnloadDelayFeeWithUnitQueryInput());
    if (unloadDelayFeeWithUnit.getDataGridColumn() == null) unloadDelayFeeWithUnit.setDataGridColumn(createUnloadDelayFeeWithUnitDataGridColumn());
    return unloadDelayFeeWithUnit;
  }
  public HtmlTag createUnloadDelayFeeWithUnitInput(){
    return unloadDelayFeeWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createUnloadDelayFeeWithUnitQueryInput(){
    return unloadDelayFee.numberQueryInput();
  }
  public JsType createUnloadDelayFeeWithUnitDataGridColumn(){
    return unloadDelayFee.textColumn();
  }
  
  // 卸港对卖方滞速费币种
  public FieldCodes unloadDelayFeeUnit() {
    if (unloadDelayFeeUnit.getInput() == null) unloadDelayFeeUnit.setInput(createUnloadDelayFeeUnitInput());
    if (unloadDelayFeeUnit.getQueryInput() == null) unloadDelayFeeUnit.setQueryInput(createUnloadDelayFeeUnitQueryInput());
    if (unloadDelayFeeUnit.getDataGridColumn() == null) unloadDelayFeeUnit.setDataGridColumn(createUnloadDelayFeeUnitDataGridColumn());
    return unloadDelayFeeUnit;
  }
  public HtmlTag createUnloadDelayFeeUnitInput(){
    return unloadDelayFeeUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createUnloadDelayFeeUnitQueryInput(){
    return unloadDelayFeeUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createUnloadDelayFeeUnitDataGridColumn(){
    return unloadDelayFeeUnit.textColumn();
  }
  
  // 卸港滞速费率
  public FieldCodes unloadDelayFeeRate() {
    if (unloadDelayFeeRate.getInput() == null) unloadDelayFeeRate.setInput(createUnloadDelayFeeRateInput());
    if (unloadDelayFeeRate.getQueryInput() == null) unloadDelayFeeRate.setQueryInput(createUnloadDelayFeeRateQueryInput());
    if (unloadDelayFeeRate.getDataGridColumn() == null) unloadDelayFeeRate.setDataGridColumn(createUnloadDelayFeeRateDataGridColumn());
    return unloadDelayFeeRate;
  }
  public HtmlTag createUnloadDelayFeeRateInput(){
    return unloadDelayFeeRate.numberInput(5);
  }
  public HtmlTag createUnloadDelayFeeRateQueryInput(){
    return unloadDelayFeeRate.numberQueryInput();
  }
  public JsType createUnloadDelayFeeRateDataGridColumn(){
    return unloadDelayFeeRate.textColumn();
  }
  
  // CFR卸港运费调整
  public FieldCodes unloadTransportAdjust() {
    if (unloadTransportAdjust.getInput() == null) unloadTransportAdjust.setInput(createUnloadTransportAdjustInput());
    if (unloadTransportAdjust.getQueryInput() == null) unloadTransportAdjust.setQueryInput(createUnloadTransportAdjustQueryInput());
    if (unloadTransportAdjust.getDataGridColumn() == null) unloadTransportAdjust.setDataGridColumn(createUnloadTransportAdjustDataGridColumn());
    return unloadTransportAdjust;
  }
  public HtmlTag createUnloadTransportAdjustInput(){
    return unloadTransportAdjust.numberInput(2);
  }
  public HtmlTag createUnloadTransportAdjustQueryInput(){
    return unloadTransportAdjust.numberQueryInput();
  }
  public JsType createUnloadTransportAdjustDataGridColumn(){
    return unloadTransportAdjust.textColumn();
  }
  
  // CFR卸港运费调整（带单位）
  public FieldCodes unloadTransportAdjustWithUnit() {
    if (unloadTransportAdjustWithUnit.getInput() == null) unloadTransportAdjustWithUnit.setInput(createUnloadTransportAdjustWithUnitInput());
    if (unloadTransportAdjustWithUnit.getQueryInput() == null) unloadTransportAdjustWithUnit.setQueryInput(createUnloadTransportAdjustWithUnitQueryInput());
    if (unloadTransportAdjustWithUnit.getDataGridColumn() == null) unloadTransportAdjustWithUnit.setDataGridColumn(createUnloadTransportAdjustWithUnitDataGridColumn());
    return unloadTransportAdjustWithUnit;
  }
  public HtmlTag createUnloadTransportAdjustWithUnitInput(){
    return unloadTransportAdjustWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createUnloadTransportAdjustWithUnitQueryInput(){
    return unloadTransportAdjust.numberQueryInput();
  }
  public JsType createUnloadTransportAdjustWithUnitDataGridColumn(){
    return unloadTransportAdjust.textColumn();
  }
  
  // CFR卸港运费调整币种
  public FieldCodes unloadTransportAdjustUnit() {
    if (unloadTransportAdjustUnit.getInput() == null) unloadTransportAdjustUnit.setInput(createUnloadTransportAdjustUnitInput());
    if (unloadTransportAdjustUnit.getQueryInput() == null) unloadTransportAdjustUnit.setQueryInput(createUnloadTransportAdjustUnitQueryInput());
    if (unloadTransportAdjustUnit.getDataGridColumn() == null) unloadTransportAdjustUnit.setDataGridColumn(createUnloadTransportAdjustUnitDataGridColumn());
    return unloadTransportAdjustUnit;
  }
  public HtmlTag createUnloadTransportAdjustUnitInput(){
    return unloadTransportAdjustUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createUnloadTransportAdjustUnitQueryInput(){
    return unloadTransportAdjustUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createUnloadTransportAdjustUnitDataGridColumn(){
    return unloadTransportAdjustUnit.textColumn();
  }
  
  // 卸港与船公司滞速费
  public FieldCodes speedDelayFee() {
    if (speedDelayFee.getInput() == null) speedDelayFee.setInput(createSpeedDelayFeeInput());
    if (speedDelayFee.getQueryInput() == null) speedDelayFee.setQueryInput(createSpeedDelayFeeQueryInput());
    if (speedDelayFee.getDataGridColumn() == null) speedDelayFee.setDataGridColumn(createSpeedDelayFeeDataGridColumn());
    return speedDelayFee;
  }
  public HtmlTag createSpeedDelayFeeInput(){
    return speedDelayFee.numberInput(2);
  }
  public HtmlTag createSpeedDelayFeeQueryInput(){
    return speedDelayFee.numberQueryInput();
  }
  public JsType createSpeedDelayFeeDataGridColumn(){
    return speedDelayFee.textColumn();
  }
  
  // 卸港与船公司滞速费（带单位）
  public FieldCodes speedDelayFeeWithUnit() {
    if (speedDelayFeeWithUnit.getInput() == null) speedDelayFeeWithUnit.setInput(createSpeedDelayFeeWithUnitInput());
    if (speedDelayFeeWithUnit.getQueryInput() == null) speedDelayFeeWithUnit.setQueryInput(createSpeedDelayFeeWithUnitQueryInput());
    if (speedDelayFeeWithUnit.getDataGridColumn() == null) speedDelayFeeWithUnit.setDataGridColumn(createSpeedDelayFeeWithUnitDataGridColumn());
    return speedDelayFeeWithUnit;
  }
  public HtmlTag createSpeedDelayFeeWithUnitInput(){
    return speedDelayFeeWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createSpeedDelayFeeWithUnitQueryInput(){
    return speedDelayFee.numberQueryInput();
  }
  public JsType createSpeedDelayFeeWithUnitDataGridColumn(){
    return speedDelayFee.textColumn();
  }
  
  // 卸港与船公司滞速费币种
  public FieldCodes speedDelayFeeUnit() {
    if (speedDelayFeeUnit.getInput() == null) speedDelayFeeUnit.setInput(createSpeedDelayFeeUnitInput());
    if (speedDelayFeeUnit.getQueryInput() == null) speedDelayFeeUnit.setQueryInput(createSpeedDelayFeeUnitQueryInput());
    if (speedDelayFeeUnit.getDataGridColumn() == null) speedDelayFeeUnit.setDataGridColumn(createSpeedDelayFeeUnitDataGridColumn());
    return speedDelayFeeUnit;
  }
  public HtmlTag createSpeedDelayFeeUnitInput(){
    return speedDelayFeeUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createSpeedDelayFeeUnitQueryInput(){
    return speedDelayFeeUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createSpeedDelayFeeUnitDataGridColumn(){
    return speedDelayFeeUnit.textColumn();
  }
  
  // 船代
  public FieldCodes shipAgent() {
    if (shipAgent.getInput() == null) shipAgent.setInput(createShipAgentInput());
    if (shipAgent.getQueryInput() == null) shipAgent.setQueryInput(createShipAgentQueryInput());
    if (shipAgent.getDataGridColumn() == null) shipAgent.setDataGridColumn(createShipAgentDataGridColumn());
    return shipAgent;
  }
  public HtmlTag createShipAgentInput(){
    return shipAgent.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=6002");
  }
  public HtmlTag createShipAgentQueryInput(){
    return shipAgent.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=6002");
  }
  public JsType createShipAgentDataGridColumn(){
    return shipAgent.textColumn();
  }
  
  // 归档
  public FieldCodes ffb040t030pArchived() {
    if (ffb040t030pArchived.getInput() == null) ffb040t030pArchived.setInput(createFfb040t030pArchivedInput());
    if (ffb040t030pArchived.getQueryInput() == null) ffb040t030pArchived.setQueryInput(createFfb040t030pArchivedQueryInput());
    if (ffb040t030pArchived.getDataGridColumn() == null) ffb040t030pArchived.setDataGridColumn(createFfb040t030pArchivedDataGridColumn());
    return ffb040t030pArchived;
  }
  public HtmlTag createFfb040t030pArchivedInput(){
    return ffb040t030pArchived.comboboxInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '已归档', value: '已归档'}, {label: '未归档', value: '未归档'}]");
  }
  public HtmlTag createFfb040t030pArchivedQueryInput(){
    return ffb040t030pArchived.comboboxQueryInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '已归档', value: '已归档'}, {label: '未归档', value: '未归档'}]");
  }
  public JsType createFfb040t030pArchivedDataGridColumn(){
    return ffb040t030pArchived.textColumn();
  }
  
  // 货代
  public FieldCodes goodsAgent() {
    if (goodsAgent.getInput() == null) goodsAgent.setInput(createGoodsAgentInput());
    if (goodsAgent.getQueryInput() == null) goodsAgent.setQueryInput(createGoodsAgentQueryInput());
    if (goodsAgent.getDataGridColumn() == null) goodsAgent.setDataGridColumn(createGoodsAgentDataGridColumn());
    return goodsAgent;
  }
  public HtmlTag createGoodsAgentInput(){
    return goodsAgent.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=6004");
  }
  public HtmlTag createGoodsAgentQueryInput(){
    return goodsAgent.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=6004");
  }
  public JsType createGoodsAgentDataGridColumn(){
    return goodsAgent.textColumn();
  }
  
  // 报关单位
  public FieldCodes declareCustomsCompany() {
    if (declareCustomsCompany.getInput() == null) declareCustomsCompany.setInput(createDeclareCustomsCompanyInput());
    if (declareCustomsCompany.getQueryInput() == null) declareCustomsCompany.setQueryInput(createDeclareCustomsCompanyQueryInput());
    if (declareCustomsCompany.getDataGridColumn() == null) declareCustomsCompany.setDataGridColumn(createDeclareCustomsCompanyDataGridColumn());
    return declareCustomsCompany;
  }
  public HtmlTag createDeclareCustomsCompanyInput(){
    return declareCustomsCompany.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=6005");
  }
  public HtmlTag createDeclareCustomsCompanyQueryInput(){
    return declareCustomsCompany.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=6005");
  }
  public JsType createDeclareCustomsCompanyDataGridColumn(){
    return declareCustomsCompany.textColumn();
  }
  
  // 保证金
  public FieldCodes depositFee() {
    if (depositFee.getInput() == null) depositFee.setInput(createDepositFeeInput());
    if (depositFee.getQueryInput() == null) depositFee.setQueryInput(createDepositFeeQueryInput());
    if (depositFee.getDataGridColumn() == null) depositFee.setDataGridColumn(createDepositFeeDataGridColumn());
    return depositFee;
  }
  public HtmlTag createDepositFeeInput(){
    return depositFee.numberInput(2);
  }
  public HtmlTag createDepositFeeQueryInput(){
    return depositFee.numberQueryInput();
  }
  public JsType createDepositFeeDataGridColumn(){
    return depositFee.textColumn();
  }
  
  // 保证金（带单位）
  public FieldCodes depositFeeWithUnit() {
    if (depositFeeWithUnit.getInput() == null) depositFeeWithUnit.setInput(createDepositFeeWithUnitInput());
    if (depositFeeWithUnit.getQueryInput() == null) depositFeeWithUnit.setQueryInput(createDepositFeeWithUnitQueryInput());
    if (depositFeeWithUnit.getDataGridColumn() == null) depositFeeWithUnit.setDataGridColumn(createDepositFeeWithUnitDataGridColumn());
    return depositFeeWithUnit;
  }
  public HtmlTag createDepositFeeWithUnitInput(){
    return depositFeeWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createDepositFeeWithUnitQueryInput(){
    return depositFee.numberQueryInput();
  }
  public JsType createDepositFeeWithUnitDataGridColumn(){
    return depositFee.textColumn();
  }
  
  // 保证金币种
  public FieldCodes depositFeeUnit() {
    if (depositFeeUnit.getInput() == null) depositFeeUnit.setInput(createDepositFeeUnitInput());
    if (depositFeeUnit.getQueryInput() == null) depositFeeUnit.setQueryInput(createDepositFeeUnitQueryInput());
    if (depositFeeUnit.getDataGridColumn() == null) depositFeeUnit.setDataGridColumn(createDepositFeeUnitDataGridColumn());
    return depositFeeUnit;
  }
  public HtmlTag createDepositFeeUnitInput(){
    return depositFeeUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createDepositFeeUnitQueryInput(){
    return depositFeeUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createDepositFeeUnitDataGridColumn(){
    return depositFeeUnit.textColumn();
  }
  
  // 报关海关
  public FieldCodes declareCustoms() {
    if (declareCustoms.getInput() == null) declareCustoms.setInput(createDeclareCustomsInput());
    if (declareCustoms.getQueryInput() == null) declareCustoms.setQueryInput(createDeclareCustomsQueryInput());
    if (declareCustoms.getDataGridColumn() == null) declareCustoms.setDataGridColumn(createDeclareCustomsDataGridColumn());
    return declareCustoms;
  }
  public HtmlTag createDeclareCustomsInput(){
    return declareCustoms.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=6006");
  }
  public HtmlTag createDeclareCustomsQueryInput(){
    return declareCustoms.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=6006");
  }
  public JsType createDeclareCustomsDataGridColumn(){
    return declareCustoms.textColumn();
  }
  
  // 最晚结关日
  public FieldCodes customsClearanceLastDate() {
    if (customsClearanceLastDate.getInput() == null) customsClearanceLastDate.setInput(createCustomsClearanceLastDateInput());
    if (customsClearanceLastDate.getQueryInput() == null) customsClearanceLastDate.setQueryInput(createCustomsClearanceLastDateQueryInput());
    if (customsClearanceLastDate.getDataGridColumn() == null) customsClearanceLastDate.setDataGridColumn(createCustomsClearanceLastDateDataGridColumn());
    return customsClearanceLastDate;
  }
  public HtmlTag createCustomsClearanceLastDateInput(){
    return customsClearanceLastDate.dateInput();
  }
  public HtmlTag createCustomsClearanceLastDateQueryInput(){
    return customsClearanceLastDate.dateQueryInput();
  }
  public JsType createCustomsClearanceLastDateDataGridColumn(){
    return customsClearanceLastDate.dateColumn();
  }
  
  // 实际结关日
  public FieldCodes customsClearanceActualDate() {
    if (customsClearanceActualDate.getInput() == null) customsClearanceActualDate.setInput(createCustomsClearanceActualDateInput());
    if (customsClearanceActualDate.getQueryInput() == null) customsClearanceActualDate.setQueryInput(createCustomsClearanceActualDateQueryInput());
    if (customsClearanceActualDate.getDataGridColumn() == null) customsClearanceActualDate.setDataGridColumn(createCustomsClearanceActualDateDataGridColumn());
    return customsClearanceActualDate;
  }
  public HtmlTag createCustomsClearanceActualDateInput(){
    return customsClearanceActualDate.dateInput();
  }
  public HtmlTag createCustomsClearanceActualDateQueryInput(){
    return customsClearanceActualDate.dateQueryInput();
  }
  public JsType createCustomsClearanceActualDateDataGridColumn(){
    return customsClearanceActualDate.dateColumn();
  }
  
  // 外管局申报
  public FieldCodes safeDeclar() {
    if (safeDeclar.getInput() == null) safeDeclar.setInput(createSafeDeclarInput());
    if (safeDeclar.getQueryInput() == null) safeDeclar.setQueryInput(createSafeDeclarQueryInput());
    if (safeDeclar.getDataGridColumn() == null) safeDeclar.setDataGridColumn(createSafeDeclarDataGridColumn());
    return safeDeclar;
  }
  public HtmlTag createSafeDeclarInput(){
    return safeDeclar.textInput(30);
  }
  public HtmlTag createSafeDeclarQueryInput(){
    return safeDeclar.textQueryInput();
  }
  public JsType createSafeDeclarDataGridColumn(){
    return safeDeclar.textColumn();
  }
  
  // 首次报关日期
  public FieldCodes declareCustomsDate() {
    if (declareCustomsDate.getInput() == null) declareCustomsDate.setInput(createDeclareCustomsDateInput());
    if (declareCustomsDate.getQueryInput() == null) declareCustomsDate.setQueryInput(createDeclareCustomsDateQueryInput());
    if (declareCustomsDate.getDataGridColumn() == null) declareCustomsDate.setDataGridColumn(createDeclareCustomsDateDataGridColumn());
    return declareCustomsDate;
  }
  public HtmlTag createDeclareCustomsDateInput(){
    return declareCustomsDate.dateInput();
  }
  public HtmlTag createDeclareCustomsDateQueryInput(){
    return declareCustomsDate.dateQueryInput();
  }
  public JsType createDeclareCustomsDateDataGridColumn(){
    return declareCustomsDate.dateColumn();
  }
  
  // 报关单号
  public FieldCodes declareCustomsBill() {
    if (declareCustomsBill.getInput() == null) declareCustomsBill.setInput(createDeclareCustomsBillInput());
    if (declareCustomsBill.getQueryInput() == null) declareCustomsBill.setQueryInput(createDeclareCustomsBillQueryInput());
    if (declareCustomsBill.getDataGridColumn() == null) declareCustomsBill.setDataGridColumn(createDeclareCustomsBillDataGridColumn());
    return declareCustomsBill;
  }
  public HtmlTag createDeclareCustomsBillInput(){
    return declareCustomsBill.textInput(30);
  }
  public HtmlTag createDeclareCustomsBillQueryInput(){
    return declareCustomsBill.textQueryInput();
  }
  public JsType createDeclareCustomsBillDataGridColumn(){
    return declareCustomsBill.textColumn();
  }
  
  // 结关状态
  public FieldCodes customsClearanceState() {
    if (customsClearanceState.getInput() == null) customsClearanceState.setInput(createCustomsClearanceStateInput());
    if (customsClearanceState.getQueryInput() == null) customsClearanceState.setQueryInput(createCustomsClearanceStateQueryInput());
    if (customsClearanceState.getDataGridColumn() == null) customsClearanceState.setDataGridColumn(createCustomsClearanceStateDataGridColumn());
    return customsClearanceState;
  }
  public HtmlTag createCustomsClearanceStateInput(){
    return customsClearanceState.textInput(20);
  }
  public HtmlTag createCustomsClearanceStateQueryInput(){
    return customsClearanceState.textQueryInput();
  }
  public JsType createCustomsClearanceStateDataGridColumn(){
    return customsClearanceState.textColumn();
  }
  
  // 首次报关金额
  public FieldCodes declareCustomsFee() {
    if (declareCustomsFee.getInput() == null) declareCustomsFee.setInput(createDeclareCustomsFeeInput());
    if (declareCustomsFee.getQueryInput() == null) declareCustomsFee.setQueryInput(createDeclareCustomsFeeQueryInput());
    if (declareCustomsFee.getDataGridColumn() == null) declareCustomsFee.setDataGridColumn(createDeclareCustomsFeeDataGridColumn());
    return declareCustomsFee;
  }
  public HtmlTag createDeclareCustomsFeeInput(){
    return declareCustomsFee.numberInput(2);
  }
  public HtmlTag createDeclareCustomsFeeQueryInput(){
    return declareCustomsFee.numberQueryInput();
  }
  public JsType createDeclareCustomsFeeDataGridColumn(){
    return declareCustomsFee.textColumn();
  }
  
  // 首次报关金额（带单位）
  public FieldCodes declareCustomsFeeWithUnit() {
    if (declareCustomsFeeWithUnit.getInput() == null) declareCustomsFeeWithUnit.setInput(createDeclareCustomsFeeWithUnitInput());
    if (declareCustomsFeeWithUnit.getQueryInput() == null) declareCustomsFeeWithUnit.setQueryInput(createDeclareCustomsFeeWithUnitQueryInput());
    if (declareCustomsFeeWithUnit.getDataGridColumn() == null) declareCustomsFeeWithUnit.setDataGridColumn(createDeclareCustomsFeeWithUnitDataGridColumn());
    return declareCustomsFeeWithUnit;
  }
  public HtmlTag createDeclareCustomsFeeWithUnitInput(){
    return declareCustomsFeeWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createDeclareCustomsFeeWithUnitQueryInput(){
    return declareCustomsFee.numberQueryInput();
  }
  public JsType createDeclareCustomsFeeWithUnitDataGridColumn(){
    return declareCustomsFee.textColumn();
  }
  
  // 首次报关金额币种
  public FieldCodes declareCustomsFeeUnit() {
    if (declareCustomsFeeUnit.getInput() == null) declareCustomsFeeUnit.setInput(createDeclareCustomsFeeUnitInput());
    if (declareCustomsFeeUnit.getQueryInput() == null) declareCustomsFeeUnit.setQueryInput(createDeclareCustomsFeeUnitQueryInput());
    if (declareCustomsFeeUnit.getDataGridColumn() == null) declareCustomsFeeUnit.setDataGridColumn(createDeclareCustomsFeeUnitDataGridColumn());
    return declareCustomsFeeUnit;
  }
  public HtmlTag createDeclareCustomsFeeUnitInput(){
    return declareCustomsFeeUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createDeclareCustomsFeeUnitQueryInput(){
    return declareCustomsFeeUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createDeclareCustomsFeeUnitDataGridColumn(){
    return declareCustomsFeeUnit.textColumn();
  }
  
  // 许可证号
  public FieldCodes licenseNumber() {
    if (licenseNumber.getInput() == null) licenseNumber.setInput(createLicenseNumberInput());
    if (licenseNumber.getQueryInput() == null) licenseNumber.setQueryInput(createLicenseNumberQueryInput());
    if (licenseNumber.getDataGridColumn() == null) licenseNumber.setDataGridColumn(createLicenseNumberDataGridColumn());
    return licenseNumber;
  }
  public HtmlTag createLicenseNumberInput(){
    return licenseNumber.textInput(30);
  }
  public HtmlTag createLicenseNumberQueryInput(){
    return licenseNumber.textQueryInput();
  }
  public JsType createLicenseNumberDataGridColumn(){
    return licenseNumber.textColumn();
  }
  
  // 海关征收增值税
  public FieldCodes valueAddedTax() {
    if (valueAddedTax.getInput() == null) valueAddedTax.setInput(createValueAddedTaxInput());
    if (valueAddedTax.getQueryInput() == null) valueAddedTax.setQueryInput(createValueAddedTaxQueryInput());
    if (valueAddedTax.getDataGridColumn() == null) valueAddedTax.setDataGridColumn(createValueAddedTaxDataGridColumn());
    return valueAddedTax;
  }
  public HtmlTag createValueAddedTaxInput(){
    return valueAddedTax.numberInput(2);
  }
  public HtmlTag createValueAddedTaxQueryInput(){
    return valueAddedTax.numberQueryInput();
  }
  public JsType createValueAddedTaxDataGridColumn(){
    return valueAddedTax.textColumn();
  }
  
  // 海关征收增值税（带单位）
  public FieldCodes valueAddedTaxWithUnit() {
    if (valueAddedTaxWithUnit.getInput() == null) valueAddedTaxWithUnit.setInput(createValueAddedTaxWithUnitInput());
    if (valueAddedTaxWithUnit.getQueryInput() == null) valueAddedTaxWithUnit.setQueryInput(createValueAddedTaxWithUnitQueryInput());
    if (valueAddedTaxWithUnit.getDataGridColumn() == null) valueAddedTaxWithUnit.setDataGridColumn(createValueAddedTaxWithUnitDataGridColumn());
    return valueAddedTaxWithUnit;
  }
  public HtmlTag createValueAddedTaxWithUnitInput(){
    return valueAddedTaxWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createValueAddedTaxWithUnitQueryInput(){
    return valueAddedTax.numberQueryInput();
  }
  public JsType createValueAddedTaxWithUnitDataGridColumn(){
    return valueAddedTax.textColumn();
  }
  
  // 海关征收增值税币种
  public FieldCodes valueAddedTaxUnit() {
    if (valueAddedTaxUnit.getInput() == null) valueAddedTaxUnit.setInput(createValueAddedTaxUnitInput());
    if (valueAddedTaxUnit.getQueryInput() == null) valueAddedTaxUnit.setQueryInput(createValueAddedTaxUnitQueryInput());
    if (valueAddedTaxUnit.getDataGridColumn() == null) valueAddedTaxUnit.setDataGridColumn(createValueAddedTaxUnitDataGridColumn());
    return valueAddedTaxUnit;
  }
  public HtmlTag createValueAddedTaxUnitInput(){
    return valueAddedTaxUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createValueAddedTaxUnitQueryInput(){
    return valueAddedTaxUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createValueAddedTaxUnitDataGridColumn(){
    return valueAddedTaxUnit.textColumn();
  }
  
  // 海关补税金额
  public FieldCodes customsTaxEqualize() {
    if (customsTaxEqualize.getInput() == null) customsTaxEqualize.setInput(createCustomsTaxEqualizeInput());
    if (customsTaxEqualize.getQueryInput() == null) customsTaxEqualize.setQueryInput(createCustomsTaxEqualizeQueryInput());
    if (customsTaxEqualize.getDataGridColumn() == null) customsTaxEqualize.setDataGridColumn(createCustomsTaxEqualizeDataGridColumn());
    return customsTaxEqualize;
  }
  public HtmlTag createCustomsTaxEqualizeInput(){
    return customsTaxEqualize.numberInput(2);
  }
  public HtmlTag createCustomsTaxEqualizeQueryInput(){
    return customsTaxEqualize.numberQueryInput();
  }
  public JsType createCustomsTaxEqualizeDataGridColumn(){
    return customsTaxEqualize.textColumn();
  }
  
  // 海关补税金额（带单位）
  public FieldCodes customsTaxEqualizeWithUnit() {
    if (customsTaxEqualizeWithUnit.getInput() == null) customsTaxEqualizeWithUnit.setInput(createCustomsTaxEqualizeWithUnitInput());
    if (customsTaxEqualizeWithUnit.getQueryInput() == null) customsTaxEqualizeWithUnit.setQueryInput(createCustomsTaxEqualizeWithUnitQueryInput());
    if (customsTaxEqualizeWithUnit.getDataGridColumn() == null) customsTaxEqualizeWithUnit.setDataGridColumn(createCustomsTaxEqualizeWithUnitDataGridColumn());
    return customsTaxEqualizeWithUnit;
  }
  public HtmlTag createCustomsTaxEqualizeWithUnitInput(){
    return customsTaxEqualizeWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createCustomsTaxEqualizeWithUnitQueryInput(){
    return customsTaxEqualize.numberQueryInput();
  }
  public JsType createCustomsTaxEqualizeWithUnitDataGridColumn(){
    return customsTaxEqualize.textColumn();
  }
  
  // 海关补税金额币种
  public FieldCodes customsTaxEqualizeUnit() {
    if (customsTaxEqualizeUnit.getInput() == null) customsTaxEqualizeUnit.setInput(createCustomsTaxEqualizeUnitInput());
    if (customsTaxEqualizeUnit.getQueryInput() == null) customsTaxEqualizeUnit.setQueryInput(createCustomsTaxEqualizeUnitQueryInput());
    if (customsTaxEqualizeUnit.getDataGridColumn() == null) customsTaxEqualizeUnit.setDataGridColumn(createCustomsTaxEqualizeUnitDataGridColumn());
    return customsTaxEqualizeUnit;
  }
  public HtmlTag createCustomsTaxEqualizeUnitInput(){
    return customsTaxEqualizeUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createCustomsTaxEqualizeUnitQueryInput(){
    return customsTaxEqualizeUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createCustomsTaxEqualizeUnitDataGridColumn(){
    return customsTaxEqualizeUnit.textColumn();
  }
  
  // 归档
  public FieldCodes ffb040t040pArchived() {
    if (ffb040t040pArchived.getInput() == null) ffb040t040pArchived.setInput(createFfb040t040pArchivedInput());
    if (ffb040t040pArchived.getQueryInput() == null) ffb040t040pArchived.setQueryInput(createFfb040t040pArchivedQueryInput());
    if (ffb040t040pArchived.getDataGridColumn() == null) ffb040t040pArchived.setDataGridColumn(createFfb040t040pArchivedDataGridColumn());
    return ffb040t040pArchived;
  }
  public HtmlTag createFfb040t040pArchivedInput(){
    return ffb040t040pArchived.comboboxInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '已归档', value: '已归档'}, {label: '未归档', value: '未归档'}]");
  }
  public HtmlTag createFfb040t040pArchivedQueryInput(){
    return ffb040t040pArchived.comboboxQueryInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '已归档', value: '已归档'}, {label: '未归档', value: '未归档'}]");
  }
  public JsType createFfb040t040pArchivedDataGridColumn(){
    return ffb040t040pArchived.textColumn();
  }
  
  
}
