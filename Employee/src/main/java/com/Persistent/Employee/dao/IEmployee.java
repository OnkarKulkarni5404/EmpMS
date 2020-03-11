package com.Persistent.Employee.dao;

import java.util.List;

import com.Persistent.Employee.Beans.Employee;

public interface IEmployee {

	public Employee getEmployeeById(String empid);
	public List<Employee> getAllEmpl();
	public void Insert(Employee obj);
	public void Update(Employee obj);
	public void Delete(Employee obj);

}
