class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder("");
        String arr[]=title.split(" ");
        for(String s:arr)
        {
            if(s.length()<=2)
            {
                sb.append(s.toLowerCase());
            }
            else
            {
                String fp = (s.substring(0,1)).toUpperCase();
                String sp = (s.substring(1)).toLowerCase();
                sb.append(fp+sp);
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}