package com.ysusoft.POJO;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ysusoft.annotations.Comment;

@Entity 
@Table(name="ffb060av")
@Comment("合同可见部门")
@SuppressWarnings("serial")
public class Ffb060av extends Ffb060avAuto {
}