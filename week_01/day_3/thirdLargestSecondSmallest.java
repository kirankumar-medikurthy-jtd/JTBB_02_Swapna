class thirdLargestSecondSmallest
{
	public static void main(String[] args)
	{
		int[] array = {1,2,3,7,8,29,13,34};
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		
		for(int i = 0;i<array.length;i++)
		{
			if(array[i] > max1)
			{
				max1 = array[i];
			}
		}
		System.out.println(max1);
		
		for(int i = 0;i<array.length;i++)
		{
			if(array[i] > max2 && array[i] < max1)
			{
				max2 = array[i];
			}
		}
		System.out.println(max2);
		
		for(int i = 0;i<array.length;i++)
		{
			if(array[i] > max3 && array[i] < max2)
			{
				max3 = array[i];
			}
		}
		System.out.println(max3);
		
		
		
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for(int i = 0;i<array.length;i++)
		{
			if(array[i] < min1)
			{
				min1 = array[i];
			}
		}
		System.out.println(min1);
		
		for(int i = 0;i<array.length;i++)
		{
			if(array[i] < min2 && array[i] > min1)
			{
				min2 = array[i];
			}
		}
		System.out.println(min2);
		
		
		

	}
}
