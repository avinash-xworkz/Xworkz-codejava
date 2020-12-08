package com.xworkz.icecream;

public class Icecream {
				
			private String name;
			private String color;
			private String icetype;
			
			public Icecream() {
				System.out.println("My Fav Ice-cream");
			}
			
			public Icecream(String name, String color,String icetype)
			{
				this.name = name;
				this.color = color;
				this.icetype = icetype;
			}
			
			public String getName() {
				return name;
			}
			
			public void setName(String name) {
				this.name = name;
			}
			
			public String getColor()
			{
				return color;
			}
			public void setColor(String color) {
				this.color=color;
			}
			
			public String geticetype() {
				return icetype;
			}
			
			public void seticetype(String icetype) {
				this.icetype = icetype;
			}


	}
