//Write a program to check to print indices of three numbers present in an array, whose sum is equal to target value ?
 //           Example : input  : Array = [2,3,4,6,8,1];     Target : 13
  //               Output = 1,2,3

class elementTarget
{
	public static void main(String[] args)
	{
		int[] array = {2,3,4,6,8,9};
		int target = 14;
		System.out.println(arraytarget(array, target));
	}	
		
		public static String arraytarget(int[] array, int target)
		{
			String flag = "No :"+ "sum is not equal to target";
		    	for(int i=0;i<array.length-1;i++)
		    	{
		    		for(int j=i+1;j<array.length-1;j++)
		    		{
		    			for(int k = j+1;k<array.length-1;k++)
		    			{
			       			if(array[i]+array[j] + array[k]==target)
			       			{
							flag = "the index values of "+ i+ "," + j+ "," + k + "=" +target ;
							break;
			       			}
			       		}	
		    		}
		  
		    	}
    			return flag;
		}
	
}


