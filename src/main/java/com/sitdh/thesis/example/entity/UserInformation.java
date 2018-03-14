package com.sitdh.thesis.example.entity;

public class UserInformation {
	
	private String name;
	
	private String lastname;
	
	private String taxId;

	public UserInformation(String name, String lastname, String taxId) {
		this.name = name;
		this.lastname = lastname;
		this.taxId = taxId;
	}

	public String getFullname() {
		// TODO Auto-generated method stub
		return String.format("%s %s", this.name, this.lastname);
	}

	public String getGeneralInformation() {
		return String.format("%s %s #%s", name, lastname, taxId);
	}

}
