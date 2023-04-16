/*Two common ways of traversing a matrix are row-major-order and column-major-order. 
Input : mat[][] = {{1, 2, 3}, 
                            {4, 5, 6}, 
                           {7, 8, 9}}
Output : Row-wise: 1 2 3 4 5 6 7 8 9
               Col-wise : 1 4 7 2 5 8 3 6 9*/
               
               
class columnMajorOrder
{

	public static void main(String[] args)
	{
		int[][] array = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		
		int row = 3;
		int col = 3;
		String bag = "";
		int i =0;
		while(i<col)
		{
			for(int j =0;j<row;j++)
			{
				bag += (array[j][i]+" "); 
			}
			i++;
		}
		System.out.print(bag);
		
		
		for(int k=0;k<row;k++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println(("\n"+array[k][j]));
			}
		}
	}
	
	
	
}

