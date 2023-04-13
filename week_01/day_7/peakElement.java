/*Write a program to find a peak element, which is not smaller than its neighbors
Input : array[] = {5,10,20,15}
Output : 20*/

class peakElement
{
	public static void main(String[] args)
	{
		int[] array = {5,3,2,15,19,14};
		
		for(int i = 1;i<array.length;i++)
		{
			if(array[i] > array[i-1] && array[i]> array[i+1])
			{
				System.out.print(array[i]);
			}
		}
	}
}

/*class peakElement
{
	public static void main(String[] args)
	{
		int[] arr = {5,1,10,20,6,7};
		int firstElm = arr[0];
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > firstElm)
			{
				firstElm = arr[i];	
			}
			
		}
		System.out.println(firstElm);
	
	}
		
}*/





