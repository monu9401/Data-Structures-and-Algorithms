class Solution {
    public boolean areOccurrencesEqual(String s) {
        int arr[]=new int[26];
        int i;
        for(i=0;i<s.length();i++)
        {
            int ch=s.charAt(i) - 'a';
            arr[ch]=arr[ch]+1;
        }
        int first=-1;
        for(i=0;i<26;i++)
        {
            if(arr[i]!=0)
            {
                first=arr[i];
                break;
            }
        }
        int f=0;
        for(i=1;i<26;i++)
        {
            if(arr[i]!=first && arr[i]!=0)
            {
                f=1;
                break;
            }
        }
        if(f==0)
            return true;
        else
            return false;
    }
}