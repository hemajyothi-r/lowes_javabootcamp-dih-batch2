package com.labs.java.lambda;

import java.util.function.BiFunction;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Calculator {

	public static void main(String[] args) {

//		//ICalculator add = (a, b) -> (a + b);
//		ICalculator add = (a, b) ->{System.out.println(a + b); return a+b;};
//		
//		ICalculator subtract = (a, b) -> (a - b);
//		ICalculator multiply = (a, b) -> (a * b);
//		ICalculator divide = (a, b) -> (a / b);
//		ICalculator mod = (a, b) -> (a % b);
		
		//ICalculator add = (a, b) -> (a + b);
		BiFunction<Integer, Integer, Integer> add = (a, b) ->{System.out.println(a + b); return a+b;};
		
		BiFunction<Integer, Integer, Integer> subtract = (a, b) -> (a - b);
		BiFunction<Integer, Integer, Integer> multiply = (a, b) -> (a * b);
		BiFunction<Integer, Integer, Integer> divide = (a, b) -> (a / b);
		BiFunction<Integer, Integer, Integer> mod = (a, b) -> (a % b);
		
		
		System.out.println("20+10=" + doCalculate(20, 10, add));
		System.out.println("20-10=" + doCalculate(20, 10, subtract));
		System.out.println("20*10=" + doCalculate(20, 10, multiply));
		System.out.println("20/10=" + doCalculate(20, 10, divide));
		System.out.println("20%10=" + doCalculate(20, 10, mod));
		
//		doCalculate(20, 10, add);
//		doCalculate(20, 10, subtract);
//		doCalculate(20, 10, multiply);
//		doCalculate(20, 10, divide);
//		doCalculate(20, 10, mod);
		
	}

	// returns int
//	public static int doCalculate(int a, int b, ICalculator operation) {
//		return operation.calculate(a, b);
//
//	}

//	// returns object
//	public static Object doCalculate(int a, int b, ICalculator operation) {
//		return operation.calculate(a, b);
//
//	}
	
	// returns object
		public static Object doCalculate(int a, int b, BiFunction<Integer, Integer, Integer> operation) {
			return operation.apply(a, b);

		}
	
//	public interface ICalculator {
//		public int calculate(int a, int b);
//		//public int calculate(int a, int b, int c);
//	}
}
