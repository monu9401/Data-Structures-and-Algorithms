class Solution {
    public int[] minOperations(String boxes) {
        
        
        int n=boxes.length();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<i;j++)
            {
                if(boxes.charAt(j)=='1')
                    c=c+(i-j);
            }
            for(int j=i+1;j<n;j++)
            {
                if(boxes.charAt(j)=='1')
                    c=c+(j-i);
            }
            arr[i]=c;
        }
        return arr;
    }
}