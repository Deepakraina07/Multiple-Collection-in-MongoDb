package com.samco.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CompareEmployee {

	@Id
	private int id;
	private String name;
	private String age;
	private String domain;
	private String address;
	private String city;
	private String pincode;
	
	public CompareEmployee() {
		super();
	}

	public CompareEmployee(int id, String name, String age, String domain, String address, String city,
			String pincode) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.domain = domain;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
