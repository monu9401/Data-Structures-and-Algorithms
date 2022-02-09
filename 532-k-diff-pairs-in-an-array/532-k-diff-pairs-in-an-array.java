class Solution {
    public int findPairs(int[] nums, int k) {
        int sum=0;
        if(k==0)
        {
            HashMap<Integer,Integer> hm = new HashMap<>();
            for(int i:nums)
            {
                if(hm.containsKey(i))
                    hm.put(i,hm.get(i)+1);
                else
                    hm.put(i,1);
            }
            for(int i:hm.keySet())
            {
                if(hm.get(i)>1)
                    sum++;
            }
            return sum;
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        for(int i:hs)
        {
            int val1=i-k;
            if(hs.contains(val1))
            {
                sum++;
            }
        }
        return sum;
        
    }
}