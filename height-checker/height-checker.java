class Solution {
    public int heightChecker(int[] heights) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i:heights)
        {
            al.add(i);
        }
        Collections.sort(al);
        int c=0;
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=al.get(i))
                c++;
        }
        return c;
    }
}