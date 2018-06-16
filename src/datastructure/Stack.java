package datastructure;

public class Stack {
	
	private static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
	}

	Node top;
	
	public boolean isEmpty()
	{
		return top == null;
	}
	public void push(int data)
	{
			Node node=new Node(data);
			node.next=top;
			top=node;
	}
	public int pop()
	{
			int	data=top.data;
			top=top.next;
			return data;
	}
	public static void main(String[] args) {
		Stack stack = new Stack();
		System.out.println(stack.isEmpty());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.pop());
		stack.push(40);
		System.out.println(stack.pop());
	}
}
