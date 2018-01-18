package com.ysusoft.frame.purchase;

import com.ysusoft.annotations.Comment;

@Comment("审核关系")
public class Ffb011tFrame<TLong, TDecimal, TString, TDate> extends BaseFrame {
  
  @Comment("业务id")
  private TString bizId;
  
  @Comment("审批条件id")
  private TString whereId;
  
  @Comment("上级审批状态")
  private TString prevState;
  
  @Comment("下级审批序号")
  private TString nextOrder;
  
  @Comment("归档")
  private TString archived;
  

  public Ffb011tFrame() {
  }

  
  public TString getBizId() {
    return this.bizId;
  }
  public void setBizId(TString bizId) {
    this.bizId = bizId;
  }
  
  public TString getWhereId() {
    return this.whereId;
  }
  public void setWhereId(TString whereId) {
    this.whereId = whereId;
  }
  
  public TString getPrevState() {
    return this.prevState;
  }
  public void setPrevState(TString prevState) {
    this.prevState = prevState;
  }
  
  public TString getNextOrder() {
    return this.nextOrder;
  }
  public void setNextOrder(TString nextOrder) {
    this.nextOrder = nextOrder;
  }
  
  public TString getArchived() {
    return this.archived;
  }
  public void setArchived(TString archived) {
    this.archived = archived;
  }
  
}