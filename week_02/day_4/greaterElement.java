/*Write a program to print the next greater element present in an array?
Example : Input: arr[] = [ 4 , 5 , 2 , 25 ]
                Output:  4      –>   5
                              5      –>   25
                               2      –>   25
                               25     –>   -1
class greaterElement
{
	
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25,27};
        int n = arr.length;
        int[] nextGreater = new int[n];
        
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    nextGreater[i] = arr[j];
                    break;
                }
            }
            if (j == n) {
                nextGreater[i] = -1;
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " -> " + nextGreater[i]);
        }
    }


}*/








public class greaterElement
    {    
	    public static void main(String argvs[])  
	    {  

		  
		    int[] arr={4,5,2,25};
		      
		    for(int i = 0; i < arr.length; i++)  
		    {  
		    		int temp = -1;  
		    		
		    	for(int j = i + 1; j < arr.length; j++)  
		    	{  
				if(arr[j] > arr[i])  
				{  
				   temp = arr[j]; 
				   break   ;
				}  
			  
			}  
			if(temp != -1)  
			{  
			    System.out.println( arr[i] + " ->  " + temp);  
			}  
			    else  
			{  
			    System.out.println( arr[i] + "->  -1 ");  
			}  
		    }  
	    }  
    }
