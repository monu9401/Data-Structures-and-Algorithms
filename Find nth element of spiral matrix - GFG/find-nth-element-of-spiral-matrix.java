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
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new GfG().findK(arr, n, m, k));
		t--;
		}
	}
}// } Driver Code Ends


class GfG
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
	    int minr=0,maxr=n-1,minc=0,maxc=m-1;
	    int total=n*m,count=0;
	    while(count<total)
	    {
	        for(int i=minr,j=minc;j<=maxc && count<total;j++)
	        {
	            count++;
	            if(count==k)
	            return A[i][j];
	        }
	        minr++;
	        for(int i=minr,j=maxc;i<=maxr && count<total;i++)
	        {
	            count++;
	            if(count==k)
	            return A[i][j];
	        }
	        maxc--;
	        for(int i=maxr,j=maxc;j>=minc && count<total;j--)
	        {
	            count++;
	            if(count==k)
	            return A[i][j];
	        }
	        maxr--;
	        for(int i=maxr,j=minc;i>=minr && count<total;i--)
	        {
	            count++;
	            if(count==k)
	            return A[i][j];
	        }
	        minc++;
	    }
	    return 0;
    }
}