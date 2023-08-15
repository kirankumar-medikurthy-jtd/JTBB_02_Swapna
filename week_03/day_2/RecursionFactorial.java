class RecursionFactorial
{
	public static void main(String[] args)
	{
		int number = 5;
		int fact = 1;
		factorial(number,1,fact);
		
	}
	public static void factorial(int number,int i,int fact)
	{
		if(i == number+1 )
		{
			System.out.println(fact);
			return;
		}
			fact*=i;
			factorial(number,++i,fact);
		
	}
}
