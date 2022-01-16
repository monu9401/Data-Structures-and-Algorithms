// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> operands = new Stack<>();
        
        for(int i=0;i<S.length();i++)
        {
            char ch = S.charAt(i);
            if(Character.isDigit(ch))
            {
                operands.push(ch-'0');
            }
            else
            {
                int val2 = operands.pop();
                int val1 = operands.pop();
                int res = result(val1,val2,ch);
                operands.push(res);
            }
            //System.out.println(operands);
        }
        return operands.peek();
    }
    static int result(int a,int b,char c)
    {
        if(c=='+')
        return a+b;
        else if(c=='-')
        return a-b;
        else if(c=='*')
        return a*b;
        else if(c=='/')
        return a/b;
        else
        return 0;
    }
}