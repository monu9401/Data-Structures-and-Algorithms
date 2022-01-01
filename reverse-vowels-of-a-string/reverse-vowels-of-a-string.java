class Solution {
    public String reverseVowels(String s) {
        
        char arr[]=s.toCharArray();
        int i=0,j=arr.length-1;
        while(i<=j)
        {
            char ch1 = arr[i];
            char ch2 = arr[j];
            if(!isVowel(ch1) && !isVowel(ch2))
            {
                i++;
                j--;
            }
            if(isVowel(ch1) && !isVowel(ch2))
            {
                j--;
            }
            if(!isVowel(ch1) && isVowel(ch2))
            {
                i++;
            }
            if(isVowel(ch1) && isVowel(ch2))
            {
                if(ch1!=ch2)
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        String st = new String(arr);
        return st;
        
    }
    void swap(char arr[],int i,int j)
    {
        char ch = arr[i];
        arr[i]=arr[j];
        arr[j]=ch;
    }
    boolean isVowel(char ch)
    {
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            return true;
        else
            return false;
    }
}