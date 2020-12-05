package com.xworkz.util;

import java.util.Scanner;

import com.xworkz.pizza.PizzaHut;
import com.xworkz.util.PizzaHutUtil;

public class PizzaHutUtil {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Address");
			String address=sc.next();
			System.out.println("Enter the type of Pizza");
			String typeOfPizzas=sc.next();
			System.out.println("Enter the price");
			double price=sc.nextDouble();
			sc.close();
			PizzaHut pizzaHut = new PizzaHut(address,typeOfPizzas,price);
			System.out.println(pizzaHut.address);
		}
	}
