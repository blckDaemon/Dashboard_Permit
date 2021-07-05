package com.example.barGraph.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tm_state")
public class Stateno {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column
	private  String statecode;
	@Column
	private Integer countno;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStatecode() {
		return statecode;
	}
	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}
	public Integer getCountno() {
		return countno;
	}
	public void setCountno(Integer countno) {
		this.countno = countno;
	}
	@Override
	public String toString() {
		return "Stateno [id=" + id + ", statecode=" + statecode + ", countno=" + countno + "]";
	}
	

}