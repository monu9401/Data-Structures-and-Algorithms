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
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.getSpecialNumber(n));
                }
        }
}    // } Driver Code Ends


//User function Template for Java



class Solution
{
    
public long getSpecialNumber(int N)
    {
        if(N==1)
        return 0;
        StringBuilder sb = new StringBuilder("");
        int m=N-1;
        while(m!=0)
        {
            int r = m%6;
            sb.append(r);
            m=m/6;
        }
        return Long.valueOf(sb.reverse().toString());
    }

}

