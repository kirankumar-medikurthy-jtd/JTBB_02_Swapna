/*Write a program to move all negative number to left side of an array and all positive number to the right side of an array;
Input : [0,-10,8,-20,-1,3,-9]
Output : [-10,-20,-1,-9,0,8,3]
*/



class arrange
{
	public static void main(String[]args)
	{
		int []arr={0,-10,8,-20,-1,3,-9};
		
		int start=0;
		int end=arr.length-1;
		
		while(start<end)
		{
			if(arr[start]<0)
			{
				start++;
			
			}
			if(arr[end]>0)
			{
				end--;
			
			
			}
			if(start<end)
			{
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
			
			
			}
		
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		
		
		}
	
	
	}

}
