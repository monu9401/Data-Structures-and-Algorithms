// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        StringBuilder sb = new StringBuilder("");
        LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();
        for(int i=0;i<A.length();i++)
        {
            char ch = A.charAt(i);
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)+1);
            }
            else
            hm.put(ch,1);
            int flag=0;
            for(char j:hm.keySet())
            {
                if(hm.get(j)==1)
                {
                    sb.append(j);
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            sb.append("#");
        }
        return sb.toString();
    }
}