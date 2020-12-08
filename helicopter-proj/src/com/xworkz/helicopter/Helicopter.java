package com.xworkz.helicopter;

import java.util.Date;

public class Helicopter {
	
		
		private String name;
		private int id;
		private Date date;
		
		public Helicopter() {
			System.out.println("New Helicopter");
		}
		
		public Helicopter(String name, int id,Date date)
		{
			this.name = name;
			this.id = id;
			this.date = date;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getId()
		{
			return id;
		}
		public void setId(int id) {
			this.id=id;
		}
		
		public Date getDate() {
			return date;
		}
		
		public void setDate(Date date) {
			this.date=date;
		}


}
