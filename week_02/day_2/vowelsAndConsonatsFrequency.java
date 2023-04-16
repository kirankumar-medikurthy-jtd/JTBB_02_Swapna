class vowelsAndConsonatsFrequency
{
 
	public static void main(String[]args)
	{
		
		String str="welcome to JTD jtbb bootcamp";
		
		System.out.print(str+"\n");
		for (int i = 0; i < str.length(); i++)
       	       {
		    int count = 1;
		    boolean counted = false;
		    for (int j = 0; j < i; j++)
            	    {
		        if (str.charAt(j) == str.charAt(i))
		        {
		            counted = true;
		            break;
		        }
            	    }
		    if (counted==false)
		    {
		        for (int j = i+1; j < str.length(); j++)
		        {
		            if (str.charAt(j) == str.charAt(i)) 
		            {
		                count++;
		            }
		        }
		        System.out.println(str.charAt(i) +":"+ count );
		    }
		}
		
        
        
        
		int start=0;
		int previous=0;
		
		while(start<str.length())
		{
			while(start<str.length() && str.charAt(start)!=' ')
			{
				start++;
			}
			String temp=str.substring(previous,start);
			//System.out.print(findVowel(temp));
			System.out.print(temp+"\n");
			frequency(temp);
			
			System.out.print(findConsonants(temp));
			start=start+1;
			previous=start;
			
		}
	
	}
	public static String findVowel(String str)
	{
		String vowel="";
		String consonants="";
		for(int i=0;i<str.length();i++)
		{
			
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' ||str.charAt(i)=='u')
				{
					vowel+=str.charAt(i);
				
				}
				
		}
		return vowel;
				
	}
	
	
	public static String findConsonants(String str)
	{
		String vowel="";
		String con="";
		for(int i=0;i<str.length();i++)
		{
			
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' ||str.charAt(i)=='u')
				{
					vowel+=str.charAt(i);
				
				}
				else
				{
					con+=str.charAt(i);
				}
				
		}
		return con;
				
	}
	
	
	public static void frequency(String str)
	{
	for (int i = 0; i < str.length(); i++)
       	       {
		    int count = 1;
		    boolean counted = false;
		    for (int j = 0; j < i; j++)
            	    {
		        if (str.charAt(j) == str.charAt(i))
		        {
		            counted = true;
		            break;
		        }
            	    }
		    if (counted==false)
		    {
		        for (int j = i+1; j < str.length(); j++)
		        {
		            if (str.charAt(j) == str.charAt(i)) 
		            {
		                count++;
		            }
		        }
		        System.out.println(str.charAt(i) +":"+ count );
		    }
		}
	}
		
	
    
}
