class Solution {
    public int countGoodSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length()-2;i++)
        {
            String st = s.substring(i,i+3);
            char ch1=st.charAt(0);
            char ch2=st.charAt(1);
            char ch3=st.charAt(2);
            if(ch1!=ch2 && ch2!=ch3 && ch3!=ch1)
                c++;
        }
        return c;
    }
}