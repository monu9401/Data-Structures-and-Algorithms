// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.newIPAdd(s));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String newIPAdd(String S)
    {
        StringBuilder sb = new StringBuilder("");
        S=S+".";
        String st="";
        int flag=0;
        for(int i=0;i<S.length();i++)
        {
            char ch = S.charAt(i);
            if(ch=='.')
            {
                if(st.length()>0)
                    sb.append(st+'.');
                else
                    sb.append("0.");    
                flag=0;
                st="";
            }
            else
            {
                if(flag==0)
                {
                    if(ch!='0')
                    {
                        flag=1;
                        st=st+ch;
                    }
                }
                else
                {
                    st=st+ch;
                }
            }
        }
        sb=sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}