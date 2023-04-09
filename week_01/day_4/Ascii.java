class Ascii
{
	public static void main(String[] args)
	{
		String str1 = "jtd";
		String str2 = "jtd";
		
		int sum1 = 0;
		int sum2 = 0;
		
		int p1 = 0;
		int p2 = 0;
		int start = 0;
		int end = (str1.length() < str2.length())?str1.length():str2.length();
		while(start <end)
		{
			sum1 += (int)str1.charAt(p1);
			sum2 += (int)str2.charAt(p2);
			p1 ++;
			p2 ++;
			start ++;
				
		}
		if(sum1 > sum2)
		{
			System.out.println(sum1 - sum2);
		}
		else if(sum1 == sum2)
		{
			System.out.println(sum1 - sum2);
		}
		else
		{
			System.out.println(sum1 - sum2);
		}
	}
}
