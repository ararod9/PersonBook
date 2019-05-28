package com.Contact.Username.Domain;

import javax.persistence.*;

@Embeddable
public class Geo {


	@Column(name = "Geo_lat")
	private String lat;

	@Column(name = "Geo_lng")
	private String lng;

	public Geo() {
	}

	public Geo(String lat, String lng) {
		this.lat = lat;
		this.lng = lng;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	@Override
	public String toString() {
		return getLat()
				+ ","+ getLng();
	}
}
