package com.cavassani.inventory.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Commodity extends GenericDomain {
	
	@Column(length = 250, nullable = false)
	private String commodityName;
	
	@Column( nullable = false)
	private String amountInventory;
	
	@Column( nullable = false)
	private String minimalAmount;
    

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public String getAmountInventory() {
		return amountInventory;
	}

	public void setAmountInventory(String amountInventory) {
		this.amountInventory = amountInventory;
	}

	public String getMinimalAmount() {
		return minimalAmount;
	}

	public void setMinimalAmount(String minimalAmount) {
		this.minimalAmount = minimalAmount;
	}

}
