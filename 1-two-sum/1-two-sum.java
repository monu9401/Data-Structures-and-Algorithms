class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(target-nums[i]))
            {
                arr[0]=i;
                arr[1]=hm.get(target-nums[i]);
                return arr;
            }
            hm.put(nums[i],i);
        }
        return arr;
    }
}