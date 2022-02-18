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
            String s[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            String arr[] = in.readLine().trim().split("\\s+");
            int mat[][] = new int[n][m];
            for(int i = 0;i < n*m;i++)
                mat[i/m][i%m] = Integer.parseInt(arr[i]);
            int x = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.isSuperSimilar(n, m, mat, x));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    static int isSuperSimilar(int n, int m, int mat[][], int x)
    {
        if(m==1)
        return 1;
        int matrix[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<m;j++)
                {
                    matrix[i][j]=mat[i][(j+x)%m];
                }
            }
            else
            {
                for(int j=0;j<m;j++)
                {
                    matrix[i][j]=mat[i][((j-x)%m < 0)?m+(j-x)%m:(j-x)%m];
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]!=matrix[i][j])
                return 0;
            }
        }
        return 1;
    }
}