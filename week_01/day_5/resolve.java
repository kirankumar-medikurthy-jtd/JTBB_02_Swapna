/*Write a program to transpose a given 2D Array
Input : [1,2,3],[4,5,6],[7,8,9]]
Output : [[1,4,7],[2,5,8],[3,6,9]]*/

 
class resolve
{
	public static void main(String[]args)
	{
		int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
		
		int row=3;
		int col=3;
		
		for(int i=0;i<row;i++)
		{
			System.out.print(arr[i][0]+" ");
		
		}
		for(int i=0;i<row;i++)
		{
			System.out.print(arr[i][1]+" ");
		
		}
		for(int i=0;i<row;i++)
		{
			System.out.print(arr[i][2]+" ");
		
		}
		
	}
}
