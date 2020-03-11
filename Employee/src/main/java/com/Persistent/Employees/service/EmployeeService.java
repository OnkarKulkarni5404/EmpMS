package com.Persistent.Employees.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Persistent.Employee.Beans.Employee;
import com.Persistent.Employee.dao.EmployeeDaoImpl;

@Service("service")
public class EmployeeService {

	@Autowired
	public EmployeeDaoImpl dao;
	
	public Employee getEmployeeById(String empid)
	{
		return dao.getEmployeeById(empid);
	}
	public List<Employee> getAllEmpl(){
		return dao.getAllEmpl();
	}
	public void Insert(Employee obj) {
		dao.Insert(obj);
	}
	public void Update(Employee obj)
	{
		dao.Update(obj);
	}
	public void Delete(Employee obj) {
		dao.Delete(obj);
	}
	
}
