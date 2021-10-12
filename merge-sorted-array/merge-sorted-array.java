class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i=0,j=0,k=0;
        int arr[]=new int[n+m];
        while(i<m && j<n)
        {
            if(nums1[i]<=nums2[j])
            {
                arr[k]=nums1[i];
                i++;
                k++;
            }
            else
            {
                arr[k]=nums2[j];
                j++;
                k++;
            }
        }
        if(i==m)
        {
            for(int l=j;l<n;l++)
                arr[k++]=nums2[l];
        }
        else if(j==n)
        {
            for(int l=i;l<m;l++)
                arr[k++]=nums1[l];
        }
        k=0;
        for(int l:arr)
            nums1[k++]=l;
    }
}