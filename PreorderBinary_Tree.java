
//package leetode;

import java.util.Stack;
class node
{
	int data;
	node right,left;

	public node(int key)
	{
		data=key;
		left=null;
		right=null;
	}
}

class BinaryTree
{
	node root;
	BinaryTree(int data)
	{
		root=new node(data);
	}
	BinaryTree()
	{
		root=null;
	}

	public void preorder()
	{
		if(root==null)
		{
			return;
		}
		System.out.print("Preorder Traversal:");
		Stack<node> stack=new Stack<>();
		stack.push(root);
		while(!stack.isEmpty())
		{
			node temp=stack.pop();
			System.out.print(" "+temp.data);
			if(temp.right!=null)
			{
				stack.push(temp.right);
			}
			if(temp.left!=null)
			{
				stack.push(temp.left);
			}
		}
		System.out.println();
	}

	public void inorder()
	{
		if(root==null)
			return ;
		Stack<node> stack=new Stack<>();
		node temp=root;
		System.out.print("Inorder Traversal:");
		while(!stack.isEmpty()||temp!=null)
		{
			if(temp!=null)
			{
				stack.push(temp);
				temp=temp.left;
			}
			else
			{
				temp=stack.pop();
				System.out.print(" "+temp.data);
				
				temp=temp.right;
			}
		}
	}
}

public class PreorderBinary_Tree 
{
	public static void main(String[] args) 
	{
		BinaryTree tree=new BinaryTree();
		tree.root=new node(1);
	//	tree.root.left=new node(4);
		tree.root.right=new node(2);
	//	tree.root.left.left=new node(6);
		//tree.root.left.right=new node(7);
		tree.root.right.left=new node(3);
		//tree.root.right.right=new node(9);
		tree.preorder();
		tree.inorder();
	}
}
