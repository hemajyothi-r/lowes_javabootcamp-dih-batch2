package com.labs.spring.carapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	String model;
	String manufacutrer;
	String color;
	//Engine engine;

	@Autowired
	@Qualifier("petrol")
	Engine engine;
	
	public Car() {

	}

	public Car(Engine engine) {
		this.engine = engine;
	}

	public Car(String model, String manufacutrer, String color, Engine engine) {
		super();
		this.model = model;
		this.manufacutrer = manufacutrer;
		this.color = color;
		this.engine = engine;
	}

	public Car(String model, String manufacutrer, String color) {
		super();
		this.model = model;
		this.manufacutrer = manufacutrer;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacutrer() {
		return manufacutrer;
	}

	public void setManufacutrer(String manufacutrer) {
		this.manufacutrer = manufacutrer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	
	public void init() {
		System.out.println("Car been initialized..");
	}
	
	public void destroy() {
		System.out.println("Car been destroyed");
	}
}
