class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for(int i:nums1)
        {
            hs1.add(i);
        }
        for(int i:nums2)
        {
            hs2.add(i);
        }
        hs1.retainAll(hs2);
        int arr[]=new int[hs1.size()];
        int c=0;
        for(int i:hs1)
        {
            arr[c++]=i;
        }
        return arr;
    }
}