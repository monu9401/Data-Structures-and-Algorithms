class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String arr[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> hs = new HashSet<>();
        for(String s:words)
        {
            StringBuilder sb = new StringBuilder("");
            for(int i=0;i<s.length();i++)
            {
                char ch = s.charAt(i);
                int x = ch - 'a';
                sb.append(arr[x]);
            }
            hs.add(sb.toString());
        }
        return hs.size();
    }
}