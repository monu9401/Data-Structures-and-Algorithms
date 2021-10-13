class Solution {
    public boolean halvesAreAlike(String s) {
        int l=s.length();
        String fh = s.substring(0,l/2);
        String sh = s.substring(l/2);
        int c=0,d=0;
        for(int i=0;i<fh.length();i++)
        {
            char ch=fh.charAt(i);
            if(isVowel(ch))
                c++;
        }
        for(int i=0;i<sh.length();i++)
        {
            char ch=sh.charAt(i);
            if(isVowel(ch))
                d++;
        }
        if(c==d)
            return true;
        else
            return false;
    }
    boolean isVowel(char ch)
    {
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
            return true;
        else
            return false;
    }
}