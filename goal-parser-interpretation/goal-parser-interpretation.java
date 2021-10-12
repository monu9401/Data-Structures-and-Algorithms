class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<command.length();i++)
        {
            char ch=command.charAt(i);
            if(ch=='G')
                sb.append("G");
            else if(ch=='(')
            {
                char ch1=command.charAt(i+1);
                if(ch1==')')
                {
                    sb.append("o");
                    i++;
                }
                else if(ch1=='a')
                {
                    sb.append("al");
                    i=i+3;
                }
            }
        }
        return sb.toString();
    }
}