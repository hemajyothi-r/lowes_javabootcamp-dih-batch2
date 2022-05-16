package com.assignments.day1;

//Write a program to find the factorial of a given number using While loops.

public class FactorialWhileLoop {
    public static void main(String[] args) 
    {

        int number = 5;  //number given
        long fact = 1; // factorial number
        int i = 1;

        while(i<=number)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
