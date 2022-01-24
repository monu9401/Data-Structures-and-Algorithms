class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int arr[]=new int[nums.length];
        int left=1,right=1;
        arr[0]=1;
        arr[arr.length-1]=1;
        for(int i=1;i<nums.length;i++)
        {
            left=left*nums[i-1];
            arr[i]=left;
        }
        for(int i=nums.length-2;i>=0;i--)
        {
            right=right*nums[i+1];
            arr[i]=arr[i]*right;
        }
        return arr;
    }
}