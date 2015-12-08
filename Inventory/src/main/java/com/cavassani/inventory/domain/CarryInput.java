package com.cavassani.inventory.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class CarryInput extends GenericDomain {
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Provider provider;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date entryDate; 

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	
	

}
