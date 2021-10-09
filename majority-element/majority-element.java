class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums)
        {
            if(hm.containsKey(i))
                hm.put(i,hm.get(i)+1);
            else
                hm.put(i,1);
        }
        int max=0;
        int major=-1;
        for(int i:hm.keySet())
        {
            if(max<hm.get(i))
            {
                major = i;
                max=hm.get(i);
            }
        }
        return major;
    }
}