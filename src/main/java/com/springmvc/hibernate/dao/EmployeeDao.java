package com.springmvc.hibernate.dao;

import java.util.List;

import com.springmvc.hibernate.model.Employee;

public interface EmployeeDao {
	Employee findById(int id);
	void saveEmployee(Employee employee);
	void deleteEmployeeBySsn(String ssn);
	List<Employee> findAllEmployees();
	Employee findEmployeeSsn(String ssn);

}
