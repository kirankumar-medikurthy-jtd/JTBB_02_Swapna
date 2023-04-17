/*Write a program to find the k largest missing number present in the array
Input: arr[] = {2, 8, 7,3 , 5, 9, 11}   K = 3
Output: 8
*/

class klargestmissingnumber
{
	public static void main(String[]args)
	{
		int[]arr={2, 8, 7,3 , 5, 9,11};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		//System.out.println(min);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
		
			}
	
		}
		//System.out.println(max);
		
		int result[]= new int[20];
		
		for(int i=0;i<arr.length;i++)
		{
			result[arr[i]]+=1;
		
		}
		for(int i=min;i<=max;i++)
		{
			result[i]+=1;
		
		}
		int large=Integer.MIN_VALUE;
		
		for(int i=1;i<result.length-1;i++)
		{
			
			if(result[i]==1 && i > large)
			{	
				
				System.out.println( i+" ");
					large = i;
					
			}
		}
		System.out.println("largest  in missing numbers" + large);

	}
}
