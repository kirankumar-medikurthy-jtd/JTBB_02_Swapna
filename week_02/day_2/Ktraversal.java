/*Write a program to print all the element present in the matrix in “K” Traversal 
          Input : mat[][] = {{1, 2, 3}, 
                                       {4, 5, 6}, 
                                        {7, 8, 9}}
Output : 1 4 7 3 5 9*/


class Ktraversal
{
	public static void main(String[] args)
	{
		int[][] array = {{1, 2, 3,4,5,6,7},{1, 2, 3,4,5,6,7},{1, 2, 3,4,5,6,7},{1, 2, 3,4,5,6,7},{1, 2, 3,4,5,6,7},{1, 2, 3,4,5,6,7},{1, 2, 3,4,5,6,7}};
		
		int row = 7;
		int col = 7;
		
		int rowmid = (row/2);
		System.out.println(rowmid);
		int colmid = (col/2);
		System.out.println(colmid);
		
		for(int i =0;i<row;i++)
		{
			System.out.print(array[i][0]+" ");
		}
		int s =0;
		int k =col-1;
		while(s<=rowmid && k >=colmid)
		{
			System.out.print(array[s][k]+" ");
			s++;
			k--;
		}
		for(int i =colmid-1;i>=0;i--)
		{
			System.out.print(array[rowmid][i]+" ");
		}
		
		int i = rowmid;
		int j = colmid;
		while(i<row && j < col)
		{
			System.out.print(array[i][j]+" ");
			i++;
			j++;
		}
		
		
	}
}

