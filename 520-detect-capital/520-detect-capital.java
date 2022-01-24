class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()==1)
            return true;
        
        char ch1 = word.charAt(0);
        char ch2 = word.charAt(1);
        if(Character.isLowerCase(ch1) && Character.isUpperCase(ch2))
            return false;
        if((Character.isLowerCase(ch1) && Character.isLowerCase(ch2)) || (Character.isUpperCase(ch1) && Character.isLowerCase(ch2)))
        {
            for(int i=2;i<word.length();i++)
            {
                char ch = word.charAt(i);
                if(Character.isUpperCase(ch))
                    return false;
            }
            return true;
        }
        if(Character.isUpperCase(ch1) && Character.isUpperCase(ch2))
        {
            for(int i=2;i<word.length();i++)
            {
                char ch = word.charAt(i);
                if(Character.isLowerCase(ch))
                    return false;
            }
            return true;
        }
        return false;
    }
}