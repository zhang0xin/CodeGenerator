package com.ysusoft.POJO;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ysusoft.annotations.Comment;

@Entity 
@Table(name="ffb020av")
@Comment("船运可见部门")
@SuppressWarnings("serial")
public class Ffb020av extends Ffb020avAuto {
}