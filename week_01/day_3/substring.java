
class substring
{
	public static void main(String[] args)
	{
		String str = "bootcamp";
		int a = str.length();
		int count=0;
		
		
		
		for(int i = 0;i<a;i++)
		{
			for(int j=i;j<=a-1;j++)
			{
				String sub = str.substring(i,j);
				System.out.println(sub);
				
				count++;
			}
		}
		
		System.out.println(count);

	}
}
