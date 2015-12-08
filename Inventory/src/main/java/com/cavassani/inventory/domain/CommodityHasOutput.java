package com.cavassani.inventory.domain;

import java.math.BigDecimal;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class CommodityHasOutput extends GenericDomain {
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Commodity commodity;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private CarryOutput carryOutput;
	
	@Column(precision = 9  , scale = 5, nullable = false)
	private BigDecimal amount;
	
	public Commodity getCommodity() {
		return commodity;
	}
	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}
	public CarryOutput getCarryOutput() {
		return carryOutput;
	}
	public void setCarryOutput(CarryOutput carryOutput) {
		this.carryOutput = carryOutput;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	
	


}
