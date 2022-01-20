// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-->0){
            String s1[] = in.readLine().trim().split("\\s+");
            int mat[][] = new int[9][9];
            for(int i = 0;i < 81;i++)
                mat[i/9][i%9] = Integer.parseInt(s1[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.isValid(mat));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int isValid(int mat[][]){
        
        for(int i=0;i<mat.length;i++)
        {
            HashSet<Integer> hs = new HashSet<>();
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]!=0)
                {
                    if(!hs.add(mat[i][j]))
                    return 0;
                }
            }
        }
        for(int i=0;i<mat.length;i++)
        {
            HashSet<Integer> hs = new HashSet<>();
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[j][i]!=0)
                {
                    if(!hs.add(mat[j][i]))
                    return 0;
                }
            }
        }
        for(int i=0;i<9;i=i+3)
        {
            for(int j=0;j<9;j=j+3)
            {
                HashSet<Integer> hs = new HashSet<>();
                for(int k=i;k<i+3;k++)
                {
                    for(int l=j;l<j+3;l++)
                    {
                        if(mat[k][l]!=0)
                        {
                            if(!hs.add(mat[k][l]))
                            return 0;
                        }
                    }
                }
            }
        }
        return 1;
    }
}