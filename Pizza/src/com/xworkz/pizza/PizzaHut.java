package com.xworkz.pizza;

public class PizzaHut {
	
	public String address;
	public String typesOfPizzas;
	public int price;
	public PizzaHut(String address,String typeOfPizzas,double price) {
	System.out.println("Inside two parameterized const");
	this.address=address;
	this.typesOfPizzas= typeOfPizzas;
	System.out.println("ending with two parameterized constructor");
	}
}
