package com.caijia.servlet;

import java.io.IOException;
import java.util.Objects;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/pref")
public class LanguageServlet extends HttpServlet {

	private static final long serialVersionUID = 1120588326207066960L;

	private static final Set<String> LANGUAGES = Set.of("en", "zh");
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String lang = req.getParameter("lang");
		if(Objects.nonNull(lang) && LANGUAGES.contains(lang)) {
			Cookie cookie = new Cookie("lang", lang);
			cookie.setPath("/");
			cookie.setMaxAge(8640000);
			resp.addCookie(cookie);
		}
		resp.sendRedirect("/");
	}
}
