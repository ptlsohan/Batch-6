package com.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Lab2 extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
		res.setContentType("text/html");
		String name = req.getParameter("name");
		String pwd = req.getParameter("pwd");
		PrintWriter writer=res.getWriter();
		String mimeType=req.getHeader("Accept");
		String dataSize=req.getHeader("Content-Length");
		Locale locale = req.getLocale();
		//writer.println("<h5>MIME:  "+mimeType+"</h5>");
		//writer.println("<h5>Data in bytes "+dataSize+"</h5>");
		//writer.println("<h5>Locale "+locale+"</h5>");
		if(isValid(name,pwd)) {
			
			res.sendRedirect("success.html");
			
		}else {
			res.sendRedirect("failure.html");
		}
		
	
			
		
	}
	private boolean isValid(String name,String pwd) {
		if("admin".equals(name) && "password".equals(pwd)){
			return true;
			}
		else {
			return false;
		}
	}

}
