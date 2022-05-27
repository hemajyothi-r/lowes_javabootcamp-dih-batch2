package com.labs.java.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionInterfacesDemo {

	public static void main(String[] args) {
		// consumer -> takes arguments and no return
		Consumer<String> consumer = (msg) -> System.out.println(msg);
		consumer.accept("Hello Consumer");

		// consumer -> takes arguments and no return
		BiConsumer<String, String> biconsumer = (msg1, msg2) -> System.out.println(msg1 + msg2);
		biconsumer.accept("Hello Consumer ", "Hema");

		// supplier -> no arguments and return value
		Supplier<List> supplier = () -> Arrays.asList("Java", "Spring", "Hibernate");
		System.out.println(supplier.get());

//		// supplier -> no arguments and return value
//		Supplier<List> supplier1 = () -> msg = "Hello Supplier";;
//		System.out.println(supplier.get(msg));

		// function -> take argument and return value
		Function<Integer, Integer> function = (a) -> a * 7;
		System.out.println(function.apply(10));

		// function -> take two different data types as arguments and return value
		Function<Integer, String> function1 = (a) -> {
			if (a % 2 == 0)
				return "Even";
			else
				return "Odd";
		};
		System.out.println(function1.apply(15));

		// Function -> takes
		UnaryOperator<Integer> unary = (a) -> a * 2;
		System.out.println(unary.apply(15));

		// function -> take two arguments and return value
		BinaryOperator<Integer> binary = (a, b) -> (a + b) * 2;
		System.out.println(binary.apply(2, 4));

		// predicate-> take arguments and return boolean value
		Predicate<Integer> predicate = (age) -> age > 20;
		System.out.println(predicate.test(30));

	}

}
