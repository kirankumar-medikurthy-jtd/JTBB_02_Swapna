/*Write a program to find subarray with given sum, Array contain non negative integer?
Input : [1,4,20,3,10,5]  sum = 33
Output : 2,3,4;*/





class subArraySum
{
public static void main(String[]args)
	{
		int[] array = {1,4,20,3,10,5};
		
		
		int sum = 33;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i;j<array.length;j++)
			{
				int subarraySum = 0;
				String subarray="";
				for(int m=i;m<=j;m++)
				{
					subarraySum+=array[m];
					subarray += m + " ";
					
				}
				if(subarraySum == sum)
				{
					System.out.println(subarray);
				}
			}
		
		}
		
	
	
	}
}	

