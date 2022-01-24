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
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int N, int arr[]){
        
        int idx=-1;
        for(int i=0;i<N-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                idx=i;
            }
        }
        if(idx==-1)
        {
            ArrayList<Integer> al = new ArrayList<>();
            for(int i:arr)
            al.add(i);
            Collections.sort(al);
            return al;
        }
            int idx1=-1;
            for(int i=idx+1;i<N;i++)
            {
                if(arr[i]>arr[idx])
                {
                    idx1=i;
                }
            }
            //System.out.println(idx+" "+idx1);
            int temp = arr[idx];
            arr[idx] = arr[idx1];
            arr[idx1] = temp;
        reverse(arr,idx+1);
        ArrayList<Integer> al = new ArrayList<>();
        for(int i:arr)
        al.add(i);
        return al;
    }
    static void reverse(int arr[],int x)
    {
        int k=0,n=arr.length;
        for(int i=x;i<=(n-1+x)/2;i++)
        {
            int temp = arr[i];
            arr[i] = arr[n-1-k];
            arr[n-1-k] = temp;
            k++;
        }
    }
}