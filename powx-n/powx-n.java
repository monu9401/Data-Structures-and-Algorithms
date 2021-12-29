class Solution {
    public double myPow(double x, int n) {
        
        int m = Math.abs(n);
        double res = calculatePow(x,m);
        if(n<0)
            return 1.0/res;
        else
            return res;
        
    }
    public static double calculatePow(double x,int n)
    {
        if(n==1)
            return x;
        if(n==0)
            return 1.0;
        double r = (new Solution()).calculatePow(x,n/2);
        if(n%2==0)
        {
            return r*r;
        }
        else
        {
            return r*r*x;
        }
    }
    
}