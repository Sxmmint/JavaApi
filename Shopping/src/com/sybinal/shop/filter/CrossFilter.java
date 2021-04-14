package com.sybinal.shop.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CrossFilter implements Filter {

	private boolean isCross = false;

	@Override
	public void destroy() {
		isCross = false;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("************************************************");
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		if (isCross) {
			System.out.println("拦截请求: " + req.getHeader("Origin"));
			System.out.println("---------------------------------------");
			res.setHeader("Access-Control-Allow-Origin", "*");
			res.setHeader("Access-Control-Allow-Credentials", "true");
			res.setHeader("Access-Control-Allow-Headers",
					"Accept,Accept-Encoding,Accept-Language,Connection,Content-Length,Content-Type, Cookie,Host,Origin,Referer,User-Agent, Authorization,X-Requested-With,OsType");
			res.setHeader("Access-Control-Allow-Methods", "POST,GET, HEAD,PUT, DELETE, TRACE, OPTIONS");
		}
		chain.doFilter(req, res);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		isCross = filterConfig.getInitParameter("IsCross").equals("true");
	}

}
