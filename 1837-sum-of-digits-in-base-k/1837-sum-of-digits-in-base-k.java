class Solution {
    public int sumBase(int n, int k) {
        return newNum(n,k);
    }
    public int newNum(int n,int k)
    {
        int sum=0;
        while(n!=0)
        {
            int r = n%k;
            sum = sum+r;
            n=n/k;
        }
        return sum;
    }
}