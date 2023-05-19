package com.mycompany.entities;

import java.io.Serializable;

public class Customer implements Serializable {
    private String name;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private String address;
    private String occupation;
    private String rKnow;
    private String nuisance;
    private String birth;
    private String register;

    public Customer(String name, String lastName, String emailAddress, String phoneNumber, String address, String occupation, String rKnow, String nuisance, String birth, String register) {
        this.name = name;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.occupation = occupation;
        this.rKnow = rKnow;
        this.nuisance = nuisance;
        this.birth = birth;
        this.register = register;
    }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmailAddress() {
	return emailAddress;
}
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getOccupation() {
	return occupation;
}
public void setOccupation(String occupation) {
	this.occupation = occupation;
}
public String getrKnow() {
	return rKnow;
}
public void setrKnow(String rKnow) {
	this.rKnow = rKnow;
}
public String getNuisance() {
	return nuisance;
}
public void setNuisance(String nuisance) {
	this.nuisance = nuisance;
}
public String getBirth() {
	return birth;
}
public void setBirth(String birth) {
	this.birth = birth;
}
public String getRegister() {
	return register;
}
public void setRegister(String register) {
	this.register = register;
}
 

}
