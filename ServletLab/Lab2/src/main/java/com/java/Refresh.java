package com.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/refresh")
public class Refresh extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
	
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		res.setIntHeader("Refresh", 5);
		writer.println(LocalDateTime.now());
	} 

}
