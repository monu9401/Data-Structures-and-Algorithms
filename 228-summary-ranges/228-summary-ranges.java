class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        if(nums.length==0)
            return new ArrayList<>();
        
        List<String> list = new ArrayList<>();
        String s = "";
        s = s + nums[0];
        int c=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] == nums[i-1]+1)
            {
                c++;
            }
            else
            {
                if(c==0)
                {
                    list.add(s);
                    s = ""+nums[i];
                }
                else
                {
                    s = s+"->"+nums[i-1];
                    list.add(s);
                    s = ""+nums[i];
                    c = 0;
                }
            }
        }
        if(s.length()!=0)
        {
            if(c!=0)
            {
                s = s+"->"+nums[nums.length-1];
            }
            list.add(s);
        }
        return list;
    }
}