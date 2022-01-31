class Solution {
    public int firstMissingPositive(int[] nums) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                if(hm.containsKey(nums[i]))
                {
                    hm.put(nums[i],hm.get(nums[i])+1);
                }
                else
                    hm.put(nums[i],1);
            }
        }
        for(int i=1;i<=500000;i++)
        {
            if(!hm.containsKey(i))
            {
                return i;
            }
        }
        return 500001;
    }
}