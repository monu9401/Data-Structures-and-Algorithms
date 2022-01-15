class Solution {
    public boolean rotateString(String s, String goal) {
        
        if(s.equals(goal))
            return true;
        
        StringBuilder sb = new StringBuilder(s);
        int c=0,f=0;
        while(c<s.length())
        {
            c++;
            char ch = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(ch);
            
            if(goal.equals(sb.toString()))
            {
                f=1;
                break;
            }
        }
        if(f==1)
            return true;
        else
            return false;
    }
}