// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.isDivisible(s));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution {
    int isDivisible(String s) {
        int odd=0,even=0;
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                even = even + (s.charAt(i)-'0');
            }
            else
            {
                odd = odd + (s.charAt(i)-'0');
            }
        }
        int diff = Math.abs(even-odd);
        if(diff%3==0)
        return 1;
        else
        return 0;
    }
}