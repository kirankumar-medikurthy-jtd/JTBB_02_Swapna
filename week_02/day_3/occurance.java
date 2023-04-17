/*frequency of characters*/

class occurance
{
	public static void main(String[] args)
	{
		int[] array = {2,2,2,6,6,5,5,5,7,7,3,3,3,0,0,0};
		int max = Integer.MIN_VALUE;
		int min  = Integer.MAX_VALUE;
		
		for(int i =0;i<array.length;i++)
		{
			if(array[i]> max)
			{
				max = array[i];
			}
		}
		System.out.println(max);
		for(int i = 0;i<array.length;i++)
		{
			if(array[i] < min)
			{
				min = array[i];
			}
		}
		System.out.println(min);
		
		int result[] = new int[20];
		for(int i =0;i<array.length;i++)
		{
			result[array[i]] += 1;
			
		}
		/*for(int i = min;i<= max;i++)
		{
			result[i] += 1;
		}*/
		
		for(int i =0;i< result.length;i++)
		{
			if(result[i] > 0)
			{
				System.out.println(i +"-" + result[i]+" ");
			}
		}
	}
}
