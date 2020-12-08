package com.xworkz.Util;

import com.xworkz.icecream.Icecream;

public class IcecreamUtil {
		
		public static void main(String[] args) {
			
			Icecream icecream = new Icecream();
			icecream.setName("Vanilla Swrilled Choco Icecream");
			icecream.setColor("Brownish-white");
			icecream.seticetype("Cone");
			System.out.println(icecream.getColor() + " "+ icecream.getName() + " " + icecream.geticetype());
		}

	}

