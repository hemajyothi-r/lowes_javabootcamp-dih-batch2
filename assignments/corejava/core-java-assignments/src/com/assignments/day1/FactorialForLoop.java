package com.assignments.day1;

//Question 5: Write a program to find the factorial of a given number using for loops.
// Factorial of n (n!) = 1 * 2 * 3 * 4 * ... * n

public class FactorialForLoop {
    public static void main(String[] args) {

        int number = 3; //given number
        int fact = 1; //factorial number

        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }

//        for(int i = number ; i >= 1; i--)
//        {
//            fact = fact * i;
//        }

        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
