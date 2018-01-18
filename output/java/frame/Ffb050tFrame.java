package com.ysusoft.frame.purchase;

import com.ysusoft.annotations.Comment;

@Comment("船舶")
public class Ffb050tFrame<TLong, TDecimal, TString, TDate> extends BaseFrame {
  
  @Comment("船编号")
  private TString shipNumber;
  
  @Comment("船运公司")
  private TString shipCompany;
  
  @Comment("船舶所属")
  private TString shipOwner;
  
  @Comment("英文船名")
  private TString shipName;
  
  @Comment("中文船名")
  private TString shipChineseName;
  
  @Comment("归档")
  private TString archived;
  

  public Ffb050tFrame() {
  }

  
  public TString getShipNumber() {
    return this.shipNumber;
  }
  public void setShipNumber(TString shipNumber) {
    this.shipNumber = shipNumber;
  }
  
  public TString getShipCompany() {
    return this.shipCompany;
  }
  public void setShipCompany(TString shipCompany) {
    this.shipCompany = shipCompany;
  }
  
  public TString getShipOwner() {
    return this.shipOwner;
  }
  public void setShipOwner(TString shipOwner) {
    this.shipOwner = shipOwner;
  }
  
  public TString getShipName() {
    return this.shipName;
  }
  public void setShipName(TString shipName) {
    this.shipName = shipName;
  }
  
  public TString getShipChineseName() {
    return this.shipChineseName;
  }
  public void setShipChineseName(TString shipChineseName) {
    this.shipChineseName = shipChineseName;
  }
  
  public TString getArchived() {
    return this.archived;
  }
  public void setArchived(TString archived) {
    this.archived = archived;
  }
  
}