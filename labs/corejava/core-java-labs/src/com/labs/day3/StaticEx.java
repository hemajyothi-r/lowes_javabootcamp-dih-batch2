package com.labs.day3;
class Student{
	public int rollNumber;
	public String name;
	static public String schoolName = "Vibgyor";
}

public class StaticEx {
	
	// Static Block
	static {
        System.out.println("static block");
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main method");
		
		Student objStu = new Student();
		objStu.rollNumber = 12;
		objStu.name = "Samruddhi";
		
		Student objStu2 = new Student();
		objStu2.rollNumber = 10;
		objStu2.name = "Ajeya";
		
		System.out.println("Student Name : " + objStu.name + ", Roll Number : " + objStu.rollNumber + ", School Name : " + Student.schoolName);

		System.out.println("Student Name : " + objStu2.name + ", Roll Number : " + objStu2.rollNumber + ", School Name : " + Student.schoolName);

	}

}
