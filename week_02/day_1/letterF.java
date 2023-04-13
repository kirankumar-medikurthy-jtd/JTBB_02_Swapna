/*Write a program to print all the elements present in the matrix in “F” traversal.
             Input : mat[][] = {{1, 2, 3,5,6}, 
                            {4, 5, 6}, 
                           {7, 8, 9}}
Output: 1 2 3 4 5  7*/


class letterF
{
	public static void main(String[] args)
	{
		int[][] array = {{1, 2, 3,4,5},{4, 5, 6,7,8},{7, 8, 9,7,5},{7, 8, 9,7,5},{7, 8, 9,7,5}};
		
		int row = 5;
		int col = 5;
		int rowmid = (row/2);
		int colmid = (col/2);
		
		for(int i =0;i<row;i++)
		{
			System.out.print(array[i][0]+" ");
		}
		
		for(int i = 1;i<col;i++)
		{
			System.out.print(array[0][i]+" ");
		}
		
		for(int i =1;i<col-1;i++)
		{
			System.out.print(array[rowmid][i]+" ");
		}
	}
}
