/*Write a program to print diamond traversal of an array?
Example : input : [[1,2,3],[4,5,6],[7,8,9]]
                 Output : 3 2 6 8*/

class DiamondTraversal
{
	public static void main(String[] args)
	{
		int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
		int row = 3;
		int col = 3;
		int colmid = (col/2);
		int rowmid = (row/2);
		
		int i = 0;
		int j = colmid;
		
		while(i <= rowmid && j <col)
		{
			System.out.print(array[i][j]+" ");
			i++;
			j++;
		}
		
		int k = rowmid+1;
		int s = col-2;
		while(k<row && s>=colmid)
		{
			System.out.print(array[k][s]+" ");
			k++;
			s--;
		}
		
		int r = colmid-1;
		int w = row-2;
		while(r>=0 && w >rowmid)
		{
			System.out.print(array[w][r]+" ");
			r--;
			w --;
		}
		
		int a = rowmid;
		int n = 0;
		while(a>=0 && n< colmid)
		{
			System.out.print(array[a][n]+" ");
			a--;
			n ++;
		}
	}
}                 
