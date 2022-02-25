class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int arr[] = new int[50];
        for(int i=lowLimit;i<=highLimit;i++)
        {
            int sum = sd(i);
            arr[sum]++;
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<50;i++)
        {
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }
    public int sd(int n)
    {
        int sum = 0;
        while(n!=0)
        {
            int r = n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
}