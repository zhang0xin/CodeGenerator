package com.ysusoft.POJO;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ysusoft.annotations.Comment;

@Entity 
@Table(name="ffb050t")
@Comment("船舶")
@SuppressWarnings("serial")
public class Ffb050t extends Ffb050tAuto {
}