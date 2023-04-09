/*Write a program to print all the element in a string in the form “T” pattern in a 2D array
Input : Array = [[1,2,3],[4,5,6],[7,8,9]]
Output : 1 2 3 5 8*/


class tShape
{
	public static void main(String[] args)
	{
		int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
		
		int row =3;
		int col = 3;
		
		int colmid = (col/2);
		for(int i = 0;i<col;i++)
		{
			System.out.println(array[0][i]);
		}
	        for(int i = colmid;i<row;i++)
	        {
	        	System.out.println(array[i][colmid]+" ");
	        }
		
		
	}
}

