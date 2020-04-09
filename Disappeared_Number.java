package leetode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class DissArray
{
	public List<Integer> findDisappearedNumbers(int[] nums)
	{
		List<Integer> al=new ArrayList<Integer>();
		int[] reg=new int[nums.length+1];
		for(int i:nums)
		{
			reg[i]=1;
		}
		for(int j=1;j<reg.length;j++)
		{
			if(reg[j]==0)
			{
				al.add(j);
			}
		}
		return al;
		
	}
}

public class Disappeared_Number {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int k[]=new int[t];
		for(int i=0;i<t;i++)
		{
			k[i]=sc.nextInt();
		}
		DissArray obj= new DissArray();
		obj.findDisappearedNumbers(k);

	}

}
