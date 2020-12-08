package com.xworkx.church;

public class Church {
	
	String name;
	String address;
	int noOfFathersAndSisters;
	
	public Church() {
		System.out.println("Church object is created");
	}
	
	public Church(String name, String address, int noOfFathersAndSisters) {
		this.name=name;
		this.address=address;
		this.noOfFathersAndSisters=noOfFathersAndSisters;
	}	
	
	public String getName() {
		return name;
		
	}

	public String getAddress() {
		return address;
	}

	public int getNoOfFatherAndSister() {
		return noOfFathersAndSisters;
	}

	public void setNoOfFathersAndSisters(int i) {
		
	}

	public void setAddress(String string) {
		
	}

	public void setName(String string) {
		
	}
	

}

//there are two types of initialization one is constructor initialization 
// and other is setter initialization 
