package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmpService implements EmployeeService {

	@Override
	public String getDetail(Employee emp) {
		
		String str = "Name: "+emp.getName()+"\n salary:"+emp.getSalary()+"\ndesignation: "+emp.getDesignation(); 
		return str;
	}

	@Override
	public String findScheme(double s,String d) {
		// TODO Auto-generated method stub
		if((s>5000 && s< 20000) && d.equalsIgnoreCase("System Associate" ))
			return "Scheme C";
		else if((s>=20000 && s<40000) && d.equalsIgnoreCase("Programmer"))
			return "Scheme B";
		else if(s>=40000 && d.equalsIgnoreCase("Manager"))
			return "Scheme C";
		else if(s<5000 && d.equalsIgnoreCase("Clerk"))
			return "No Scheme";
		
		return null;
	}

	@Override
	public void displayAllDetails(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("Id: "+emp.getId()+"\nName: "+emp.getName()+"\n salary:"+emp.getSalary()+"\ndesignation: "+emp.getDesignation()+"\nScheme: "+emp.getInsuranceScheme()); 

	}

}
