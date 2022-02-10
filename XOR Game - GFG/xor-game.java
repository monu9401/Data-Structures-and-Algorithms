// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int k = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.xorCal(k));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int xorCal(int k){
        if(k==1)
        return 2;
        if((k & (k+1))==0)
        {
            int x = (int)((double)Math.log(k)/(double)Math.log(2));
            int m = (int)Math.pow(2,x)-1;
            return m;
        }
        else
        return -1;
    }
}