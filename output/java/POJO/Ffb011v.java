package com.ysusoft.POJO;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ysusoft.annotations.Comment;

@Entity 
@Table(name="ffb011v")
@Comment("采购申请")
@SuppressWarnings("serial")
public class Ffb011v extends Ffb011vAuto {
}