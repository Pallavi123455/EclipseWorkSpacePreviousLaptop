package com.monami.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Aservlett extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Aservlett() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		ServletConfig config = getServletConfig();
		String a = config.getInitParameter("a");
		String b = config.getInitParameter("b");
		String c = config.getInitParameter("c");

		// servlet context
		ServletContext context=getServletContext();
		ServletContext context1=getServletConfig().getServletContext();
		String v=context.getInitParameter("v");
		String vv1=config.getServletContext().getInitParameter("v");
		
		out.println("First Servlet Working <br/>");
		out.print("<br/>"+"Servlet Context: " + context);
		out.print("<br/>"+"Servlet Context1: " + context1);
		out.println("<br/>"+"Variable: "+v);
		out.println("<br/>"+"Variable1: "+vv1);
		
		// servlet config
		out.print("<br/>"+"Servlet Config: " + config);
		out.println("<br/>"+"a: " + a);
		out.println("<br/>"+"b: " + b);
		out.println("<br/>"+"c: " + c);

		out.close();
	}

}