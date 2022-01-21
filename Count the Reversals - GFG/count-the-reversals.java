// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countRev (s));
        }
        
    }
}
// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countRev (String s)
    {
        // your code here    
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='{')
            stack.push(ch);
            else
            {
                if(!stack.isEmpty() && stack.peek()=='{')
                stack.pop();
                else
                stack.push(ch);
            }
        }
        //System.out.println(stack);
        if(stack.size()%2==1)
        return -1;
        int count=0;
        for(int i=0;i<stack.size();i=i+2)
        {
            char ch = stack.get(i);
            char ch1 = stack.get(i+1);
            if(ch=='{' && ch1=='{')
            count++;
            else if(ch=='}' && ch1=='}')
            count++;
            else if(ch=='}' && ch1=='{')
            count=count+2;
        }
        return count;
    }
}