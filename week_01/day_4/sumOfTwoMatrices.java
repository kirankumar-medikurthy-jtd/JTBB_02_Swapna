/*Write a program to add two 2D Arrays?
Example : input1:  [[1,2,3],       input2 : [[9,8,7],
                              [4,5,6],                        [6,5,4],
                              [7,8,9]]                        [3,2,1]]*/



public class sumOfTwoMatrices

{  
	public static void main(String args[])
	{  
   
		int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};    
		int arr2[][]={{9,8,7},{6,5,4},{3,2,1}};    
    


		int row=3;
		int col=3;  
		int sum[][]=new int[3][3];
    
   
		for(int i=0;i<row;i++)
		{
		    for(int j=0;j<col;j++)
		    {    
			sum[i][j]=arr1[i][j]+arr2[i][j];  
			  
				System.out.print(sum[i][j]+" ");    
			}    
				System.out.println();    
		}	    
	}
}
