class Solution {
   public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
{
	java.util.List<Boole1an> al=new ArrayList<Boolean>();
	int max = 0;
    for (int i : candies) 
    if (i > max) max = i;
	for(int i:candies) 
	{
		al.add(i+extraCandies>=max);
	}
	return al;
    
}
}
