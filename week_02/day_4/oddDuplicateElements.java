//odd duplicate elements in array

class oddDuplicateElements
{
	public static void main(String[] args)
	{
		int[] array = {1,2,3,3,4,5,5,6,7};
		String bag = "";
		for(int i =0;i<array.length;i++)
		{
			for(int j =i+1;j<array.length;j++)
			{
				if(array[i] == array[j] && array[j]%2 == 1)
				{
					System.out.print(array[j]+" ");
				}
			}
		}
	}
}
