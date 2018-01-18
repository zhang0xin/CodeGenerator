package com.ysusoft.POJO;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.ysusoft.annotations.Comment;

@SuppressWarnings("serial")
@MappedSuperclass
public class Ffb060tAuto extends BaseEntity {
  
  @Comment("合同号")
  @Column(name="fcontract_number", length=36)
  private java.lang.String contractNumber;
  
  @Comment("国内合同签订方")
  @Column(name="fcontract_sign", length=36)
  private java.lang.String contractSign;
  
  @Comment("合同性质")
  @Column(name="fcontract_nature", length=20)
  private java.lang.String contractNature;
  
  @Comment("合同量")
  @Column(name="fcontract_quantity")
  private java.lang.Double contractQuantity;
  
  @Comment("合同金额")
  @Column(name="fcontract_money")
  private java.lang.Double contractMoney;
  
  @Comment("合同金额币种")
  @Column(name="fcontract_money_unit", length=10)
  private java.lang.String contractMoneyUnit;
  
  @Comment("计量单位")
  @Column(name="funit", length=10)
  private java.lang.String unit;
  
  @Comment("矿山")
  @Column(name="fmine", length=36)
  private java.lang.String mine;
  
  @Comment("物料名称")
  @Column(name="fmaterial_id", length=36)
  private java.lang.String materialId;
  
  @Comment("贸易类型")
  @Column(name="ftrade_type", length=20)
  private java.lang.String tradeType;
  
  @Comment("北京采购定价模式")
  @Column(name="fpurchase_price_mode", length=20)
  private java.lang.String purchasePriceMode;
  
  @Comment("北京销售定价模式")
  @Column(name="fsale_price_mode", length=20)
  private java.lang.String salePriceMode;
  
  @Comment("卖方")
  @Column(name="fseller", length=30)
  private java.lang.String seller;
  
  @Comment("最终用户")
  @Column(name="ffinal_user", length=30)
  private java.lang.String finalUser;
  
  @Comment("装期（始）")
  @Column(name="fload_date_start")
  private java.util.Date loadDateStart;
  
  @Comment("装期（终）")
  @Column(name="fload_date_end")
  private java.util.Date loadDateEnd;
  
  @Comment("合同执行完毕日")
  @Column(name="fexercise_date")
  private java.util.Date exerciseDate;
  
  @Comment("合同执行情况说明")
  @Column(name="fexercise_description", length=300)
  private java.lang.String exerciseDescription;
  
  @Comment("签订日期")
  @Column(name="fsign_date")
  private java.util.Date signDate;
  

  public Ffb060tAuto() {
  }

  
  public java.lang.String getContractNumber() {
    return this.contractNumber;
  }
  public void setContractNumber(java.lang.String contractNumber) {
    this.contractNumber = contractNumber;
  }
  
  public java.lang.String getContractSign() {
    return this.contractSign;
  }
  public void setContractSign(java.lang.String contractSign) {
    this.contractSign = contractSign;
  }
  
  public java.lang.String getContractNature() {
    return this.contractNature;
  }
  public void setContractNature(java.lang.String contractNature) {
    this.contractNature = contractNature;
  }
  
  public java.lang.Double getContractQuantity() {
    return this.contractQuantity;
  }
  public void setContractQuantity(java.lang.Double contractQuantity) {
    this.contractQuantity = contractQuantity;
  }
  
  public java.lang.Double getContractMoney() {
    return this.contractMoney;
  }
  public void setContractMoney(java.lang.Double contractMoney) {
    this.contractMoney = contractMoney;
  }
  
  public java.lang.String getContractMoneyUnit() {
    return this.contractMoneyUnit;
  }
  public void setContractMoneyUnit(java.lang.String contractMoneyUnit) {
    this.contractMoneyUnit = contractMoneyUnit;
  }
  
  public java.lang.String getUnit() {
    return this.unit;
  }
  public void setUnit(java.lang.String unit) {
    this.unit = unit;
  }
  
  public java.lang.String getMine() {
    return this.mine;
  }
  public void setMine(java.lang.String mine) {
    this.mine = mine;
  }
  
  public java.lang.String getMaterialId() {
    return this.materialId;
  }
  public void setMaterialId(java.lang.String materialId) {
    this.materialId = materialId;
  }
  
  public java.lang.String getTradeType() {
    return this.tradeType;
  }
  public void setTradeType(java.lang.String tradeType) {
    this.tradeType = tradeType;
  }
  
  public java.lang.String getPurchasePriceMode() {
    return this.purchasePriceMode;
  }
  public void setPurchasePriceMode(java.lang.String purchasePriceMode) {
    this.purchasePriceMode = purchasePriceMode;
  }
  
  public java.lang.String getSalePriceMode() {
    return this.salePriceMode;
  }
  public void setSalePriceMode(java.lang.String salePriceMode) {
    this.salePriceMode = salePriceMode;
  }
  
  public java.lang.String getSeller() {
    return this.seller;
  }
  public void setSeller(java.lang.String seller) {
    this.seller = seller;
  }
  
  public java.lang.String getFinalUser() {
    return this.finalUser;
  }
  public void setFinalUser(java.lang.String finalUser) {
    this.finalUser = finalUser;
  }
  
  public java.util.Date getLoadDateStart() {
    return this.loadDateStart;
  }
  public void setLoadDateStart(java.util.Date loadDateStart) {
    this.loadDateStart = loadDateStart;
  }
  
  public java.util.Date getLoadDateEnd() {
    return this.loadDateEnd;
  }
  public void setLoadDateEnd(java.util.Date loadDateEnd) {
    this.loadDateEnd = loadDateEnd;
  }
  
  public java.util.Date getExerciseDate() {
    return this.exerciseDate;
  }
  public void setExerciseDate(java.util.Date exerciseDate) {
    this.exerciseDate = exerciseDate;
  }
  
  public java.lang.String getExerciseDescription() {
    return this.exerciseDescription;
  }
  public void setExerciseDescription(java.lang.String exerciseDescription) {
    this.exerciseDescription = exerciseDescription;
  }
  
  public java.util.Date getSignDate() {
    return this.signDate;
  }
  public void setSignDate(java.util.Date signDate) {
    this.signDate = signDate;
  }
  
}