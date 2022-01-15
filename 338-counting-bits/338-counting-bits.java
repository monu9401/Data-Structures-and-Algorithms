class Solution {
    public int[] countBits(int n) {
        
        int arr[] = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int x=i;
            int c=0;
            while(x!=0)
            {
                x = x & (x-1);
                c++;
            }
            arr[i]=c;
        }
        return arr;
    }
}