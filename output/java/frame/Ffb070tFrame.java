package com.ysusoft.frame.purchase;

import com.ysusoft.annotations.Comment;

@Comment("信用证")
public class Ffb070tFrame<TLong, TDecimal, TString, TDate> extends BaseFrame {
  
  @Comment("L/C号码")
  private TString lcNumber;
  
  @Comment("船运批次")
  private TString shipBatchId;
  
  @Comment("开证性质")
  private TString issueProperty;
  
  @Comment("开证行")
  private TString issueBank;
  
  @Comment("受益人")
  private TString beneficiary;
  
  @Comment("开证金额")
  private TDecimal issueAmount;
  
  @Comment("开证金额币种")
  private TString issueAmountUnit;
  
  @Comment("开证单价")
  private TDecimal issuePrice;
  
  @Comment("开证单价币种")
  private TString issuePriceUnit;
  
  @Comment("开证日期")
  private TDate issueDate;
  
  @Comment("吨度价")
  private TString dryTonPrice;
  
  @Comment("TFe")
  private TString tfe;
  
  @Comment("FOB价")
  private TString pobPrice;
  
  @Comment("CFR价")
  private TString cfrPrice;
  
  @Comment("吨矿海运费")
  private TDecimal tonSeaFeeEqualize;
  
  @Comment("吨矿海运费币种")
  private TString tonSeaFeeEqualizeUnit;
  
  @Comment("计价月份")
  private TString valuationMonth;
  
  @Comment("海运费补偿")
  private TDecimal seeFeeEqualize;
  
  @Comment("海运费补偿币种")
  private TString seeFeeEqualizeUnit;
  
  @Comment("佣金")
  private TDecimal commission;
  
  @Comment("佣金币种")
  private TString commissionUnit;
  
  @Comment("开证吨数")
  private TDecimal issueTon;
  
  @Comment("信用证效期日")
  private TDate expireDays;
  
  @Comment("展期期限/天")
  private TLong extensionPeriod;
  
  @Comment("展期到期日")
  private TDate extensionDate;
  
  @Comment("展期金额")
  private TDecimal extensionAmount;
  
  @Comment("展期利率")
  private TDecimal extensionRate;
  
  @Comment("展期利息")
  private TDecimal extensionInterest;
  
  @Comment("展期执行单位")
  private TString extensionExecuteUnit;
  
  @Comment("备注")
  private TString remark;
  
  @Comment("归档")
  private TString archived;
  

  public Ffb070tFrame() {
  }

  
  public TString getLcNumber() {
    return this.lcNumber;
  }
  public void setLcNumber(TString lcNumber) {
    this.lcNumber = lcNumber;
  }
  
  public TString getShipBatchId() {
    return this.shipBatchId;
  }
  public void setShipBatchId(TString shipBatchId) {
    this.shipBatchId = shipBatchId;
  }
  
  public TString getIssueProperty() {
    return this.issueProperty;
  }
  public void setIssueProperty(TString issueProperty) {
    this.issueProperty = issueProperty;
  }
  
  public TString getIssueBank() {
    return this.issueBank;
  }
  public void setIssueBank(TString issueBank) {
    this.issueBank = issueBank;
  }
  
  public TString getBeneficiary() {
    return this.beneficiary;
  }
  public void setBeneficiary(TString beneficiary) {
    this.beneficiary = beneficiary;
  }
  
  public TDecimal getIssueAmount() {
    return this.issueAmount;
  }
  public void setIssueAmount(TDecimal issueAmount) {
    this.issueAmount = issueAmount;
  }
  
  public TString getIssueAmountUnit() {
    return this.issueAmountUnit;
  }
  public void setIssueAmountUnit(TString issueAmountUnit) {
    this.issueAmountUnit = issueAmountUnit;
  }
  
  public TDecimal getIssuePrice() {
    return this.issuePrice;
  }
  public void setIssuePrice(TDecimal issuePrice) {
    this.issuePrice = issuePrice;
  }
  
  public TString getIssuePriceUnit() {
    return this.issuePriceUnit;
  }
  public void setIssuePriceUnit(TString issuePriceUnit) {
    this.issuePriceUnit = issuePriceUnit;
  }
  
  public TDate getIssueDate() {
    return this.issueDate;
  }
  public void setIssueDate(TDate issueDate) {
    this.issueDate = issueDate;
  }
  
  public TString getDryTonPrice() {
    return this.dryTonPrice;
  }
  public void setDryTonPrice(TString dryTonPrice) {
    this.dryTonPrice = dryTonPrice;
  }
  
  public TString getTfe() {
    return this.tfe;
  }
  public void setTfe(TString tfe) {
    this.tfe = tfe;
  }
  
  public TString getPobPrice() {
    return this.pobPrice;
  }
  public void setPobPrice(TString pobPrice) {
    this.pobPrice = pobPrice;
  }
  
  public TString getCfrPrice() {
    return this.cfrPrice;
  }
  public void setCfrPrice(TString cfrPrice) {
    this.cfrPrice = cfrPrice;
  }
  
  public TDecimal getTonSeaFeeEqualize() {
    return this.tonSeaFeeEqualize;
  }
  public void setTonSeaFeeEqualize(TDecimal tonSeaFeeEqualize) {
    this.tonSeaFeeEqualize = tonSeaFeeEqualize;
  }
  
  public TString getTonSeaFeeEqualizeUnit() {
    return this.tonSeaFeeEqualizeUnit;
  }
  public void setTonSeaFeeEqualizeUnit(TString tonSeaFeeEqualizeUnit) {
    this.tonSeaFeeEqualizeUnit = tonSeaFeeEqualizeUnit;
  }
  
  public TString getValuationMonth() {
    return this.valuationMonth;
  }
  public void setValuationMonth(TString valuationMonth) {
    this.valuationMonth = valuationMonth;
  }
  
  public TDecimal getSeeFeeEqualize() {
    return this.seeFeeEqualize;
  }
  public void setSeeFeeEqualize(TDecimal seeFeeEqualize) {
    this.seeFeeEqualize = seeFeeEqualize;
  }
  
  public TString getSeeFeeEqualizeUnit() {
    return this.seeFeeEqualizeUnit;
  }
  public void setSeeFeeEqualizeUnit(TString seeFeeEqualizeUnit) {
    this.seeFeeEqualizeUnit = seeFeeEqualizeUnit;
  }
  
  public TDecimal getCommission() {
    return this.commission;
  }
  public void setCommission(TDecimal commission) {
    this.commission = commission;
  }
  
  public TString getCommissionUnit() {
    return this.commissionUnit;
  }
  public void setCommissionUnit(TString commissionUnit) {
    this.commissionUnit = commissionUnit;
  }
  
  public TDecimal getIssueTon() {
    return this.issueTon;
  }
  public void setIssueTon(TDecimal issueTon) {
    this.issueTon = issueTon;
  }
  
  public TDate getExpireDays() {
    return this.expireDays;
  }
  public void setExpireDays(TDate expireDays) {
    this.expireDays = expireDays;
  }
  
  public TLong getExtensionPeriod() {
    return this.extensionPeriod;
  }
  public void setExtensionPeriod(TLong extensionPeriod) {
    this.extensionPeriod = extensionPeriod;
  }
  
  public TDate getExtensionDate() {
    return this.extensionDate;
  }
  public void setExtensionDate(TDate extensionDate) {
    this.extensionDate = extensionDate;
  }
  
  public TDecimal getExtensionAmount() {
    return this.extensionAmount;
  }
  public void setExtensionAmount(TDecimal extensionAmount) {
    this.extensionAmount = extensionAmount;
  }
  
  public TDecimal getExtensionRate() {
    return this.extensionRate;
  }
  public void setExtensionRate(TDecimal extensionRate) {
    this.extensionRate = extensionRate;
  }
  
  public TDecimal getExtensionInterest() {
    return this.extensionInterest;
  }
  public void setExtensionInterest(TDecimal extensionInterest) {
    this.extensionInterest = extensionInterest;
  }
  
  public TString getExtensionExecuteUnit() {
    return this.extensionExecuteUnit;
  }
  public void setExtensionExecuteUnit(TString extensionExecuteUnit) {
    this.extensionExecuteUnit = extensionExecuteUnit;
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
  
}