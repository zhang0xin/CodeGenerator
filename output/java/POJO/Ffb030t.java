package com.ysusoft.POJO;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ysusoft.annotations.Comment;

@Entity 
@Table(name="ffb030t")
@Comment("卸港")
@SuppressWarnings("serial")
public class Ffb030t extends Ffb030tAuto {
}