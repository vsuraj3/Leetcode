package leetode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

class Dups {
    public List<Integer> findDuplicates(int[] nums)
    {
    	List<Integer> al= new ArrayList<>();
    Set<Integer> s=new HashSet<>();    
    	for(int i:nums)
    	{
    		if(s.add(i)==false)
    		{
    			System.out.println(i);
    			al.add(i);
    		}
    	}
    return al;
    }
}
public class Duplicate_Array 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int k[]=new int[t];
		for(int i=0;i<t;i++){
			k[i]=sc.nextInt();
		}
		Dups obj=new Dups();
		obj.findDuplicates(k);
	}
}
