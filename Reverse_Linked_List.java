package leetode;

class Reverse_Linked_List {
	static Node head;
	static class Node
	{
		int data;
		Node next;
		
		/*Node(int data)
		{
			this.data=data;
			next=null;
		}*/
	}
	
	Node Reverse(Node node)
	{
		Node prev=null;
		Node next=null;
		Node curr=node;
		while(curr!=null)
		{
		next=curr.next;
		curr.next=prev;
		prev=curr;
		curr=next;
		}
		node=prev;
		return node;
	}

	void Printlist(Node node){
		while(node!=null)
		{
			System.out.println(node.data+" ");
			node=node.next;
		}
		System.out.println();
	}
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
	public static void main(String[] args)
	{
		Reverse_Linked_List list= new Reverse_Linked_List();
		
		list.insert(23);
		list.insert(45);
		list.insert(97);
		list.insert(78);
		list.insert(11);


        list.Printlist(head);
        head = list.Reverse(head);
        list.Printlist(head);

	}

}
