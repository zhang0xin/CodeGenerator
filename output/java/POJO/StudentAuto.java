package com.ysusoft.POJO;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.ysusoft.annotations.Comment;

@SuppressWarnings("serial")
@MappedSuperclass
public class StudentAuto extends BaseEntity {
  
  @Comment("部门编码")
  @Column(name="fdepartment_id", length=30)
  private java.lang.String departmentId;
  
  @Comment("学生名称")
  @Column(name="fname", length=36)
  private java.lang.String name;
  
  @Comment("日期")
  @Column(name="fin_date")
  private java.util.Date inDate;
  

  public StudentAuto() {
  }

  
  public java.lang.String getDepartmentId() {
    return this.departmentId;
  }
  public void setDepartmentId(java.lang.String departmentId) {
    this.departmentId = departmentId;
  }
  
  public java.lang.String getName() {
    return this.name;
  }
  public void setName(java.lang.String name) {
    this.name = name;
  }
  
  public java.util.Date getInDate() {
    return this.inDate;
  }
  public void setInDate(java.util.Date inDate) {
    this.inDate = inDate;
  }
  
}