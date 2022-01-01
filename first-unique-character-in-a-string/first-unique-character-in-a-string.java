class Solution {
    public int firstUniqChar(String s) {
        
        LinkedHashMap<Character,Integer> lhs = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(lhs.get(ch)==null)
            {
                lhs.put(ch,1);
            }
            else
                lhs.put(ch,lhs.get(ch)+1);
        }
        char nr='\0';
        int f=0;
        for(char ch:lhs.keySet())
        {
            if(lhs.get(ch)==1)
            {
                nr=ch;
                f=1;
                break;
            } 
        }
        if(f==0)
            return -1;
        for(int i=0;i<s.length();i++)
        {
            if(nr==s.charAt(i))
                return i;
        }
        return -1;
    }
}