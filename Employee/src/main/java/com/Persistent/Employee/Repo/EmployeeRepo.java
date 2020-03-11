package com.Persistent.Employee.Repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Persistent.Employee.Beans.Employee;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee,String>{

//	List<Employee> findall();
	//Employee findbyId(String empid);

}
