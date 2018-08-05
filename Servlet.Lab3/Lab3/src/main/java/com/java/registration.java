package com.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/registration")
public class registration extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String fname= request.getParameter("first");
		String lname= request.getParameter("last");
		String password= request.getParameter("password");
		String gender= request.getParameter("gender");
		String[] skill= request.getParameterValues("skill");
		String city= request.getParameter("city");
		List<String> list =  Arrays.asList(skill);
		
		User user=new User(fname,lname,password,gender,list,city);
		
		
		request.setAttribute("fname", fname);
		request.setAttribute("lname", lname);
		request.setAttribute("password", password);
		request.setAttribute("gender", gender);
		request.setAttribute("skill", skill);
		request.setAttribute("city", city);
		
		try {
			request.getRequestDispatcher("display").forward(request, response);
		} catch (ServletException e) {
			
			e.printStackTrace();
		}
		

		
		//System.out.println(fname+" "+lname+" "+password+" "+gender+" "+skill+" "+city);
		
	}

}
