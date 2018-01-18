package com.ysusoft.POJO;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ysusoft.annotations.Comment;

@Entity 
@Table(name="ffb040t")
@Comment("品质")
@SuppressWarnings("serial")
public class Ffb040t extends Ffb040tAuto {
}