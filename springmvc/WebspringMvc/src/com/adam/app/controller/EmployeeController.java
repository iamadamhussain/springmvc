package com.adam.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.adam.app.Employee;
import com.adam.app.service.EmployeeService;


@Controller
public class EmployeeController 
{@Autowired
	private EmployeeService service;
	
	
	@RequestMapping(value="saveemp"
			,method=RequestMethod.POST)
	public String saveemp(@ModelAttribute Employee employee,ModelMap  map)
	{
		
Employee employee2=	service.save(employee);

		
		map.addAttribute("fn", employee2.getFirstname());
	//return new ModelAndView("success", "fn", employee.getFirstname());
		
		return "success";
		
	}

	

	


}
