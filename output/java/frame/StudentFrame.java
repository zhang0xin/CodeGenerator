package com.ysusoft.frame.purchase;

import com.ysusoft.annotations.Comment;

@Comment("学生")
public class StudentFrame<TLong, TDecimal, TString, TDate> extends BaseFrame {
  
  @Comment("部门编码")
  private TString departmentId;
  
  @Comment("学生名称")
  private TString name;
  
  @Comment("日期")
  private TDate inDate;
  
  @Comment("归档")
  private TString archived;
  

  public StudentFrame() {
  }

  
  public TString getDepartmentId() {
    return this.departmentId;
  }
  public void setDepartmentId(TString departmentId) {
    this.departmentId = departmentId;
  }
  
  public TString getName() {
    return this.name;
  }
  public void setName(TString name) {
    this.name = name;
  }
  
  public TDate getInDate() {
    return this.inDate;
  }
  public void setInDate(TDate inDate) {
    this.inDate = inDate;
  }
  
  public TString getArchived() {
    return this.archived;
  }
  public void setArchived(TString archived) {
    this.archived = archived;
  }
  
}