import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-- > 0)
	    {
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        PriorityQueue<Integer> pq = new PriorityQueue<>();
	        for(int i=0;i<=k && i<n;i++)
	        {
	            pq.offer(arr[i]);
	        }
	        for(int i=k+1;i<n;i++)
	        {
	            System.out.print(pq.poll()+" ");
	            pq.offer(arr[i]);
	        }
	        while(!pq.isEmpty())
	            System.out.print(pq.poll()+" ");
	        System.out.println();
	    }
	 }
}