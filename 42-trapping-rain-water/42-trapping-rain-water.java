class Solution {
    public int trap(int[] height) {
        
        int l=0,r=height.length-1;
        int leftMax=0,rightMax=0,sum=0;
        while(l<r)
        {
            leftMax=Math.max(leftMax,height[l]);
            rightMax=Math.max(rightMax,height[r]);
            if(leftMax<rightMax)
            {
                sum = sum+(leftMax-height[l]);
                l++;
            }
            else
            {
                sum = sum+(rightMax-height[r]);
                r--;
            }
        }
        return sum;
    }
}