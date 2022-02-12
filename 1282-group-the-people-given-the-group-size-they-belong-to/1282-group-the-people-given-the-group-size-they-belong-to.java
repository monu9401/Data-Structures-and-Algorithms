class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        
        HashMap<Integer,List<Integer>> hm = new HashMap<>();
        HashMap<List<Integer>,Integer> hmp = new HashMap<>();
        List<List<Integer>> al = new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++)
        {
            if(hm.containsKey(groupSizes[i]))
            {
                List<Integer> list = hm.get(groupSizes[i]);
                list.add(i);
                if(list.size()==groupSizes[i])
                {
                    hmp.put(list,groupSizes[i]);
                    hm.remove(groupSizes[i]);
                }
                else
                    hm.put(groupSizes[i],list);
            }
            else
            {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                if(list.size()==groupSizes[i])
                    hmp.put(list,groupSizes[i]);
                else
                    hm.put(groupSizes[i],list);
            }
        }
        for(List<Integer> i:hmp.keySet())
        {
           al.add(i);
        }
        return al;
    }
}