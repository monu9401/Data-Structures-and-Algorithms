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
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            String b = input[1];
            Solution ob = new Solution();
            System.out.println(ob.addBinary(a,b));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    String addBinary(String A, String B) {
        // code here
        StringBuilder sb = new StringBuilder("");
        int i=A.length()-1,j=B.length()-1;
        char carry='0';
        char sum='0';
        while(i>=0 && j>=0)
        {
            char ch1 = A.charAt(i);
            char ch2 = B.charAt(j);
            char arr[] = addition(ch1,ch2,carry);
            sum=arr[0];carry=arr[1];
            sb.append(sum);
            i--;
            j--;
        }
        while(i>=0)
        {
            char ch = A.charAt(i);
            char arr[] = addition(ch,'0',carry);
            sum=arr[0];carry=arr[1];
            sb.append(sum);
            i--;
        }
        while(j>=0)
        {
            char ch = B.charAt(j);
            char arr[] = addition('0',ch,carry);
            sum=arr[0];carry=arr[1];
            sb.append(sum);
            j--;
        }
        if(carry=='1')
        sb.append(carry);
        while(sb.charAt(sb.length()-1)=='0')
        {
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.reverse().toString();
    }
    public char[] addition(char a,char b,char c)
    {
        char ans='\0',carry='\0';
        if(a=='0' && b=='0' && c=='0')
        {
            ans='0';
            carry='0';
        }
        if(a=='0' && b=='0' && c=='1')
        {
            ans='1';
            carry='0';
        }
        if(a=='0' && b=='1' && c=='0')
        {
            ans='1';
            carry='0';
        }
        if(a=='0' && b=='1' && c=='1')
        {
            ans='0';
            carry='1';
        }
        if(a=='1' && b=='0' && c=='0')
        {
            ans='1';
            carry='0';
        }
        if(a=='1' && b=='0' && c=='1')
        {
            ans='0';
            carry='1';
        }
        if(a=='1' && b=='1' && c=='0')
        {
            ans='0';
            carry='1';
        }
        if(a=='1' && b=='1' && c=='1')
        {
            ans='1';
            carry='1';
        }
        return new char[]{ans,carry};
    }
}