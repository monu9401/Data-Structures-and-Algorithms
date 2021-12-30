class Solution {
    public String toHex(int num) {
        if(num==0)
            return "0";
        if(num==Integer.MIN_VALUE)
            return "80000000";
        String bin="";
        if(num<0)
        {
            bin = binary(Math.abs(num));
            while(bin.length()!=32)
                bin = "0"+bin;
            bin = twosComplement(bin);
        }
        else
        {
            bin = binary(num);
        }
        String hex[]={"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
        HashMap<Integer,Character> hm = new HashMap<>();
        hm.put(10,'a');
        hm.put(11,'b');
        hm.put(12,'c');
        hm.put(13,'d');
        hm.put(14,'e');
        hm.put(15,'f');
        StringBuilder ans = new StringBuilder("");
        for(int i=0;i<=28;i=i+4)
        {
            String st = bin.substring(i,i+4);
            for(int j=0;j<16;j++)
            {
                String s = hex[j];
                if(st.equals(s))
                {
                    if(j<10)
                        ans.append(String.valueOf(j));
                    else
                        ans.append(hm.get(j));
                    break;
                }
            }
        }
        for(int i=0;i<ans.length();i++)
        {
            if(ans.charAt(i)!='0')
            {
                String s = ans.substring(i);
                ans = new StringBuilder(s);
                break;
            }
        }
        return ans.toString();
        
    }
    static String binary(int num)
    {
        String bin="";
        while(num!=0)
        {
            int r = num%2;
            bin=String.valueOf(r)+bin;
            num = num/2;
        }
        while(bin.length() != 32)
        {
            bin = "0"+bin;
        }
        return bin;
    }
    static String twosComplement(String s)
    {
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
                sb.append("1");
            else if(s.charAt(i)=='1')
                sb.append("0");
        }
        int i = sb.length()-1,carry=0,val=1;
        char sum='\0';
        while(i>=0)
        {
            char ch = sb.charAt(i);
            if(ch=='0' && val==0 && carry==0)
            {
                sum = '0';
                carry = 0;
            }
            else if(ch=='0' && val==0 && carry==1)
            {
                sum = '1';
                carry = 0;
            }
            else if(ch=='0' && val==1 && carry==0)
            {
                sum = '1';
                carry = 0;
            }
            else if(ch=='0' && val==1 && carry==1)
            {
                sum = '0';
                carry = 1;
            }
            else if(ch=='1' && val==0 && carry==0)
            {
                sum = '1';
                carry = 0;
            }
            else if(ch=='1' && val==0 && carry==1)
            {
                sum = '0';
                carry = 1;
            }
            else if(ch=='1' && val==1 && carry==0)
            {
                sum = '0';
                carry = 1;
            }
            else if(ch=='1' && val==1 && carry==1)
            {
                sum = '1';
                carry = 1;
            }
            sb.setCharAt(i,sum);
            val=0;
            i--;
        }
        return sb.toString();
    }
}