// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        long sum=0;
        for(int i:arr)
        {
            sum=sum+(long)i;
        }
        long sumUptoN = ((long)n*(n+1))/2;
        long diff = sumUptoN-sum;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int x=-1;
        for(int i:arr)
        {
            if(hm.containsKey(i))
            {
                x=i;
                break;
            }
            else
            hm.put(i,1);
        }
        int a[] = new int[2];
        a[0]=x;
        a[1]=(int)(x+diff);
        return a;
    }
}