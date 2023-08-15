class RecursionDigitSum
{
	public static void main(String[] args)
	{
		int number = 1911;
		String str = "" + number;
		System.out.print(SumofDigits(str,0,0));
	}
	
	public static int SumofDigits(String str,int i,int sum)
	{
		if(i>=str.length())
		{
			return sum;
		}
		else
		{
			sum = sum+str.charAt(i)-'0';
			return SumofDigits(str,++i,sum);
		}
	}
}

