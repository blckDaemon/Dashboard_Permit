package com.example.barGraph.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tm_rto")
public class Rtono {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String Statecode;
    @Column
    private String Rtocode;
    @Column
    private Integer Rtocount;

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	public Integer getRtocount() {
		return Rtocount;
	}


	public void setRtocount(Integer rtocount) {
		Rtocount = rtocount;
	}


	@Override
	public String toString() {
		return "Rtono [id=" + id + ", Statecode=" + Statecode + ", Rtocode=" + Rtocode + ", Rtocount=" + Rtocount + "]";
	}



	

}
   