class Solution {
    public boolean isSubsequence(String s, String t) {
       
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            String st = s.substring(i,i+1);
            if(t.contains(st))
            {
                t = t.substring(t.indexOf(st)+1);
            }
            else
                return false;
        }
        return true;
        
    }
}