package com.example.demo;

import javax.persistence.*;

@Entity
public class Address {
	@Id
	private long phone;
	private String addressString;

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Address [phone=" + phone + ", addressString=" + addressString + "]";
	}

	public String getAddressString() {
		return addressString;
	}

	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}

	public Address(long phone, String addressString) {
		super();
		this.phone = phone;
		this.addressString = addressString;
	}

}
