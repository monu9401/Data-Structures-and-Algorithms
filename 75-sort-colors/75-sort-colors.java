class Solution {
    public void sortColors(int[] nums) {
        int i=0,j=0,k=nums.length-1;
        while(i<=k)
        {
            if(nums[i]==0)
            {
                swap(nums,i,j);
                i++;
                j++;
            }
            else if(nums[i]==1)
            {
                i++;
            }
            else if(nums[i]==2)
            {
                swap(nums,i,k);
                k--;
            }
        }
    }
    void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}