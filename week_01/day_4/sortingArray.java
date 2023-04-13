/*Write a program to sort an array in the descending order without an inbuilt sort method?
Example : input : [2,8,6,5,9,4,7]
                 Output : [9,8,7,6,5,4,2]*/


class sortingArray
{
	public static void main(String[] args) 

	{
		int[] array = {2,8,6,9,7,11,12,86,1};
		for(int i =0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length-1;j++)
			{
				if(array[i] < array[j])
				{	
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int i = 0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		    
	}
}


