// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            if(ob.geekNumber(N) == 1)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    static int geekNumber(int N){
        // code here
        int div=2;
        while(div*div<=N)
        {
            int count=0;
            while(N%div==0)
            {
                N=N/div;
                count++;
            }
            if(count>1)
            return 0;
            div++;
        }
        return 1;
    }
}