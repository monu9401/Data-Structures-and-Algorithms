// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int  N = Integer.parseInt(input_line[0]);
            Solution ob = new Solution();
            int ans = ob.countZeroes(N);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    int countZeroes(int n){
        int low=0,high=4005,m=-1,f=0;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(countDigitsInFactorial(mid)>n)
            {
                high=mid-1;
            }
            else if(countDigitsInFactorial(mid)<n)
            {
                low=mid+1;
            }
            else
            {
                m=mid;
                f=1;
                break;
            }
        }
        if(f==0)
        return 0;
        while(countDigitsInFactorial(m)==n)
        {
            m--;
        }
        m++;
        int count=0;
        while(countDigitsInFactorial(m)==n)
        {
            m++;
            count++;
        }
        return count;
    }
    int countDigitsInFactorial(int x)
    {
        int count=0;
        for(int i=5;i<=x;i=i*5)
        {
            count=count+x/i;
        }
        return count;
    }
}
