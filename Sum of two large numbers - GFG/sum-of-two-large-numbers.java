// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String x = read.readLine();
            String y = read.readLine();
            Solution ob = new Solution();
            String result = ob.findSum(x, y);

            System.out.println(result);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    String findSum(String X, String Y) {
        int i=X.length()-1, j=Y.length()-1,carry=0;
        StringBuilder sb = new StringBuilder("");
        while(i>=0 && j>=0)
        {
            char ch1 = X.charAt(i);
            char ch2 = Y.charAt(j);
            int val1 = ch1-'0';
            int val2 = ch2-'0';
            int sum = val1+val2+carry;
            if(sum>=10)
            {
                carry=1;
                sum=sum-10;
            }
            else
            {
                carry=0;
            }
            sb.append(sum);
            i--;
            j--;
        }
        while(i>=0)
        {
            int val = X.charAt(i)-'0';
            int sum = val+carry;
            if(sum>=10)
            {
                carry=1;
                sum=sum-10;
            }
            else
            {
                carry=0;
            }
            sb.append(sum);
            i--;
        }
        while(j>=0)
        {
            int val = Y.charAt(j)-'0';
            int sum = val+carry;
            if(sum>=10)
            {
                carry=1;
                sum=sum-10;
            }
            else
            {
                carry=0;
            }
            sb.append(sum);
            j--;
        }
        if(carry!=0)
        sb.append(carry);
        sb = sb.reverse();
        while(sb.length()>0 && sb.charAt(0)=='0')
        {
            sb.deleteCharAt(0);
        }
        if(sb.length()==0)
        sb.append('0');
        return sb.toString();
    }
}