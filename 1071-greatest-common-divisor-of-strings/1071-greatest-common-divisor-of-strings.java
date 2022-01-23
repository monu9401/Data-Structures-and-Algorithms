class Solution {
    public String gcdOfStrings(String str1, String str2) {
        
        String x = str1.length()<str2.length() ? str1 : str2;
        ArrayList<Integer> al = factors(x.length());
        for(int i:al)
        {
            if(str1.length()%i==0 && str2.length()%i==0)
            {
                String s1 = str1.substring(0,i);
                String s2 = str2.substring(0,i);
                String a1 = s1.repeat(str1.length()/i);
                String a2 = s2.repeat(str2.length()/i);
                if(a1.equals(str1) && a2.equals(str2) && s1.equals(s2))
                    return s1;
            }
        }
        return "";
    }
    ArrayList<Integer> factors(int n)
    {
        ArrayList<Integer> al = new ArrayList<>();
        int c=0;
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                if(n/i != i)
                al.add(n/i);
                al.add(i);
                c++;
            }
        }
        Collections.sort(al,Collections.reverseOrder());
        return al;
    }
}