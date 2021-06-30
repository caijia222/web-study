package com.caijia.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.caijia.bean.School;
import com.caijia.bean.User;

@WebServlet(urlPatterns = "/user")
public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = 4559076904375988723L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		School school = new School("No.1 Middle School", "101 South Street");
		User user = new User(1, "Bob", school);
		req.setAttribute("user", user);
		req.getRequestDispatcher("/WEB-INF/user.jsp").forward(req, resp);
	}
}
