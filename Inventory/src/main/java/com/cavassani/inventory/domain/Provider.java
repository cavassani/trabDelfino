package com.cavassani.inventory.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@SuppressWarnings("serial")
public class Provider extends GenericDomain {
	
	@Column(length =128 , nullable = false)
	private String attendantName;
	
	@Column(length =255 , nullable = false)
	private String companyName;
	
	@Column(length =255 , nullable = false)
	private String fantasyName;
	
	@Column(length =14 , nullable = false, unique = true)
	private String cnpj;
	
	@Column(length =128 , nullable = false)
	private String city;
	
	@Column(length =128 , nullable = false)
	private String state;
	
	@Column(length =255 , nullable = false)
	private String street;
	
	@Column(length =10 , nullable = false)
	private String streetNumber;
	
	@Column(length = 9, nullable = false)
	private String zipCode;
	
	@Column(length =128 , nullable = false, unique = true)
	private String email;
	
	@Column(length =14, nullable = false)
	private String phone;
	
	@Column(length =20, nullable = false)
	private String fax;
	
	@Column(length =20, nullable = false)
	private String stateRegistration;

	public String getAttendantName() {
		return attendantName;
	}

	public void setAttendantName(String attendantName) {
		this.attendantName = attendantName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getFantasyName() {
		return fantasyName;
	}

	public void setFantasyName(String fantasyName) {
		this.fantasyName = fantasyName;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getStateRegistration() {
		return stateRegistration;
	}

	public void setStateRegistration(String stateRegistration) {
		this.stateRegistration = stateRegistration;
	}

}
