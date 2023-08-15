/*class RecursionReversing
{
	public static void main(String[] args)
	{
		String str = "swapna";
		reverseString(str,str.length()-1,"");
	}
	
	public static void reverseString(String str,int i,String bag)
	{
		if(i < 0)
		{
			System.out.println(bag);
			return;
		}
		
			bag=bag+str.charAt(i);
			 reverseString(str,--i,bag);
	}
}*/



class RecursionReversing
{
    public static void main(String[] args)
    {
        String str = "RadhaKrishna";
        String reversed = reverseString(str, str.length() - 1);
        System.out.println(reversed);
    }

    public static String reverseString(String str, int i)
    {
        if (i < 0)
        {
            return "";
        }
        
        char temp = str.charAt(i);
        String reversedSubstring = reverseString(str, --i);
        
        return temp + reversedSubstring;
    }
}

