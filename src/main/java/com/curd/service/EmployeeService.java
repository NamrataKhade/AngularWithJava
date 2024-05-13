package com.curd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.curd.entity.Employee;
import com.curd.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public List<Employee> getEmployees() {
		List<Employee> employees=new ArrayList<>();
	    employeeRepository.findAll().forEach(employees::add);
	    return employees;
	}
	
	public Employee getEmployeeById(Integer employeeId) {
		return employeeRepository.findById(employeeId).orElseThrow();
	}
	
	public void deleteEmployee(Integer employeeId) {
		 employeeRepository.deleteById(employeeId);
	}
	
	public Employee updateEmployee(Employee employee) {
		employeeRepository.findById(employee.getEmployeeId()).orElseThrow();
		return employeeRepository.save(employee);
	}

}
