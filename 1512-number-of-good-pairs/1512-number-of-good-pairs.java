class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums)
        {
            if(hm.containsKey(i))
                hm.put(i,hm.get(i)+1);
            else
                hm.put(i,1);
        }
        int sum=0;
        for(int x:hm.values())
        {
            if(x>1)
            {
                int c = (x*(x-1))/2;
                sum=sum+c;
            }
        }
        return sum;
    }
}