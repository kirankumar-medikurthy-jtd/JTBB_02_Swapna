/*Write a program to print all odd length palindrome words present in a sentence.
Input : String = “madam speak malayalam fluently”
Output : madam, malayalam*/

class oddPalindrome
{
	public static void main(String[] args)
	{ 
		String str = "madam speak malayalam fluently";
		
		int start  = 0;
		int prePoint = 0;
		// counting the words of a sentence
		int count = 0;
		
		while(start < str.length())
		{
			while(start < str.length() && str.charAt(start) != ' ')
			{
				start ++;
			}
			String temp = str.substring(prePoint,start);
			
			count ++;
			
			// checking the if the word is oddlengthpalindrome or not
			if(temp.length() % 2 != 0 && Palindrome(temp))
			{
				System.out.println(temp);
			}
			// calling the ReverseWord function here*/
            		
			ReverseWord(temp);
			start = start + 1;
			prePoint = start;
		}
		//printing the count of words
		System.out.println("\n"+"number of words in this sentence - " + count);
	 }
	
	//checking the palindrome
	public static boolean Palindrome(String str)
	{
		int start = 0;
		int end = str.length()-1;
		while(start < end)
		{
			if(str.charAt(start) != str.charAt(end))
			{
				return false;
			}
			start ++;
			end --;
		}
		return true;
	}
	 //Reversing the words present in a sentence
	    public static void ReverseWord(String str)
	    {
		char[] strarray = str.toCharArray();
		int start = 0;
		int end = strarray.length -1 ;
		while(start < end)
		{
		    char temp = strarray[start];
		    strarray[start] = strarray[end];
		    strarray[end] = temp;
		    start++;
		    end--;
		}
		System.out.print(CharArrayToString(strarray));
		System.out.println(EvenIndicesCharacter(strarray) + " ");
	    }
	    // Converting character array into a string 
	    public static String CharArrayToString(char[] array)
	    {
		String result = "";
		for(int i = 0; i < array.length; i++)
		{
		    result += String.valueOf(array[i]);
		}
		return result+" ";
	    }
	    // printing the evenIndecies character in a word
	    public static String EvenIndicesCharacter(char[] strarray)
	    {
		String evenIndicesCharacter = "";
		for(int i = 0; i < strarray.length; i++)
		{
		    if(i % 2 == 0)
		    {
		        evenIndicesCharacter += String.valueOf(strarray[i]);
		    }
		}
		return evenIndicesCharacter+" ";
	    }
}


