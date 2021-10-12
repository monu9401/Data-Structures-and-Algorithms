class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        ArrayList<List<Integer>> a = new ArrayList<>();
        a.add(new ArrayList<>(Arrays.asList(1)));
        
        for(int i=1;i<numRows;i++)
        {
            ArrayList<Integer> b =new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                b.add(calculate(i,j));
            }
            a.add(b);
        }
        return a;
    }
    
    public int calculate(int n,int r)
    {
        if(r==0 || r==n)
            return 1;
        int k=1;
        double x=1.0;
        int m = Math.min(r,n-r);
        for(int i=m+1;i<=n;i++)
        {
            x = x*((double)i/(double)k);
            k++;
        }
        return (int)(Math.round(x));
    }
}