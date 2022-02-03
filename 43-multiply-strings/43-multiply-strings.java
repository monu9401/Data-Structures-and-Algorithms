class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))
            return "0";
        int idx=0;
        StringBuilder sum = new StringBuilder("");
        for(int i=num1.length()-1;i>=0;i--)
        {
            int x = num1.charAt(i)-'0';
            int carry=0;
            StringBuilder sb = new StringBuilder("");
            idx++;
            for(int k=1;k<idx;k++)
                sb.append('0');
            for(int j=num2.length()-1;j>=0;j--)
            {
                int y = num2.charAt(j)-'0';
                int product = x*y + carry;
                carry = product/10;
                int rem = product%10;
                sb.insert(0,rem);
            }
            if(carry!=0)
                sb.insert(0,carry);
            sum = findSum(sum,sb);
        }
        return sum.toString();
    }
    StringBuilder findSum(StringBuilder a,StringBuilder b)
    {
        if(a.length()<b.length())
        {
            while(a.length()!=b.length())
                a.insert(0,'0');
        }
        if(a.length()>b.length())
        {
            while(a.length()!=b.length())
                b.insert(0,'0');
        }
        StringBuilder result = new StringBuilder("");
        int carry=0;
        for(int i=a.length()-1;i>=0;i--)
        {
            int x = a.charAt(i)-'0';
            int y = b.charAt(i)-'0';
            int sum = x+y+carry;
            carry=sum/10;
            sum=sum%10;
            result.insert(0,sum);
        }
        if(carry!=0)
            result.insert(0,carry);
        return result;
    }
}