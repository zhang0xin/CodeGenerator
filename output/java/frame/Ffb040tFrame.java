package com.ysusoft.frame.purchase;

import com.ysusoft.annotations.Comment;

@Comment("品质")
public class Ffb040tFrame<TLong, TDecimal, TString, TDate> extends BaseFrame {
  
  @Comment("采购批次")
  private TString purchaseBatchId;
  
  @Comment("卸港批次")
  private TString unloadPortId;
  
  @Comment("TFe")
  private TString tfe;
  
  @Comment("SiO2")
  private TString sio2;
  
  @Comment("CaO")
  private TString cao;
  
  @Comment("MgO")
  private TString mgo;
  
  @Comment("Al2O3")
  private TString al2o3;
  
  @Comment("SiO2+Al2O3")
  private TString sio2Al2o3;
  
  @Comment("TiO2")
  private TString tio2;
  
  @Comment("K2O")
  private TString k2o;
  
  @Comment("Na2O")
  private TString na2o;
  
  @Comment("ZnO")
  private TString zno;
  
  @Comment("As")
  private TString as;
  
  @Comment("PbO")
  private TString pbo;
  
  @Comment("Cr")
  private TString cr;
  
  @Comment("Ni")
  private TString ni;
  
  @Comment("Cu")
  private TString cu;
  
  @Comment("Mn")
  private TString mn;
  
  @Comment("H2O")
  private TString h2o;
  
  @Comment("FeO")
  private TString feo;
  
  @Comment("P")
  private TString p;
  
  @Comment("S")
  private TString s;
  
  @Comment("烧损")
  private TString burnLose;
  
  @Comment("湿量")
  private TString wetWeight;
  
  @Comment("粒度")
  private TString grainSize;
  
  @Comment("备注")
  private TString remark;
  
  @Comment("归档")
  private TString archived;
  
  @Comment("港口费")
  private TDecimal portFee;
  
  @Comment("港口建设费")
  private TDecimal portConstructionFee;
  
  @Comment("检测费")
  private TDecimal detectFee;
  
  @Comment("商检费")
  private TDecimal inspectionFee;
  
  @Comment("港口代理费")
  private TDecimal portAgentFee;
  
  @Comment("制取样费")
  private TDecimal sampleFee;
  
  @Comment("水尺鉴定费")
  private TDecimal waterGaugeFee;
  
  @Comment("小船费")
  private TDecimal boatFee;
  
  @Comment("报关代理费")
  private TDecimal declareAgentFee;
  
  @Comment("报检代理费")
  private TDecimal declareInspAgentFee;
  
  @Comment("报关代理")
  private TString declareCustomsAgent;
  
  @Comment("货运代理")
  private TString freightAgent;
  
  @Comment("最终收货人")
  private TString finalReceiver;
  
  @Comment("归档")
  private TString ffb040t050pArchived;
  
  @Comment("卸港滞期天数")
  private TDecimal unloadDelayDays;
  
  @Comment("卸港对卖方滞速费")
  private TDecimal unloadDelayFee;
  
  @Comment("卸港对卖方滞速费币种")
  private TString unloadDelayFeeUnit;
  
  @Comment("卸港滞速费率")
  private TDecimal unloadDelayFeeRate;
  
  @Comment("CFR卸港运费调整")
  private TDecimal unloadTransportAdjust;
  
  @Comment("CFR卸港运费调整币种")
  private TString unloadTransportAdjustUnit;
  
  @Comment("卸港与船公司滞速费")
  private TDecimal speedDelayFee;
  
  @Comment("卸港与船公司滞速费币种")
  private TString speedDelayFeeUnit;
  
  @Comment("船代")
  private TString shipAgent;
  
  @Comment("归档")
  private TString ffb040t030pArchived;
  
  @Comment("货代")
  private TString goodsAgent;
  
  @Comment("报关单位")
  private TString declareCustomsCompany;
  
  @Comment("保证金")
  private TDecimal depositFee;
  
  @Comment("保证金币种")
  private TString depositFeeUnit;
  
  @Comment("报关海关")
  private TString declareCustoms;
  
  @Comment("最晚结关日")
  private TDate customsClearanceLastDate;
  
  @Comment("实际结关日")
  private TDate customsClearanceActualDate;
  
  @Comment("外管局申报")
  private TString safeDeclar;
  
  @Comment("首次报关日期")
  private TDate declareCustomsDate;
  
  @Comment("报关单号")
  private TString declareCustomsBill;
  
  @Comment("结关状态")
  private TString customsClearanceState;
  
  @Comment("首次报关金额")
  private TDecimal declareCustomsFee;
  
  @Comment("首次报关金额币种")
  private TString declareCustomsFeeUnit;
  
  @Comment("许可证号")
  private TString licenseNumber;
  
  @Comment("海关征收增值税")
  private TDecimal valueAddedTax;
  
  @Comment("海关征收增值税币种")
  private TString valueAddedTaxUnit;
  
  @Comment("海关补税金额")
  private TDecimal customsTaxEqualize;
  
  @Comment("海关补税金额币种")
  private TString customsTaxEqualizeUnit;
  
  @Comment("归档")
  private TString ffb040t040pArchived;
  

  public Ffb040tFrame() {
  }

  
  public TString getPurchaseBatchId() {
    return this.purchaseBatchId;
  }
  public void setPurchaseBatchId(TString purchaseBatchId) {
    this.purchaseBatchId = purchaseBatchId;
  }
  
  public TString getUnloadPortId() {
    return this.unloadPortId;
  }
  public void setUnloadPortId(TString unloadPortId) {
    this.unloadPortId = unloadPortId;
  }
  
  public TString getTfe() {
    return this.tfe;
  }
  public void setTfe(TString tfe) {
    this.tfe = tfe;
  }
  
  public TString getSio2() {
    return this.sio2;
  }
  public void setSio2(TString sio2) {
    this.sio2 = sio2;
  }
  
  public TString getCao() {
    return this.cao;
  }
  public void setCao(TString cao) {
    this.cao = cao;
  }
  
  public TString getMgo() {
    return this.mgo;
  }
  public void setMgo(TString mgo) {
    this.mgo = mgo;
  }
  
  public TString getAl2o3() {
    return this.al2o3;
  }
  public void setAl2o3(TString al2o3) {
    this.al2o3 = al2o3;
  }
  
  public TString getSio2Al2o3() {
    return this.sio2Al2o3;
  }
  public void setSio2Al2o3(TString sio2Al2o3) {
    this.sio2Al2o3 = sio2Al2o3;
  }
  
  public TString getTio2() {
    return this.tio2;
  }
  public void setTio2(TString tio2) {
    this.tio2 = tio2;
  }
  
  public TString getK2o() {
    return this.k2o;
  }
  public void setK2o(TString k2o) {
    this.k2o = k2o;
  }
  
  public TString getNa2o() {
    return this.na2o;
  }
  public void setNa2o(TString na2o) {
    this.na2o = na2o;
  }
  
  public TString getZno() {
    return this.zno;
  }
  public void setZno(TString zno) {
    this.zno = zno;
  }
  
  public TString getAs() {
    return this.as;
  }
  public void setAs(TString as) {
    this.as = as;
  }
  
  public TString getPbo() {
    return this.pbo;
  }
  public void setPbo(TString pbo) {
    this.pbo = pbo;
  }
  
  public TString getCr() {
    return this.cr;
  }
  public void setCr(TString cr) {
    this.cr = cr;
  }
  
  public TString getNi() {
    return this.ni;
  }
  public void setNi(TString ni) {
    this.ni = ni;
  }
  
  public TString getCu() {
    return this.cu;
  }
  public void setCu(TString cu) {
    this.cu = cu;
  }
  
  public TString getMn() {
    return this.mn;
  }
  public void setMn(TString mn) {
    this.mn = mn;
  }
  
  public TString getH2o() {
    return this.h2o;
  }
  public void setH2o(TString h2o) {
    this.h2o = h2o;
  }
  
  public TString getFeo() {
    return this.feo;
  }
  public void setFeo(TString feo) {
    this.feo = feo;
  }
  
  public TString getP() {
    return this.p;
  }
  public void setP(TString p) {
    this.p = p;
  }
  
  public TString getS() {
    return this.s;
  }
  public void setS(TString s) {
    this.s = s;
  }
  
  public TString getBurnLose() {
    return this.burnLose;
  }
  public void setBurnLose(TString burnLose) {
    this.burnLose = burnLose;
  }
  
  public TString getWetWeight() {
    return this.wetWeight;
  }
  public void setWetWeight(TString wetWeight) {
    this.wetWeight = wetWeight;
  }
  
  public TString getGrainSize() {
    return this.grainSize;
  }
  public void setGrainSize(TString grainSize) {
    this.grainSize = grainSize;
  }
  
  public TString getRemark() {
    return this.remark;
  }
  public void setRemark(TString remark) {
    this.remark = remark;
  }
  
  public TString getArchived() {
    return this.archived;
  }
  public void setArchived(TString archived) {
    this.archived = archived;
  }
  
  public TDecimal getPortFee() {
    return this.portFee;
  }
  public void setPortFee(TDecimal portFee) {
    this.portFee = portFee;
  }
  
  public TDecimal getPortConstructionFee() {
    return this.portConstructionFee;
  }
  public void setPortConstructionFee(TDecimal portConstructionFee) {
    this.portConstructionFee = portConstructionFee;
  }
  
  public TDecimal getDetectFee() {
    return this.detectFee;
  }
  public void setDetectFee(TDecimal detectFee) {
    this.detectFee = detectFee;
  }
  
  public TDecimal getInspectionFee() {
    return this.inspectionFee;
  }
  public void setInspectionFee(TDecimal inspectionFee) {
    this.inspectionFee = inspectionFee;
  }
  
  public TDecimal getPortAgentFee() {
    return this.portAgentFee;
  }
  public void setPortAgentFee(TDecimal portAgentFee) {
    this.portAgentFee = portAgentFee;
  }
  
  public TDecimal getSampleFee() {
    return this.sampleFee;
  }
  public void setSampleFee(TDecimal sampleFee) {
    this.sampleFee = sampleFee;
  }
  
  public TDecimal getWaterGaugeFee() {
    return this.waterGaugeFee;
  }
  public void setWaterGaugeFee(TDecimal waterGaugeFee) {
    this.waterGaugeFee = waterGaugeFee;
  }
  
  public TDecimal getBoatFee() {
    return this.boatFee;
  }
  public void setBoatFee(TDecimal boatFee) {
    this.boatFee = boatFee;
  }
  
  public TDecimal getDeclareAgentFee() {
    return this.declareAgentFee;
  }
  public void setDeclareAgentFee(TDecimal declareAgentFee) {
    this.declareAgentFee = declareAgentFee;
  }
  
  public TDecimal getDeclareInspAgentFee() {
    return this.declareInspAgentFee;
  }
  public void setDeclareInspAgentFee(TDecimal declareInspAgentFee) {
    this.declareInspAgentFee = declareInspAgentFee;
  }
  
  public TString getDeclareCustomsAgent() {
    return this.declareCustomsAgent;
  }
  public void setDeclareCustomsAgent(TString declareCustomsAgent) {
    this.declareCustomsAgent = declareCustomsAgent;
  }
  
  public TString getFreightAgent() {
    return this.freightAgent;
  }
  public void setFreightAgent(TString freightAgent) {
    this.freightAgent = freightAgent;
  }
  
  public TString getFinalReceiver() {
    return this.finalReceiver;
  }
  public void setFinalReceiver(TString finalReceiver) {
    this.finalReceiver = finalReceiver;
  }
  
  public TString getFfb040t050pArchived() {
    return this.ffb040t050pArchived;
  }
  public void setFfb040t050pArchived(TString ffb040t050pArchived) {
    this.ffb040t050pArchived = ffb040t050pArchived;
  }
  
  public TDecimal getUnloadDelayDays() {
    return this.unloadDelayDays;
  }
  public void setUnloadDelayDays(TDecimal unloadDelayDays) {
    this.unloadDelayDays = unloadDelayDays;
  }
  
  public TDecimal getUnloadDelayFee() {
    return this.unloadDelayFee;
  }
  public void setUnloadDelayFee(TDecimal unloadDelayFee) {
    this.unloadDelayFee = unloadDelayFee;
  }
  
  public TString getUnloadDelayFeeUnit() {
    return this.unloadDelayFeeUnit;
  }
  public void setUnloadDelayFeeUnit(TString unloadDelayFeeUnit) {
    this.unloadDelayFeeUnit = unloadDelayFeeUnit;
  }
  
  public TDecimal getUnloadDelayFeeRate() {
    return this.unloadDelayFeeRate;
  }
  public void setUnloadDelayFeeRate(TDecimal unloadDelayFeeRate) {
    this.unloadDelayFeeRate = unloadDelayFeeRate;
  }
  
  public TDecimal getUnloadTransportAdjust() {
    return this.unloadTransportAdjust;
  }
  public void setUnloadTransportAdjust(TDecimal unloadTransportAdjust) {
    this.unloadTransportAdjust = unloadTransportAdjust;
  }
  
  public TString getUnloadTransportAdjustUnit() {
    return this.unloadTransportAdjustUnit;
  }
  public void setUnloadTransportAdjustUnit(TString unloadTransportAdjustUnit) {
    this.unloadTransportAdjustUnit = unloadTransportAdjustUnit;
  }
  
  public TDecimal getSpeedDelayFee() {
    return this.speedDelayFee;
  }
  public void setSpeedDelayFee(TDecimal speedDelayFee) {
    this.speedDelayFee = speedDelayFee;
  }
  
  public TString getSpeedDelayFeeUnit() {
    return this.speedDelayFeeUnit;
  }
  public void setSpeedDelayFeeUnit(TString speedDelayFeeUnit) {
    this.speedDelayFeeUnit = speedDelayFeeUnit;
  }
  
  public TString getShipAgent() {
    return this.shipAgent;
  }
  public void setShipAgent(TString shipAgent) {
    this.shipAgent = shipAgent;
  }
  
  public TString getFfb040t030pArchived() {
    return this.ffb040t030pArchived;
  }
  public void setFfb040t030pArchived(TString ffb040t030pArchived) {
    this.ffb040t030pArchived = ffb040t030pArchived;
  }
  
  public TString getGoodsAgent() {
    return this.goodsAgent;
  }
  public void setGoodsAgent(TString goodsAgent) {
    this.goodsAgent = goodsAgent;
  }
  
  public TString getDeclareCustomsCompany() {
    return this.declareCustomsCompany;
  }
  public void setDeclareCustomsCompany(TString declareCustomsCompany) {
    this.declareCustomsCompany = declareCustomsCompany;
  }
  
  public TDecimal getDepositFee() {
    return this.depositFee;
  }
  public void setDepositFee(TDecimal depositFee) {
    this.depositFee = depositFee;
  }
  
  public TString getDepositFeeUnit() {
    return this.depositFeeUnit;
  }
  public void setDepositFeeUnit(TString depositFeeUnit) {
    this.depositFeeUnit = depositFeeUnit;
  }
  
  public TString getDeclareCustoms() {
    return this.declareCustoms;
  }
  public void setDeclareCustoms(TString declareCustoms) {
    this.declareCustoms = declareCustoms;
  }
  
  public TDate getCustomsClearanceLastDate() {
    return this.customsClearanceLastDate;
  }
  public void setCustomsClearanceLastDate(TDate customsClearanceLastDate) {
    this.customsClearanceLastDate = customsClearanceLastDate;
  }
  
  public TDate getCustomsClearanceActualDate() {
    return this.customsClearanceActualDate;
  }
  public void setCustomsClearanceActualDate(TDate customsClearanceActualDate) {
    this.customsClearanceActualDate = customsClearanceActualDate;
  }
  
  public TString getSafeDeclar() {
    return this.safeDeclar;
  }
  public void setSafeDeclar(TString safeDeclar) {
    this.safeDeclar = safeDeclar;
  }
  
  public TDate getDeclareCustomsDate() {
    return this.declareCustomsDate;
  }
  public void setDeclareCustomsDate(TDate declareCustomsDate) {
    this.declareCustomsDate = declareCustomsDate;
  }
  
  public TString getDeclareCustomsBill() {
    return this.declareCustomsBill;
  }
  public void setDeclareCustomsBill(TString declareCustomsBill) {
    this.declareCustomsBill = declareCustomsBill;
  }
  
  public TString getCustomsClearanceState() {
    return this.customsClearanceState;
  }
  public void setCustomsClearanceState(TString customsClearanceState) {
    this.customsClearanceState = customsClearanceState;
  }
  
  public TDecimal getDeclareCustomsFee() {
    return this.declareCustomsFee;
  }
  public void setDeclareCustomsFee(TDecimal declareCustomsFee) {
    this.declareCustomsFee = declareCustomsFee;
  }
  
  public TString getDeclareCustomsFeeUnit() {
    return this.declareCustomsFeeUnit;
  }
  public void setDeclareCustomsFeeUnit(TString declareCustomsFeeUnit) {
    this.declareCustomsFeeUnit = declareCustomsFeeUnit;
  }
  
  public TString getLicenseNumber() {
    return this.licenseNumber;
  }
  public void setLicenseNumber(TString licenseNumber) {
    this.licenseNumber = licenseNumber;
  }
  
  public TDecimal getValueAddedTax() {
    return this.valueAddedTax;
  }
  public void setValueAddedTax(TDecimal valueAddedTax) {
    this.valueAddedTax = valueAddedTax;
  }
  
  public TString getValueAddedTaxUnit() {
    return this.valueAddedTaxUnit;
  }
  public void setValueAddedTaxUnit(TString valueAddedTaxUnit) {
    this.valueAddedTaxUnit = valueAddedTaxUnit;
  }
  
  public TDecimal getCustomsTaxEqualize() {
    return this.customsTaxEqualize;
  }
  public void setCustomsTaxEqualize(TDecimal customsTaxEqualize) {
    this.customsTaxEqualize = customsTaxEqualize;
  }
  
  public TString getCustomsTaxEqualizeUnit() {
    return this.customsTaxEqualizeUnit;
  }
  public void setCustomsTaxEqualizeUnit(TString customsTaxEqualizeUnit) {
    this.customsTaxEqualizeUnit = customsTaxEqualizeUnit;
  }
  
  public TString getFfb040t040pArchived() {
    return this.ffb040t040pArchived;
  }
  public void setFfb040t040pArchived(TString ffb040t040pArchived) {
    this.ffb040t040pArchived = ffb040t040pArchived;
  }
  
}