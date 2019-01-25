package com.monami.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	ServletContext context1;
	ServletConfig config1;
	public void init() throws ServletException
	{
		ServletContext con=this.getServletContext();
		ServletConfig config=this.getServletConfig();
				System.out.println("config params"+config.getInitParameterNames()+"  "+config.getInitParameter("iparam1")+"  "+config.getInitParameter("iparam2"));
		System.out.println("context params"+con.getInitParameterNames()+"  "+con.getInitParameter("cparam1")+"  "+con.getInitParameter("cparam2"));
		config1=config;
		context1=con;
	}
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		out.println("<h1>Home</h1>");
		out.println("config params"+config1.getInitParameterNames()+"  "+config1.getInitParameter("iparam1")+"  "+config1.getInitParameter("iparam2"));
		out.println("context params"+context1.getInitParameterNames()+"  "+context1.getInitParameter("cparam1")+"  "+context1.getInitParameter("cparam2"));
		}
	}


