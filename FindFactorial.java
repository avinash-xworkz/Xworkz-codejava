class FindFactorial
{
	public static void main(String a[])
	{
		int f = myFact(7);
		int g = myFact(4);
		int r = myFact(3);
		int finalOutput = f/(g*r);
		System.out.println(finalOutput);
		
		double total = FindAverage.avg(45.45,89.99,99.99);
		System.out.println(total);
	}
	static int myFact(int nm)
	{
		int fact = 1;
		for(int i=1;i<=nm;i++)
		{
			fact=fact*i;
			// return fact;
		}
		System.out.println(fact);
		return fact;
	}
}
			
			
/*
class FindFactorial
{
	public static void main(String a[])
	{
		myFact(89);
	}
	static void myFact(double nm)
	{
		double fact = 1;
		for(int i=1;i<=nm;i++)
		{
			fact=fact*i;
			// return fact;
		}
		System.out.println(fact);
	}
}
			
			
*/			