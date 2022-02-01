class Solution {
    public String intToRoman(int num) {
        
        int x = num;
        int arr[] = new int[4];
        int div=1000,idx=0;
        while(x!=0)
        {
            int r=x/div;
            arr[idx]=r;
            idx++;
            x=x%div;
            div=div/10;
        }
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<4;i++)
        {
            if(i==0)
            {
                if(arr[i]==1)
                    sb.append("M");
                else if(arr[i]==2)
                    sb.append("MM");
                else if(arr[i]==3)
                    sb.append("MMM");
            }
            else if(i==1)
            {
                if(arr[i]>=1 && arr[i]<=3)
                {
                    sb.append(("C").repeat(arr[i]));
                }
                else if(arr[i]==4)
                {
                    sb.append("CD");
                }
                else if(arr[i]==5)
                {
                    sb.append("D");
                }
                else if(arr[i]>=6 && arr[i]<=8)
                {
                    sb.append("D"+("C").repeat(arr[i]-5));
                }
                else if(arr[i]==9)
                {
                    sb.append("CM");
                }
            }
            else if(i==2)
            {
                if(arr[i]>=1 && arr[i]<=3)
                {
                    sb.append(("X").repeat(arr[i]));
                }
                else if(arr[i]==4)
                {
                    sb.append("XL");
                }
                else if(arr[i]==5)
                {
                    sb.append("L");
                }
                else if(arr[i]>=6 && arr[i]<=8)
                {
                    sb.append("L"+("X").repeat(arr[i]-5));
                }
                else if(arr[i]==9)
                {
                    sb.append("XC");
                }
            }
            else if(i==3)
            {
                if(arr[i]>=1 && arr[i]<=3)
                {
                    sb.append(("I").repeat(arr[i]));
                }
                else if(arr[i]==4)
                {
                    sb.append("IV");
                }
                else if(arr[i]==5)
                {
                    sb.append("V");
                }
                else if(arr[i]>=6 && arr[i]<=8)
                {
                    sb.append("V"+("I").repeat(arr[i]-5));
                }
                else if(arr[i]==9)
                {
                    sb.append("IX");
                }
            }
        }
        return sb.toString();
    }
}