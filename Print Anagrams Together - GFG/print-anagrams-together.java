// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine().trim());
	    while(t > 0)
	    {
	        int n= Integer.parseInt(br.readLine().trim());
	        String x = br.readLine().trim();
	        String string_list[] = x.split(" ",n);
	        
	        Solution ob = new  Solution();
	        
	        List <List<String>> ans = ob.Anagrams(string_list);
	        
	        Collections.sort(ans, new Comparator<List<String>>(){
            public int compare(List<String> l1, List<String> l2) {
                    String s1 =  l1.get(0);
                    String s2 = l2.get(0);
                    
                    return s1.compareTo(s2);
                }
            });
	        
	        for(int i=0;i<ans.size();i++)
	        {
	            for(int j=0;j<ans.get(i).size();j++)
	            {
	                System.out.print(ans.get(i).get(j) + " ");
	            }
	            System.out.println();
	        }
	       
	       
            t--;
	    }
	}
    
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        List<List<String>> al= new ArrayList<>();
        String[] x = new String[string_list.length];
        boolean condition[] = new boolean[string_list.length];
        Arrays.fill(condition,true);
        for(int i=0;i<string_list.length;i++)
        {
            String s = string_list[i];
            char ch1[]=s.toCharArray();
            Arrays.sort(ch1);
            String st = new String(ch1);
            x[i]=st;
        }
        for(int i=0;i<x.length;i++)
        {
            if(condition[i])
            {
                List<String> ls = new ArrayList<>();
                ls.add(string_list[i]);
                condition[i]=false;
                for(int j=i+1;j<x.length;j++)
                {
                    if(x[i].equals(x[j]))
                    {
                        ls.add(string_list[j]);
                        condition[j]=false;
                    }
                }
                al.add(ls);
            }
        }
        return al;
    }
}
