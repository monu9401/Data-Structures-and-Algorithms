class Solution {
    public boolean checkString(String s) {
        int countB=0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='b')
                countB++;
            if(ch=='a' && countB!=0)
                return false;
        }
        return true;
        
    }
}