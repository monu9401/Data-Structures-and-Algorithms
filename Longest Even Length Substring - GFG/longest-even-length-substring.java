import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-- > 0)
	    {
	        String s = sc.next();
	        int n = s.length();
	        int m=0;
	        for(int i=0;i<n;i++)
	        {
	            for(int j=i+1;j<=n;j++)
	            {
	                String x = s.substring(i,j);
	                if(x.length()%2==0)
	                {
	                    int left=0,right=0;
	                    for(int k=0;k<x.length()/2;k++)
	                    {
	                        left=left+(x.charAt(k)-'0');
	                    }
	                    for(int k=x.length()-1;k>=x.length()/2;k--)
	                    {
	                        right=right+(x.charAt(k)-'0');
	                    }
	                    if(left==right)
	                    {
	                        m = Math.max(m,x.length());
	                    }
	                }
	            }
	        }
	        System.out.println(m);
	    }
	 }
}