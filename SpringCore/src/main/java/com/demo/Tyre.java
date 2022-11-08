package com.demo;

public class Tyre {
	
	private String brand;
	private long price;
	
	@Override
	public String toString() {
		return "Tyre [brand=" + brand + ", price=" + price + "]";
	}

	public Tyre(String brand, long price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	

	public void display() {
		System.out.println("hi am from display");
	}

	
	

}
