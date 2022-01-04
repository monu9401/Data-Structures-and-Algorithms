class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> all = new ArrayList<>();
        int p = permutations(nums.length);
        for(int i=0;i<p;i++)
        {
            int x=i;
            List<Integer> a = new ArrayList<>();
            for(int k:nums)
                a.add(k);
            List<Integer> al = new ArrayList<>();
            for(int j=nums.length;j>0;j--)
            {
                int q = x/j;
                int r = x%j;
                al.add(a.get(r));
                a.remove(r);
                x=q;
            }
            all.add(al);
        }
        
        return all;
    }
    int permutations(int a)
    {
        int f=1;
        for(int i=1;i<=a;i++)
        {
            f=f*i;
        }
        return f;
    }
}