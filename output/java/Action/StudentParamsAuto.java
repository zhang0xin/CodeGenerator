package com.ysusoft.Action.purchase;

import com.ysusoft.Action.BaseQueryParams;
import com.ysusoft.Action.StringQueryParameter;
import com.ysusoft.Action.DateQueryParameter;
import com.ysusoft.Action.LongQueryParameter;
import com.ysusoft.Action.DoubleQueryParameter;

public class StudentParamsAuto extends BaseQueryParams {
  
  private StringQueryParameter f0 = new StringQueryParameter();
  
  private StringQueryParameter departmentId = new StringQueryParameter();
  
  private StringQueryParameter name = new StringQueryParameter();
  
  private DateQueryParameter inDate = new DateQueryParameter();
  
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
  
  public StringQueryParameter getDepartmentId() {
    return departmentId;
  }
  public void setDepartmentId(StringQueryParameter departmentId) {
    this.departmentId = departmentId;
  }
  
  public StringQueryParameter getName() {
    return name;
  }
  public void setName(StringQueryParameter name) {
    this.name = name;
  }
  
  public DateQueryParameter getInDate() {
    return inDate;
  }
  public void setInDate(DateQueryParameter inDate) {
    this.inDate = inDate;
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
