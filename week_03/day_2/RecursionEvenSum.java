class RecursionEvenSum
{
	public static void main(String[] args)
	{
		int[] array = {1,2,3,4,5,10,4};
		System.out.print(evenSum(array,0,0));
	}
	public static int evenSum(int[] array,int i,int sum)
	{
		if(i >=array.length)
		{
			return sum;
		}
		else if(array[i]%2 ==0)
		{
			sum+=array[i];
		}
		return evenSum(array,++i,sum);
	}
	
} 
