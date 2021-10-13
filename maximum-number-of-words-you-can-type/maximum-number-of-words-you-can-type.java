class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String arr[]=text.split(" ");
        char ch[]=brokenLetters.toCharArray();
        int count=0;
        for(String s:arr)
        {
            for(char c:ch)
            {
                if(s.contains(String.valueOf(c)))
                {
                    count++;
                    break;
                }
            }
        }
        return (arr.length-count);
    }
}