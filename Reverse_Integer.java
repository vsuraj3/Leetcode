class Solution {
    public int reverse(int x) 
    {
        boolean negative = false;
        if(x<0)
        {
         negative = true;   
         x=x*-1;
        }
        long reverse=0;
        while(x>0)
        {
            reverse=(reverse*10)+(x%10);
            x=x/10;
        }
        if(reverse>Integer.MAX_VALUE)
        {
         return 0;   
        }
        return negative?(int)(-1*reverse):(int)reverse;
    }
}
