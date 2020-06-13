class Solution {
    public int firstUniqChar(String s) 
    {
    	HashMap<Character, Integer> h1 = new HashMap<Character, Integer>();
    for(int i=0;i<s.length();i++) 
    {
    	char curr=s.charAt(i);
    	if(!h1.containsKey(curr)) 
    	{
    		h1.put(curr, i);
    	}
    	else 
    	{
    		h1.put(curr, -1);
    	}	
    }
    	int min=Integer.MAX_VALUE;
    	for(char c:h1.keySet()) 
    	{
    		if(h1.get(c)>-1 && h1.get(c)<min) 
    		{
    			min=h1.get(c);
    		}
    	}
    	return min==Integer.MAX_VALUE?-1:min;
    	
    }
  
}
