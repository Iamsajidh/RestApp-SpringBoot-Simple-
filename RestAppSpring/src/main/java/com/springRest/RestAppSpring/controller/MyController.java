package com.springRest.RestAppSpring.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springRest.RestAppSpring.model.Employee;
import com.springRest.RestAppSpring.service.EmployeeService;

@RestController
@RequestMapping(path="/employees")
public class MyController {
	
	@Autowired
	private EmployeeService empDAO;
	
	//Use GET method 
	@GetMapping(path="/", produces="application/json")
	public ArrayList<Employee> getEmployees(){
		return empDAO.getEmplist();
	}
	
//	@GetMapping(path="/{id}", produces="application/json")
//	public Employee getEmployeesById(@PathVariable int id){
//		return empDAO.getAllEmployeesById(id);
//	}
	
	//use POST method to add
	@PostMapping(path="/", produces="application/json")
	public boolean addEmp(@RequestBody Employee employee)
	{
		return empDAO.addEmp(employee);
	}
	
	//use PUT method to update
	@PutMapping(path="/", produces="application/json")
	public Employee updateEmployee(@RequestBody Employee empObj)
	{
		return empDAO.updateEmployee(empObj.getId(), empObj.getName());
		
	}
	
	//use DELETE
	@DeleteMapping(path="/", produces="application/json")
	public Employee deleteEmployee(@RequestBody Employee empObj)
	{
		return empDAO.deleteEmployee(empObj.getId());
	}
	
	
	
	
	

}
