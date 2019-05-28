package com.Contact.Username.Domain;

import javax.persistence.*;

@Embeddable
public class Address {


	@Column(name = "Address_street")
	private String street;

	@Column(name = "Address_suite")
	private String suite;

	@Column(name = "Address_city")
	private String city;

	@Column(name = "Address_zipcode")
	private String zipcode;


	@Column(name = "Address_Geo")
	@Embedded private Geo geo;


	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Geo getGeo() {
		return geo;
	}

	public void setGeo(Geo geo) {
		this.geo = geo;
	}

	@Override
	public String toString() {
		return  getStreet()
				+ "," + getSuite()
				+ "," + getCity()
				+ "," + getZipcode()
				+ "," + getGeo();
	}
}
