package com.ysusoft.POJO;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.ysusoft.annotations.Comment;

@SuppressWarnings("serial")
@MappedSuperclass
public class Ffb011tAuto extends BaseEntity {
  
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
  

  public Ffb011tAuto() {
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
  
}