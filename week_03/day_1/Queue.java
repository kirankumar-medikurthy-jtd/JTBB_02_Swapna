/*class Node
{
	int data;
	Node next;
}
class Queue
{
	public static Node first = null;
	
	
	public static void queuePush(int data)
	{
		Node temp = new Node();
		temp.data = data; 
		temp.next = null;
	
		if(first == null)
		{
			first = temp;
		}
		
	
		Node Traverse = first;
		while(Traverse.next != null)
		{
			Traverse = Traverse.next;
		}
		
		Traverse = temp;
		
	}
	
	
	public static void Display()
	{
	
		Node traverse = first;
		while(traverse != null)
		{
		
			System.out.println(traverse.data +" ");
			traverse = first.next	;
		}	
	}
	public static void main(String[] args)
	{
		System.out.println("Hello world");
		Queue.queuePush(10);
		Queue.Display();
		
	}
}*/


class Node
{
	int data;
	Node next;
}

class Queue
{
	public static Node first = null;
	
	public static void queuePush(int data)
	{
		Node temp = new Node();
		temp.data = data;
		temp.next = null;

		if (first == null)
		{
			first = temp;
		}
		else
		{
			Node Traverse = first;
			while (Traverse.next != null)
			{
				Traverse = Traverse.next;
			}

			Traverse.next = temp;
		}
	}
	
	public static void DeQueue()
	{
	    if (first == null) {
		System.out.println("Queue is empty");
	    } else {
		Node temp = first;
		first = first.next; 
		System.out.println("Popped element: " + temp.data);
	    }
	}
		

	public static void Display()
	{
		Node traverse = first;
		while (traverse != null)
		{
			System.out.println(traverse.data + " "); 
			traverse = traverse.next;
		}
		System.out.println();
	}
		
	
	public static void main(String[] args)
	{
		//System.out.println("Hello world");
		Queue.queuePush(10);
		Queue.queuePush(11);
		Queue.queuePush(9);
		Queue.queuePush(18);
		Queue.queuePush(1);
		Queue.queuePush(14);
		Queue.queuePush(19);
		Queue.queuePush(23);
		Queue.queuePush(1);
		
		
		
		Queue.DeQueue();
		Queue.DeQueue();
		
		
		Queue.Display();
	}
}



