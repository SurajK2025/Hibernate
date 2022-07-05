package com.tables;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Hiber2_Stds")
public class Students {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String fname;
	private String lname;
	
	@Embedded
	private Address ads;

	@Override
	public String toString() {
		return "Students [id=" + id + ", fname=" + fname + ", lname=" + lname + ", ads=" + ads + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Address getAds() {
		return ads;
	}

	public void setAds(Address ads) {
		this.ads = ads;
	}
}
