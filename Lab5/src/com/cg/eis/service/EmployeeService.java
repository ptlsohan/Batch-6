package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {

	public String getDetail(Employee emp);
	public String findScheme(double s, String d);
	public void displayAllDetails(Employee emp);
}
