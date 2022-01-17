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
            int N = Integer.parseInt(read.readLine());
            
            String arr[] = new String[N];
            
            for(int i=0; i<N; i++)
                arr[i] = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.palindromepair(N,arr));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int palindromepair(int N, String arr[]) {
        // code here
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                String s1 = arr[i]+arr[j];
                String s2 = arr[j]+arr[i];
                if(isPalindrome(s1) || isPalindrome(s2))
                return 1;
            }
        }
        return 0;
    }
    static boolean isPalindrome(String s)
    {
        for(int i=0;i<s.length()/2;i++)
        {
            char ch = s.charAt(i);
            char ch1 = s.charAt(s.length()-1-i);
            if(ch!=ch1)
            return false;
        }
        return true;
    }
};