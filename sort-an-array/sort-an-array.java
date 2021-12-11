class Solution {
    public int[] sortArray(int[] nums) {
        int sorted[]=mergeSort(nums,0,nums.length-1);
        return sorted;
    }
    static int[] mergeSort(int nums[],int low,int high)
    {
        if(low==high)
        {
            int a[]=new int[1];
            a[0]=nums[low];
            return a;
        }
        int mid = (low+high)/2;
        int fsh[] = mergeSort(nums,low,mid);
        int ssh[] = mergeSort(nums,mid+1,high);
        int full[] = merge(fsh,ssh);
        return full;
    }
    static int[] merge(int a[],int b[])
    {
        int arr[]=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]<b[j])
            {
                arr[k]=a[i];
                i++;
                k++;
            }
            else
            {
                arr[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<a.length)
        {
            arr[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length)
        {
            arr[k]=b[j];
            j++;
            k++;
        }
        return arr;
    }
}