class Solution {
    public void nextPermutation(int[] nums) {
        int k=-1;
        for(int i=nums.length-1;i>0;i--)
        {
            if(nums[i]>nums[i-1])
            {
                k=i-1;
                break;
            }
        }
        if(k==-1)
        {
            for(int i=0;i<nums.length/2;i++)
            {
                int temp=nums[i];
                nums[i]=nums[nums.length-1-i];
                nums[nums.length-1-i]=temp;
            }
            return;
        }
        int l=-1;
        for(int i=nums.length-1;i>=k;i--)
        {
            if(nums[i]>nums[k])
            {
                l=i;
                break;
            }
        }
        int temp=nums[k];
        nums[k]=nums[l];
        nums[l]=temp;
        reverse(nums,k+1,nums.length-1);
    }
    void reverse(int[] arr,int x,int y)
    {
        int c=0;
        for(int i=x;i<=(x+y)/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[y-c];
            arr[y-c]=temp;
            c++;
        }
    }
}