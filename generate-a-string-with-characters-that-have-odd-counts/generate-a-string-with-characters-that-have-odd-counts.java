class Solution {
    public String generateTheString(int n) {
        if(n<=26)
        {
            char ch='a';
            int c=0;
            String st="";
            while(c<n)
            {
                st=st+ch;
                ch++;
                c++;
            }
            return st;
        }
        if(n%2==1)
        {
            char ch='a';
            String st="";
            int c=0;
            while(c<n)
            {
                st=st+ch;
                c++;
            }
            return st;
        }
        else
        {
            String st="a";
            char ch='b';
            int c=0;
            while(c<n-1)
            {
                st=st+ch;
                c++;
            }
            return st;
        }
    }
}