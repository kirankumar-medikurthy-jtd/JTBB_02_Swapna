/* Write a program to     implement a stack  and its operations like push, pop, top of the stack using arrays?
Example : Array = [2,3,4,5,6]
*/

import java.util.Scanner;
class stackoperation
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		int[] stack=new int[100];
		int peek=-1;
		System.out.print("enter number of operations--");
		int numofoperation=input.nextInt();
		
		
		for(int i=0;i<numofoperation;i++)
		{
			System.out.println("  enetr type of operation--"+i);
			String operation=input.next();
			
			if(operation.equals("push"))
			{
				if(peek<=100)
				{
					System.out.print("enetr value to push :-");
					int value=input.nextInt();
					peek+=1;
					
					
					stack[peek]=value;
				}else
				{
					System.out.print("stack overflow");
				
				}
			}else if(operation.equals("pop"))
			{
				if(peek==-1)
				{
					System.out.print("Stack underflow");
				}else
				{
					System.out.print(stack[peek]);
					peek-=1;
				
				}
			}
			else if(operation.equals("peek"))
			{
				System.out.print(stack[peek]+" ");
			}
		
		}
		for(int i=0;i<=peek;i++)
		{
		System.out.print(stack[i]+"  ");
		}	
	}

}
