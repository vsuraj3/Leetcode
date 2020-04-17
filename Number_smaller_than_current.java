package leetode;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
    	int[] counter = new int[101];
    	for(int i=0; i< nums.length; i++)
    	{
    		counter[nums[i]]++;
    	}
    	int acc = counter[0];
    	counter[0]=0;
    	for(int j=1;j<101;j++)
    	{
    		int freq = counter[j];
    		counter[j] = acc;
    		acc = acc + freq;
    	}
    	for(int i = 0;i<nums.length;i++)
    		nums[i] = counter[nums[i]];
    	return nums;
        
    }
}
