class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> al = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int total = m*n;
        int minc=0,minr=0,maxc=n-1,maxr=m-1;
        int c=0;
        while(c<total)
        {
            for(int i=minr,j=minc;j<=maxc && c<total;j++)
            {
                al.add(matrix[i][j]);
                c++;
            }
            minr++;
            for(int i=minr,j=maxc;i<=maxr && c<total;i++)
            {
                al.add(matrix[i][j]);
                c++;
            }
            maxc--;
            for(int i=maxr,j=maxc;j>=minc && c<total;j--)
            {
                al.add(matrix[i][j]);
                c++;
            }
            maxr--;
            for(int i=maxr,j=minc;i>=minr && c<total;i--)
            {
                al.add(matrix[i][j]);
                c++;
            }
            minc++;
        }
        return al;
    }
}