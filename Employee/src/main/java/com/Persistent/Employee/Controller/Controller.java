package com.Persistent.Employee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Persistent.Employees.service.EmployeeService;

@org.springframework.stereotype.Controller


@RestController
@RequestMapping("/employee")
public class Controller {
	
	//@Autowired 
	//public EmployeeService service;
	
	@GetMapping("/hello")
	String printit()
	{
		return "Hello World";
	}

}
