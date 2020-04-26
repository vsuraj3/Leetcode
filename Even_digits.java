class Solution {
    public int findNumbers(int[] nums) {
         int count=0;
        String s="";
    for(int i:nums) 
    {
        s=String.valueOf(i);
    	if(s.length()%2==0) 
    	{
    		count++;
    	}
    }
    System.out.println(count);
    return count;
    }
}
