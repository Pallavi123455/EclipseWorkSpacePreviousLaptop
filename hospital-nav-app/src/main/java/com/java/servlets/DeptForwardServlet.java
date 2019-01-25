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
 * Servlet implementation class DeptForwardServlet
 */
public class DeptForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

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

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeptForwardServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = null;
		String pageName = "opd.jsp";

		String deptCode = request.getParameter("deptCode");
		switch (deptCode) {
		case "101":
			pageName = "neuro.jsp";
			break;
		case "102":
			pageName = "cardiac.jsp";
			break;
		case "103":
			pageName = "surgery.jsp";
			break;

		}

		rd = request.getRequestDispatcher("/WEB-INF/" + pageName);
		rd.forward(request, response);
	}

}
