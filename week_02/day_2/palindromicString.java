public class palindromicString
{
	public static void main(String[] args)
	{
		String str = "babad";
		
			for(int j = 0; j < str.length(); j++)
			{
				//String substr="";
				
				for(int f = j+1; f <= str.length(); f++)
				{
					String substr=str.substring(j,f);
					if(findPalindrom(substr) && substr.length()%2==1)
					{
						System.out.println(substr);
					}
				}
			}
		
	}
	
	public static boolean findPalindrom(String str)
	{
		int start = 0;
		int end = str.length()-1;
		boolean flag = true;
		while(start < end)
		{
			if(str.charAt(start) != str.charAt(end))
			{
				flag =  false;
			}	
			start++;
			end--;
		}
		return flag;
		
		
	}
}
