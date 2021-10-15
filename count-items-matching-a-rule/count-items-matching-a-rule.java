class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c=0;
        for(List<String> a : items)
        {
            if(ruleKey.equals("type"))
            {
                if((a.get(0)).equals(ruleValue))
                    c++;
            }
            else if(ruleKey.equals("color"))
            {
                if((a.get(1)).equals(ruleValue))
                    c++;
            }
            else if(ruleKey.equals("name"))
            {
                if((a.get(2)).equals(ruleValue))
                    c++;
            }
        }
        return c;
    }
}