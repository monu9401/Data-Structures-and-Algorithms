// { Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main(String args[])
    {
        //taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        
        //taking total count of testcases
        int t = sc.nextInt();
        
        
        
        while(t-- > 0)
        {
            //taking total number of elements
            int n = sc.nextInt();
            
            //taking size of subArrays 
            int k = sc.nextInt();
            
            //Declaring and Intializing an array of size n
            int arr[] = new int[n];
            
            //adding all the elements to the array 
            for(int i = 0; i <n; i++)
            {
                arr[i] =sc.nextInt();
            }
            
            //Calling the method max_of_subarrays of class solve
            //and storing the result in an ArrayList
            ArrayList <Integer> res = new Solution().max_of_subarrays(arr, n, k);
            
            //printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++)
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function template for JAVA

class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> al = new ArrayList<>();
        int ngetr[] = ngetri(arr);
        for(int i=0;i<=n-k;i++)
        {
            int j = i;
            while(ngetr[j]<i+k)
            {
                j = ngetr[j];
            }
            al.add(arr[j]);
        }
        return al;
    }
    static int[] ngetri(int arr[])
    {
        int ans[]=new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i=1;i<arr.length;i++)
        {
            while(!stack.isEmpty() && arr[stack.peek()]<arr[i])
            {
                ans[stack.pop()]=i;
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            ans[stack.pop()]=arr.length;
        }
        return ans;
    }
}