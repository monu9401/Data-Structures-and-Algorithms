class Solution {
    public boolean isPowerOfThree(int n) {
        double x = n;
        while(x>=1 && x==(int)x)
        {
            if(x==1)
                return true;
            x = x/3;
        }
        return false;
    }
}