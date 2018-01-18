package com.ysusoft.frame.purchase;

import com.ysusoft.annotations.Comment;

@Comment("审核记录")
public class Ffb012tFrame<TLong, TDecimal, TString, TDate> extends BaseFrame {
  
  @Comment("业务id")
  private TString bizId;
  
  @Comment("审批序号")
  private TString auditOrder;
  
  @Comment("审批意见")
  private TString auditSuggestion;
  
  @Comment("审批职务")
  private TString auditDuty;
  
  @Comment("审批流程id")
  private TString flowId;
  
  @Comment("审批状态")
  private TString auditPass;
  
  @Comment("审批人")
  private TString auditMan;
  
  @Comment("审批时间")
  private TDate auditDate;
  
  @Comment("归档")
  private TString archived;
  

  public Ffb012tFrame() {
  }

  
  public TString getBizId() {
    return this.bizId;
  }
  public void setBizId(TString bizId) {
    this.bizId = bizId;
  }
  
  public TString getAuditOrder() {
    return this.auditOrder;
  }
  public void setAuditOrder(TString auditOrder) {
    this.auditOrder = auditOrder;
  }
  
  public TString getAuditSuggestion() {
    return this.auditSuggestion;
  }
  public void setAuditSuggestion(TString auditSuggestion) {
    this.auditSuggestion = auditSuggestion;
  }
  
  public TString getAuditDuty() {
    return this.auditDuty;
  }
  public void setAuditDuty(TString auditDuty) {
    this.auditDuty = auditDuty;
  }
  
  public TString getFlowId() {
    return this.flowId;
  }
  public void setFlowId(TString flowId) {
    this.flowId = flowId;
  }
  
  public TString getAuditPass() {
    return this.auditPass;
  }
  public void setAuditPass(TString auditPass) {
    this.auditPass = auditPass;
  }
  
  public TString getAuditMan() {
    return this.auditMan;
  }
  public void setAuditMan(TString auditMan) {
    this.auditMan = auditMan;
  }
  
  public TDate getAuditDate() {
    return this.auditDate;
  }
  public void setAuditDate(TDate auditDate) {
    this.auditDate = auditDate;
  }
  
  public TString getArchived() {
    return this.archived;
  }
  public void setArchived(TString archived) {
    this.archived = archived;
  }
  
}