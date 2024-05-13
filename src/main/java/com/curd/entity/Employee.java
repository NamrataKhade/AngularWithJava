package com.curd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employee")

public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employeeId;
	
    
    @NotEmpty
    @Size(min = 3,message = "Username Must be min of 10 character")
	private String employeeName;
    
    @NotEmpty
    @Size(min = 10,message = "Contact Number Must be min of 10 character")
	private String employeeContactNumber;
    
    @NotEmpty
	private String employeeAddress;
   
    @NotEmpty
	private String employeeGender;
    
    @NotEmpty
	private String employeeDepartment;
    
    @NotEmpty
	private String employeeSkills;

}
