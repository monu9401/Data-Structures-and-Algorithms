class Solution {
    public int findMiddleIndex(int[] nums) {
        
        int leftSum=0,rightSum=0;
        for(int i=1;i<nums.length;i++)
        {
            rightSum += nums[i];
        }
        if(leftSum==rightSum)
            return 0;
        for(int i=1;i<nums.length;i++)
        {
            leftSum=leftSum+nums[i-1];
            rightSum=rightSum-nums[i];
            if(leftSum==rightSum)
                return i;
        }
        return -1;
    }
}