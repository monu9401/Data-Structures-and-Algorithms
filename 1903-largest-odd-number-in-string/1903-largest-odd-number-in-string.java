class Solution {
    public String largestOddNumber(String num) {
        String ans="";
        for(int i=num.length()-1;i>=0;i--)
        {
            char ch = num.charAt(i);
            if(ch=='1' || ch=='3' || ch=='5' || ch=='7' || ch=='9')
            {
                ans = num.substring(0,i+1);
                break;
            }
        }
        return ans;
    }
}