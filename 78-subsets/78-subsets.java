class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int l = nums.length;
        int s = (int)Math.pow(2,l);
        for(int i=0;i<s;i++)
        {
            String bin = Integer.toBinaryString(i);
            while(bin.length()<l)
                bin="0"+bin;
            List<Integer> l1 = new ArrayList<>();
            for(int j=0;j<bin.length();j++)
            {
                char ch = bin.charAt(j);
                if(ch=='1')
                {
                    l1.add(nums[j]);
                }
            }
            list.add(l1);
        }
        return list;
    }
}