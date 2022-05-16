package com.labs.day1;

public class OperatorsExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test obj=new Test();
		obj.addNumbers();
	
		System.out.println(Test.y);
		obj.foo();
		
		int a= 30;
		int b= 20;
		int c= 10;
		
		boolean e= true;
		boolean f= false;
		
		System.out.println(a + b); // 50
        System.out.println(a - b); // 10
        System.out.println(a * b); // 600
        System.out.println(a / b);

        System.out.println(a > b);
        System.out.println(a > b && a > c); // true
        System.out.println(a > b && a < b); // false
        System.out.println(a >b || a < c);  // true

        int max = (a > b) ? a : b;
        System.out.println(max);
        
        System.out.println(e);
        System.out.println(f);        
        
        int g = 10;
        int h = 20;
        System.out.println(g);  // 10
        System.out.println(h); // 20

        System.out.println(g++); // 10
        System.out.println(g); // 11
        System.out.println(++ g); // 21

        //a++
        g = g + 1;

        g += 5;
        // g = g + 5
        System.out.println(g);

        a = b;
        System.out.println(a);

	}

}

class Test{
	
	static int y = 40;
	int x=10;
			
	public void addNumbers()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	public void foo()
	{
		
		System.out.println("this is foo function");
	}
	
	
}
