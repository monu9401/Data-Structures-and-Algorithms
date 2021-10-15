class Solution {
    public String freqAlphabets(String s) {
        
        StringBuilder sb = new StringBuilder("");
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch = s.charAt(i);
            if(ch=='#')
            {
                String st = s.substring(i-2,i);
                int x = Integer.valueOf(st);
                char ch1 = (char)(96+x);
                sb.append(ch1);
                i=i-2;
            }
            else
            {
                char ch1 = (char)(96+((int)ch-48));
                sb.append(ch1);
            }
        }
        return (sb.reverse().toString());
    }
}