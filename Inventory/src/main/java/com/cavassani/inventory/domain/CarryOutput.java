package com.cavassani.inventory.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity 
public class CarryOutput extends GenericDomain{
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date exitDate;

	public Date getExitDate() {
		return exitDate;
	}

	public void setExitDate(Date exitDate) {
		this.exitDate = exitDate;
	}
	
}
