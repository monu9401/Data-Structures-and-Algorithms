class Solution {
    public int fib(int n) {
        int a=0,b=1;
        int c=a+b;
        if(n==0)
            return a;
        else if(n==1)
            return b;
        else if(n==2)
            return c;
        for(int i=3;i<=n;i++)
        {
            a=b;
            b=c;
            c=a+b;
        }
        return c;
    }
}