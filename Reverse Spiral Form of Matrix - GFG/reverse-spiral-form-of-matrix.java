// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] input = new String[2]; 
            input = read.readLine().split(" "); 
            int R = Integer.parseInt(input[0]); 
            int C = Integer.parseInt(input[1]); 
            String s1[] = read.readLine().trim().split("\\s+");
            int a[][] = new int[R][C];
            for(int i = 0;i < R*C;i++)
                a[i/C][i%C] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int[] ans = ob.reverseSpiral(R,C,a);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] a)
    {
        int[] spiral = new int[R*C];
        int minr=0,maxr=R-1,minc=0,maxc=C-1;
	    int total=R*C,count=0;
	    while(count<total)
	    {
	        for(int i=minr,j=minc;j<=maxc && count<total;j++)
	        {
	            spiral[count]=a[i][j];
	            count++;
	        }
	        minr++;
	        for(int i=minr,j=maxc;i<=maxr && count<total;i++)
	        {
	            spiral[count]=a[i][j];
	            count++;
	        }
	        maxc--;
	        for(int i=maxr,j=maxc;j>=minc && count<total;j--)
	        {
	            spiral[count]=a[i][j];
	            count++;
	        }
	        maxr--;
	        for(int i=maxr,j=minc;i>=minr && count<total;i--)
	        {
	            spiral[count]=a[i][j];
	            count++;
	        }
	        minc++;
	    }
	    for(int i=0;i<spiral.length/2;i++)
	    {
	        int temp = spiral[i];
	        spiral[i]=spiral[spiral.length-1-i];
	        spiral[spiral.length-1-i]=temp;
	    }
	    return spiral;
    }
}