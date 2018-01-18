package com.ysusoft.frame.purchase;

import com.ysusoft.annotations.Comment;

@Comment("合同")
public class Ffb060tFrame<TLong, TDecimal, TString, TDate> extends BaseFrame {
  
  @Comment("合同号")
  private TString contractNumber;
  
  @Comment("国内合同签订方")
  private TString contractSign;
  
  @Comment("合同性质")
  private TString contractNature;
  
  @Comment("合同量")
  private TDecimal contractQuantity;
  
  @Comment("合同金额")
  private TDecimal contractMoney;
  
  @Comment("合同金额币种")
  private TString contractMoneyUnit;
  
  @Comment("计量单位")
  private TString unit;
  
  @Comment("矿山")
  private TString mine;
  
  @Comment("物料名称")
  private TString materialId;
  
  @Comment("贸易类型")
  private TString tradeType;
  
  @Comment("北京采购定价模式")
  private TString purchasePriceMode;
  
  @Comment("北京销售定价模式")
  private TString salePriceMode;
  
  @Comment("卖方")
  private TString seller;
  
  @Comment("最终用户")
  private TString finalUser;
  
  @Comment("装期（始）")
  private TDate loadDateStart;
  
  @Comment("装期（终）")
  private TDate loadDateEnd;
  
  @Comment("合同执行完毕日")
  private TDate exerciseDate;
  
  @Comment("合同执行情况说明")
  private TString exerciseDescription;
  
  @Comment("签订日期")
  private TDate signDate;
  
  @Comment("归档")
  private TString archived;
  

  public Ffb060tFrame() {
  }

  
  public TString getContractNumber() {
    return this.contractNumber;
  }
  public void setContractNumber(TString contractNumber) {
    this.contractNumber = contractNumber;
  }
  
  public TString getContractSign() {
    return this.contractSign;
  }
  public void setContractSign(TString contractSign) {
    this.contractSign = contractSign;
  }
  
  public TString getContractNature() {
    return this.contractNature;
  }
  public void setContractNature(TString contractNature) {
    this.contractNature = contractNature;
  }
  
  public TDecimal getContractQuantity() {
    return this.contractQuantity;
  }
  public void setContractQuantity(TDecimal contractQuantity) {
    this.contractQuantity = contractQuantity;
  }
  
  public TDecimal getContractMoney() {
    return this.contractMoney;
  }
  public void setContractMoney(TDecimal contractMoney) {
    this.contractMoney = contractMoney;
  }
  
  public TString getContractMoneyUnit() {
    return this.contractMoneyUnit;
  }
  public void setContractMoneyUnit(TString contractMoneyUnit) {
    this.contractMoneyUnit = contractMoneyUnit;
  }
  
  public TString getUnit() {
    return this.unit;
  }
  public void setUnit(TString unit) {
    this.unit = unit;
  }
  
  public TString getMine() {
    return this.mine;
  }
  public void setMine(TString mine) {
    this.mine = mine;
  }
  
  public TString getMaterialId() {
    return this.materialId;
  }
  public void setMaterialId(TString materialId) {
    this.materialId = materialId;
  }
  
  public TString getTradeType() {
    return this.tradeType;
  }
  public void setTradeType(TString tradeType) {
    this.tradeType = tradeType;
  }
  
  public TString getPurchasePriceMode() {
    return this.purchasePriceMode;
  }
  public void setPurchasePriceMode(TString purchasePriceMode) {
    this.purchasePriceMode = purchasePriceMode;
  }
  
  public TString getSalePriceMode() {
    return this.salePriceMode;
  }
  public void setSalePriceMode(TString salePriceMode) {
    this.salePriceMode = salePriceMode;
  }
  
  public TString getSeller() {
    return this.seller;
  }
  public void setSeller(TString seller) {
    this.seller = seller;
  }
  
  public TString getFinalUser() {
    return this.finalUser;
  }
  public void setFinalUser(TString finalUser) {
    this.finalUser = finalUser;
  }
  
  public TDate getLoadDateStart() {
    return this.loadDateStart;
  }
  public void setLoadDateStart(TDate loadDateStart) {
    this.loadDateStart = loadDateStart;
  }
  
  public TDate getLoadDateEnd() {
    return this.loadDateEnd;
  }
  public void setLoadDateEnd(TDate loadDateEnd) {
    this.loadDateEnd = loadDateEnd;
  }
  
  public TDate getExerciseDate() {
    return this.exerciseDate;
  }
  public void setExerciseDate(TDate exerciseDate) {
    this.exerciseDate = exerciseDate;
  }
  
  public TString getExerciseDescription() {
    return this.exerciseDescription;
  }
  public void setExerciseDescription(TString exerciseDescription) {
    this.exerciseDescription = exerciseDescription;
  }
  
  public TDate getSignDate() {
    return this.signDate;
  }
  public void setSignDate(TDate signDate) {
    this.signDate = signDate;
  }
  
  public TString getArchived() {
    return this.archived;
  }
  public void setArchived(TString archived) {
    this.archived = archived;
  }
  
}