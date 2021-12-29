class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        if(x>=0 && x<=9)
            return true;
        int no = (int)Math.log10(x);
        int a = (int)Math.pow(10,no);
        int b = 1;
        while(a>b)
        {
            int m = (x/a)%10;
            int n = (x/b)%10;
            if(m!=n)
                return false;
            a=a/10;
            b=b*10;
        }
        return true;
    }
}