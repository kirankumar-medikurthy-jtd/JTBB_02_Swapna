class difference{
 public static void main(String[] args)
 {
  	int target=5;
  	int[] array = {1,8,2,3,9,4,5};
  	String flag = "No :"+ "sum is not equal to target";
    	for(int i=0;i<array.length-1;i++)
    	{
    		for(int j=i+1;j<array.length;j++)
    		{
       			if(array[i]-array[j]==target || array[j]-array[i] == target)
       			{
        			flag = "Yes : "+ i+ "," + j+"=" +target ;
        			break;
       			}
    		}
  
    	}
    	System.out.println(flag);
   }
 
} 
