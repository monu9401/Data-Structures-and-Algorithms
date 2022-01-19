class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[]=new int[2];
        int low=0,high=numbers.length-1;
        while(low<high)
        {
            int sum = numbers[low]+numbers[high];
            if(sum>target)
                high--;
            else if(sum<target)
                low++;
            else
            {
                arr[0]=low+1;
                arr[1]=high+1;
                return arr;
            }
        }
        return arr;
    }
}