class boxtype
{
	public static void main(String[] args)
	{
		int num = 4;
		
		for(int i = 1;i<=num;i++)
		{
			String bag = "";
			for(int j =1;j<=num;j++)
			{
				if(i==1 || j ==1 || i==num || j==num)
				{
					bag+="*";
				}
				else
				{
					bag+=" ";
				}
			}
			System.out.println(bag);
		}
		
		
	}
	
}
