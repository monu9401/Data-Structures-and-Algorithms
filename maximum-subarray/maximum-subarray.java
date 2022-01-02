class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum=nums[0],bestSum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            currentSum = currentSum+nums[i];
            if(currentSum<nums[i])
                currentSum = nums[i];
            if(currentSum>bestSum)
                bestSum = currentSum;
        }
        return bestSum;
    }
}