class Solution {
    public boolean isHappy(int n) {
        int fast=n,slow=n,c=0;
        while(c==0 || fast!=slow)
        {
            c++;
            slow =calculate(slow);
            fast = calculate(calculate(fast));
        }
        if(slow==1)
            return true;
        else
            return false;
    }
    static int calculate(int x)
    {
        int sum=0;
        while(x!=0)
        {
            int r = x%10;
            sum = sum + r*r;
            x=x/10;
        }
        return sum;
    }
}