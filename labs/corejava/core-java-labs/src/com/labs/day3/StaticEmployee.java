package com.labs.day3;

class Employee2{
    public int empId;
    public String name;
    public static String companyName = "Revature";

    public Employee2(int empId, String name){
        this.empId = empId;
        this.name = name;
    }

    public void printInfo(){
        System.out.println("Id: "+ empId+ ", Name: "+ name+ ", Company Name: "+ companyName);
    }
}


public class StaticEmployee {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Employee2 emp1 = new Employee2(1, "Hemajyothi");
        Employee2 emp2 = new Employee2(2, "Ajeya");
        emp1.printInfo();
        emp2.printInfo();
        Employee2.companyName = "ASH";
        emp1.printInfo();
        emp2.printInfo();

        
	}

}
