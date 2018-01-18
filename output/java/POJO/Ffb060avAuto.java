package com.ysusoft.POJO;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.ysusoft.annotations.Comment;

@SuppressWarnings("serial")
@MappedSuperclass
public class Ffb060avAuto extends BaseEntity {
  
  @Comment("合同号")
  @Column(name="fcontract_number", length=36)
  private java.lang.String contractNumber;
  
  @Comment("可见部门")
  @Column(name="fvisible_department", length=30)
  private java.lang.String visibleDepartment;
  

  public Ffb060avAuto() {
  }

  
  public java.lang.String getContractNumber() {
    return this.contractNumber;
  }
  public void setContractNumber(java.lang.String contractNumber) {
    this.contractNumber = contractNumber;
  }
  
  public java.lang.String getVisibleDepartment() {
    return this.visibleDepartment;
  }
  public void setVisibleDepartment(java.lang.String visibleDepartment) {
    this.visibleDepartment = visibleDepartment;
  }
  
}