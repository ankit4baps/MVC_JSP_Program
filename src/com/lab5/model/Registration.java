package com.lab5.model;

public class Registration {
	private String nm;
	private String add;
	private String gender;
	private String mob;
	private String emil;

	public Registration(String nm, String add, String gender, String mob, String emil) {
		// TODO Auto-generated constructor stub
		this.nm = nm;
		this.add = add;
		this.gender = gender;
		this.mob = mob;
		this.setEmil(emil);
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMno() {
		return mob;
	}

	public void setMno(String mob) {
		this.mob = mob;
	}

	public String getEmil() {
		return emil;
	}

	public void setEmil(String emil) {
		this.emil = emil;
	}

}
