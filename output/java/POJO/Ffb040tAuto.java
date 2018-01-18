package com.ysusoft.POJO;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.ysusoft.annotations.Comment;

@SuppressWarnings("serial")
@MappedSuperclass
public class Ffb040tAuto extends BaseEntity {
  
  @Comment("采购批次")
  @Column(name="fpurchase_batch_id", length=36)
  private java.lang.String purchaseBatchId;
  
  @Comment("卸港批次")
  @Column(name="funload_port_id", length=36)
  private java.lang.String unloadPortId;
  
  @Comment("TFe")
  @Column(name="ftfe", length=20)
  private java.lang.String tfe;
  
  @Comment("SiO2")
  @Column(name="fsio2", length=20)
  private java.lang.String sio2;
  
  @Comment("CaO")
  @Column(name="fcao", length=20)
  private java.lang.String cao;
  
  @Comment("MgO")
  @Column(name="fmgo", length=20)
  private java.lang.String mgo;
  
  @Comment("Al2O3")
  @Column(name="fal2o3", length=20)
  private java.lang.String al2o3;
  
  @Comment("SiO2+Al2O3")
  @Column(name="fsio2_al2o3", length=20)
  private java.lang.String sio2Al2o3;
  
  @Comment("TiO2")
  @Column(name="ftio2", length=20)
  private java.lang.String tio2;
  
  @Comment("K2O")
  @Column(name="fk2o", length=20)
  private java.lang.String k2o;
  
  @Comment("Na2O")
  @Column(name="fna2o", length=20)
  private java.lang.String na2o;
  
  @Comment("ZnO")
  @Column(name="fzno", length=20)
  private java.lang.String zno;
  
  @Comment("As")
  @Column(name="fas", length=20)
  private java.lang.String as;
  
  @Comment("PbO")
  @Column(name="fpbo", length=20)
  private java.lang.String pbo;
  
  @Comment("Cr")
  @Column(name="fcr", length=20)
  private java.lang.String cr;
  
  @Comment("Ni")
  @Column(name="fni", length=20)
  private java.lang.String ni;
  
  @Comment("Cu")
  @Column(name="fcu", length=20)
  private java.lang.String cu;
  
  @Comment("Mn")
  @Column(name="fmn", length=20)
  private java.lang.String mn;
  
  @Comment("H2O")
  @Column(name="fh2o", length=20)
  private java.lang.String h2o;
  
  @Comment("FeO")
  @Column(name="ffeo", length=20)
  private java.lang.String feo;
  
  @Comment("P")
  @Column(name="fp", length=20)
  private java.lang.String p;
  
  @Comment("S")
  @Column(name="fs", length=20)
  private java.lang.String s;
  
  @Comment("烧损")
  @Column(name="fburn_lose", length=20)
  private java.lang.String burnLose;
  
  @Comment("湿量")
  @Column(name="fwet_weight", length=20)
  private java.lang.String wetWeight;
  
  @Comment("粒度")
  @Column(name="fgrain_size", length=500)
  private java.lang.String grainSize;
  
  @Comment("备注")
  @Column(name="fremark", length=500)
  private java.lang.String remark;
  
  @Comment("港口费")
  @Column(name="fport_fee")
  private java.lang.Double portFee;
  
  @Comment("港口建设费")
  @Column(name="fport_construction_fee")
  private java.lang.Double portConstructionFee;
  
  @Comment("检测费")
  @Column(name="fdetect_fee")
  private java.lang.Double detectFee;
  
  @Comment("商检费")
  @Column(name="finspection_fee")
  private java.lang.Double inspectionFee;
  
  @Comment("港口代理费")
  @Column(name="fport_agent_fee")
  private java.lang.Double portAgentFee;
  
  @Comment("制取样费")
  @Column(name="fsample_fee")
  private java.lang.Double sampleFee;
  
  @Comment("水尺鉴定费")
  @Column(name="fwater_gauge_fee")
  private java.lang.Double waterGaugeFee;
  
  @Comment("小船费")
  @Column(name="fboat_fee")
  private java.lang.Double boatFee;
  
  @Comment("报关代理费")
  @Column(name="fdeclare_agent_fee")
  private java.lang.Double declareAgentFee;
  
  @Comment("报检代理费")
  @Column(name="fdeclare_insp_agent_fee")
  private java.lang.Double declareInspAgentFee;
  
  @Comment("报关代理")
  @Column(name="fdeclare_customs_agent", length=50)
  private java.lang.String declareCustomsAgent;
  
  @Comment("货运代理")
  @Column(name="ffreight_agent", length=50)
  private java.lang.String freightAgent;
  
  @Comment("最终收货人")
  @Column(name="ffinal_receiver", length=10)
  private java.lang.String finalReceiver;
  
  @Comment("归档")
  @Column(name="fffb040t050p_archived", length=10)
  private java.lang.String ffb040t050pArchived;
  
  @Comment("卸港滞期天数")
  @Column(name="funload_delay_days")
  private java.lang.Double unloadDelayDays;
  
  @Comment("卸港对卖方滞速费")
  @Column(name="funload_delay_fee")
  private java.lang.Double unloadDelayFee;
  
  @Comment("卸港对卖方滞速费币种")
  @Column(name="funload_delay_fee_unit", length=10)
  private java.lang.String unloadDelayFeeUnit;
  
  @Comment("卸港滞速费率")
  @Column(name="funload_delay_fee_rate")
  private java.lang.Double unloadDelayFeeRate;
  
  @Comment("CFR卸港运费调整")
  @Column(name="funload_transport_adjust")
  private java.lang.Double unloadTransportAdjust;
  
  @Comment("CFR卸港运费调整币种")
  @Column(name="funload_transport_adjust_unit", length=10)
  private java.lang.String unloadTransportAdjustUnit;
  
  @Comment("卸港与船公司滞速费")
  @Column(name="fspeed_delay_fee")
  private java.lang.Double speedDelayFee;
  
  @Comment("卸港与船公司滞速费币种")
  @Column(name="fspeed_delay_fee_unit", length=10)
  private java.lang.String speedDelayFeeUnit;
  
  @Comment("船代")
  @Column(name="fship_agent", length=30)
  private java.lang.String shipAgent;
  
  @Comment("归档")
  @Column(name="fffb040t030p_archived", length=10)
  private java.lang.String ffb040t030pArchived;
  
  @Comment("货代")
  @Column(name="fgoods_agent", length=30)
  private java.lang.String goodsAgent;
  
  @Comment("报关单位")
  @Column(name="fdeclare_customs_company", length=30)
  private java.lang.String declareCustomsCompany;
  
  @Comment("保证金")
  @Column(name="fdeposit_fee")
  private java.lang.Double depositFee;
  
  @Comment("保证金币种")
  @Column(name="fdeposit_fee_unit", length=10)
  private java.lang.String depositFeeUnit;
  
  @Comment("报关海关")
  @Column(name="fdeclare_customs", length=30)
  private java.lang.String declareCustoms;
  
  @Comment("最晚结关日")
  @Column(name="fcustoms_clearance_last_date")
  private java.util.Date customsClearanceLastDate;
  
  @Comment("实际结关日")
  @Column(name="fcustoms_clearance_actual_date")
  private java.util.Date customsClearanceActualDate;
  
  @Comment("外管局申报")
  @Column(name="fsafe_declar", length=30)
  private java.lang.String safeDeclar;
  
  @Comment("首次报关日期")
  @Column(name="fdeclare_customs_date")
  private java.util.Date declareCustomsDate;
  
  @Comment("报关单号")
  @Column(name="fdeclare_customs_bill", length=30)
  private java.lang.String declareCustomsBill;
  
  @Comment("结关状态")
  @Column(name="fcustoms_clearance_state", length=20)
  private java.lang.String customsClearanceState;
  
  @Comment("首次报关金额")
  @Column(name="fdeclare_customs_fee")
  private java.lang.Double declareCustomsFee;
  
  @Comment("首次报关金额币种")
  @Column(name="fdeclare_customs_fee_unit", length=10)
  private java.lang.String declareCustomsFeeUnit;
  
  @Comment("许可证号")
  @Column(name="flicense_number", length=30)
  private java.lang.String licenseNumber;
  
  @Comment("海关征收增值税")
  @Column(name="fvalue_added_tax")
  private java.lang.Double valueAddedTax;
  
  @Comment("海关征收增值税币种")
  @Column(name="fvalue_added_tax_unit", length=10)
  private java.lang.String valueAddedTaxUnit;
  
  @Comment("海关补税金额")
  @Column(name="fcustoms_tax_equalize")
  private java.lang.Double customsTaxEqualize;
  
  @Comment("海关补税金额币种")
  @Column(name="fcustoms_tax_equalize_unit", length=10)
  private java.lang.String customsTaxEqualizeUnit;
  
  @Comment("归档")
  @Column(name="fffb040t040p_archived", length=10)
  private java.lang.String ffb040t040pArchived;
  

  public Ffb040tAuto() {
  }

  
  public java.lang.String getPurchaseBatchId() {
    return this.purchaseBatchId;
  }
  public void setPurchaseBatchId(java.lang.String purchaseBatchId) {
    this.purchaseBatchId = purchaseBatchId;
  }
  
  public java.lang.String getUnloadPortId() {
    return this.unloadPortId;
  }
  public void setUnloadPortId(java.lang.String unloadPortId) {
    this.unloadPortId = unloadPortId;
  }
  
  public java.lang.String getTfe() {
    return this.tfe;
  }
  public void setTfe(java.lang.String tfe) {
    this.tfe = tfe;
  }
  
  public java.lang.String getSio2() {
    return this.sio2;
  }
  public void setSio2(java.lang.String sio2) {
    this.sio2 = sio2;
  }
  
  public java.lang.String getCao() {
    return this.cao;
  }
  public void setCao(java.lang.String cao) {
    this.cao = cao;
  }
  
  public java.lang.String getMgo() {
    return this.mgo;
  }
  public void setMgo(java.lang.String mgo) {
    this.mgo = mgo;
  }
  
  public java.lang.String getAl2o3() {
    return this.al2o3;
  }
  public void setAl2o3(java.lang.String al2o3) {
    this.al2o3 = al2o3;
  }
  
  public java.lang.String getSio2Al2o3() {
    return this.sio2Al2o3;
  }
  public void setSio2Al2o3(java.lang.String sio2Al2o3) {
    this.sio2Al2o3 = sio2Al2o3;
  }
  
  public java.lang.String getTio2() {
    return this.tio2;
  }
  public void setTio2(java.lang.String tio2) {
    this.tio2 = tio2;
  }
  
  public java.lang.String getK2o() {
    return this.k2o;
  }
  public void setK2o(java.lang.String k2o) {
    this.k2o = k2o;
  }
  
  public java.lang.String getNa2o() {
    return this.na2o;
  }
  public void setNa2o(java.lang.String na2o) {
    this.na2o = na2o;
  }
  
  public java.lang.String getZno() {
    return this.zno;
  }
  public void setZno(java.lang.String zno) {
    this.zno = zno;
  }
  
  public java.lang.String getAs() {
    return this.as;
  }
  public void setAs(java.lang.String as) {
    this.as = as;
  }
  
  public java.lang.String getPbo() {
    return this.pbo;
  }
  public void setPbo(java.lang.String pbo) {
    this.pbo = pbo;
  }
  
  public java.lang.String getCr() {
    return this.cr;
  }
  public void setCr(java.lang.String cr) {
    this.cr = cr;
  }
  
  public java.lang.String getNi() {
    return this.ni;
  }
  public void setNi(java.lang.String ni) {
    this.ni = ni;
  }
  
  public java.lang.String getCu() {
    return this.cu;
  }
  public void setCu(java.lang.String cu) {
    this.cu = cu;
  }
  
  public java.lang.String getMn() {
    return this.mn;
  }
  public void setMn(java.lang.String mn) {
    this.mn = mn;
  }
  
  public java.lang.String getH2o() {
    return this.h2o;
  }
  public void setH2o(java.lang.String h2o) {
    this.h2o = h2o;
  }
  
  public java.lang.String getFeo() {
    return this.feo;
  }
  public void setFeo(java.lang.String feo) {
    this.feo = feo;
  }
  
  public java.lang.String getP() {
    return this.p;
  }
  public void setP(java.lang.String p) {
    this.p = p;
  }
  
  public java.lang.String getS() {
    return this.s;
  }
  public void setS(java.lang.String s) {
    this.s = s;
  }
  
  public java.lang.String getBurnLose() {
    return this.burnLose;
  }
  public void setBurnLose(java.lang.String burnLose) {
    this.burnLose = burnLose;
  }
  
  public java.lang.String getWetWeight() {
    return this.wetWeight;
  }
  public void setWetWeight(java.lang.String wetWeight) {
    this.wetWeight = wetWeight;
  }
  
  public java.lang.String getGrainSize() {
    return this.grainSize;
  }
  public void setGrainSize(java.lang.String grainSize) {
    this.grainSize = grainSize;
  }
  
  public java.lang.String getRemark() {
    return this.remark;
  }
  public void setRemark(java.lang.String remark) {
    this.remark = remark;
  }
  
  public java.lang.Double getPortFee() {
    return this.portFee;
  }
  public void setPortFee(java.lang.Double portFee) {
    this.portFee = portFee;
  }
  
  public java.lang.Double getPortConstructionFee() {
    return this.portConstructionFee;
  }
  public void setPortConstructionFee(java.lang.Double portConstructionFee) {
    this.portConstructionFee = portConstructionFee;
  }
  
  public java.lang.Double getDetectFee() {
    return this.detectFee;
  }
  public void setDetectFee(java.lang.Double detectFee) {
    this.detectFee = detectFee;
  }
  
  public java.lang.Double getInspectionFee() {
    return this.inspectionFee;
  }
  public void setInspectionFee(java.lang.Double inspectionFee) {
    this.inspectionFee = inspectionFee;
  }
  
  public java.lang.Double getPortAgentFee() {
    return this.portAgentFee;
  }
  public void setPortAgentFee(java.lang.Double portAgentFee) {
    this.portAgentFee = portAgentFee;
  }
  
  public java.lang.Double getSampleFee() {
    return this.sampleFee;
  }
  public void setSampleFee(java.lang.Double sampleFee) {
    this.sampleFee = sampleFee;
  }
  
  public java.lang.Double getWaterGaugeFee() {
    return this.waterGaugeFee;
  }
  public void setWaterGaugeFee(java.lang.Double waterGaugeFee) {
    this.waterGaugeFee = waterGaugeFee;
  }
  
  public java.lang.Double getBoatFee() {
    return this.boatFee;
  }
  public void setBoatFee(java.lang.Double boatFee) {
    this.boatFee = boatFee;
  }
  
  public java.lang.Double getDeclareAgentFee() {
    return this.declareAgentFee;
  }
  public void setDeclareAgentFee(java.lang.Double declareAgentFee) {
    this.declareAgentFee = declareAgentFee;
  }
  
  public java.lang.Double getDeclareInspAgentFee() {
    return this.declareInspAgentFee;
  }
  public void setDeclareInspAgentFee(java.lang.Double declareInspAgentFee) {
    this.declareInspAgentFee = declareInspAgentFee;
  }
  
  public java.lang.String getDeclareCustomsAgent() {
    return this.declareCustomsAgent;
  }
  public void setDeclareCustomsAgent(java.lang.String declareCustomsAgent) {
    this.declareCustomsAgent = declareCustomsAgent;
  }
  
  public java.lang.String getFreightAgent() {
    return this.freightAgent;
  }
  public void setFreightAgent(java.lang.String freightAgent) {
    this.freightAgent = freightAgent;
  }
  
  public java.lang.String getFinalReceiver() {
    return this.finalReceiver;
  }
  public void setFinalReceiver(java.lang.String finalReceiver) {
    this.finalReceiver = finalReceiver;
  }
  
  public java.lang.String getFfb040t050pArchived() {
    return this.ffb040t050pArchived;
  }
  public void setFfb040t050pArchived(java.lang.String ffb040t050pArchived) {
    this.ffb040t050pArchived = ffb040t050pArchived;
  }
  
  public java.lang.Double getUnloadDelayDays() {
    return this.unloadDelayDays;
  }
  public void setUnloadDelayDays(java.lang.Double unloadDelayDays) {
    this.unloadDelayDays = unloadDelayDays;
  }
  
  public java.lang.Double getUnloadDelayFee() {
    return this.unloadDelayFee;
  }
  public void setUnloadDelayFee(java.lang.Double unloadDelayFee) {
    this.unloadDelayFee = unloadDelayFee;
  }
  
  public java.lang.String getUnloadDelayFeeUnit() {
    return this.unloadDelayFeeUnit;
  }
  public void setUnloadDelayFeeUnit(java.lang.String unloadDelayFeeUnit) {
    this.unloadDelayFeeUnit = unloadDelayFeeUnit;
  }
  
  public java.lang.Double getUnloadDelayFeeRate() {
    return this.unloadDelayFeeRate;
  }
  public void setUnloadDelayFeeRate(java.lang.Double unloadDelayFeeRate) {
    this.unloadDelayFeeRate = unloadDelayFeeRate;
  }
  
  public java.lang.Double getUnloadTransportAdjust() {
    return this.unloadTransportAdjust;
  }
  public void setUnloadTransportAdjust(java.lang.Double unloadTransportAdjust) {
    this.unloadTransportAdjust = unloadTransportAdjust;
  }
  
  public java.lang.String getUnloadTransportAdjustUnit() {
    return this.unloadTransportAdjustUnit;
  }
  public void setUnloadTransportAdjustUnit(java.lang.String unloadTransportAdjustUnit) {
    this.unloadTransportAdjustUnit = unloadTransportAdjustUnit;
  }
  
  public java.lang.Double getSpeedDelayFee() {
    return this.speedDelayFee;
  }
  public void setSpeedDelayFee(java.lang.Double speedDelayFee) {
    this.speedDelayFee = speedDelayFee;
  }
  
  public java.lang.String getSpeedDelayFeeUnit() {
    return this.speedDelayFeeUnit;
  }
  public void setSpeedDelayFeeUnit(java.lang.String speedDelayFeeUnit) {
    this.speedDelayFeeUnit = speedDelayFeeUnit;
  }
  
  public java.lang.String getShipAgent() {
    return this.shipAgent;
  }
  public void setShipAgent(java.lang.String shipAgent) {
    this.shipAgent = shipAgent;
  }
  
  public java.lang.String getFfb040t030pArchived() {
    return this.ffb040t030pArchived;
  }
  public void setFfb040t030pArchived(java.lang.String ffb040t030pArchived) {
    this.ffb040t030pArchived = ffb040t030pArchived;
  }
  
  public java.lang.String getGoodsAgent() {
    return this.goodsAgent;
  }
  public void setGoodsAgent(java.lang.String goodsAgent) {
    this.goodsAgent = goodsAgent;
  }
  
  public java.lang.String getDeclareCustomsCompany() {
    return this.declareCustomsCompany;
  }
  public void setDeclareCustomsCompany(java.lang.String declareCustomsCompany) {
    this.declareCustomsCompany = declareCustomsCompany;
  }
  
  public java.lang.Double getDepositFee() {
    return this.depositFee;
  }
  public void setDepositFee(java.lang.Double depositFee) {
    this.depositFee = depositFee;
  }
  
  public java.lang.String getDepositFeeUnit() {
    return this.depositFeeUnit;
  }
  public void setDepositFeeUnit(java.lang.String depositFeeUnit) {
    this.depositFeeUnit = depositFeeUnit;
  }
  
  public java.lang.String getDeclareCustoms() {
    return this.declareCustoms;
  }
  public void setDeclareCustoms(java.lang.String declareCustoms) {
    this.declareCustoms = declareCustoms;
  }
  
  public java.util.Date getCustomsClearanceLastDate() {
    return this.customsClearanceLastDate;
  }
  public void setCustomsClearanceLastDate(java.util.Date customsClearanceLastDate) {
    this.customsClearanceLastDate = customsClearanceLastDate;
  }
  
  public java.util.Date getCustomsClearanceActualDate() {
    return this.customsClearanceActualDate;
  }
  public void setCustomsClearanceActualDate(java.util.Date customsClearanceActualDate) {
    this.customsClearanceActualDate = customsClearanceActualDate;
  }
  
  public java.lang.String getSafeDeclar() {
    return this.safeDeclar;
  }
  public void setSafeDeclar(java.lang.String safeDeclar) {
    this.safeDeclar = safeDeclar;
  }
  
  public java.util.Date getDeclareCustomsDate() {
    return this.declareCustomsDate;
  }
  public void setDeclareCustomsDate(java.util.Date declareCustomsDate) {
    this.declareCustomsDate = declareCustomsDate;
  }
  
  public java.lang.String getDeclareCustomsBill() {
    return this.declareCustomsBill;
  }
  public void setDeclareCustomsBill(java.lang.String declareCustomsBill) {
    this.declareCustomsBill = declareCustomsBill;
  }
  
  public java.lang.String getCustomsClearanceState() {
    return this.customsClearanceState;
  }
  public void setCustomsClearanceState(java.lang.String customsClearanceState) {
    this.customsClearanceState = customsClearanceState;
  }
  
  public java.lang.Double getDeclareCustomsFee() {
    return this.declareCustomsFee;
  }
  public void setDeclareCustomsFee(java.lang.Double declareCustomsFee) {
    this.declareCustomsFee = declareCustomsFee;
  }
  
  public java.lang.String getDeclareCustomsFeeUnit() {
    return this.declareCustomsFeeUnit;
  }
  public void setDeclareCustomsFeeUnit(java.lang.String declareCustomsFeeUnit) {
    this.declareCustomsFeeUnit = declareCustomsFeeUnit;
  }
  
  public java.lang.String getLicenseNumber() {
    return this.licenseNumber;
  }
  public void setLicenseNumber(java.lang.String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }
  
  public java.lang.Double getValueAddedTax() {
    return this.valueAddedTax;
  }
  public void setValueAddedTax(java.lang.Double valueAddedTax) {
    this.valueAddedTax = valueAddedTax;
  }
  
  public java.lang.String getValueAddedTaxUnit() {
    return this.valueAddedTaxUnit;
  }
  public void setValueAddedTaxUnit(java.lang.String valueAddedTaxUnit) {
    this.valueAddedTaxUnit = valueAddedTaxUnit;
  }
  
  public java.lang.Double getCustomsTaxEqualize() {
    return this.customsTaxEqualize;
  }
  public void setCustomsTaxEqualize(java.lang.Double customsTaxEqualize) {
    this.customsTaxEqualize = customsTaxEqualize;
  }
  
  public java.lang.String getCustomsTaxEqualizeUnit() {
    return this.customsTaxEqualizeUnit;
  }
  public void setCustomsTaxEqualizeUnit(java.lang.String customsTaxEqualizeUnit) {
    this.customsTaxEqualizeUnit = customsTaxEqualizeUnit;
  }
  
  public java.lang.String getFfb040t040pArchived() {
    return this.ffb040t040pArchived;
  }
  public void setFfb040t040pArchived(java.lang.String ffb040t040pArchived) {
    this.ffb040t040pArchived = ffb040t040pArchived;
  }
  
}