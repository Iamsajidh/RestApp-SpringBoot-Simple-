package com.springRest.RestAppSpring.service;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.springRest.RestAppSpring.model.Employee;


@Component
public class EmployeeService {
	
  ArrayList<Employee> empList = new ArrayList<>();
  
   

  public ArrayList<Employee> getEmpList() {
	return empList;
  }
  public void setEmpList(ArrayList<Employee> empList) {
	this.empList = empList;
  }
  
  public EmployeeService(){
	Employee e1 = new Employee("Sajid", 101, 14000);
	Employee e2 = new Employee("Shiv", 102, 16000);
	Employee e3 = new Employee("Adi", 103, 14000);
	Employee e4 = new Employee("Wasim", 104, 16000);
	
	empList.add(e1);
	empList.add(e2);
	empList.add(e3);
	empList.add(e4);
}
  
  //add method (POST)
  public boolean addEmp(Employee employee) {
	
	return empList.add(employee);
	
}
  //view method (GET)
  public ArrayList<Employee> getEmplist() {
	  return empList;
  }
  
  //DELETE method
  public Employee deleteEmployee(int id){
	  Employee empObj = null;
	  for(Employee e: empList){
		  if(e.getId()==id){
			  empObj=e;     
		  }
	  }
	  return empObj;
  }
  
////Get -> Read
//	//Method to get employees
//	public Employee getAllEmployeesById(int id){
//		for(Employee emp : empList) {
//			if(emp.getId()==id) {
//				return emp;
//			}
//		}
//		return null;
//	}
  
  //UPDATE method(PUT)
  public Employee updateEmployee(int id, String name){
	  Employee empObj =null;
	  for(Employee e: empList){
		  if(e.getId()==id){
			  empObj =e;
			  empObj.setName(name);
			 
		  }
	  }
	  
	  return empObj;
  }	

}
