class Solution {
    public String getPermutation(int n, int k) {
        
        if(n==1)
            return "1";
        String s="";
        for(int i=1;i<=n;i++)
            s=s+i;
        String x = permute(s,n,k);
        return x;
    }
    static String permute(String s , int n , int k)
    {
        if(n==2)
        {
            if(k==0)
            {
                return String.valueOf(s.charAt(1))+String.valueOf(s.charAt(0));
            }
            else if(k==1)
            {
                return String.valueOf(s.charAt(0))+String.valueOf(s.charAt(1));
            }
        }
        StringBuilder sb = new StringBuilder(s);
        int perm = factorial(n);
        int cols = perm/n;
        int idx = (int)Math.ceil((double)k/cols);
        if(idx==0)
            return (sb.reverse()).toString();
        String ans = String.valueOf(sb.charAt(idx-1));
        sb.deleteCharAt(idx-1);
        k = k%cols;
        return ans+permute(sb.toString(),n-1,k);
    }
    static int factorial(int n)
    {
        int f=1;
        for(int i=2;i<=n;i++)
        {
            f = f*i;
        }
        return f;
    }
}