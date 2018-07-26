package com.cg.eis.bean;

import java.util.Comparator;

public class Employee {
	private static int n=0;
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	
	
	
	
	public Employee(String name, double salary, String designation) {
		super();
		n++;
		this.id=n;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	
	
	
	
}
