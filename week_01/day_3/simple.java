//S.I. = (P × T × R) ⁄ 100
//C.I. = P(1+R⁄100)t − P

class simple
{
	public static void main(String[] args)
	{
		int principle = 1000;
		int interest = 15;
		int time = 3 ;
		int frequencyPerAnnum = 1;
		
		float simpleIntrest = (principle *interest*time) /100;
		//int simple = total/100;
		
		int result = (1+interest/frequencyPerAnnum);
		int pow = frequencyPerAnnum * time;
		
		double compound = principle*Math.pow(result,pow)-(principle);
		
		System.out.println("simple interest : " + simpleIntrest);
		System.out.println("compound interest : " + compound);
		
		
	}
	
}
