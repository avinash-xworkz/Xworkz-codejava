package com.xworkz.Util;

import com.xworkz.telescope.Telescope;

public class TelescopeUtil {
		
		public static void main(String[] args) {
			
			Telescope telescope = new Telescope();
			telescope.setName("Galelio");
			telescope.setColor("Grey001");
			telescope.settelescopetype("Macro");
			System.out.println(telescope.getColor() + " "+ telescope.getName() + " " + telescope.gettelescopetype());
		}

	}
