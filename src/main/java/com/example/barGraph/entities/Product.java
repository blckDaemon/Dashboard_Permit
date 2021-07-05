package com.example.barGraph.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="vt_permitdetails")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long _id;
    private String Appno;
    private String Statecode;
    private String Rtocode;
    private String Transactype  ;
	public Long get_id() {
		return _id;
	}
	public void set_id(Long id) {
		this._id = id;
	}
	public String getAppno() {
		return Appno;
	}
	public void setAppno(String appno) {
		Appno = appno;
	}
	
	public String getStatecode() {
		return Statecode;
	}
	public void setStatecode(String statecode) {
		Statecode = statecode;
	}
	public String getRtocode() {
		return Rtocode;
	}
	public void setRtocode(String rtocode) {
		Rtocode = rtocode;
	}
	public String getTransactype() {
		return Transactype;
	}
	public void setTransactype(String transactype) {
		Transactype = transactype;
	}
	
	
}
   