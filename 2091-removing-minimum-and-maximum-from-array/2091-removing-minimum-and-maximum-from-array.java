class Solution {
    public int minimumDeletions(int[] nums) {
        
        int max = nums[0],min = nums[0],maxIdx = 0,minIdx = 0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                maxIdx=i;
            }
            if(nums[i]<min)
            {
                min=nums[i];
                minIdx=i;
            }
        }
        int first = Math.max(minIdx,maxIdx)+1;
        int second = Math.max(nums.length-1-minIdx,nums.length-1-maxIdx)+1;
        int third = nums.length-minIdx + (maxIdx+1);
        int fourth = nums.length-maxIdx + (minIdx+1);
        int m = Math.min(first,Math.min(second,Math.min(third,fourth)));
        return m;
    }
}