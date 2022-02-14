// { Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			Solution obj = new Solution();
			System.out.println(obj.findK(arr, n, m, k));
		t--;
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{
   
	public int findK(int a[][], int n, int m, int k)
	{
	    int c=n*m,count=0;
	    int maxr=n-1,minr=0,minc=0,maxc=m-1;
	    while(count<c)
	    {
	        for(int i=minr,j=minc;j<=maxc && count<c;j++)
	        {
	            count++;
	            if(count==k)
	            {
	                return a[i][j];
	            }
	        }
	        minr++;
	        for(int i=minr,j=maxc;i<=maxr && count<c;i++)
	        {
	            count++;
	            if(count==k)
	            {
	                return a[i][j];
	            }
	        }
	        maxc--;
	        for(int i=maxr,j=maxc;j>=minc && count<c;j--)
	        {
	            count++;
	            if(count==k)
	            {
	                return a[i][j];
	            }
	        }
	        maxr--;
	        for(int i=maxr,j=minc;i>=minr && count<c;i--)
	        {
	            count++;
	            if(count==k)
	            {
	                return a[i][j];
	            }
	        }
	        minc++;
	    }
	    return 0;
	}
	
}