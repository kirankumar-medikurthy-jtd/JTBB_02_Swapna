/*Write a program to print all the elements present in the matrix in “R” traversal.
Input : mat[][] = {{1, 2, 3}, 
                            {4, 5, 6}, 
                           {7, 8, 9}}
                        Output: 1 4 7 2 3 6 5 9*/
                        
class Rtraversal
{
	public static void main(String[] args)
	{
		int[][] array = {{1, 2, 3,5,4},{4, 5, 6,3,2},{7, 8, 9,8,5},{1,3,6,2,7},{2,4,3,6,8}};
		int row = 3;
		int col = 3;
		int rowmid = (row/2);
		
		for(int i= 0 ;i<row;i++)
		{
			System.out.print(array[i][0]+" ");
		}
		
		for(int i = 1;i< col;i++)
		{
			System.out.print(array[0][i]+" ");
		}
		for(int i=1;i<rowmid;i++)
		{
			System.out.print(array[i][col-1]+" ");
		}
		
		for(int i = col-1;i>=1;i--)
		{
			System.out.print(array[rowmid][i]+" ");
		}
		for(int i =rowmid+1; i<row;i++)
		{
			System.out.print(array[i][col-1]+" ");
		}
		
	}
}                        

