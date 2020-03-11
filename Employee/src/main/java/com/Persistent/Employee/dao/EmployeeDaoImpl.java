package com.Persistent.Employee.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Persistent.Employee.Beans.Employee;
import com.Persistent.Employee.Repo.EmployeeRepo;


@Repository("dao")
public class EmployeeDaoImpl implements IEmployee{

	
	@Autowired
	EmployeeRepo repo;
	
	
	
	@Override
	public Employee getEmployeeById(String empid) {
		Optional<Employee> emp=repo.findById(empid);
		if(emp==null)
		{
			return null;
			}
		else
			return emp.get();
	}

	@Override
	public List<Employee> getAllEmpl() {
		return repo.findAll();
	}

	@Override
	public void Insert(Employee obj) {
		repo.insert(obj);
	}

	@Override
	public void Update(Employee obj) {
		repo.insert(obj);
	}

	@Override
	public void Delete(Employee obj) {
		repo.delete(obj);
	}

}