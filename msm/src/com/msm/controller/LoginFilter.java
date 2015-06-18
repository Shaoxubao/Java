package com.msm.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.msm.model.User;

public class LoginFilter implements Filter {

	@Override
	public void destroy() {

	}

	/**
	 * 过滤链的好处是，执行过程中任何时候都可以打断，
	 * 只要不执行chain.doFilter()就不会再执行后面的过滤器和请求的内容。
	 * 而在实际使用时，就要特别注意过滤链的执行顺序问题，
	 * 像EncodingFilter就一定要放在所有Filter之前，这样才能确保在使用请求中的数据前设置正确的编码。
	 */
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		// 将请求转换成HttpServletRequest 请求
		HttpServletRequest hsq = (HttpServletRequest) req;
		User u = (User) hsq.getSession().getAttribute("loginUser");
		if (null == u) {
			((HttpServletResponse) resp).sendRedirect(hsq.getContextPath()
					+ "/login");
		}
		chain.doFilter(req, resp);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

}
