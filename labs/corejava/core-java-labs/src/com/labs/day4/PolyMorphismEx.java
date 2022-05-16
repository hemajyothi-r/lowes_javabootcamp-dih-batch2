package com.labs.day4;

class Calculation{
    public void test(){
        System.out.println("1st method");
    }

    public void test(int a){
        System.out.println("2nd method");
    }

    public void test(String b){
        System.out.println("3rd method");
    }

    public void test(int a, String b){
        System.out.println("4th method");
    }

    public void test(String a, int b){
        System.out.println("5th method");
    }

  
}


public class PolyMorphismEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculation objCalc = new Calculation();
		objCalc.test();
		objCalc.test(1);
		objCalc.test("Hema");
		objCalc.test(2, "Ajeya");
		objCalc.test("Samruddhi", 3);
		
		
		
		
	}

}
