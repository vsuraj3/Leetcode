package leetode;

import java.util.Scanner;

class Solution
{
	public String reverse(String S)
	{
		int i=0; int j=S.length()-1;
		char[] chars=S.toCharArray();
		while(i<j)
		{
			while(!Character.isAlphabetic(chars[i])&&i<j)
			{
				i++;
			}
			while(!Character.isAlphabetic(chars[j])&&i<j)
			{
				j--;
			}
			char temp=chars[i];
			chars[i]=chars[j];
			chars[j]=temp;
			i++;j--;
		}
		System.out.println(chars);
		return new String(chars);
		
	}
}
public class Reverse_only_letter {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		Solution obj=new Solution();
		obj.reverse(s);
		
		
	}

}
