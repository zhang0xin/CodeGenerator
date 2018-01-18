package com.ysusoft.POJO;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ysusoft.annotations.Comment;

@Entity 
@Table(name="student")
@Comment("学生")
@SuppressWarnings("serial")
public class Student extends StudentAuto {
}