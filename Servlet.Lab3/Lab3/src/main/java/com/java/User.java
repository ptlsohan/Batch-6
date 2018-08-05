package com.java;

import java.util.ArrayList;
import java.util.List;

public class User {
private String fname;
private String lname;
private String password;
private String gender;
private List<String> skill= new ArrayList<>();
private String city;
public User() {
	super();
	
}
public User(String fname, String lname, String password, String gender, List<String> skill, String city) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.password = password;
	this.gender = gender;
	this.skill.addAll(skill);
	this.city = city;
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}


public List<String> getSkill() {
	return skill;
}
public void setSkill(List<String> skill) {
	this.skill = skill;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}



}
