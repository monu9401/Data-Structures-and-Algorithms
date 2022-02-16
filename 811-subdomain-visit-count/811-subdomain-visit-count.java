class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        
        HashMap<String,Integer> hm = new HashMap<>(); 
        for(String s:cpdomains)
        {
            int d = s.indexOf(' ');
            int rep = Integer.valueOf(s.substring(0,d));
            String st1 = s.substring(d+1);
            if(hm.containsKey(st1))
            {
                hm.put(st1,hm.get(st1)+rep);
            }
            else
                hm.put(st1,rep);
            while(st1.indexOf('.')!=-1)
            {
                d = st1.indexOf('.');
                st1 = st1.substring(d+1);
                if(hm.containsKey(st1))
                {
                    hm.put(st1,hm.get(st1)+rep);
                }
                else
                    hm.put(st1,rep);
            }
        }
        List<String> list = new ArrayList<>();
        for(String s:hm.keySet())
        {
            list.add(hm.get(s)+" "+s);
        }
        return list;
    }
}