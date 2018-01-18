package com.ysusoft.POJO;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.ysusoft.annotations.Comment;

@SuppressWarnings("serial")
@MappedSuperclass
public class DepartmentAuto extends BaseEntity {
  
  @Comment("部门编码")
  @Column(name="fdepartment_id", length=30)
  private java.lang.String departmentId;
  
  @Comment("学生数")
  @Column(name="fstudent_count", precision=10)
  private java.lang.Long studentCount;
  
  @Comment("部门名称")
  @Column(name="fname", length=36)
  private java.lang.String name;
  
  @Comment("时间")
  @Column(name="fdt")
  private java.util.Date dt;
  

  public DepartmentAuto() {
  }

  
  public java.lang.String getDepartmentId() {
    return this.departmentId;
  }
  public void setDepartmentId(java.lang.String departmentId) {
    this.departmentId = departmentId;
  }
  
  public java.lang.Long getStudentCount() {
    return this.studentCount;
  }
  public void setStudentCount(java.lang.Long studentCount) {
    this.studentCount = studentCount;
  }
  
  public java.lang.String getName() {
    return this.name;
  }
  public void setName(java.lang.String name) {
    this.name = name;
  }
  
  public java.util.Date getDt() {
    return this.dt;
  }
  public void setDt(java.util.Date dt) {
    this.dt = dt;
  }
  
}