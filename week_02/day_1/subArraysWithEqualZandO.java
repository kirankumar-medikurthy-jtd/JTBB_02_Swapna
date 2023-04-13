/*Given an array arr[] of size n containing 0 and 1 only. The problem is to count the subarrays having an equal number of 0’s and 1’s.
Input: arr[] = {1, 0, 0, 1, 0, 1, 1}
Output: 8
Explanation: The index range for the 8 sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4), (4, 5)(2, 5), (0, 5), (1, 6)*/


class subArraysWithEqualZandO 
{
	public static void main(String[]args)
	{
		int[]arr={1, 0, 0, 1, 0, 1, 1};
		int count=0;
		
		int n=arr.length;
		//int count=0;
		
		for(int i=0;i<n;i++)
		{
			int zeros=0;
			int ones=0;
			
			for(int j=i;j<n;j++)
			{
				if(arr[j]==0)
				{
					zeros++;
				
				}else
				{
					ones++;
				
				}if(zeros==ones)
				{
					count++;				
						
				
				}	
				
				
				
			}
		
		}
		System.out.println(count);
	
	}
}	
	
