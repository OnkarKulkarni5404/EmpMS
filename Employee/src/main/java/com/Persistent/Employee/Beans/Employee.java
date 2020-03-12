package com.Persistent.Employee.Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Employee")
public class Employee {
	
	@Id
	private String empid;
	private String EmpName;
	private String contactno;
	@Value("to_beallocated")
	private String Location;
	@Value("0")
	private String VehicleNo;
	@Value("ELTP")
	private String ProjectBU;
	@Value("TobeAllocated")
	private String ProjectName;
	@Value("ELTP")
	private String Role;
	
	public Employee() {}
	
	public Employee(String empid,String Empname)
	{
		super();
		this.empid=empid;
		this.EmpName=Empname;
	}
	
	public Employee(String empid, String empName, String contactno, String location, String vehicleNo, String projectBU,
			String projectName, String role) {
		super();
		this.empid = empid;
		EmpName = empName;
		this.contactno = contactno;
		Location = location;
		VehicleNo = vehicleNo;
		ProjectBU = projectBU;
		ProjectName = projectName;
		Role = role;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getVehicleNo() {
		return VehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		VehicleNo = vehicleNo;
	}

	public String getProjectBU() {
		return ProjectBU;
	}

	public void setProjectBU(String projectBU) {
		ProjectBU = projectBU;
	}

	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}
}
