class Solution {
    public int getSum(int a, int b) {
        int sum=0,carry=0;
        if(b==0)
        {
            int temp = a;
            a = b;
            b = temp;
        }
        while(b!=0)
        {
            sum = a^b;
            carry = a&b;
            carry = carry<<1;
            a=sum;
            b=carry;
        }
        return sum;
        
    }
}