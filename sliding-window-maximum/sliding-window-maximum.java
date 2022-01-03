class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int window[] = new int[nums.length-k+1];
        int[] ngetri = ngetr(nums);
        for(int i=0;i<=nums.length-k;i++)
        {
            int j=i;
            while(ngetri[j]<(i+k))
            {
                j = ngetri[j];
            }
            window[i]=nums[j];
        }
        return window;
        
    }
    public int[] ngetr(int[] nums)
    {
        Stack<Integer> stack = new Stack<>();
        int ans[]=new int[nums.length];
        stack.push(0);
        for(int i=1;i<nums.length;i++)
        {
            while(!stack.isEmpty() && nums[i]>nums[stack.peek()])
            {
                ans[stack.pop()]=i;
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            ans[stack.pop()]=nums.length;
        }
        return ans;
    }
}