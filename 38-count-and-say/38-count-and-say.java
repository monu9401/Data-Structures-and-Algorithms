class Solution {
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        String prev = countAndSay(n-1);
        StringBuilder sb = new StringBuilder("");
        char current=prev.charAt(0);
        int count=1;
        for(int i=1;i<prev.length();i++)
        {
            char ch1 = prev.charAt(i);
            char ch2 = prev.charAt(i-1);
            if(ch1==ch2)
            {
                count++;
            }
            else
            {
                sb.append(count);
                sb.append(current);
                current=ch1;
                count=1;
            }
        }
        sb.append(count);
        sb.append(current);
        return sb.toString();
    }
}