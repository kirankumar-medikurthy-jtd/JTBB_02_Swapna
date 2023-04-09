/*Write a program for  removing the leading zero present in a string  
Example : Input  : 00000123569 
                Output :  123569*/
                
class leadingZeros
{
	public static void main(String[]args)
	{
		String str="00000123569";
		int count=0;
		String result = "";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='0')
			{
				count++;
			
			}else {
				break;
			}
		
		}
		while(count < str.length()){
			result += str.charAt(count);
			count++;
		}
		//System.out.println(str.substring(count));
		System.out.println(result);
	}
}
