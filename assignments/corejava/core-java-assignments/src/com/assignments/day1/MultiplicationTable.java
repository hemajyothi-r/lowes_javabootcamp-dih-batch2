package com.assignments.day1;

//Question 3: Write a program to print the multiplication table of a given number n.

public class MultiplicationTable {
    public static void main(String[] args) {

        int num1; // number input for multiplication table

        num1 = 8;

        System.out.println("Multiplication table for the number " + num1 + " is : ");

        for (int i=1; i<=10; i++)
        {
            System.out.println(num1 + " x " + (i) + " = " + (num1 * (i)));
        }

    }
}
