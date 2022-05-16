package com.labs.day2;

class Car{
    public String brand;
    public String year;
    public String model;
    public String color;
    public String engineType;
    public int price;

    public Car(String brand, String year, String model, String color, String engineType ){
            this.brand= brand;
            this.year= year;
            this.model = model;
            this.color=color;
            this.engineType= engineType;

    }

    public Car(Car car){
        this.brand= car.brand;
        this.year= car.year;
        this.model = car.model;
        this.color=car.color;
        this.engineType= car.engineType;

    }

    public Car(Car car, int price){
        this.brand= car.brand;
        this.year= car.year;
        this.model = car.model;
        this.color=car.color;
        this.engineType= car.engineType;
        this.price= price;
        
        
    }
}

public class ConstructorTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Car car1 = new Car("Mahindra", "2021", "XUV 700", "White", "Automatic");
	        Car car2 = new Car(car1);
	        Car car3 = new Car(car1, 30000);
	}

}
