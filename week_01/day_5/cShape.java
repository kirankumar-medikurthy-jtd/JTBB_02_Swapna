class cShape
{
	public static void main(String[] args)
	{
		int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
		
		int row =3;
		int col = 3;
		
		for(int i=col-1;i>=0;i--)
		{
			System.out.print(array[0][i]+" ");
		}
		
		for(int i =1;i<row;i++)
		{
			System.out.print(array[i][0]+" ");
		}
		for(int i =1;i<col;i++)
		{
			System.out.print(array[row-1][i]+" ");
		}
		
	}
}
