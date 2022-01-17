class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> l = new ArrayList<>();
        HashMap<List<Integer>,List<String>> hm = new HashMap<>();
        for(String s:strs)
        {
            int arr[]=frequency(s);
            List<Integer> l1 = new ArrayList<>();
            for(int i:arr)
            {
                l1.add(i);
            }
            if(hm.containsKey(l1))
            {
                List<String> ls = hm.get(l1);
                ls.add(s);
                hm.put(l1,ls);
            }
            else
                hm.put(l1,new ArrayList<>(Arrays.asList(s)));
        }
        for(List<String> ls:hm.values())
        {
            l.add(ls);
        }
        return l;
        
    }
    public int[] frequency(String s)
    {
        int arr[] = new int[26];
        for(int i=0;i<s.length();i++)
        {
            int c = s.charAt(i)-'a';
            arr[c]++;
        }
        return arr;
    }
}