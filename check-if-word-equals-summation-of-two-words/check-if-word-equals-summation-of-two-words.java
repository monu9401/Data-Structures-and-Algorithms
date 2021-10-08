class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int num1=0,num2=0,num3=0;
        String s1="",s2="",s3="";
        int i;
        for(i=0;i<firstWord.length();i++)
        {
            char ch=firstWord.charAt(i);
            s1=s1+(int)(ch-'a');
        }
        for(i=0;i<secondWord.length();i++)
        {
            char ch=secondWord.charAt(i);
            s2=s2+(int)(ch-'a');
        }
        for(i=0;i<targetWord.length();i++)
        {
            char ch=targetWord.charAt(i);
            s3=s3+(int)(ch-'a');
        }
        num1=Integer.valueOf(s1);
        num2=Integer.valueOf(s2);
        num3=Integer.valueOf(s3);
        if(num1+num2==num3)
            return true;
        else
            return false;
    }
}