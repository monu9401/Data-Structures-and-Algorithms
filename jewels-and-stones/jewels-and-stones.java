class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        for(int i=0;i<stones.length();i++)
        {
            String s=stones.substring(i,i+1);
            if(jewels.contains(s))
                c++;
        }
        return c;
    }
}