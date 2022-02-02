class Solution {
    public int minSteps(String s, String t) {
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for(int i=0;i<s.length();i++)
        {
            int ch = s.charAt(i)-'a';
            arr1[ch]++;
        }
        for(int i=0;i<t.length();i++)
        {
            int ch = t.charAt(i)-'a';
            arr2[ch]++;
        }
        int sum=0;
        for(int i=0;i<26;i++)
        {
            if(arr1[i]>arr2[i])
            sum=sum+Math.abs(arr1[i]-arr2[i]);
        }
        return sum;
    }
}