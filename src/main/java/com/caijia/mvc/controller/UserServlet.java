package com.caijia.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.caijia.mvc.model.School;
import com.caijia.mvc.model.User;

@WebServlet(urlPatterns = "/user")
public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = 4559076904375988723L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		School school = new School("No.1 Middle School", "101 South Street");
		User user = new User(1, "Bob", school);
		req.setAttribute("user", user);
		req.getRequestDispatcher("/WEB-INF/mvc.view/user.jsp").forward(req, resp);
	}
}
