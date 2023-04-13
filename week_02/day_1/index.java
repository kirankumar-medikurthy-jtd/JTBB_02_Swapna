/*Write a program to print all the element present in the matrix below traversal
             Input : mat[][] = {{1, 2, 3 
                                          {4, 5, 6,11}, 
                                          {7, 8, 9,12},
                                            {13,14,15,16}}
             Output : 1 2 3 10 11 6 5 4 7 8 9 12 16 15 14 13*/
             
             
 class index
 {
 	public static void main(String[] args)
 	{
 		int[][] array = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
 		
 		int row = 3;
 		int col = 3;
 		for(int i =0;i<row;i++)
 		{
 			if(i%2==0)	
 			{
 				for(int j = 0 ;j<col;j++)
 				{
 					System.out.print(array[i][j]+" ");
 				}	
 			}
 			else
 			{
 				for(int j= col-1;j>=0;j--)
 				{
 					System.out.print(array[i][j]+" ");
 				}
 			}
 		}
 		
 	}
 }            

