class Solution {
    public int findTheWinner(int n, int k) {
       ArrayList<Integer> al = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            al.add(i);
        }
        int current=0;
        while(al.size()!=1)
        {
            current=current+k-1;
            current = current%al.size();
            al.remove(current);
        }
        return al.get(0);
    }
}