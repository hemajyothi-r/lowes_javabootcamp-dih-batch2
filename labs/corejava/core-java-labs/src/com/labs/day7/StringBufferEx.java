package com.labs.day7;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");
        System.out.println(sb); // HelloWorld
        
        
        StringBuffer sb1 = new StringBuffer("Hello");
        System.out.println(sb1);

//        // append
//        sb1.append("World");
//        System.out.println(sb1);

//        // insert
//        sb1.insert(0, "World");
//        System.out.println(sb1);

//      //   replace
//        sb1.replace(1, 3, "World");
//        System.out.println(sb1);

//        // delete
//        sb1.delete(1,3);
//        System.out.println(sb1);

        // reverse
        sb1.reverse();
        System.out.println(sb1);
                     
        
        
	}

}
