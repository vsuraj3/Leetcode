class Solution {
    public int maxSubArray(int[] nums) 
    {
        int max_curr=nums[0];
       int  max_global=nums[0];
        if(nums.length<1){
            return nums[0];
        }
        else{
        for(int i=1;i<nums.length;i++)
        max_curr=Math.max(nums[i],max_curr+nums[i]);
        if(max_curr>max_global){
            max_global=max_curr;
        }
        return max_global;
    }}
}
