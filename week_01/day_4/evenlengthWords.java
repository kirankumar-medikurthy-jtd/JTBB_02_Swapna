/*Write a program to print all even length words present in the sentence?
Example : Input  :  String str = “JTD is running JTBB Bootcamp”                      
                                         Output : is
                                                       JTBB
                                                       Bootcamp
*/



class evenlengthWords 
{
    public static void main(String[] args)
    {
        String str = "JTD is running JTBB Bootcamp";
        int start = 0;
        int prev = 0;
        while(start < str.length())
        {
            while(start < str.length() && str.charAt(start) != ' ')
            {
                start++;
            }
            String temp = str.substring(prev,start);
            if(temp.length() % 2 == 0)
            {
                System.out.println(temp);
            }
            start = start+1;
            prev = start;
        }
    }
}
