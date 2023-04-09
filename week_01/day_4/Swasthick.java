class Swasthick
{
	public static void main(String[] args)
	{
		int[][] array = { {1,2,3,4,5} , {1,2,3,4,5} , {1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
		
		int row = 5;
		int col = 5;
		
		int rowmid = (row/2);
		int colmid = (col/2);
		
		for(int i = 0;i<colmid;i++)
		{
			System.out.print(array[0][i] +" ");
		}
		
		for(int i=0;i<row;i++)
		{
			System.out.println(array[i][colmid]+" ");
		}
		
		for(int i =colmid+1;i<col;i++)
		{
			System.out.print(array[row-1][i]+" ");
		}
		
		for(int i=row-1;i>rowmid;i--)
		{
			System.out.println(array[i][0]+" ");
		}
		for(int i =0;i< col;i++)
		{
			System.out.print(array[rowmid][i]+" ");
		}
		for(int i=rowmid-1;i>=0;i--)
		{
			System.out.println(array[i][col-1]+" ");
		}
	}
}
