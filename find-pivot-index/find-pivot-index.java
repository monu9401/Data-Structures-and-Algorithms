class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i:nums)
        {
            sum = sum+i;
        }
        int leftSum=0,rightSum=sum;
        for(int i=0;i<nums.length;i++)
        {
            rightSum = rightSum-nums[i];
            if(i!=0)
                leftSum=leftSum+nums[i-1];
            if(leftSum==rightSum)
                return i;
        }
        return -1;
    }
}