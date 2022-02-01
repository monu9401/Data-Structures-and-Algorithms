class Solution {
    public int findComplement(int n) {
        int d = (int)(Math.log(n)/Math.log(2))+1;
        for(int i=0;i<d;i++)
        {
            int x = 1<<i;
            n=n^x;
        }
        return n;
    }
}