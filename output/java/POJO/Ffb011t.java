package com.ysusoft.POJO;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ysusoft.annotations.Comment;

@Entity 
@Table(name="ffb011t")
@Comment("审核关系")
@SuppressWarnings("serial")
public class Ffb011t extends Ffb011tAuto {
}