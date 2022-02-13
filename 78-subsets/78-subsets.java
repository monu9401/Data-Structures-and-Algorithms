class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> al = new ArrayList<>();
        int n = nums.length;
        int total = (int)Math.pow(2,n);
        for(int i=0;i<total;i++)
        {
            String s = binary(i,n);
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if(s.charAt(j)=='1')
                {
                    list.add(nums[j]);
                }
            }
            al.add(list);
        }
        return al;
    }
    public String binary(int x,int n)
    {
        StringBuilder sb = new StringBuilder("");
        while(x!=0)
        {
            int r=x%2;
            sb.append(r);
            x=x/2;
        }
        while(sb.length()!=n)
            sb.append("0");
        return sb.reverse().toString();
    }
}