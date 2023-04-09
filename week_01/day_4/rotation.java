/*Write a program for 90 degrees  rotation of  all elements present in a 2d array?
Example : Input 1 : [[1 3  4]
                                 [6 3 2]
                                  [9 2 10]]                          
                                        Output1 :  [[9 ,6, 1],[2,3,3],[10,2,4]]  */


class rotation
{
	public static void main(String[] args)
	{
		int[][] array = {{1 ,3 , 4},{6,3,2},{9,2,10}};
		
		for(int i =0;i<array.length;i++)
		{
			for(int j=array.length-1;j>=0;j--)
			{
				System.out.print(array[j][i] + " ");
				
			}
			System.out.println();
		}
	}
}
