class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int y = reverse(x);
        return x == y;
    }
    
    private int reverse(int x){
        int y = 0;
        while(x != 0){
            y = 10*y + x%10;
            x = x/10;
        }
        return y;
    }
}
