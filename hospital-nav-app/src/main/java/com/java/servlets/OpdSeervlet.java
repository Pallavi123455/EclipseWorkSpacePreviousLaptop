package com.java.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OpdSeervlet
 */
public class OpdSeervlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		ServletContext context = this.getServletContext();

		ServletConfig config = this.getServletConfig();

		System.out.println("context params" + context.getInitParameterNames() + " -- "
				+ context.getInitParameter("cparam1") + " --  " + context.getInitParameter("cparam2"));

		System.out.println("config params" + config.getInitParameterNames() + " -- "
				+ config.getInitParameter("iparam1") + " --  " + config.getInitParameter("iparam2"));

	}

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OpdSeervlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/opd.jsp");
		rd.forward(request, response);

	}

}
