class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
                hm.put(nums[i],1);
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int i:hm.values())
        {
            al.add(i);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<k;i++)
        {
            pq.offer(al.get(i));
        }
        for(int i=k;i<al.size();i++)
        {
            int x = pq.peek();
            int y = al.get(i);
            if(x<y)
            {
                pq.poll();
                pq.offer(al.get(i));
            }
        }
        int res[]=new int[pq.size()];
        int c=0;
        while(!pq.isEmpty())
        {
            for(int i:hm.keySet())
            {
                if(hm.get(i)==pq.peek())
                {
                    res[c]=i;
                    c++;
                    pq.poll();
                    hm.remove(i);
                    break;
                }
            }
        }
        return res;
    }
}