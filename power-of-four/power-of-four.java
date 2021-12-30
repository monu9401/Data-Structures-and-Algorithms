class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)
            return false;
        if((n & n-1)==0)
        {
            int trailingZeros = (int)(Math.log(n)/Math.log(2));
            if(trailingZeros % 2 == 0)
                return true;
            else
                return false;
        }
        else
            return false;
    }
}