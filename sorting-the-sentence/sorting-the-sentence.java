class Solution {
    public String sortSentence(String s) {
        String arr[]=s.split(" ");
        String sent[] = new String[arr.length];
        String st = "";
        for(String i:arr)
        {
            int ch = i.charAt(i.length()-1) - '0';
            sent[ch-1]=i.substring(0,i.length()-1);
        }
        StringBuilder sb = new StringBuilder("");
        for(String i:sent)
            sb.append(i+" ");
        
        return (sb.toString()).trim();
    }
}