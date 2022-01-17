// { Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        int minr=0,minc=0,maxr=r-1,maxc=c-1;
        int count=0;
        int total=r*c;
        ArrayList<Integer> al = new ArrayList<>();
        while(count<total)
        {
            for(int i=minr,j=minc;j<=maxc && count<total;j++)
            {
                al.add(matrix[i][j]);
                count++;
            }
            minr++;
            for(int i=minr,j=maxc;i<=maxr && count<total;i++)
            {
                al.add(matrix[i][j]);
                count++;
            }
            maxc--;
            for(int i=maxr,j=maxc;j>=minc && count<total;j--)
            {
                al.add(matrix[i][j]);
                count++;
            }
            maxr--;
            for(int i=maxr,j=minc;i>=minr && count<total;i--)
            {
                al.add(matrix[i][j]);
                count++;
            }
            minc++;
        }
        return al;
    }
}
