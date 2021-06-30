package com.caijia.advancedmvc.framework;

import java.util.Map;

public class ModelAndView {

	Map<String,Object> model;
	String view;
	public ModelAndView(String view, Map<String, Object> model) {
		super();
		this.model = model;
		this.view = view;
	}
	public ModelAndView(String view) {
		super();
		this.view = view;
	}
	
}
