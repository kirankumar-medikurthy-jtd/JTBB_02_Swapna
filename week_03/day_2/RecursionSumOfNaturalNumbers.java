class RecursionSumOfNaturalNumbers
{
	/*public static void main(String[] args)
	{
		int[] array = {1,2,3,4,5,10};
		int size = array.length;
		System.out.print(arraySum(array,size,0,0));
	}	
		
	public static int arraySum(int[] array,int size,int i,int sum)
	{
		if(i == size)
		{
			return sum;
		}
		else
		{
			sum = sum+array[i];
			return arraySum(array,size,++i,sum);
		}
	}*/
	
	public static void main(String[] args)
	{		
		int num = 5;
		System.out.print(arraySum(num,1,0));
	}	
		
	public static int arraySum(int num,int i,int sum)
	{
		if(i > num)
		{
			return sum;
		}
		else
		{
			sum = sum+i;
			return arraySum(num,++i,sum);
		}
	}
}
