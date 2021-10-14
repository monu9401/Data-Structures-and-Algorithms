class Solution {
    public int balancedStringSplit(String s) {
        Stack<Character> stack = new Stack<>();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(stack.isEmpty())
            {
                stack.push(ch);
                c++;
            }
            else
            {
                if((stack.peek()=='L' && ch=='R') || (stack.peek()=='R' && ch=='L'))
                    stack.pop();
                else
                    stack.push(ch);
            }
        }
        return c;
    }
}