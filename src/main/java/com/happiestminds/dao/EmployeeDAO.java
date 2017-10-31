/**
 * 
 */
package com.happiestminds.dao;

import java.util.List;

import com.happiestminds.entity.Employee;

/**
 * @author happiestminds Reddy
 * @version 1.0
 */
public interface EmployeeDAO {
	public long createEmployee(Employee employee);
    public Employee updateEmployee(Employee employee);
    public void deleteEmployee(long id);
    public List<Employee> getAllEmployees();
    public Employee getEmployee(long id);	
	public List<Employee> getAllEmployees(String employeeName);
}
