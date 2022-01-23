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
	         ArrayDeque<Integer> ad = new ArrayDeque<>();
	         for(int i=1;i<=n;i++)
	         {
	             ad.offerLast(i);
	         }
	         while(ad.size()!=1)
	         {
	             ad.offerLast(ad.pollFirst());
	             ad.pollFirst();
	         }
	         System.out.println(ad.peekFirst());
	     }
	 }
}