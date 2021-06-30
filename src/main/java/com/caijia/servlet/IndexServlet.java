package com.caijia.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/")
public class IndexServlet extends HttpServlet {

	private static final long serialVersionUID = -7944807696322295029L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String lang = parseLanguageFromCookie(req);
		String user = (String) req.getSession().getAttribute("user");
		resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        resp.setHeader("X-Powered-By", "JavaEE Servlet");
        PrintWriter pw = resp.getWriter();
        if(lang.equals("zh")) {
        	pw.write("<h1>你好, " + (user != null ? user : "Guest") + "</h1>");
        	if(user == null) {
        		pw.write("<p><a href=\"/signin\">登录</p>");
        	}else {
        		pw.write("<p><a href=\"/signout\">登出</p>");
        	}
        }else {
        	pw.write("<h1>Welcome, " + (user != null ? user : "Guest") + "</h1>");
        	if(user == null) {
        		pw.write("<p><a href=\"/signin\">Sign In</p>");
        	}else {
        		pw.write("<p><a href=\"/signout\">Sign Out</p>");
        	}
        }
        pw.write("<p><a href=\"/pref?lang=en\">English</a> | <a href=\"/pref?lang=zh\">中文</a></p>");
        pw.flush();
	}
	
	private String parseLanguageFromCookie(HttpServletRequest req) {
		Cookie[] cookies = req.getCookies();
		if(Objects.nonNull(cookies)) {
			for (Cookie cookie : cookies) {
				if("lang".equals(cookie.getName())) {
					return cookie.getValue();
				}
			}
		}
		return "en";
	}
}
