// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.findMaxLen(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution {
    static int findMaxLen(String S) {
        // code here
        int longest=0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i=0;i<S.length();i++)
        {
            char ch = S.charAt(i);
            if(ch=='(')
            stack.push(i);
            else
            {
                stack.pop();
                if(stack.isEmpty())
                {
                    stack.push(i);
                }
                else
                {
                    int current = i-stack.peek();
                    if(current>longest)
                    longest = current;
                }
            }
        }
        return longest;
    }
};