class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int[] left = nsetli(heights);
        int[] right = nsetri(heights);
        int maxArea=0;
        for(int i=0;i<heights.length;i++)
        {
            int width = Math.abs(left[i]-right[i])-1;
            int height = heights[i];
            int area = width*height;
            if(maxArea<area)
                maxArea=area;
        }
        return maxArea;
        
    }
    public int[] nsetri(int[] heights)
    {
        Stack<Integer> stack = new Stack<>();
        int arr[]=new int[heights.length];
        stack.push(0);
        for(int i=1;i<heights.length;i++)
        {
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()])
            {
                arr[stack.pop()]=i;
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            arr[stack.pop()]=heights.length;
        }
        return arr;
    }
    public int[] nsetli(int[] heights)
    {
        Stack<Integer> stack = new Stack<>();
        int arr[]=new int[heights.length];
        stack.push(heights.length-1);
        for(int i=heights.length-2;i>=0;i--)
        {
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()])
            {
                arr[stack.pop()]=i;
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            arr[stack.pop()]=-1;
        }
        return arr;
    }
}