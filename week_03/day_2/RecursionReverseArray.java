class RecursionReverseArray
{
	public static void main(String[] args)
	{
		int[] array = {1,2,3,4,5};
		System.out.print(reverseArray(array,array.length-1,""));
	}
	public static String reverseArray(int[] array,int i,String bag)
	{
		if(i < 0)
		{
			return bag;
		}
		else
		{
			bag += array[i]+" ";
			return reverseArray(array,--i,bag);
		}
	}
}
