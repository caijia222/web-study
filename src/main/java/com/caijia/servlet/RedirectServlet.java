package com.caijia.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/hi")
public class RedirectServlet extends HttpServlet {

	private static final long serialVersionUID = 6574127881422996843L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 302 临时重定向
		resp.sendRedirect("/hello");
		
		// 301 永久重定向
//		resp.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
//		resp.setHeader("Location", "/hello");
	}
}
