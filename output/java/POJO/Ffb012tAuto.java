package com.ysusoft.POJO;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.ysusoft.annotations.Comment;

@SuppressWarnings("serial")
@MappedSuperclass
public class Ffb012tAuto extends BaseEntity {
  
  @Comment("业务id")
  @Column(name="fbiz_id", length=36)
  private java.lang.String bizId;
  
  @Comment("审批序号")
  @Column(name="faudit_order", length=2)
  private java.lang.String auditOrder;
  
  @Comment("审批意见")
  @Column(name="faudit_suggestion", length=500)
  private java.lang.String auditSuggestion;
  
  @Comment("审批职务")
  @Column(name="faudit_duty", length=36)
  private java.lang.String auditDuty;
  
  @Comment("审批流程id")
  @Column(name="fflow_id", length=36)
  private java.lang.String flowId;
  
  @Comment("审批状态")
  @Column(name="faudit_pass", length=10)
  private java.lang.String auditPass;
  
  @Comment("审批人")
  @Column(name="faudit_man", length=36)
  private java.lang.String auditMan;
  
  @Comment("审批时间")
  @Column(name="faudit_date")
  private java.util.Date auditDate;
  

  public Ffb012tAuto() {
  }

  
  public java.lang.String getBizId() {
    return this.bizId;
  }
  public void setBizId(java.lang.String bizId) {
    this.bizId = bizId;
  }
  
  public java.lang.String getAuditOrder() {
    return this.auditOrder;
  }
  public void setAuditOrder(java.lang.String auditOrder) {
    this.auditOrder = auditOrder;
  }
  
  public java.lang.String getAuditSuggestion() {
    return this.auditSuggestion;
  }
  public void setAuditSuggestion(java.lang.String auditSuggestion) {
    this.auditSuggestion = auditSuggestion;
  }
  
  public java.lang.String getAuditDuty() {
    return this.auditDuty;
  }
  public void setAuditDuty(java.lang.String auditDuty) {
    this.auditDuty = auditDuty;
  }
  
  public java.lang.String getFlowId() {
    return this.flowId;
  }
  public void setFlowId(java.lang.String flowId) {
    this.flowId = flowId;
  }
  
  public java.lang.String getAuditPass() {
    return this.auditPass;
  }
  public void setAuditPass(java.lang.String auditPass) {
    this.auditPass = auditPass;
  }
  
  public java.lang.String getAuditMan() {
    return this.auditMan;
  }
  public void setAuditMan(java.lang.String auditMan) {
    this.auditMan = auditMan;
  }
  
  public java.util.Date getAuditDate() {
    return this.auditDate;
  }
  public void setAuditDate(java.util.Date auditDate) {
    this.auditDate = auditDate;
  }
  
}