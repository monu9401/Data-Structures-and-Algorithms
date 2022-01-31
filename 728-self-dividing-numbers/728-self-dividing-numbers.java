class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> al = new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(isSDN(i))
                al.add(i);
        }
        return al;
    }
    public boolean isSDN(int n)
    {
        int x=n;
        ArrayList<Integer> arr = new ArrayList<>();
        while(x!=0)
        {
            int r = x%10;
            arr.add(r);
            x = x/10;
        }
        for(int i:arr)
        {
            if(i==0 || n%i!=0)
                return false;
        }
        return true;
    }
}