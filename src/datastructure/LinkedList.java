package datastructure;

import java.util.Currency;

public class LinkedList {

	private static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
	}
	
	Node head;
	public int peek()
	{
		return head.data;
	}
	
	public int peekTail()
	{
		Node current=head;
		int data=0;
		while(current.next!=null)
		{
			current=current.next;
		}
		return current.data;
	}
	
	public Node append(int data)
	{
		   Node node = new Node(data);
	        if(head==null)
	        {
	            head=node;
	            return head;
	        }
	        Node current=head;
	        while(current.next!=null)
	        {
	           current=current.next;
	        }
	        current.next=node;
	        return head;
	}
	
	public void deletewithvalue(int data)
	{
		if(head==null)return;
		
		if(head.data==data)
		{
			head=head.next;
		}
		Node current=head;
		while(current.next!=null)
		{
			if(current.data==data)
			{
				current.next=current.next.next;
				return;
			}
			current=current.next;
		}
	}
	public void revers()
	{
		Node current=head;
		Node prevNode=null,nextNode=null;
		while(current!=null)
		{
			nextNode=current.next;
			prevNode=current;
			current=nextNode;
		}
		head=current;
	}
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.append(10);
		linkedList.append(20);
		linkedList.append(30);
		//linkedList.revers();

	System.out.println(linkedList.peek());
	System.out.println(linkedList.peekTail());
	}
}
