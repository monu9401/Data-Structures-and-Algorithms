class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder("");
        int c=1;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ' && c==k)
                break;
            else
            {
                if(ch==' ')
                {
                    sb.append(" ");
                    c++;
                }
                else
                    sb.append(ch);
            }
        }
        return sb.toString();
    }
}