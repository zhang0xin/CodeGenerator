package com.ysusoft.POJO;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.ysusoft.annotations.Comment;

@SuppressWarnings("serial")
@MappedSuperclass
public class Ffb050tAuto extends BaseEntity {
  
  @Comment("船编号")
  @Column(name="fship_number", length=36)
  private java.lang.String shipNumber;
  
  @Comment("船运公司")
  @Column(name="fship_company", length=30)
  private java.lang.String shipCompany;
  
  @Comment("船舶所属")
  @Column(name="fship_owner", length=30)
  private java.lang.String shipOwner;
  
  @Comment("英文船名")
  @Column(name="fship_name", length=30)
  private java.lang.String shipName;
  
  @Comment("中文船名")
  @Column(name="fship_chinese_name", length=30)
  private java.lang.String shipChineseName;
  

  public Ffb050tAuto() {
  }

  
  public java.lang.String getShipNumber() {
    return this.shipNumber;
  }
  public void setShipNumber(java.lang.String shipNumber) {
    this.shipNumber = shipNumber;
  }
  
  public java.lang.String getShipCompany() {
    return this.shipCompany;
  }
  public void setShipCompany(java.lang.String shipCompany) {
    this.shipCompany = shipCompany;
  }
  
  public java.lang.String getShipOwner() {
    return this.shipOwner;
  }
  public void setShipOwner(java.lang.String shipOwner) {
    this.shipOwner = shipOwner;
  }
  
  public java.lang.String getShipName() {
    return this.shipName;
  }
  public void setShipName(java.lang.String shipName) {
    this.shipName = shipName;
  }
  
  public java.lang.String getShipChineseName() {
    return this.shipChineseName;
  }
  public void setShipChineseName(java.lang.String shipChineseName) {
    this.shipChineseName = shipChineseName;
  }
  
}