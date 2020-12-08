package com.xworkz.util;

import java.util.Date;

import com.xworkz.helicopter.Helicopter;

public class HelicopterUtil {
		
		public static void main(String[] args) {
			
			Helicopter helicopter = new Helicopter();
			helicopter.setName("Volocopter");
			helicopter.setId(2345);
			helicopter.setDate(new Date());
		//	helicopter.date = new Date();
			System.out.println(helicopter.getId() + " "+ helicopter.getName() + " " + helicopter.getDate());
		}

	}

