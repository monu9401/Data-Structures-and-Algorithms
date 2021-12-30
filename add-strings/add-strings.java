class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb1 = new StringBuilder(num1);
        StringBuilder sb2 = new StringBuilder(num2);
        while(sb1.length()<sb2.length())
        {
            sb1.insert(0,"0");
        }
        while(sb1.length()>sb2.length())
        {
            sb2.insert(0,"0");
        }
        int carry = 0;
        StringBuilder sb = new StringBuilder("");
        for(int i=sb1.length()-1;i>=0;i--)
        {
            int val1 = sb1.charAt(i)-'0';
            int val2 = sb2.charAt(i)-'0';
            int sum = val1+val2+carry;
            if(sum>=10)
            {
                carry = sum/10;
                sum = sum%10;
            }
            else
            {
                carry = 0;
            }
            sb.append(sum);
        }
        if(carry!=0)
        {
            sb.append(carry);
        }
        return (sb.reverse()).toString();
    }
}