package leetcode;
import java.util.Stack;

public class Baseball_Game_Stack 
{
	public void calPoints(String[] ops)
	{
		int t;
		Stack<String> stack= new Stack<>();
		String st[]=new String[ops.length];
	//	StringBuilder abc= new StringBuilder();
		int top=0;
		for(String str:ops)
		{
			if(stack.isEmpty())
			{
				stack.push(str);
				while(!stack.isEmpty())
				{
					st[top]=stack.pop();
					top++;
				}
			}
			else
			{
				if(stack.peek()=="C")
				{
					//stack.pus(str);
					top--;
					
				}
				else
				{
					if(stack.peek()=="D")
					{
						
						t=Integer.parseInt(st[top])*2;
						st[top]=Integer.toString(t);
						stack.pop();
						top++;
					}
					else
					{
						if(stack.peek()=="+")
						{
							t=Integer.parseInt(st[top-1])+Integer.parseInt(st[top-2]);
							st[top]=Integer.toString(t);
							stack.pop();
							top++;
						}
						else
						{
							stack.push(str);
						}
					}
				}
			}
		}
	}
}
