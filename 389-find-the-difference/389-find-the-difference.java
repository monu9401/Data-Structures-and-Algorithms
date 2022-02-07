class Solution {
    public char findTheDifference(String s, String t) {
        
        int arr1[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            int x = s.charAt(i)-'a';
            arr1[x]++;
        }
        int arr2[]=new int[26];
        for(int i=0;i<t.length();i++)
        {
            int x = t.charAt(i)-'a';
            arr2[x]++;
        }
        for(int i=0;i<26;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                return (char)(97+i);
            }
        }
        return 'a';
    }
}