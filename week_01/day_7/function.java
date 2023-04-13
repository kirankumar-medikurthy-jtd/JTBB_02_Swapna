/*Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[]
Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
Output: 4 */


class function
{
	public static void main(String[] args)
	{
		int[] array =  {1, 1, 2, 2, 2, 2, 3,};
		int x = 3;
		System.out.print(arrayfunction(array,x));
		
	}
	public static int arrayfunction(int[] array,int x)
	{
		int count = 0;
		for(int i =0;i<array.length;i++)
		{
			
			
			if(array[i] == x){	
					count +=1;	
				
				
			}
			
		}
		return count;
	}
}

