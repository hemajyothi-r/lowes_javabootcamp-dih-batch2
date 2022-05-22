package com.lowes.empapp.service;

import com.lowes.empapp.model.Employee;
import com.lowes.empapp.exception.*;

public class EmployeeService  {
	
	private Employee[] empArray;
	 
	public static int index=0;
 
	public boolean found = false;
 
	public EmployeeService(int size){

	      empArray = new Employee[size];
	 }
	
//	public EmployeeService() {
//		empArray = new Employee[];
//	}

	 public boolean addEmployee(Employee emp){
		 
	   	empArray[index++] = emp;
	   	return true;
	 }
	 	 
     public void viewAllEmployees(){

    	if (empArray.length > 0) {
    		Employee.printEmpHeader();
    	}
    	else {found = false;}
    	
        for(int i=0; i< empArray.length; i++){
            if(empArray[i]!=null){
                System.out.println("\n"+empArray[i].getEmpId()+"\t"+empArray[i].getName()+"\t"+empArray[i].getAge()+"\t"+empArray[i].getDesignation()+"\t"+empArray[i].getDepartment()+"\t"+empArray[i].getCountry());
            	found = true;
            }
            else {
            	break;
            }
        }
        if(!found) {
        	System.out.println("\nNo records found!!!");
        	
        }
        
    }

    public Employee viewEmployeeByID(int empId){

    	if (empArray.length > 0) {
    		Employee.printEmpHeader();
    	}

    	Employee emp= null;
        for(int i=0; i< empArray.length; i++){
            if(empArray[i]!=null){
                if(empArray[i].getEmpId()==empId){
                    emp=empArray[i];
                }
            }
        }
        return emp;
    }

    public boolean delEmployeeById(int empId){
        boolean status = false;
        for(int i=0; i< empArray.length; i++){
            if(empArray[i]!=null){
                if(empArray[i].getEmpId()==empId){
                	empArray[i]=null;
                    status = true;
                }
            }
        }
        return status;
    }
    
//    public boolean updEmployeeById(int empId, String name, int age, String designation, String department, String country){
//        boolean status = false;
//        for(int i=0; i< empArray.length; i++){
//            if(empArray[i]!=null){
//                if(empArray[i].getEmpId()==empId){
//
//                	empArray[i].setName(name);
//                	empArray[i].setAge(age);
//                	empArray[i].setDesignation(designation);
//                	empArray[i].setDepartment(department);
//                	empArray[i].setCountry(country);
//                
//                	status = true;
//                }
//            }
//        }
//        return status;
//    }

    
    public boolean updEmployeeById(Employee emp, int empId){
        boolean status = false;
        for(int i=0; i< empArray.length; i++){
            if(empArray[i]!=null){
                if(empArray[i].getEmpId()==empId){

                	empArray[i].setName(emp.getName());
                	empArray[i].setAge(emp.getAge());
                	empArray[i].setDesignation(emp.getDesignation());
                	empArray[i].setDepartment(emp.getDepartment());
                	empArray[i].setCountry(emp.getCountry());
                
                	status = true;
                }
            }
        }
        return status;
    }

}

