import java.util.LinkedList;
import java.util.Queue;

class node1
{
	int data;
	node1 left,right;
	
	public node1(int data)
	{
		this.data=data;
		left=right=null;
	}	
}

class binary_tree
{
	node1 root;
	binary_tree(int data) 
	{
		root=new node1(data);
	}
	 binary_tree()
	 {
		root=null; 
	 }
	 
	 public void level_order()
		{
			Queue<node1> queue=new LinkedList<node1>();
			queue.offer(root);
			//System.out.println("dnbjkw");
			while(!queue.isEmpty())
			{
				//System.out.println("anbd");
				node1 temp =queue.poll();
				System.out.println(temp.data);
				if(temp.left!=null)
				{
					queue.offer(temp.left);
				}
				if(temp.right!=null)
				{
					queue.offer(temp.right);
				}
			}
		}
}
public class Level_order_traversal 
{
	
	public static void main(String[] args)
	{
		binary_tree tree=new binary_tree();
		tree.root=new node1(1);
		tree.root.left=new node1(2);
		tree.root.right=new node1(3);
		tree.root.left.left=new node1(4);
		tree.root.left.right=new node1(5);
		tree.root.right.left=new node1(6);
		tree.root.right.right=new node1(7);
		tree.level_order();
		

	}

}
