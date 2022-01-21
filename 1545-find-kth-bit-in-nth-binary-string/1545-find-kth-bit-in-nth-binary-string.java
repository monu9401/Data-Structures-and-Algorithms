class Solution {
    public char findKthBit(int n, int k) {
        String st = bin(n);
        return st.charAt(k-1);
    }
    public String bin(int n)
    {
        if(n==1)
            return "0";
        
        StringBuilder x = new StringBuilder(bin(n-1));
        x.append("1"+operate(x.toString()));
        return x.toString();
    }
    public String operate(String s)
    {
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
                sb.append("1");
            else
                sb.append("0");
        }
        return (sb.reverse()).toString();
    }
}