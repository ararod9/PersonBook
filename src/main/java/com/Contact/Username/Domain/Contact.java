package com.Contact.Username.Domain;

import javax.persistence.*;

@Entity
public class Contact {

	@Id
	@GeneratedValue
	@Column(name = "Contact_ID")
	private Long id;

	@Column(name = "Contact_name")
	private String name;

	@Column(name = "Contact_username")
	private String username;

	@Column(name = "Contact_email")
	private String email;


	@Column(name = "Contact_Address")
	@Embedded private Address address;

	@Column(name = "Contact_phone")
	private String phone;

	@Column(name = "Contact_website")
	private String website;

	@Column(name = "Contact_Company")
	@Embedded private Company company;

	public Contact() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return getId() + "," + getName() +
				"," + getUsername() +
				",'" + getEmail() +
				"," + getAddress() +
				"," + getPhone() +
				"," + getWebsite() +
				"," + getCompany();
	}
}
