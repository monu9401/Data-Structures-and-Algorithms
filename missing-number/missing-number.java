class Solution {
    public int missingNumber(int[] nums) {
        int sum1 = (nums.length*(nums.length+1))/2,sum2=0;
        for(int i:nums)
            sum2=sum2+i;
        return sum1-sum2;
    }
}