/*Two common ways of traversing a matrix are row-major-order and column-major-order. 
Input : mat[][] = {{1, 2, 3}, 
                            {4, 5, 6}, 
                           {7, 8, 9}}
Output : Row-wise: 1 2 3 4 5 6 7 8 9
               Col-wise : 1 4 7 2 5 8 3 6 9*/
               
               
class majorOrder
{
	public static void main(String[] args)
	{
		int[][] array = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		
		int row = 3;
		int col = 3;
		
		for(int i =0;i<row;i++)
		{
			for(int j =0;j<col;j++)
			{
				System.out.print(array[i][j]+" ");
			}
		}
		
		for(int i =0;i<row;i++)
		{
			for(int j =0;j>col;j++)
			{
				System.out.print(array[i][0]+" ");
			}
		}
		
		
		//col wise
		
		
		for(int i =0;i<row;i++)
		{
			System.out.println(array[i][0]+" ");
		}
		
		for(int i =0;i<row;i++)
		{
			System.out.print(array[i][1]+" ");
		}
		
		for(int i =0;i<row;i++)
		{
			System.out.print(array[i][2]+" ");
		}
		
	}
}

