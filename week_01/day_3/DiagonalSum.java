/*Write a program to calculate a  sum of left diagonal and right diagonal elements present in 2D arrays?
Example : Input  : [[1 3  4]
                                 [6 3 2]
                                  [9 2 10]]                          
                                         Output :  27*/

class DiagonalSum
{
	public static void main(String[] args)
	{
		int[][] array = {{1,3,4},{6,3,2},{9,2,10}};
		
		int row = 3;
		int col = 3;
		String bag = "";
		int count = 0;
		
		for(int i =0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i%2==0 && j%2==0 || i%2==1 && j%2==1)
				{
					bag += array[i][j]+" ";
					count+=array[i][j];
				}
			}
		}
		System.out.println(bag);
		System.out.println(count);
	}
}
