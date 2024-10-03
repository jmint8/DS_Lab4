
public class MyStack<T>
{
	Node head;
	
	public class Node 
	{
		public T val;
		public Node next;
		
		public Node(T val,Node next)
		{
			this.val = val;
			this.next = next;
		}
		
	}
	
	public MyStack()
	{
		head = null;
	}

	/**
	 * Pushes an element to the stack
	 * @param val
	 */
	public void push(T val) 
	{
		if(head==null)
		{
			//Node temp = new Node(val,null);
			//head = temp;
			head = new Node(val,null);
		}
		else
		{
			//Node temp = new Node(val,head);
			//head = temp;
			head = new Node(val,head);
		}
	}

	/**
	 * Throws stack underflow exception if empty
	 * @return the top element on the stack
	 */
	public T top()
	{
		if(isEmpty())
		{
			throw new StackUnderFlowException(); 
		}
		return head.val;
	}

	/**
	 * Pops the top element of the stack and returns it.
	 * Throws stack underflow exception if empty
	 * @return the popped element from the stack
	 */
	public T pop()
	{
		if(isEmpty())
		{
			throw new StackUnderFlowException(); 
		}
		Node clonehead = head;
		head = head.next;
		return clonehead.val;
	}

	/**
	 * 
	 * @return true if the stack is empty
	 */
	public boolean isEmpty()
	{
		if(this.head==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}