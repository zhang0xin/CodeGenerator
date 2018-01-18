package com.ysusoft.POJO;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ysusoft.annotations.Comment;

@Entity 
@Table(name="ffb020t")
@Comment("船运批次")
@SuppressWarnings("serial")
public class Ffb020t extends Ffb020tAuto {
}