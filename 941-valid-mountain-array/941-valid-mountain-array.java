class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3)
            return false;
        int downFall=0,rise=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(downFall==0)
            {
                if(arr[i]>arr[i+1])
                {
                    if(rise==0)
                        return false;
                    downFall=1;
                }
                else if(arr[i]==arr[i+1])
                {
                    return false;
                }
                else
                    rise++;
            }
            else
            {
                if(arr[i]<=arr[i+1])
                    return false;
            }
        }
        if(downFall==0)
            return false;
        else
            return true;
    }
}