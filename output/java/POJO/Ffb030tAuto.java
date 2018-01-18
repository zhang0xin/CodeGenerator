package com.ysusoft.POJO;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.ysusoft.annotations.Comment;

@SuppressWarnings("serial")
@MappedSuperclass
public class Ffb030tAuto extends BaseEntity {
  
  @Comment("卸港批次")
  @Column(name="funload_port_id", length=36)
  private java.lang.String unloadPortId;
  
  @Comment("卸港")
  @Column(name="funload_port", length=36)
  private java.lang.String unloadPort;
  
  @Comment("船运批次")
  @Column(name="fship_batch_id", length=36)
  private java.lang.String shipBatchId;
  
  @Comment("NOR到港日")
  @Column(name="farrived_port_date")
  private java.util.Date arrivedPortDate;
  
  @Comment("靠泊日")
  @Column(name="fberth_date")
  private java.util.Date berthDate;
  
  @Comment("卸毕日")
  @Column(name="funloaded_date")
  private java.util.Date unloadedDate;
  
  @Comment("离港日")
  @Column(name="fdepart_port_date")
  private java.util.Date departPortDate;
  
  @Comment("最终收货人")
  @Column(name="ffinal_receiver", length=10)
  private java.lang.String finalReceiver;
  

  public Ffb030tAuto() {
  }

  
  public java.lang.String getUnloadPortId() {
    return this.unloadPortId;
  }
  public void setUnloadPortId(java.lang.String unloadPortId) {
    this.unloadPortId = unloadPortId;
  }
  
  public java.lang.String getUnloadPort() {
    return this.unloadPort;
  }
  public void setUnloadPort(java.lang.String unloadPort) {
    this.unloadPort = unloadPort;
  }
  
  public java.lang.String getShipBatchId() {
    return this.shipBatchId;
  }
  public void setShipBatchId(java.lang.String shipBatchId) {
    this.shipBatchId = shipBatchId;
  }
  
  public java.util.Date getArrivedPortDate() {
    return this.arrivedPortDate;
  }
  public void setArrivedPortDate(java.util.Date arrivedPortDate) {
    this.arrivedPortDate = arrivedPortDate;
  }
  
  public java.util.Date getBerthDate() {
    return this.berthDate;
  }
  public void setBerthDate(java.util.Date berthDate) {
    this.berthDate = berthDate;
  }
  
  public java.util.Date getUnloadedDate() {
    return this.unloadedDate;
  }
  public void setUnloadedDate(java.util.Date unloadedDate) {
    this.unloadedDate = unloadedDate;
  }
  
  public java.util.Date getDepartPortDate() {
    return this.departPortDate;
  }
  public void setDepartPortDate(java.util.Date departPortDate) {
    this.departPortDate = departPortDate;
  }
  
  public java.lang.String getFinalReceiver() {
    return this.finalReceiver;
  }
  public void setFinalReceiver(java.lang.String finalReceiver) {
    this.finalReceiver = finalReceiver;
  }
  
}