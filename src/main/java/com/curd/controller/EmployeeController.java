package com.curd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curd.entity.Employee;
import com.curd.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin("http://localhost:4200")
//@CrossOrigin("*")
//@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/save/employee")
	public Employee saveEmployee(@Valid @RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);

	}
	
	@GetMapping("/get/employee")
	public List<Employee> getEmployee() {
		return employeeService.getEmployees();
		
	}
	
	@GetMapping("/get/employee/{employeeId}")
	public Employee getEmployeeById(@PathVariable Integer employeeId) {
		return employeeService.getEmployeeById(employeeId);
		
		
	}
	
	@DeleteMapping("/delete/employee/{employeeId}")
	public void deleteEmployee(@PathVariable Integer employeeId ) {
	 employeeService.deleteEmployee(employeeId);
	}
	
	@PutMapping("/update/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}

}
