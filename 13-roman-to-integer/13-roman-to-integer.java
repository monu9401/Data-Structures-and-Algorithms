class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        Stack<Integer> stack = new Stack<>();
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch = s.charAt(i);
            if(stack.isEmpty())
            {
                stack.push(hm.get(ch));
            }
            else
            {
                if(hm.get(ch)<stack.peek())
                {
                    int val = stack.pop();
                    val=val-hm.get(ch);
                    stack.push(val);
                }
                else
                    stack.push(hm.get(ch));
            }
        }
        int val=0;
        while(!stack.isEmpty())
        {
            val=val+stack.pop();
        }
        return val;
    }
}