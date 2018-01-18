package com.ysusoft.POJO;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.ysusoft.annotations.Comment;

@SuppressWarnings("serial")
@MappedSuperclass
public class Ffb011vAuto extends BaseEntity {
  
  @Comment("业务id")
  @Column(name="fbiz_id", length=36)
  private java.lang.String bizId;
  
  @Comment("审批条件id")
  @Column(name="fwhere_id", length=100)
  private java.lang.String whereId;
  
  @Comment("上级审批状态")
  @Column(name="fprev_state", length=10)
  private java.lang.String prevState;
  
  @Comment("下级审批序号")
  @Column(name="fnext_order", length=10)
  private java.lang.String nextOrder;
  
  @Comment("采购批次")
  @Column(name="fpurchase_batch_id", length=36)
  private java.lang.String purchaseBatchId;
  
  @Comment("贸易类型")
  @Column(name="ftrade_type", length=10)
  private java.lang.String tradeType;
  
  @Comment("矿石产区")
  @Column(name="fore_area", length=10)
  private java.lang.String oreArea;
  
  @Comment("物料名称")
  @Column(name="fmaterial_id", length=36)
  private java.lang.String materialId;
  
  @Comment("TFe")
  @Column(name="ftfe", length=20)
  private java.lang.String tfe;
  
  @Comment("H2O")
  @Column(name="fh2o", length=20)
  private java.lang.String h2o;
  
  @Comment("SiO2")
  @Column(name="fsio2", length=20)
  private java.lang.String sio2;
  
  @Comment("Al2O3")
  @Column(name="fal2o3", length=20)
  private java.lang.String al2o3;
  
  @Comment("P")
  @Column(name="fp", length=20)
  private java.lang.String p;
  
  @Comment("S")
  @Column(name="fs", length=20)
  private java.lang.String s;
  
  @Comment("粒度")
  @Column(name="fother", length=200)
  private java.lang.String other;
  
  @Comment("价格")
  @Column(name="fprice", length=50)
  private java.lang.String price;
  
  @Comment("采购量")
  @Column(name="fpurchase_quantity")
  private java.lang.Double purchaseQuantity;
  
  @Comment("单位")
  @Column(name="funit", length=10)
  private java.lang.String unit;
  
  @Comment("装港日期")
  @Column(name="fport_load_date")
  private java.util.Date portLoadDate;
  
  @Comment("装港名称")
  @Column(name="fport_load_name", length=30)
  private java.lang.String portLoadName;
  
  @Comment("到港日期")
  @Column(name="fport_arrived_date")
  private java.util.Date portArrivedDate;
  
  @Comment("到港名称")
  @Column(name="fport_arrived_name", length=30)
  private java.lang.String portArrivedName;
  
  @Comment("买方（最终用户）")
  @Column(name="fbuyer", length=30)
  private java.lang.String buyer;
  
  @Comment("卖方（矿山/供应商）")
  @Column(name="fseller", length=30)
  private java.lang.String seller;
  
  @Comment("资源位置")
  @Column(name="fresource_location", length=30)
  private java.lang.String resourceLocation;
  
  @Comment("审批状态")
  @Column(name="faudit_state", length=10)
  private java.lang.String auditState;
  
  @Comment("可见部门")
  @Column(name="fvisible_department", length=30)
  private java.lang.String visibleDepartment;
  
  @Comment("审批流程编码")
  @Column(name="fflowcd", length=36)
  private java.lang.String flowcd;
  
  @Comment("审批结束序号")
  @Column(name="fendorder", length=10)
  private java.lang.String endorder;
  
  @Comment("审批职务f0")
  @Column(name="fcheckpost", length=36)
  private java.lang.String checkpost;
  
  @Comment("审批职务名称")
  @Column(name="fcd_nm", length=80)
  private java.lang.String cd_nm;
  
  @Comment("审批人f0")
  @Column(name="fcheckuserid", length=36)
  private java.lang.String checkuserid;
  
  @Comment("审批人姓名")
  @Column(name="fuser_nm", length=50)
  private java.lang.String user_nm;
  

  public Ffb011vAuto() {
  }

  
  public java.lang.String getBizId() {
    return this.bizId;
  }
  public void setBizId(java.lang.String bizId) {
    this.bizId = bizId;
  }
  
  public java.lang.String getWhereId() {
    return this.whereId;
  }
  public void setWhereId(java.lang.String whereId) {
    this.whereId = whereId;
  }
  
  public java.lang.String getPrevState() {
    return this.prevState;
  }
  public void setPrevState(java.lang.String prevState) {
    this.prevState = prevState;
  }
  
  public java.lang.String getNextOrder() {
    return this.nextOrder;
  }
  public void setNextOrder(java.lang.String nextOrder) {
    this.nextOrder = nextOrder;
  }
  
  public java.lang.String getPurchaseBatchId() {
    return this.purchaseBatchId;
  }
  public void setPurchaseBatchId(java.lang.String purchaseBatchId) {
    this.purchaseBatchId = purchaseBatchId;
  }
  
  public java.lang.String getTradeType() {
    return this.tradeType;
  }
  public void setTradeType(java.lang.String tradeType) {
    this.tradeType = tradeType;
  }
  
  public java.lang.String getOreArea() {
    return this.oreArea;
  }
  public void setOreArea(java.lang.String oreArea) {
    this.oreArea = oreArea;
  }
  
  public java.lang.String getMaterialId() {
    return this.materialId;
  }
  public void setMaterialId(java.lang.String materialId) {
    this.materialId = materialId;
  }
  
  public java.lang.String getTfe() {
    return this.tfe;
  }
  public void setTfe(java.lang.String tfe) {
    this.tfe = tfe;
  }
  
  public java.lang.String getH2o() {
    return this.h2o;
  }
  public void setH2o(java.lang.String h2o) {
    this.h2o = h2o;
  }
  
  public java.lang.String getSio2() {
    return this.sio2;
  }
  public void setSio2(java.lang.String sio2) {
    this.sio2 = sio2;
  }
  
  public java.lang.String getAl2o3() {
    return this.al2o3;
  }
  public void setAl2o3(java.lang.String al2o3) {
    this.al2o3 = al2o3;
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
  
  public java.lang.String getOther() {
    return this.other;
  }
  public void setOther(java.lang.String other) {
    this.other = other;
  }
  
  public java.lang.String getPrice() {
    return this.price;
  }
  public void setPrice(java.lang.String price) {
    this.price = price;
  }
  
  public java.lang.Double getPurchaseQuantity() {
    return this.purchaseQuantity;
  }
  public void setPurchaseQuantity(java.lang.Double purchaseQuantity) {
    this.purchaseQuantity = purchaseQuantity;
  }
  
  public java.lang.String getUnit() {
    return this.unit;
  }
  public void setUnit(java.lang.String unit) {
    this.unit = unit;
  }
  
  public java.util.Date getPortLoadDate() {
    return this.portLoadDate;
  }
  public void setPortLoadDate(java.util.Date portLoadDate) {
    this.portLoadDate = portLoadDate;
  }
  
  public java.lang.String getPortLoadName() {
    return this.portLoadName;
  }
  public void setPortLoadName(java.lang.String portLoadName) {
    this.portLoadName = portLoadName;
  }
  
  public java.util.Date getPortArrivedDate() {
    return this.portArrivedDate;
  }
  public void setPortArrivedDate(java.util.Date portArrivedDate) {
    this.portArrivedDate = portArrivedDate;
  }
  
  public java.lang.String getPortArrivedName() {
    return this.portArrivedName;
  }
  public void setPortArrivedName(java.lang.String portArrivedName) {
    this.portArrivedName = portArrivedName;
  }
  
  public java.lang.String getBuyer() {
    return this.buyer;
  }
  public void setBuyer(java.lang.String buyer) {
    this.buyer = buyer;
  }
  
  public java.lang.String getSeller() {
    return this.seller;
  }
  public void setSeller(java.lang.String seller) {
    this.seller = seller;
  }
  
  public java.lang.String getResourceLocation() {
    return this.resourceLocation;
  }
  public void setResourceLocation(java.lang.String resourceLocation) {
    this.resourceLocation = resourceLocation;
  }
  
  public java.lang.String getAuditState() {
    return this.auditState;
  }
  public void setAuditState(java.lang.String auditState) {
    this.auditState = auditState;
  }
  
  public java.lang.String getVisibleDepartment() {
    return this.visibleDepartment;
  }
  public void setVisibleDepartment(java.lang.String visibleDepartment) {
    this.visibleDepartment = visibleDepartment;
  }
  
  public java.lang.String getFlowcd() {
    return this.flowcd;
  }
  public void setFlowcd(java.lang.String flowcd) {
    this.flowcd = flowcd;
  }
  
  public java.lang.String getEndorder() {
    return this.endorder;
  }
  public void setEndorder(java.lang.String endorder) {
    this.endorder = endorder;
  }
  
  public java.lang.String getCheckpost() {
    return this.checkpost;
  }
  public void setCheckpost(java.lang.String checkpost) {
    this.checkpost = checkpost;
  }
  
  public java.lang.String getCd_nm() {
    return this.cd_nm;
  }
  public void setCd_nm(java.lang.String cd_nm) {
    this.cd_nm = cd_nm;
  }
  
  public java.lang.String getCheckuserid() {
    return this.checkuserid;
  }
  public void setCheckuserid(java.lang.String checkuserid) {
    this.checkuserid = checkuserid;
  }
  
  public java.lang.String getUser_nm() {
    return this.user_nm;
  }
  public void setUser_nm(java.lang.String user_nm) {
    this.user_nm = user_nm;
  }
  
}