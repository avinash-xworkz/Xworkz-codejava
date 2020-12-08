package com.xworkx.util;

import com.xworkx.church.Church;

public class ChurchUtil {
	
	public static void main(String[] args) {
		
		Church church = new Church("St.Mary Church","Goa",45);
		church.setName("St. Joseph's Church");
		church.setAddress("Goa");
		church.setNoOfFathersAndSisters(1);
		
		System.out.println(church.getAddress() + "  "+ church.getName() +"  "+ church.getNoOfFatherAndSister());
	}

}
