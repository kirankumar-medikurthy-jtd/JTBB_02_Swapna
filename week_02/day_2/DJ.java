class DJ
{
	
	
	public static void main(String[] args)
	{
		int[][] array = {{1,2,3,4,5},{4,5,6,7,8},{7,8,9,4,5},{1,2,3,4,6},{5,4,7,9,8}};
		int row =5;
		int col =5;
		int colmid = (col/2);
		
		// D letter
		for(int i = 0;i<row;i++)
		{
			System.out.print(array[i][0]+" ");
		}
		for(int i=1;i<col-1;i++)
		{
			System.out.print(array[0][i]+" ");
		}
		for(int i=1;i<row-1;i++)
		{
			System.out.print(array[i][col-1]+" ");
		}
		for(int i =col-2;i>=1;i--)
		{
			System.out.print(array[row-1][i]+" ");
		}
		
		// J letter	
		for(int i =0;i<col;i++)
		{
			System.out.println(array[0][i]+" ");
		}
		for(int i=1;i<row;i++)
		{
			System.out.print(array[i][colmid]+" ");
		} 
		for(int i = colmid-1;i>=0;i--)
		{
			System.out.print(array[row-1][i]+" ");
		}
	
		
	}
	
		
		
	
		
}
