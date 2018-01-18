package com.ysusoft.frame.purchase;

import com.ysusoft.annotations.Comment;

@Comment("合同可见部门")
public class Ffb060avFrame<TLong, TDecimal, TString, TDate> extends BaseFrame {
  
  @Comment("合同号")
  private TString contractNumber;
  
  @Comment("可见部门")
  private TString visibleDepartment;
  

  public Ffb060avFrame() {
  }

  
  public TString getContractNumber() {
    return this.contractNumber;
  }
  public void setContractNumber(TString contractNumber) {
    this.contractNumber = contractNumber;
  }
  
  public TString getVisibleDepartment() {
    return this.visibleDepartment;
  }
  public void setVisibleDepartment(TString visibleDepartment) {
    this.visibleDepartment = visibleDepartment;
  }
  
}