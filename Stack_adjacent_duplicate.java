package leetode;

class Stack_adjacent_duplicate 
{
	public void ad_dup(String s)
	{
		int top=0;
		char[] arr=new char[s.length()];
		for(char c:arr)
		{
			if(top==0)
			{
				arr[top]=c;
				top++;
			}
			else
			{
				if(arr[top-1]==c)
				{
					top--;
				}												
				else
				{
					arr[top]=c;
					top++;
				}
			}
		}
		String abc= new String(arr, 0, top);
		System.out.println("hgfhgf "+abc);
		//return abc;
		
	}
}


