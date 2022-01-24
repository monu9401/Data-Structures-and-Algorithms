// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}



// } Driver Code Ends


class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        long nsr[] = nsetr(hist);
        long nsl[] = nsetl(hist);
        long maxArea = 0;
        for(int i=0;i<hist.length;i++)
        {
            long width = nsr[i]-nsl[i]-1;
            long currentArea = width*hist[i];
            maxArea = Math.max(maxArea,currentArea);
        }
        return maxArea;
    }
    static long[] nsetr(long arr[])
    {
        Stack<Integer> stack = new Stack<>();
        long ans[]=new long[arr.length];
        stack.push(0);
        for(int i=1;i<arr.length;i++)
        {
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i])
            {
                ans[stack.pop()]=i;
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            ans[stack.pop()]=arr.length;
        }
        return ans;
    }
    static long[] nsetl(long arr[])
    {
        Stack<Integer> stack = new Stack<>();
        long ans[]=new long[arr.length];
        stack.push(arr.length-1);
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i])
            {
                ans[stack.pop()]=i;
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            ans[stack.pop()]=-1;
        }
        return ans;
    }
        
}



