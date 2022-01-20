class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> al = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i:nums)
        {
            if(!hs.add(i))
                al.add(i);
        }
        return al;
    }
}