class diamond
{
	public static void main(String[] args)
	{
		int[][] array = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		//int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
		int row = 5;
		int col = 5;
		int rowmid = (row/2);
		int colmid = (col/2);
		
		
		// code for / line
		
		int i= rowmid;
		int j = 0;
		while(i>=0 && j<=colmid)
		{
			System.out.print(array[i][j]+" ");
			i--;
			j++;
		}
		
		// code for \ line
		
		int k= 1;
		int l = colmid+1;
		while(k<=rowmid && l < col)
		{
			System.out.print(array[k][l]+" ");
			k++;
			l++;
		}
		
		// code for / line
		
		int a = rowmid+1;
		int b = col-2;
		while(a<row && b>colmid)
		{
			System.out.print(array[a][b]+" ");
			a++;
			b--;
		}
		
		//code for \ line
		
		int c= row-1;
		int d =colmid;
		while(c>=rowmid && d>=0)
		{
			System.out.print(array[c][d]+" ");
			c--;
			d--;
		}

	}
}
