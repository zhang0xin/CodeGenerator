package com.ysusoft.POJO;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ysusoft.annotations.Comment;

@Entity 
@Table(name="ffb012t")
@Comment("审核记录")
@SuppressWarnings("serial")
public class Ffb012t extends Ffb012tAuto {
}