package com.assignments.day1;

//Question 2: Write a program to sum first n even numbers using a while loop.

public class EvenNumSum {
    public static void main(String[] args) {

        int sum = 0;  // sum of desired even numbers
        int count = 1; // counter for conditioning
        int evenNumber =2; // even number variable initialized to first even number 2
        int n; // Number of even numbers

        n=5; // n value is assigned to the number of even numbers to be summed up

        while(count <=n){

            sum += evenNumber;
            evenNumber +=2;
            count++;
        }

        System.out.println("Sum of first " + n + " even numbers using while loop is = " + sum);
    }
}
