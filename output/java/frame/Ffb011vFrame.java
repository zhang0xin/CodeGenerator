package com.ysusoft.frame.purchase;

import com.ysusoft.annotations.Comment;

@Comment("采购申请")
public class Ffb011vFrame<TLong, TDecimal, TString, TDate> extends BaseFrame {
  
  @Comment("业务id")
  private TString bizId;
  
  @Comment("审批条件id")
  private TString whereId;
  
  @Comment("上级审批状态")
  private TString prevState;
  
  @Comment("下级审批序号")
  private TString nextOrder;
  
  @Comment("采购批次")
  private TString purchaseBatchId;
  
  @Comment("贸易类型")
  private TString tradeType;
  
  @Comment("矿石产区")
  private TString oreArea;
  
  @Comment("物料名称")
  private TString materialId;
  
  @Comment("TFe")
  private TString tfe;
  
  @Comment("H2O")
  private TString h2o;
  
  @Comment("SiO2")
  private TString sio2;
  
  @Comment("Al2O3")
  private TString al2o3;
  
  @Comment("P")
  private TString p;
  
  @Comment("S")
  private TString s;
  
  @Comment("粒度")
  private TString other;
  
  @Comment("价格")
  private TString price;
  
  @Comment("采购量")
  private TDecimal purchaseQuantity;
  
  @Comment("单位")
  private TString unit;
  
  @Comment("装港日期")
  private TDate portLoadDate;
  
  @Comment("装港名称")
  private TString portLoadName;
  
  @Comment("到港日期")
  private TDate portArrivedDate;
  
  @Comment("到港名称")
  private TString portArrivedName;
  
  @Comment("买方（最终用户）")
  private TString buyer;
  
  @Comment("卖方（矿山/供应商）")
  private TString seller;
  
  @Comment("资源位置")
  private TString resourceLocation;
  
  @Comment("审批状态")
  private TString auditState;
  
  @Comment("可见部门")
  private TString visibleDepartment;
  
  @Comment("审批流程编码")
  private TString flowcd;
  
  @Comment("审批结束序号")
  private TString endorder;
  
  @Comment("审批职务f0")
  private TString checkpost;
  
  @Comment("审批职务名称")
  private TString cd_nm;
  
  @Comment("审批人f0")
  private TString checkuserid;
  
  @Comment("审批人姓名")
  private TString user_nm;
  

  public Ffb011vFrame() {
  }

  
  public TString getBizId() {
    return this.bizId;
  }
  public void setBizId(TString bizId) {
    this.bizId = bizId;
  }
  
  public TString getWhereId() {
    return this.whereId;
  }
  public void setWhereId(TString whereId) {
    this.whereId = whereId;
  }
  
  public TString getPrevState() {
    return this.prevState;
  }
  public void setPrevState(TString prevState) {
    this.prevState = prevState;
  }
  
  public TString getNextOrder() {
    return this.nextOrder;
  }
  public void setNextOrder(TString nextOrder) {
    this.nextOrder = nextOrder;
  }
  
  public TString getPurchaseBatchId() {
    return this.purchaseBatchId;
  }
  public void setPurchaseBatchId(TString purchaseBatchId) {
    this.purchaseBatchId = purchaseBatchId;
  }
  
  public TString getTradeType() {
    return this.tradeType;
  }
  public void setTradeType(TString tradeType) {
    this.tradeType = tradeType;
  }
  
  public TString getOreArea() {
    return this.oreArea;
  }
  public void setOreArea(TString oreArea) {
    this.oreArea = oreArea;
  }
  
  public TString getMaterialId() {
    return this.materialId;
  }
  public void setMaterialId(TString materialId) {
    this.materialId = materialId;
  }
  
  public TString getTfe() {
    return this.tfe;
  }
  public void setTfe(TString tfe) {
    this.tfe = tfe;
  }
  
  public TString getH2o() {
    return this.h2o;
  }
  public void setH2o(TString h2o) {
    this.h2o = h2o;
  }
  
  public TString getSio2() {
    return this.sio2;
  }
  public void setSio2(TString sio2) {
    this.sio2 = sio2;
  }
  
  public TString getAl2o3() {
    return this.al2o3;
  }
  public void setAl2o3(TString al2o3) {
    this.al2o3 = al2o3;
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
  
  public TString getOther() {
    return this.other;
  }
  public void setOther(TString other) {
    this.other = other;
  }
  
  public TString getPrice() {
    return this.price;
  }
  public void setPrice(TString price) {
    this.price = price;
  }
  
  public TDecimal getPurchaseQuantity() {
    return this.purchaseQuantity;
  }
  public void setPurchaseQuantity(TDecimal purchaseQuantity) {
    this.purchaseQuantity = purchaseQuantity;
  }
  
  public TString getUnit() {
    return this.unit;
  }
  public void setUnit(TString unit) {
    this.unit = unit;
  }
  
  public TDate getPortLoadDate() {
    return this.portLoadDate;
  }
  public void setPortLoadDate(TDate portLoadDate) {
    this.portLoadDate = portLoadDate;
  }
  
  public TString getPortLoadName() {
    return this.portLoadName;
  }
  public void setPortLoadName(TString portLoadName) {
    this.portLoadName = portLoadName;
  }
  
  public TDate getPortArrivedDate() {
    return this.portArrivedDate;
  }
  public void setPortArrivedDate(TDate portArrivedDate) {
    this.portArrivedDate = portArrivedDate;
  }
  
  public TString getPortArrivedName() {
    return this.portArrivedName;
  }
  public void setPortArrivedName(TString portArrivedName) {
    this.portArrivedName = portArrivedName;
  }
  
  public TString getBuyer() {
    return this.buyer;
  }
  public void setBuyer(TString buyer) {
    this.buyer = buyer;
  }
  
  public TString getSeller() {
    return this.seller;
  }
  public void setSeller(TString seller) {
    this.seller = seller;
  }
  
  public TString getResourceLocation() {
    return this.resourceLocation;
  }
  public void setResourceLocation(TString resourceLocation) {
    this.resourceLocation = resourceLocation;
  }
  
  public TString getAuditState() {
    return this.auditState;
  }
  public void setAuditState(TString auditState) {
    this.auditState = auditState;
  }
  
  public TString getVisibleDepartment() {
    return this.visibleDepartment;
  }
  public void setVisibleDepartment(TString visibleDepartment) {
    this.visibleDepartment = visibleDepartment;
  }
  
  public TString getFlowcd() {
    return this.flowcd;
  }
  public void setFlowcd(TString flowcd) {
    this.flowcd = flowcd;
  }
  
  public TString getEndorder() {
    return this.endorder;
  }
  public void setEndorder(TString endorder) {
    this.endorder = endorder;
  }
  
  public TString getCheckpost() {
    return this.checkpost;
  }
  public void setCheckpost(TString checkpost) {
    this.checkpost = checkpost;
  }
  
  public TString getCd_nm() {
    return this.cd_nm;
  }
  public void setCd_nm(TString cd_nm) {
    this.cd_nm = cd_nm;
  }
  
  public TString getCheckuserid() {
    return this.checkuserid;
  }
  public void setCheckuserid(TString checkuserid) {
    this.checkuserid = checkuserid;
  }
  
  public TString getUser_nm() {
    return this.user_nm;
  }
  public void setUser_nm(TString user_nm) {
    this.user_nm = user_nm;
  }
  
}