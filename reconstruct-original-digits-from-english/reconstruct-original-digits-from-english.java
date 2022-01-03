class Solution {
    public String originalDigits(String s) {
        StringBuilder sb = new StringBuilder("");
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('e',0);
        hm.put('g',0);
        hm.put('f',0);
        hm.put('i',0);
        hm.put('h',0);
        hm.put('o',0);
        hm.put('n',0);
        hm.put('s',0);
        hm.put('r',0);
        hm.put('u',0);
        hm.put('t',0);
        hm.put('w',0);
        hm.put('v',0);
        hm.put('x',0);
        hm.put('z',0);
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            hm.put(ch,hm.get(ch)+1);
        }
        ArrayList<Integer> al = new ArrayList<>();
        boolean condition;
        condition = true;
        while(condition)
        {
            if(hm.get('z')>0)
            {
                al.add(0);
                hm.put('z',hm.get('z')-1);
                hm.put('e',hm.get('e')-1);
                hm.put('r',hm.get('r')-1);
                hm.put('o',hm.get('o')-1);
            }
            else
                condition = false;
        }
        condition = true;
        while(condition)
        {
            if(hm.get('w')>0)
            {
                al.add(2);
                hm.put('t',hm.get('t')-1);
                hm.put('w',hm.get('w')-1);
                hm.put('o',hm.get('o')-1);
            }
            else
                condition = false;
        }
        condition = true;
        while(condition)
        {
            if(hm.get('u')>0)
            {
                al.add(4);
                hm.put('f',hm.get('f')-1);
                hm.put('o',hm.get('o')-1);
                hm.put('u',hm.get('u')-1);
                hm.put('r',hm.get('r')-1);
            }
            else
                condition = false;
        }
        condition = true;
        while(condition)
        {
            if(hm.get('x')>0)
            {
                al.add(6);
                hm.put('s',hm.get('s')-1);
                hm.put('i',hm.get('i')-1);
                hm.put('x',hm.get('x')-1);
            }
            else
                condition = false;
        }
        condition = true;
        while(condition)
        {
            if(hm.get('g')>0)
            {
                al.add(8);
                hm.put('e',hm.get('e')-1);
                hm.put('i',hm.get('i')-1);
                hm.put('g',hm.get('g')-1);
                hm.put('h',hm.get('h')-1);
                hm.put('t',hm.get('t')-1);
            }
            else
                condition = false;
        }
        condition = true;
        while(condition)
        {
            if(hm.get('o')>0 && hm.get('n')>0 && hm.get('e')>0)
            {
                al.add(1);
                hm.put('o',hm.get('o')-1);
                hm.put('n',hm.get('n')-1);
                hm.put('e',hm.get('e')-1); 
            }
            else if(hm.get('t')>0 && hm.get('h')>0 && hm.get('r')>0 && hm.get('e')>1)
            {
                al.add(3);
                hm.put('t',hm.get('t')-1);
                hm.put('h',hm.get('h')-1);
                hm.put('r',hm.get('r')-1);
                hm.put('e',hm.get('e')-2);
            }
            else if(hm.get('f')>0 && hm.get('i')>0 && hm.get('v')>0 && hm.get('e')>0)
            {
                al.add(5);
                hm.put('f',hm.get('f')-1);
                hm.put('i',hm.get('i')-1);
                hm.put('v',hm.get('v')-1);
                hm.put('e',hm.get('e')-1);
            }
            else if(hm.get('s')>0 && hm.get('e')>1 && hm.get('v')>0 && hm.get('n')>0)
            {
                al.add(7);
                hm.put('s',hm.get('s')-1);
                hm.put('e',hm.get('e')-2);
                hm.put('v',hm.get('v')-1);
                hm.put('n',hm.get('n')-1);
            }
            else if(hm.get('n')>1 && hm.get('i')>0 && hm.get('e')>0)
            {
                al.add(9);
                hm.put('n',hm.get('n')-2);
                hm.put('i',hm.get('i')-1);
                hm.put('e',hm.get('e')-1); 
            }
            else
                condition = false;
        }
        Collections.sort(al);
        for(int i:al)
        {
            sb.append(i);
        }
        return sb.toString();   
    }
}