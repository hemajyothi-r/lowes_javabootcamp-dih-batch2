package com.labs.day9;

public class ArrayExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        try{
            System.out.println(a[10]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }

	}

}
