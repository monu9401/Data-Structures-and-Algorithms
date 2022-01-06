class Solution {
    public String convertToBase7(int num) {
        if(num==0)
            return "0";
        StringBuilder sb = new StringBuilder("");
        int flag=0;
        if(num<0)
        {
            flag=1;
            num=Math.abs(num);
        }
        while(num!=0)
        {
            int r=num%7;
            sb.insert(0,r);
            num=num/7;
        }
        if(flag==1)
            sb.insert(0,"-");
        return sb.toString();
    }
}