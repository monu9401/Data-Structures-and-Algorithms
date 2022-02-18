class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        HashMap<Integer,Boolean> hm = new HashMap<>();
        for(int i:nums)
        {
            hm.put(i,true);
        }
        for(int x:hm.keySet())
        {
            if(hm.containsKey(x-1))
                hm.put(x,false);
        }
        int l = Integer.MIN_VALUE;
        for(int x:hm.keySet())
        {
            if(hm.get(x))
            {
                int c=1;
                int m=x;
                while(hm.containsKey(++m))
                {
                    c++;
                }
                if(c>l)
                    l=c;
            }
        }
        return l;
    }
}