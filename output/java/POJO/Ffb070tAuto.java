package com.ysusoft.POJO;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.ysusoft.annotations.Comment;

@SuppressWarnings("serial")
@MappedSuperclass
public class Ffb070tAuto extends BaseEntity {
  
  @Comment("L/C号码")
  @Column(name="flc_number", length=30)
  private java.lang.String lcNumber;
  
  @Comment("船运批次")
  @Column(name="fship_batch_id", length=36)
  private java.lang.String shipBatchId;
  
  @Comment("开证性质")
  @Column(name="fissue_property", length=20)
  private java.lang.String issueProperty;
  
  @Comment("开证行")
  @Column(name="fissue_bank", length=60)
  private java.lang.String issueBank;
  
  @Comment("受益人")
  @Column(name="fbeneficiary", length=20)
  private java.lang.String beneficiary;
  
  @Comment("开证金额")
  @Column(name="fissue_amount")
  private java.lang.Double issueAmount;
  
  @Comment("开证金额币种")
  @Column(name="fissue_amount_unit", length=10)
  private java.lang.String issueAmountUnit;
  
  @Comment("开证单价")
  @Column(name="fissue_price")
  private java.lang.Double issuePrice;
  
  @Comment("开证单价币种")
  @Column(name="fissue_price_unit", length=10)
  private java.lang.String issuePriceUnit;
  
  @Comment("开证日期")
  @Column(name="fissue_date")
  private java.util.Date issueDate;
  
  @Comment("吨度价")
  @Column(name="fdry_ton_price", length=50)
  private java.lang.String dryTonPrice;
  
  @Comment("TFe")
  @Column(name="ftfe", length=50)
  private java.lang.String tfe;
  
  @Comment("FOB价")
  @Column(name="fpob_price", length=50)
  private java.lang.String pobPrice;
  
  @Comment("CFR价")
  @Column(name="fcfr_price", length=50)
  private java.lang.String cfrPrice;
  
  @Comment("吨矿海运费")
  @Column(name="fton_sea_fee_equalize")
  private java.lang.Double tonSeaFeeEqualize;
  
  @Comment("吨矿海运费币种")
  @Column(name="fton_sea_fee_equalize_unit", length=10)
  private java.lang.String tonSeaFeeEqualizeUnit;
  
  @Comment("计价月份")
  @Column(name="fvaluation_month", length=10)
  private java.lang.String valuationMonth;
  
  @Comment("海运费补偿")
  @Column(name="fsee_fee_equalize")
  private java.lang.Double seeFeeEqualize;
  
  @Comment("海运费补偿币种")
  @Column(name="fsee_fee_equalize_unit", length=10)
  private java.lang.String seeFeeEqualizeUnit;
  
  @Comment("佣金")
  @Column(name="fcommission")
  private java.lang.Double commission;
  
  @Comment("佣金币种")
  @Column(name="fcommission_unit", length=10)
  private java.lang.String commissionUnit;
  
  @Comment("开证吨数")
  @Column(name="fissue_ton")
  private java.lang.Double issueTon;
  
  @Comment("信用证效期日")
  @Column(name="fexpire_days")
  private java.util.Date expireDays;
  
  @Comment("展期期限/天")
  @Column(name="fextension_period", precision=10)
  private java.lang.Long extensionPeriod;
  
  @Comment("展期到期日")
  @Column(name="fextension_date")
  private java.util.Date extensionDate;
  
  @Comment("展期金额")
  @Column(name="fextension_amount")
  private java.lang.Double extensionAmount;
  
  @Comment("展期利率")
  @Column(name="fextension_rate")
  private java.lang.Double extensionRate;
  
  @Comment("展期利息")
  @Column(name="fextension_interest")
  private java.lang.Double extensionInterest;
  
  @Comment("展期执行单位")
  @Column(name="fextension_execute_unit", length=30)
  private java.lang.String extensionExecuteUnit;
  
  @Comment("备注")
  @Column(name="fremark", length=300)
  private java.lang.String remark;
  

  public Ffb070tAuto() {
  }

  
  public java.lang.String getLcNumber() {
    return this.lcNumber;
  }
  public void setLcNumber(java.lang.String lcNumber) {
    this.lcNumber = lcNumber;
  }
  
  public java.lang.String getShipBatchId() {
    return this.shipBatchId;
  }
  public void setShipBatchId(java.lang.String shipBatchId) {
    this.shipBatchId = shipBatchId;
  }
  
  public java.lang.String getIssueProperty() {
    return this.issueProperty;
  }
  public void setIssueProperty(java.lang.String issueProperty) {
    this.issueProperty = issueProperty;
  }
  
  public java.lang.String getIssueBank() {
    return this.issueBank;
  }
  public void setIssueBank(java.lang.String issueBank) {
    this.issueBank = issueBank;
  }
  
  public java.lang.String getBeneficiary() {
    return this.beneficiary;
  }
  public void setBeneficiary(java.lang.String beneficiary) {
    this.beneficiary = beneficiary;
  }
  
  public java.lang.Double getIssueAmount() {
    return this.issueAmount;
  }
  public void setIssueAmount(java.lang.Double issueAmount) {
    this.issueAmount = issueAmount;
  }
  
  public java.lang.String getIssueAmountUnit() {
    return this.issueAmountUnit;
  }
  public void setIssueAmountUnit(java.lang.String issueAmountUnit) {
    this.issueAmountUnit = issueAmountUnit;
  }
  
  public java.lang.Double getIssuePrice() {
    return this.issuePrice;
  }
  public void setIssuePrice(java.lang.Double issuePrice) {
    this.issuePrice = issuePrice;
  }
  
  public java.lang.String getIssuePriceUnit() {
    return this.issuePriceUnit;
  }
  public void setIssuePriceUnit(java.lang.String issuePriceUnit) {
    this.issuePriceUnit = issuePriceUnit;
  }
  
  public java.util.Date getIssueDate() {
    return this.issueDate;
  }
  public void setIssueDate(java.util.Date issueDate) {
    this.issueDate = issueDate;
  }
  
  public java.lang.String getDryTonPrice() {
    return this.dryTonPrice;
  }
  public void setDryTonPrice(java.lang.String dryTonPrice) {
    this.dryTonPrice = dryTonPrice;
  }
  
  public java.lang.String getTfe() {
    return this.tfe;
  }
  public void setTfe(java.lang.String tfe) {
    this.tfe = tfe;
  }
  
  public java.lang.String getPobPrice() {
    return this.pobPrice;
  }
  public void setPobPrice(java.lang.String pobPrice) {
    this.pobPrice = pobPrice;
  }
  
  public java.lang.String getCfrPrice() {
    return this.cfrPrice;
  }
  public void setCfrPrice(java.lang.String cfrPrice) {
    this.cfrPrice = cfrPrice;
  }
  
  public java.lang.Double getTonSeaFeeEqualize() {
    return this.tonSeaFeeEqualize;
  }
  public void setTonSeaFeeEqualize(java.lang.Double tonSeaFeeEqualize) {
    this.tonSeaFeeEqualize = tonSeaFeeEqualize;
  }
  
  public java.lang.String getTonSeaFeeEqualizeUnit() {
    return this.tonSeaFeeEqualizeUnit;
  }
  public void setTonSeaFeeEqualizeUnit(java.lang.String tonSeaFeeEqualizeUnit) {
    this.tonSeaFeeEqualizeUnit = tonSeaFeeEqualizeUnit;
  }
  
  public java.lang.String getValuationMonth() {
    return this.valuationMonth;
  }
  public void setValuationMonth(java.lang.String valuationMonth) {
    this.valuationMonth = valuationMonth;
  }
  
  public java.lang.Double getSeeFeeEqualize() {
    return this.seeFeeEqualize;
  }
  public void setSeeFeeEqualize(java.lang.Double seeFeeEqualize) {
    this.seeFeeEqualize = seeFeeEqualize;
  }
  
  public java.lang.String getSeeFeeEqualizeUnit() {
    return this.seeFeeEqualizeUnit;
  }
  public void setSeeFeeEqualizeUnit(java.lang.String seeFeeEqualizeUnit) {
    this.seeFeeEqualizeUnit = seeFeeEqualizeUnit;
  }
  
  public java.lang.Double getCommission() {
    return this.commission;
  }
  public void setCommission(java.lang.Double commission) {
    this.commission = commission;
  }
  
  public java.lang.String getCommissionUnit() {
    return this.commissionUnit;
  }
  public void setCommissionUnit(java.lang.String commissionUnit) {
    this.commissionUnit = commissionUnit;
  }
  
  public java.lang.Double getIssueTon() {
    return this.issueTon;
  }
  public void setIssueTon(java.lang.Double issueTon) {
    this.issueTon = issueTon;
  }
  
  public java.util.Date getExpireDays() {
    return this.expireDays;
  }
  public void setExpireDays(java.util.Date expireDays) {
    this.expireDays = expireDays;
  }
  
  public java.lang.Long getExtensionPeriod() {
    return this.extensionPeriod;
  }
  public void setExtensionPeriod(java.lang.Long extensionPeriod) {
    this.extensionPeriod = extensionPeriod;
  }
  
  public java.util.Date getExtensionDate() {
    return this.extensionDate;
  }
  public void setExtensionDate(java.util.Date extensionDate) {
    this.extensionDate = extensionDate;
  }
  
  public java.lang.Double getExtensionAmount() {
    return this.extensionAmount;
  }
  public void setExtensionAmount(java.lang.Double extensionAmount) {
    this.extensionAmount = extensionAmount;
  }
  
  public java.lang.Double getExtensionRate() {
    return this.extensionRate;
  }
  public void setExtensionRate(java.lang.Double extensionRate) {
    this.extensionRate = extensionRate;
  }
  
  public java.lang.Double getExtensionInterest() {
    return this.extensionInterest;
  }
  public void setExtensionInterest(java.lang.Double extensionInterest) {
    this.extensionInterest = extensionInterest;
  }
  
  public java.lang.String getExtensionExecuteUnit() {
    return this.extensionExecuteUnit;
  }
  public void setExtensionExecuteUnit(java.lang.String extensionExecuteUnit) {
    this.extensionExecuteUnit = extensionExecuteUnit;
  }
  
  public java.lang.String getRemark() {
    return this.remark;
  }
  public void setRemark(java.lang.String remark) {
    this.remark = remark;
  }
  
}