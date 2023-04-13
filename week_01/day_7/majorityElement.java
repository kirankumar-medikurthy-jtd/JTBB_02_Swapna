/*Find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).
Input : A[]={3, 3, 4, 2, 4, 4, 2, 4, 4}
Output : 4*/

class majorityElement
{
	public static void main(String[] args)
	{
		int[] array = {3, 3, 4, 2, 4, 4, 2, 4, 4};
		int n = array.length;
		for(int i =0;i<n;i++)
		{
			if(array[i] == n/2)
			{
				System.out.print(array[i]);
				break;
			}
		}
	}
}

