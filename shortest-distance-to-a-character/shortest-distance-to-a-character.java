class Solution {
    public int[] shortestToChar(String s, char c) {
        
        int arr[]=new int[s.length()];
        
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
                al.add(i);
        }
        int x=0,y=0,p=0;
        for(int i=0;i<s.length();i++)
        {
            System.out.println(x+" "+y);
            int d1=Math.abs(i-al.get(x));
            int d2=Math.abs(i-al.get(y));
            if(d1<=d2)
                arr[p++]=d1;
            else
                arr[p++]=d2;
            if(d1==0)
            {
                if(al.size()-1 != y)
                    y++;
            }
            else if(d2==0)
            {
                x=y;
                if(al.size()-1 != y)
                    y++;
            }
        }
        return arr;
    }
}