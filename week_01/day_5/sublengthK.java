/*Write a program to print all the substrings of a string whose length is equal to K value?
Input : String  = “jtdfoundation”     K = 3;

*/

class sublengthK

{
	public static void main(String[]args)
	{
		String str="jtdfoundation";
		int k=3;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
				String substr="";
				for(int m=i;m<=j;m++)
				{
					substr+=str.charAt(m);
				}
				if(substr.length()==k)
				{
					System.out.println(substr);
				}
			
			}
		
		}
	
	
	}
}
