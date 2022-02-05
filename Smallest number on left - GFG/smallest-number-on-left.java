// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String a1[] = in.readLine().trim().split("\\s+");
            int a[] = new int[n];
            for(int i = 0;i < n;i++)
                a[i] = Integer.parseInt(a1[i]);
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.leftSmaller(n, a);
            for(int i = 0;i < n;i++)
                System.out.print(ans.get(i)+" ");
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        int ans[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(n-1);
        for(int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty() && a[i]<a[stack.peek()])
            {
                ans[stack.pop()]=a[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            ans[stack.pop()]=-1;
        }
        List<Integer> list = new ArrayList<>();
        for(int i:ans)
        list.add(i);
        return list;
    }
}