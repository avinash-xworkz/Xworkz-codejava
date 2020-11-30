class EvenOrOdd
{
	public static void main(String a[])
	{
		int number1 = isEven(89);
		System.out.println(number1 + " " + "is Odd");
		int number2 = isEven(84);
		System.out.println(number2 + " " + "is Even");		// method calling or caller
	}
		static int isEven(int number)			//called with parameter/parameterized
		{
		if (number%2==0)
		return number;
		else
		return number;
		}
}



/* class EvenOrOdd
{
	public static void main(String a[])
	{
		isEven(89);
		isEven(46);
		isEven(121);
		isEven(84);
		isEven(99);		// method calling or caller
	}
		static void isEven(int number)			//called with parameter/parameterized
		{
		if (number%2==0)
		System.out.println(number +" " + "is Even");
		else
		System.out.println(number + " " + "is Odd");
		}
}	*/