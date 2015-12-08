package com.cavassani.inventory.domain;


import java.math.BigDecimal;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@SuppressWarnings("serial")
public class CommodityHasInput extends GenericDomain {
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Commodity commodity;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private CarryInput carryInput;
	
	@Column(precision = 9, scale= 5, nullable = false)
	private BigDecimal amount;

	public Commodity getCommodity() {
		return commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	public CarryInput getCarryInput() {
		return carryInput;
	}

	public void setCarryInput(CarryInput carryInput) {
		this.carryInput = carryInput;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
