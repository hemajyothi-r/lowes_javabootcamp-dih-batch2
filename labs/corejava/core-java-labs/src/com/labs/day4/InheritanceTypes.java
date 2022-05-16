package com.labs.day4;

////*******Simple
//class A {
//
//}
//
//class B extends A {
//
//}



////**********MultiLevel
//class A {
//public void test1() {
//
//}
//}
//
//class B extends A {
//public void test2() {
//
//}
//}
//
//class C extends B {
//public void test3() {
//
//}
//}


//********Heirarchical
class A {
public void test1() {

}
}

class B extends A {
public void test2() {

}
}

class C extends A {
public void test3() {

}
}


class A2{

}

class B2{

}

// java does not support multiple inheritence directly
//class C2 extends A2, B2{
//
//}


public class InheritanceTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  A a = new A();
	        a.test1();

	        B b = new B();
	        b.test1();
	        b.test2();

	        C c  =new C();
	        c.test1();
	        //c.test2();
	        c.test3();
	        
	}

}
