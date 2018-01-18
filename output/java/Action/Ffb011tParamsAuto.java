package com.ysusoft.Action.purchase;

import com.ysusoft.Action.BaseQueryParams;
import com.ysusoft.Action.StringQueryParameter;
import com.ysusoft.Action.DateQueryParameter;
import com.ysusoft.Action.LongQueryParameter;
import com.ysusoft.Action.DoubleQueryParameter;

public class Ffb011tParamsAuto extends BaseQueryParams {
  
  private StringQueryParameter f0 = new StringQueryParameter();
  
  private StringQueryParameter bizId = new StringQueryParameter();
  
  private StringQueryParameter whereId = new StringQueryParameter();
  
  private StringQueryParameter prevState = new StringQueryParameter();
  
  private StringQueryParameter nextOrder = new StringQueryParameter();
  
  private StringQueryParameter createBy = new StringQueryParameter();
  
  private DateQueryParameter createDate = new DateQueryParameter();
  
  private StringQueryParameter updateBy = new StringQueryParameter();
  
  private DateQueryParameter updateDate = new DateQueryParameter();
  
  private StringQueryParameter archived = new StringQueryParameter();
  
  
  
  public StringQueryParameter getF0() {
    return f0;
  }
  public void setF0(StringQueryParameter f0) {
    this.f0 = f0;
  }
  
  public StringQueryParameter getBizId() {
    return bizId;
  }
  public void setBizId(StringQueryParameter bizId) {
    this.bizId = bizId;
  }
  
  public StringQueryParameter getWhereId() {
    return whereId;
  }
  public void setWhereId(StringQueryParameter whereId) {
    this.whereId = whereId;
  }
  
  public StringQueryParameter getPrevState() {
    return prevState;
  }
  public void setPrevState(StringQueryParameter prevState) {
    this.prevState = prevState;
  }
  
  public StringQueryParameter getNextOrder() {
    return nextOrder;
  }
  public void setNextOrder(StringQueryParameter nextOrder) {
    this.nextOrder = nextOrder;
  }
  
  public StringQueryParameter getCreateBy() {
    return createBy;
  }
  public void setCreateBy(StringQueryParameter createBy) {
    this.createBy = createBy;
  }
  
  public DateQueryParameter getCreateDate() {
    return createDate;
  }
  public void setCreateDate(DateQueryParameter createDate) {
    this.createDate = createDate;
  }
  
  public StringQueryParameter getUpdateBy() {
    return updateBy;
  }
  public void setUpdateBy(StringQueryParameter updateBy) {
    this.updateBy = updateBy;
  }
  
  public DateQueryParameter getUpdateDate() {
    return updateDate;
  }
  public void setUpdateDate(DateQueryParameter updateDate) {
    this.updateDate = updateDate;
  }
  
  public StringQueryParameter getArchived() {
    return archived;
  }
  public void setArchived(StringQueryParameter archived) {
    this.archived = archived;
  }
  
}
