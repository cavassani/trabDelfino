package com.cavassani.inventory.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SuppressWarnings("serial")
public class User extends GenericDomain {
	
	@Column(unique = true, nullable = false,length = 14 )
	private String cpf;
	
	@Column(length = 128, nullable = false)
	private String userName;
	
	@Column(length = 32, nullable = false)
	private String userPassword;
	
	@Column(length = 128, nullable = false)
	private String user;
	
	@Column(length = 128, nullable = false)
	private String post;
	
	@Column(length = 255, nullable = false)
	private String street;
	
	@Column(length =10 , nullable = false)
	private Integer houseNumber;
	
	@Column(length =20 , nullable = false)
	private Integer workingPapers;
	
	@Column(nullable=false)
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	@Column(length =14 , nullable = false)
	private Integer homePhone;
	
	@Column(length =14 , nullable = false)
	private Integer cellPhone;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(Integer houseNumber) {
		this.houseNumber = houseNumber;
	}

	public Integer getWorkingPapers() {
		return workingPapers;
	}

	public void setWorkingPapers(Integer workingPapers) {
		this.workingPapers = workingPapers;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(Integer homePhone) {
		this.homePhone = homePhone;
	}

	public Integer getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(Integer cellPhone) {
		this.cellPhone = cellPhone;
	}

}
