package leetode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Solution3
{
	public int findKthLargest(int[] nums, int k) 
	{
      int ans=0;
      Arrays.sort(nums);
      Collections.reverse(Arrays.asList(nums));
      System.out.println(Arrays.asList(nums));
      ans=nums[k];
      
      
      
      return ans;
    }
}
public class Kth_largest_element
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int a[] = new int[t];
		for(int i=0;i<t;i++) 
		{
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		Solution3 obj=new Solution3();
		obj.findKthLargest(a, k);

	}

}
