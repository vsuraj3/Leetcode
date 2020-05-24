class Solution {
    public int numberOfSteps (int num) {
        
        int s = 0;
        
        while(num != 0)
        {
            num = num % 2 == 0 ? num/2 : num -1;
            s++;
        }
        
        return s;
        
    }
}
