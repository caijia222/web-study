package com.caijia.advancedmvc.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.caijia.advancedmvc.bean.SignBean;
import com.caijia.advancedmvc.bean.User;
import com.caijia.advancedmvc.framework.GetMapping;
import com.caijia.advancedmvc.framework.ModelAndView;
import com.caijia.advancedmvc.framework.PostMapping;

public class UserController {
	
	@GetMapping("/user/profile")
	public ModelAndView profile(HttpServletResponse response, HttpSession session) throws Exception {
	    User user = (User) session.getAttribute("user");
	    if (user == null) {
	        // 未登录，跳转到登录页:
	        return new ModelAndView("redirect:/signin");
	    }
	    if (!user.isManager()) {
	        // 权限不够，返回403:
	        response.sendError(403);
	        return null;
	    }
	    return new ModelAndView("/profile.html", Map.of("user", user));
	}

	@GetMapping("/sign")
	public ModelAndView signin() {
		return new ModelAndView("/");
	}
	
	@PostMapping("/sign")
	public ModelAndView doSignin(SignBean bean) {
		return new ModelAndView("/");
	}
	
	@GetMapping("/signout")
	public ModelAndView signinout(HttpSession session) {
		return new ModelAndView("/");
	}
}
