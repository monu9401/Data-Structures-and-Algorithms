class Solution {
    public int findDuplicate(int[] nums) {
        boolean repeat[]=new boolean[nums.length-1];
        Arrays.fill(repeat,false);
        for(int i:nums)
        {
            if(repeat[i-1]==true)
                return i;
            repeat[i-1]=true;
        }
        return 0;
    }
}