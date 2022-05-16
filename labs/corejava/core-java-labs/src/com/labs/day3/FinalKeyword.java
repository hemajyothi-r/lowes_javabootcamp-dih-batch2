package com.labs.day3;

class Car2{
    public final int speedLimit = 60;

    public void drive(){
        //speedLimit = 80;
        System.out.println("car is driving at speed of "+ speedLimit);
    }

}

public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car2 objCar= new Car2();
		//objCar.speedLimit = 50;
		
		objCar.drive();
	}

}
