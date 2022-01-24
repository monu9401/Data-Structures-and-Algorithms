class Solution {
    public int[] runningSum(int[] nums) {
        int prefixSum=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            prefixSum = prefixSum+nums[i];
            arr[i]=prefixSum;
        }
        return arr;
    }
}