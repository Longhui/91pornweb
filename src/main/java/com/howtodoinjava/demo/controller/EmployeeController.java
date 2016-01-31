package com.howtodoinjava.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.howtodoinjava.demo.service.EmployeeManager;
import com.howtodoinjava.demo.service.pornManager;

@Controller
//@RequestMapping("/employee-module")
public class EmployeeController 
{
	@Autowired
	EmployeeManager manager;

	@Autowired
	pornManager manager91;

	@RequestMapping(value = "/getEmployees", method = RequestMethod.GET)
	public String getAllEmployees(Model model)
	{
		model.addAttribute("employees", manager.getAllEmployees());
		return "employeesListDisplay";
	}

	@RequestMapping(value = "/91porn", method = RequestMethod.GET)
	public String get91pornPicture(Model model)
	{
		model.addAttribute("pictures", manager91.getPictures());
		return "pornPictureListDisplay";
	}
}