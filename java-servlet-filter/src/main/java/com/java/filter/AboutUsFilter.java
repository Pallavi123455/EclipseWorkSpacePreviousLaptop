package com.java.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class AboutUsFilter
 */
public class AboutUsFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AboutUsFilter() {
        // TODO Auto-generated constructor stub
    	System.out.println(this.getClass()+"--about-us.filter.constuctor");
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass()+"--about-us.filter.destroy");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println(this.getClass()+"--about-us.filter.doGet1");
		// pass the request along the filter chain
		chain.doFilter(request, response);
		System.out.println(this.getClass()+"--about-us.filter.doGet2");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println(this.getClass()+"--about-us.filter.init");
	}

}
