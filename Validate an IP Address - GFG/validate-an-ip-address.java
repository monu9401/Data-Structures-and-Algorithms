// { Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String s) {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='.')
            {
                c++;
            }
        }
        if(c!=3)
        return false;
        s=s+".";
        while(s.length()!=0)
        {
            try
            {
                int x = s.indexOf('.');
                int val = Integer.valueOf(s.substring(0,x));
                String y = String.valueOf(val);
                if(!y.equals(s.substring(0,x)))
                return false;
                if(val<0 || val>255)
                return false;
                s=s.substring(x+1);
            }
            catch(Exception e)
            {
                return false;
            }
        }
        return true;
    }
}