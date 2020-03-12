package com.Persistent.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Persistent.Employee.Beans.Employee;
import com.Persistent.Employee.dao.EmployeeDaoImpl;
import com.Persistent.Employee.service.EmployeeService;

@org.springframework.stereotype.Controller

@RequestMapping("/employee")
@RestController
@Component
public class Controller {
	
	@Autowired 
	 EmployeeService serv;
	
	@GetMapping("/")
	List<Employee> getEmp()
	{
		return serv.getAllEmpl();
	}
	
	@GetMapping("/{id}")
	Employee getEmp(@PathVariable String id)
	{
		return serv.getEmployeeById(id);
	}
	
	@PostMapping("/")
	String insertemp(@RequestBody Employee emp)
	{
		return serv.Insert(emp);
	}
	
	@PutMapping("/")
	void updateemp(@RequestBody Employee emp)
	{
		serv.Update(emp);
	}
	
	@DeleteMapping("/")
	void deleteemp(@RequestBody Employee emp)
	{
		serv.Delete(emp);
	}

}
