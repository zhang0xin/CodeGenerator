package com.ysusoft.POJO;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.ysusoft.annotations.Comment;

@SuppressWarnings("serial")
@MappedSuperclass
public class Ffb020avAuto extends BaseEntity {
  
  @Comment("船运批次")
  @Column(name="fship_batch_id", length=36)
  private java.lang.String shipBatchId;
  
  @Comment("可见部门")
  @Column(name="fvisible_department", length=30)
  private java.lang.String visibleDepartment;
  

  public Ffb020avAuto() {
  }

  
  public java.lang.String getShipBatchId() {
    return this.shipBatchId;
  }
  public void setShipBatchId(java.lang.String shipBatchId) {
    this.shipBatchId = shipBatchId;
  }
  
  public java.lang.String getVisibleDepartment() {
    return this.visibleDepartment;
  }
  public void setVisibleDepartment(java.lang.String visibleDepartment) {
    this.visibleDepartment = visibleDepartment;
  }
  
}