package com.tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Emp")
public class Employee {

	@Id@GeneratedValue
	@Column(name = "Emp_Id")
	private int EmployeeId;
	
	@Column(name = "Emp_Name")
	private String EmployeeName;
	
}
