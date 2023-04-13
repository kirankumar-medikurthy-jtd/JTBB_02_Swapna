/*Write a program to calculate a  sum of left diagonal and right diagonal elements present in 2D arrays?
Example : Input  : [[1 3  4]
                                 [6 3 2]
                                  [9 2 10]]                          
                                         Output :  27*/



class Diag
{
	public static void main(String[] args)
	{
		int[][] array = {{1,3,4},{6,3,2},{9,2,10}};
		int row = 3;
		int col = 3;
		int i = 0;
		int j =0;
		
		int sum1 = 0;
		while(i< row && j< col)
		{
			System.out.print(array[i][j] + " ");
			sum1 +=array[i][j];
			i++;
			j++;
		}
		
		int sum2 = 0;
		int s =0;
		int k =col-1;
		while(s<row && k >=0)
		{
		
			if(s != k){
				System.out.print(array[s][k]+" ");
				sum2 += array[s][k];
			}
			s++;
			k--;
		}
		
		int result = sum1 + sum2;
		System.out.print(result);
		
	}
}
