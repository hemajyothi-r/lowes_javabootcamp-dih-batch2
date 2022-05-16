package com.labs.day3;

class Counter {
    static int count = 0;

	//int count =0;
	
    public Counter() {
        count++;
        System.out.println(count);
    }
}


public class StaticCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
	}

}
