package com.Contact.Username.Domain;

import javax.persistence.*;

@Embeddable
public class Company {

	@Column(name = "Company_name")
	private String name;

	@Column(name = "Company_catchPhrase")
	private String catchPhrase;

	@Column(name = "Company_bs")
	private String bs;

	public Company() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBs() {
		return bs;
	}

	public void setBs(String bs) {
		this.bs = bs;
	}

	public String getCatchPhrase() {
		return catchPhrase;
	}

	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}

	@Override
	public String toString() {
		return getName()
				+ "," + catchPhrase
				+ "," + bs;
	}
}
