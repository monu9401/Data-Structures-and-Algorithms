class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int ans[]=new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i=1;i<temperatures.length;i++)
        {
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()])
            {
                int v = stack.pop();
                ans[v]=i-v;
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            ans[stack.pop()]=0;
        }
        return ans;
    }
}