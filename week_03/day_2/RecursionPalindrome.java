class RecursionPalindrome
{
    public static void main(String[] args)
    {
        String str = "amma";
        boolean isPalindrome = checkPalindrome(str, 0, str.length() - 1);
        
        if (isPalindrome)
        {
            System.out.println(str+"-Palindrome");
        }
        else
        {
            System.out.println(str+"- Not a palindrome");
        }
    }

    public static boolean checkPalindrome(String str, int start, int end)
    {
        if (start >= end)
        {
            return true;
        }
        
        if (str.charAt(start) != str.charAt(end))
        {
            return false;
        }
        
        return checkPalindrome(str, start + 1, end - 1);
    }
}

