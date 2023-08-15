/*class RecursionMaximumElement
{
	public static void main(String[] args)
	{
		int[] array = {1,2,3,4,5,6};
		int size = array.length-1;
		int max = Integer.MIN_VALUE;
		System.out.print(MaximumElement(array,array.length,max));
	}
	
	public static int MaximumElement(int[] array,int i,int max)
	{
		if(i == 0)
		{
			return max;
		}
		else if(array[i] > max)
		{
			max = array[i];
		}
		return MaximumElement(array,--i,max);
	}
}*/


class RecursionMaximumElement {
    public static void main(String[] args) {
        int[] array = {1, 10, 3, 9, 0, 6};
        int max = Integer.MIN_VALUE;
        System.out.print(MaximumElement(array, array.length - 1, max));
    }

    public static int MaximumElement(int[] array, int i, int max) {
        if (i < 0) {
            return max;
        } else if (array[i] > max) {
            max = array[i];
        }
        return MaximumElement(array, --i, max);
    }
}

