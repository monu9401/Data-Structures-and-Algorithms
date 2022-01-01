class Solution {
    public long countVowels(String word) {
        
        int l = word.length();
        long freq = l;
        long factor = l-2;
        int i=0,j=l-1;
        long total = 0;
        while(i<=j)
        {
            char ch1 = word.charAt(i);
            char ch2 = word.charAt(j);
            if(i==j)
            {
                if(isVowel(ch1))
                {
                    total = total+freq;
                }
            }
            else
            {
                if(isVowel(ch1))
                {
                    total = total+freq;
                }
                if(isVowel(ch2))
                {
                    total = total+freq;
                }
            }
            freq = freq+factor;
            factor = factor-2;
            i++;
            j--;
        }
        return total;
    }
    boolean isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            return true;
        else
            return false;
    }
}