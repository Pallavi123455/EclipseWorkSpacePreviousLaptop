package com.monami.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private String message;
    /**
     * @see HttpServlet#HttpServlet()
     */
	public void init() throws ServletException { 
	      // Do required initialization
	      message = "This is the Servlet page";
	      System.out.println("THis is init() method");
	   }
	public HelloWorld()
	{
		super();
		System.out.println("this is the constructor");
	}
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		doGet(req,resp);	
	}
	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
	      
	      // Set response content type
	      response.setContentType("text/html");

	      // Actual logic goes here.
	      PrintWriter out = response.getWriter();
	      out.println("<h1>" + message + "</h1>");
	      System.out.println("this is service() method");
	   }
	
	   //doubt
	   public void destroy() {
	      // do nothing.
	   }
	}


