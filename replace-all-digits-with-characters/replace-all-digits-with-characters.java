class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=1;i<sb.length();i=i+2)
        {
            int val=sb.charAt(i)-48;
            char ch1=sb.charAt(i-1);
            ch1 = (char)((int)ch1+val);
            sb.setCharAt(i,ch1);
        }
        return sb.toString();
    }
}