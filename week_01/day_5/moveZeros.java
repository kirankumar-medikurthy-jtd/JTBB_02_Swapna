/*Write a program to move all non zeros values to the left side of an array and zero values to the right side of an array?
Input : Array = [1,1,0,1,0,1,0,1,1];
Output : [1,1,1,1,1,1,0,0,0]*/

class moveZeros
{
	public static void main(String[] args)
	{
		int[] array = {1,1,0,1,0,1,0,1,1};
		
		for( int i= 0;i<array.length;i++)
		{
			for(int j = i+1;j<array.length;j++)
			{
				if(array[i] <= 0)
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int i = 0;i<array.length;i++)
		{
			System.out.print(array[i] +" ");
		}

	}
}

