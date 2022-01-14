class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i=i+2*k)
        {
            String x = s.substring(i,Math.min(s.length(),i+2*k));
            if(x.length()>=2*k)
            {
                StringBuilder fp = new StringBuilder(x.substring(0,k));
                sb.append(fp.reverse());
                sb.append(x.substring(k));
            }
            else if(x.length()>=k && x.length()<2*k)
            {
                StringBuilder fp = new StringBuilder(x.substring(0,k));
                sb.append(fp.reverse());
                sb.append(x.substring(k));
            }
            else if(x.length()<k)
            {
                StringBuilder fp = new StringBuilder(x);
                sb.append(fp.reverse());
            }
        }
        return sb.toString();
    }
}