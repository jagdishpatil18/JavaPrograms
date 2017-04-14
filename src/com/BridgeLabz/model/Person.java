package com.BridgeLabz.model;

public class Person 
{
	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private long phoneno;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
//	@Override
//	public String toString() {
//		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", city=" + city
//				+ ", state=" + state + ", zipcode=" + zipcode + ", phoneno=" + phoneno + "]";
//	}
	
	@Override
	public String toString() {
		return firstname+"\t" + lastname +"\t\t"+ address + "\t\t"+ city +"\t\t"+ state +"\t\t"+ zipcode +"\t"+  phoneno + "\n";
	}
	
	

}
