class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
            return true;
        int c=0;
        while(c<s.length() && t.length()!=0)
        {
            char ch = s.charAt(c);
            int x = t.indexOf(ch);
            if(x==-1)
                return false;
            c++;
            t = t.substring(x+1);
        }
        if(t.length()==0 && c!=s.length())
            return false;
        return true;
    }
}