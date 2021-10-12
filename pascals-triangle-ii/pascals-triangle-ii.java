class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        ArrayList<Integer> a = new ArrayList<>();
        if(rowIndex==0)
        {
            a.add(1);
            return a;
        }
        for(int i=0;i<=rowIndex;i++)
        {
            a.add(calculate(rowIndex,i));
        }
        return a;
    }
    
    public int calculate(int n,int r)
    {
        if(r==0 || r==n)
            return 1;
        int k=1;
        double x=1.0;
        int m=Math.min(r,n-r);
        for(int i=m+1;i<=n;i++)
        {
            x=x*((double)i/(double)k);
            k++;
        }
        return (int)Math.round(x);
    }
}