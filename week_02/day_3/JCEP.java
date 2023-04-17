/*Write a program to print the array element in the pattern below?
            Example : input  : String str = “JCEP”*/
            
class JCEP
{
	public static void main(String[] args)
	{
		int[][] array = {{1,2,3,4,5},{4,5,6,7,8},{7,8,9,7,8},{7,8,9,7,8},{7,8,9,7,8}};
		
		int row = 5;
		int col = 5;
		int colmid = (col/2);
		int rowmid = (row/2);
		
		//J letter
		/*for(int i =0;i<col;i++)
		{
			System.out.print(array[0][i]+" ");
		}
		for(int i =1;i<row;i++)
		{
			System.out.print(array[i][colmid]+" ");
		}
		for(int i =colmid-1;i>=0;i--)
		{
			System.out.print(array[col-1][i]+" ");
		}
		
		// C letter
		for(int i = col-1;i>=1;i--)
		{
			System.out.println(array[0][i]+" ");
		}
		for(int i =1;i<row-1;i++)
		{
			System.out.print(array[i][0]+" ");
		}
		for(int i =1;i<col;i++)
		{
			System.out.print(array[row-1][i]+" ");
		}
		
		// E letter
		for(int i =0;i<row;i++)
		{
			System.out.print(array[i][0]+" ");
		}
		for(int i =1;i<col;i++)
		{
			System.out.print(array[0][i]+" ");
		}
		for(int i =1;i<col;i++)
		{
			System.out.print(array[rowmid][i]+" ");
		}
		for(int i =1;i<col;i++)
		{
			System.out.print(array[row-1][i]+" ");
		}*/
		
		//p letter
		
		for(int i = 0;i<row;i++)
		{
			System.out.print(array[i][0]+" ");
		}
		for(int i =1;i<col;i++)
		{
			System.out.print(array[0][i]+" ");
		}
		for(int i =1;i<rowmid;i++)
		{
			System.out.print(array[i][col-1]+" ");
		}
		for(int i=col-1;i>=1;i--)
		{
			System.out.print(array[rowmid][i]+" ");
		}
		
	}
}            

