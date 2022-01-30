// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		ArrayList <ArrayList <Integer>> res = new Solution().binTreeSortedLevels (arr, n);
    		
    		for (int i = 0; i < res.size(); i++)
    		{
    		    for (int j = 0; j < (res.get (i).size()); j++)
    		    {
    		        System.out.print (res.get(i).get(j) + " ");
    		    }
    		    System.out.println ();
    		}
        }
        
    }
}

// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static ArrayList <ArrayList <Integer>> binTreeSortedLevels (int arr[], int n)
    {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        ArrayList<Integer> al1 = new ArrayList<>();
        int c=1;
        ArrayList<Integer> count = new ArrayList<>();
        while(c<=n)
        {
            count.add(c);
            c=c*2;
        }
        //System.out.println(count);
        int idx=0;
        for(int i=0;i<n;i++)
        {
            al1.add(arr[i]);
            if(al1.size()==count.get(idx))
            {
                Collections.sort(al1);
                al.add(al1);
                idx++;
                al1 = new ArrayList<>();
            }
        }
        if(al1.size()>0)
        {
            Collections.sort(al1);
            al.add(al1);
        }
        return al;
    }
}