package com.xworkz.telescope;

public class Telescope {
		
		private String name;
		private String color;
		private String telescopetype;
		
		public Telescope() {
			System.out.println("Worlds best telescope");
		}
		
		public Telescope(String name, String color,String telescopetype)
		{
			this.name = name;
			this.color = color;
			this.telescopetype = telescopetype;
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
		
		public String gettelescopetype() {
			return telescopetype;
		}
		
		public void settelescopetype(String telescopetype) {
			this.telescopetype = telescopetype;
		}


}