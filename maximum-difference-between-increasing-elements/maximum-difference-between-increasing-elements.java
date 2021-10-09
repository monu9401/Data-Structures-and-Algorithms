class Solution {
    public int maximumDifference(int[] nums) {
        
        int i,j,max=-1;
        int l=nums.length;
        for(i=1;i<nums.length;i++)
        {
            for(j=0;j<i;j++)
            {
                if(nums[i]>nums[j])
                {
                    int diff=nums[i]-nums[j];
                    if(diff>max)
                        max=diff;
                }
            }
        }
        return max;
    }
}