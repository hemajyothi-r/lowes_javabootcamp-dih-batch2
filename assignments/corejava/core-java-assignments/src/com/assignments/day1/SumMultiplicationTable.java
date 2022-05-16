package com.assignments.day1;

//Question 9: Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.

public class SumMultiplicationTable {

    public static void main(String[] args) {

        int sum;  // Sum of the numbers of multiplication table
        int prod; // multiplication result
        int num; // given number
        int i; // loop variable
        sum=0;
        prod =0;
        num = 8;
        i = 1;

        do {

            prod = num * i;
            sum += prod;
            i++;

        }while (i<=10);

        System.out.println("Sum of the numbers of the multiplication table of "+ num +" is: "+sum);
    }
}
