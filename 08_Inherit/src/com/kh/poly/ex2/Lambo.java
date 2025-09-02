package com.kh.poly.ex2;

public class Lambo extends Car {

	public Lambo(String color, String fuel, int year) {
		super(color, fuel, year);
	}

	public void moveLambo() {
		System.out.println("move lambo");
	}
	
	@Override
	public void drive() {
		System.out.println("Lambo ~ drive ~");
	}
}
