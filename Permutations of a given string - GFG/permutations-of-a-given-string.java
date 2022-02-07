// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}

// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
        
        List<String> list = new ArrayList<>();
        int fact=1;
        for(int i=1;i<=S.length();i++)
        fact=fact*i;
        
        for(int i=0;i<fact;i++)
        {
            StringBuilder sb = new StringBuilder(S);
            int p=i;
            String s="";
            for(int j=S.length();j>=1;j--)
            {
                int q = p/j;
                int rem = p%j;
                s=s+sb.charAt(rem);
                sb.deleteCharAt(rem);
                p=q;
            }
            list.add(s);
        }
        Collections.sort(list);
        return list;
        
    }
}