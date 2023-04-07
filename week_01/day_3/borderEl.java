/*Write a program to print all border elements present in a 2d array??
Example : Input 1 : [[1 3  4]
                     [6 3 2]
                    [9 2 10]]                          
                                        //Output1 :  1  6 9 2 10 2 4 3 */ 




class borderEl
{
	public static void main(String[] args)
	{
		int[][] array = {{1,3,4},{6,3,2},{9,2,10}};
		int row = 3;
		int col = 3;
		
		String bag = "";
		for(int i = 0;i<row;i++)
		{
			for(int j = 0;j<col;j++)
			{
				if(i == 0 || j == 0 || i == row-1 || j == col-1  ) 
				{
					bag += array[i][j] + " ";
					
				}
				
			}
		}
		System.out.println(bag);
	}
}
