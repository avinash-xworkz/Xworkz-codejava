class Cosmetics
{
	double price;
	String name;
	String color;
	String brand;
	int cosmeticId;
	
	void makeOver()
	{
	System.out.println("party makeOver");
	}
	
	public static void main (String a[])
	{
		//Cosmetics.price = 645498.00;
		//System.out.println("");
	Cosmetics cos = new Cosmetics();
	cos.price = 89.000;
	cos.name = "Garnier White";
	cos.brand = "Godrej";
	cos.color = "White";
	
	cos.cosmeticId = 456;
	System.out.println(cos.price + " " + cos.name);
	cos.makeOver();
	}
	}