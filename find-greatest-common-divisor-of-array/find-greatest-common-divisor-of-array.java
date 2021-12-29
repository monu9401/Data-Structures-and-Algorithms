class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
        for(int i:nums)
        {
            if(max<i)
                max=i;
            if(min>i)
                min=i;
        }
        return gcd(max,min);
    }
    static int gcd(int a,int b)
    {
        int r = a%b;
        while(r!=0)
        {
            a=b;
            b=r;
            r=a%b;
        }
        return b;
    }
}