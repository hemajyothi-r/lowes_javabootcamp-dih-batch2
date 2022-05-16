package com.assignments.day1;
//Question 4: Write a program to print a multiplication table of 10 in reverse order.

public class MultiplicationTableReverse
{
    public static void main(String[] args) {

        int num1; // number input for multiplication table

        num1 = 10;

        System.out.println("Multiplication table for the number " + num1 + " in Reverse Order is : ");

        for (int i=10; i>=1; i--)
        {
            System.out.println(num1 + " x " + (i) + " = " + (num1 * (i)));
        }
    }
}
