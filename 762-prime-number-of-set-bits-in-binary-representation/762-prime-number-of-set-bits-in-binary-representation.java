class Solution {
    public int countPrimeSetBits(int left, int right) {
        
        int c=0;
        for(int i=left;i<=right;i++)
        {
            int sb = countSetBits(i);
            if(isPrime(sb))
                c++;
        }
        return c;
    }
    int countSetBits(int n)
    {
        int count = 0;
        while(n!=0)
        {
            n = n & (n-1);
            count++;
        }
        return count;
    }
    boolean isPrime(int x)
    {
        if(x==2 || x==3 || x==5 || x==7 || x==11 || x==13 || x==17 || x==19 || x==23 || x==29 || x==31)
            return true;
        else
            return false;
    }
}