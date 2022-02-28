class Solution {
    public String[] findWords(String[] words) {
        
        HashSet<Character> fr = new HashSet<>();
        fr.add('q');
        fr.add('w');
        fr.add('e');
        fr.add('r');
        fr.add('t');
        fr.add('y');
        fr.add('u');
        fr.add('i');
        fr.add('o');
        fr.add('p');
        HashSet<Character> sr = new HashSet<>();
        sr.add('a');
        sr.add('s');
        sr.add('d');
        sr.add('f');
        sr.add('g');
        sr.add('h');
        sr.add('j');
        sr.add('k');
        sr.add('l');
        HashSet<Character> tr = new HashSet<>();
        tr.add('z');
        tr.add('x');
        tr.add('c');
        tr.add('v');
        tr.add('b');
        tr.add('n');
        tr.add('m');
        List<String> ls = new ArrayList<>();
        for(String s:words)
        {
            String st = s.toLowerCase();
            int c1=0,c2=0,c3=0;
            for(int i=0;i<st.length();i++)
            {
                char ch = st.charAt(i);
                if(fr.contains(ch))
                    c1++;
                else if(sr.contains(ch))
                    c2++;
                else if(tr.contains(ch))
                    c3++;
            }
            if(c1==s.length() || c2==s.length() || c3==s.length())
                ls.add(s);
        }
        String str[] = new String[ls.size()];
        for(int i=0;i<ls.size();i++)
        {
            str[i] = ls.get(i);
        }
        return str;
    }
}