package com.ysusoft.frame.purchase;

import com.ysusoft.annotations.Comment;

@Comment("卸港")
public class Ffb030tFrame<TLong, TDecimal, TString, TDate> extends BaseFrame {
  
  @Comment("卸港批次")
  private TString unloadPortId;
  
  @Comment("卸港")
  private TString unloadPort;
  
  @Comment("船运批次")
  private TString shipBatchId;
  
  @Comment("NOR到港日")
  private TDate arrivedPortDate;
  
  @Comment("靠泊日")
  private TDate berthDate;
  
  @Comment("卸毕日")
  private TDate unloadedDate;
  
  @Comment("离港日")
  private TDate departPortDate;
  
  @Comment("最终收货人")
  private TString finalReceiver;
  
  @Comment("归档")
  private TString archived;
  

  public Ffb030tFrame() {
  }

  
  public TString getUnloadPortId() {
    return this.unloadPortId;
  }
  public void setUnloadPortId(TString unloadPortId) {
    this.unloadPortId = unloadPortId;
  }
  
  public TString getUnloadPort() {
    return this.unloadPort;
  }
  public void setUnloadPort(TString unloadPort) {
    this.unloadPort = unloadPort;
  }
  
  public TString getShipBatchId() {
    return this.shipBatchId;
  }
  public void setShipBatchId(TString shipBatchId) {
    this.shipBatchId = shipBatchId;
  }
  
  public TDate getArrivedPortDate() {
    return this.arrivedPortDate;
  }
  public void setArrivedPortDate(TDate arrivedPortDate) {
    this.arrivedPortDate = arrivedPortDate;
  }
  
  public TDate getBerthDate() {
    return this.berthDate;
  }
  public void setBerthDate(TDate berthDate) {
    this.berthDate = berthDate;
  }
  
  public TDate getUnloadedDate() {
    return this.unloadedDate;
  }
  public void setUnloadedDate(TDate unloadedDate) {
    this.unloadedDate = unloadedDate;
  }
  
  public TDate getDepartPortDate() {
    return this.departPortDate;
  }
  public void setDepartPortDate(TDate departPortDate) {
    this.departPortDate = departPortDate;
  }
  
  public TString getFinalReceiver() {
    return this.finalReceiver;
  }
  public void setFinalReceiver(TString finalReceiver) {
    this.finalReceiver = finalReceiver;
  }
  
  public TString getArchived() {
    return this.archived;
  }
  public void setArchived(TString archived) {
    this.archived = archived;
  }
  
}