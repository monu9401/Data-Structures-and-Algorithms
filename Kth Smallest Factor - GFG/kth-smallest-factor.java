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
            String S[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(S[0]);
            int K = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.kThSmallestFactor(N,K));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int kThSmallestFactor(int N , int K) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        int c=0;
        for(int i=1;i*i<=N;i++)
        {
            if(N%i==0)
            {
                int y = N/i;
                if(y!=i)
                    al.add(c,y);
                al.add(c,i);
                c++;
            }
        }
        if(K-1<al.size())
        return al.get(K-1);
        else
        return -1;
    }
};