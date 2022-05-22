package com.lowes.empapp;

import  com.lowes.empapp.model.*;
import  com.lowes.empapp.exception.*;
import com.lowes.empapp.service.*;


import java.util.Scanner;
import java.io.*;

public class EmployeeManagementMain {
	
	public static int count = 1;

	 public static void showEmployeeMainMenu(){
	       
	        System.out.println("\n1. Add Employee");
	        System.out.println("2. View Employee");
	        System.out.println("3. Update Employee");
	        System.out.println("4. Delete Employee");
	        System.out.println("5. View All Employees");
	        System.out.println("6. Exit");
	 	   
	 } 
	
    public static void main(String[] args){ 
    
    	System.out.println("Welcome to Employee Management App");   
    	EmployeeService empService = new EmployeeService(10);

    	Scanner scan = new Scanner(System.in);
        
     	Employee emp1= new Employee();
                
        int empId, age;
    	String name,designation,department,country;
    	  	    	
    	do {
    		
    		showEmployeeMainMenu();
    		
    		System.out.print("\nEnter your Option : ");
    		int option = scan.nextInt();

    		switch(option){
            	case 1:               
            		
            		emp1= new Employee() ;
                 
                	System.out.println("Enter Employee Id");
                    empId= scan.nextInt();
                    System.out.println("Enter Employee Name");
                    name= scan.next();
                    System.out.println("Enter Employee Age ");
                    age= scan.nextInt();
                    System.out.println("Enter Employee Designation");
                    designation = scan.next();
                    System.out.println("Enter Employee Department");
                    department= scan.next();
                    System.out.println("Enter Employee Country");
                    country = scan.next();
                    
                    emp1.setEmpId(empId);
                    emp1.setName(name);
                    emp1.setAge(age);
                    emp1.setDesignation(designation);
                    emp1.setDepartment(department);
                    emp1.setCountry(country);
                    
                    if(empService.addEmployee(emp1)){
                    	System.out.println("\nEmployee Added successfully!!");
                		count ++;
                    }
                    else {
                    	System.out.println("\nEmployee couldnt be added !!");
                         	
                    }
            		break;
            	case 2:
            		System.out.println("Enter employee id to be viewed");
                    emp1 = empService.viewEmployeeByID(scan.nextInt());
                    if(emp1!=null) {
                    	System.out.println("\n"+emp1.getEmpId()+"\t"+emp1.getName()+"\t"+emp1.getAge()+"\t"+emp1.getDesignation()+"\t"+emp1.getDepartment()+"\t"+emp1.getCountry());
                    }
                    else{
                            System.out.println("\nThis employee does not exist!");
                        }

            		break;
            	case 3:
	           		
            		 emp1= new Employee() ;
                    
            		 System.out.println("Enter the employee id to be updated");
	           		 empId= scan.nextInt();
	                 System.out.println("Enter new Employee Name");
	                 name= scan.next();
	                 System.out.println("Enter new Employee Age");
	                 age= scan.nextInt();
	                 System.out.println("Enter new Employee Designation");
	                 designation = scan.next();
	                 System.out.println("Enter new Employee Department");
	                 department= scan.next();
	                 System.out.println("Enter new Employee Country");
	                 country = scan.next();
	                 
	                 emp1.setEmpId(empId);
	                 emp1.setName(name);
	                 emp1.setAge(age);
	                 emp1.setDesignation(designation);
	                 emp1.setDepartment(department);
	                 emp1.setCountry(country);
	                 
	                 if(empService.updEmployeeById(emp1, empId)) {
	                	 System.out.println("\nEmployee details updated successfully!!");
	                 }else {
	                	 System.out.println("\nThis employee does not exist!");
	                 }

            		break;
	            case 4:
	            	 System.out.println("Enter the employee Id to delete");
	            	 empId = scan.nextInt();
	                    if(empService.delEmployeeById(empId)){
	                        System.out.println("\nEmployee deleted successfully!!");
	                        count--;

	                    }else{
	                        System.out.println("\nThis employee does not exist!");
	                    }
	            	
	                break;
	            case 5:
	            	empService.viewAllEmployees();
	            	break;
	            case 6: 
	            	System.out.println("\nThank you for using Employee Management application!!");
	                System.exit(0);
	                break;
	            default:
	                System.out.println("\nInvalid option!\n");
	                showEmployeeMainMenu();
    			}
       
    		}while(true);
    }
  
}