package com.ysusoft.frame.purchase;

import com.ysusoft.annotations.Comment;

@Comment("部门")
public class DepartmentFrame<TLong, TDecimal, TString, TDate> extends BaseFrame {
  
  @Comment("部门编码")
  private TString departmentId;
  
  @Comment("学生数")
  private TLong studentCount;
  
  @Comment("部门名称")
  private TString name;
  
  @Comment("时间")
  private TDate dt;
  
  @Comment("归档")
  private TString archived;
  

  public DepartmentFrame() {
  }

  
  public TString getDepartmentId() {
    return this.departmentId;
  }
  public void setDepartmentId(TString departmentId) {
    this.departmentId = departmentId;
  }
  
  public TLong getStudentCount() {
    return this.studentCount;
  }
  public void setStudentCount(TLong studentCount) {
    this.studentCount = studentCount;
  }
  
  public TString getName() {
    return this.name;
  }
  public void setName(TString name) {
    this.name = name;
  }
  
  public TDate getDt() {
    return this.dt;
  }
  public void setDt(TDate dt) {
    this.dt = dt;
  }
  
  public TString getArchived() {
    return this.archived;
  }
  public void setArchived(TString archived) {
    this.archived = archived;
  }
  
}