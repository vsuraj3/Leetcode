package leetode;

public class Merge_twoLinkedList 
{
	static class Node
	{
		int data;
		Node next;
	}	
	Node head;
	public void insert(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
	}
	
	public void printList()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data+" ");
			n=n.next;
		}
		System.out.println();
	}
	static class CGF{	
	Node sorted(Node headA, Node headB )
	{
		Node dummynode=new Node();
		Node tail=dummynode;
		while(true)
		{
			if(headA==null)
			{
				tail.next=headB;
			}
			if(headB==null)
			{
				tail.next=headB;
			}
			if(headA.data<=headB.data)
			{
				tail.next=headA;
				headA=headA.next;
			}
			else
			{
				tail.next=headB;
				headB=headB.next;
			}
			tail=tail.next;
		}
	}
	}

	public static void main(String[] args) 
	{
		Merge_twoLinkedList list1=new Merge_twoLinkedList();
		Merge_twoLinkedList list2=new Merge_twoLinkedList();
		list1.insert(5);
		list1.insert(6);
		list1.insert(5);
		list2.insert(3);
		list2.insert(1);
		list2.insert(0);
		list1.printList();
		list2.printList();
		
		list1.head=new CGF().sorted(list1.head, list2.head);
		list1.printList();

	}
	
	}


