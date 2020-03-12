package com.Persistent.Employee;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import com.Persistent.Employee.Beans.Employee;
import com.Persistent.Employee.dao.EmployeeDaoImpl;
import com.Persistent.Employee.service.EmployeeService;

@SpringBootTest
class EmployeeApplicationTests {

	@InjectMocks
	EmployeeService serv;
	
	@Mock
	EmployeeDaoImpl dao;
	
	@Before()
	public void init()
	{
		  MockitoAnnotations.initMocks(this);
	}

	Employee e=new Employee("123","opk");
	@Test
	public void testInsertEmployee()
	{
		String result="Updated";
		when(dao.Insert(e)).thenReturn(result);
		assertEquals(dao.Insert(e),"Updated");
		
	}
}
