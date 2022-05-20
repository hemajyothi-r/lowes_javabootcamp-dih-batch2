package com.labs.day8;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first name and last name");
		String fistname = scanner.next();
		String lastname = scanner.next();
		System.out.println("FullName :" + (fistname + lastname));
		
		
	}

}
