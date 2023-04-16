class JTBB
{
	public static void main(String[] args)
	{
		int[][] array = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{1,2,3,4,5}};
		int row = 5;
		int col =5;
		int rowmid = (row/2);
		int colmid = (col/2);
		// J letter
		for(int i =0;i<col;i++)
		{
			System.out.print(array[0][i]+" ");
		}
		for(int i=1;i<row;i++)
		{
			System.out.print(array[i][colmid]+" ");
		} 
		for(int i = colmid-1;i>=0;i--)
		{
			System.out.print(array[row-1][i]+" ");
		}
		
		// T letter
		for(int i =0;i<col;i++)
		{
			System.out.println(array[0][i]+" ");
		}
		for(int i=1;i<row;i++)
		{
			System.out.print(array[i][colmid]+" ");
		}
		
		
		
		// B letter
		for(int i=0;i<row;i++)
		{
			System.out.println(array[i][0]+" ");
		}
		for(int i =1;i<col;i++)
		{
			System.out.print(array[0][i]+" ");
		}
		for(int i =1;i<=rowmid;i++)
		{
			System.out.print(array[i][col-1]+" ");
		}
		for(int i=col-2;i>=1;i--)
		{
			System.out.print(array[rowmid][i]+" ");
		}
		for(int i=rowmid+1;i<row;i++)
		{
			System.out.print(array[i][col-1]+" ");
		}
		for(int i=col-2;i>=1;i--)
		{
			System.out.print(array[row-1][i]+" ");
		}
		
		
		// B letter
		for(int i=0;i<row;i++)
		{
			System.out.println(array[i][0]+" ");
		}
		for(int i =1;i<col;i++)
		{
			System.out.print(array[0][i]+" ");
		}
		for(int i =1;i<=rowmid;i++)
		{
			System.out.print(array[i][col-1]+" ");
		}
		for(int i=col-2;i>=1;i--)
		{
			System.out.print(array[rowmid][i]+" ");
		}
		for(int i=rowmid+1;i<row;i++)
		{
			System.out.print(array[i][col-1]+" ");
		}
		for(int i=col-2;i>=1;i--)
		{
			System.out.print(array[row-1][i]+" ");
		}
	
	}
}
