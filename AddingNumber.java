class AddingNumber
{
	static double finalData;
	public static void main(String a[])
	{		
		int output = add();
		System.out.println(output);
		double ans = add(567,123);
		double ansForThree = add(567,123,89);
		System.out.println(ans);
		System.out.println(ansForThree);
		
	}
	static int add()
	{
		int a=10;
		int b=14;
		int c = a+b;
		return c;
		
	}
	static double add(double sub1, double sub2)
	{
		double finalData = ((sub1+sub2));
		return finalData;
	}
	static double add(double sub1, double sub2, double sub3)
	{
		double finalData = ((sub1+sub2+sub3));
		return finalData;
	}
}
	
		