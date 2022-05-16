package com.labs.day4;

class Employee{
    public int empId;
    public String firstName;
    public String lastName;
    public String email;
    private String foo;

    public void getFullName(){
        System.out.println(firstName+ " " + lastName);
    }
}

class FullTimeEmployee extends Employee{
    public int annualSalary;
}

//class FullTimeEmployee {
//    int annualSalary;
//     int empId;
//     String firstName;
//     String lastName;
//     String email;
//    
//    public void getFullName(){
//        System.out.println(firstName+ " " + lastName);
//    }
//}


class PartTimeEmployee extends Employee{
    public int hourSalary;
}

//class PartTimeEmployee {
//     int empId;
//     String firstName;
//     String lastName;
//     String email;
//     int hourSalary;
//    
//    public void getFullName(){
//        System.out.println(firstName+ " " + lastName);
//    }
//}



public class InheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FullTimeEmployee fte = new FullTimeEmployee();
        fte.firstName = "Hema";
        fte.lastName = "Jyothi";
       

        PartTimeEmployee pte = new PartTimeEmployee();
        pte.firstName = "Ajeya";
        pte.lastName = "Sam";
        
        fte.getFullName();
        pte.getFullName();

	}

}
