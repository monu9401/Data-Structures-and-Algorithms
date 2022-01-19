class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(hm.containsKey(ch))
                hm.put(ch,hm.get(ch)+1);
            else
                hm.put(ch,1);
        }
        TreeMap<Integer,ArrayList<Character>> tm = new TreeMap<>(Collections.reverseOrder());
        for(char ch:hm.keySet())
        {
            int x=hm.get(ch);
            if(tm.containsKey(x))
            {
                ArrayList<Character> al = tm.get(x);
                al.add(ch);
                tm.put(x,al);
            }
            else
            {
                ArrayList<Character> al = new ArrayList<>();
                al.add(ch);
                tm.put(x,al);
            }
        }
        StringBuilder sb = new StringBuilder("");
        for(int x:tm.keySet())
        {
            for(char ch:tm.get(x))
            {
                String st = String.valueOf(ch).repeat(x);
                sb.append(st);
            }
        }
        return sb.toString();
    }
}