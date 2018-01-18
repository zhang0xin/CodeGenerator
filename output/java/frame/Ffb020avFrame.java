package com.ysusoft.frame.purchase;

import com.ysusoft.annotations.Comment;

@Comment("船运可见部门")
public class Ffb020avFrame<TLong, TDecimal, TString, TDate> extends BaseFrame {
  
  @Comment("船运批次")
  private TString shipBatchId;
  
  @Comment("可见部门")
  private TString visibleDepartment;
  

  public Ffb020avFrame() {
  }

  
  public TString getShipBatchId() {
    return this.shipBatchId;
  }
  public void setShipBatchId(TString shipBatchId) {
    this.shipBatchId = shipBatchId;
  }
  
  public TString getVisibleDepartment() {
    return this.visibleDepartment;
  }
  public void setVisibleDepartment(TString visibleDepartment) {
    this.visibleDepartment = visibleDepartment;
  }
  
}