//diagonal elements in R traversal


class Rdiagonal
{
	public static void main(String[] args)
	{
		//int[][] array = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
		int row = 3;
		int col = 3;
		int rowmid = (row/2);
		int colmid = (col/2);
		
		
		System.out.print(array[row-1][0]+" ");
		
		
		System.out.print(array[0][0]+" ");
		
		int i = 0;
		int j = col-1;
		while(i<=rowmid && j>= colmid)
		{
			System.out.print(array[i][j]+" ");
			i++;
			j--;
		}
		
		int k = rowmid+1;
		int s = colmid+1;
		while(k< row && s< col)
		{
			System.out.print(array[k][s]+" ");
			k++;
			s++;
		}
		
	}
}
