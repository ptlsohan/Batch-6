package com.java;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/display")
public class display extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String fname= (String) request.getAttribute("fname");
		String lname= (String) request.getAttribute("lname");
		String password= (String) request.getAttribute("password");
		String gender= (String) request.getAttribute("gender");
		String[] skill= (String[]) request.getAttribute("skill");
		String city= (String) request.getAttribute("city");

		
		System.out.println(fname+" "+lname+" "+password+" "+gender+" "+city);
		
		for(String s: skill) {
			System.out.println(s);
		}
	
	
	
	}
}
