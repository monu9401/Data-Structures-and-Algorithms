class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++)
        {
            int ch = s.charAt(i)-'a' + 1;
            sb.append(ch);
        }
        while(k!=0)
        {
            int sum=0;
            for(int i=0;i<sb.length();i++)
            {
                int x = Integer.valueOf(sb.substring(i,i+1));
                sum=sum+x;
            }
            sb=new StringBuilder("");
            sb.append(sum);
            k--;
        }
        return Integer.valueOf(sb.toString());
    }
}