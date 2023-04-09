//Write a program to check if the sum of maximum and minimum elements present in an array is even number or odd number?
 //               Example : input :Array = [3,8,19,3,2,7,6], output :  “odd number”

class largest
{
	public static void main(String[] args)
	{
		int[] array = {3,8,19,3,2,7,6};
		
		int max = -1;
		
		
		for(int i =0;i<array.length;i++)
		{
		
			if(array[i] > max)
			{
				max = array[i];
				
			}
			
		}
		System.out.println(max);
		
		
		int min = array[0];
		for(int i =0;i<array.length;i++)
		{
		
			if(array[i] < min)
			{
				min = array[i];
				
			}
			
		}
		System.out.println(min);
		
		int sum = max + min;
		
		if(sum%2 == 0 )
		{
			System.out.println(sum + " even num");
		}
		else
		{
			System.out.println(sum + " odd num");
		}
	}
}




