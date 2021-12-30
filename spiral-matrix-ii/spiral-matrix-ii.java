class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n];
        int x = n*n;
        int minc=0,maxc=n-1,minr=0,maxr=n-1;
        int c=1;
        while(c<=x)
        {
            for(int i=minr,j=minc;j<=maxc && c<=x;j++)
            {
                matrix[i][j]=c;
                c++;
            }
            minr++;
            for(int i=minr,j=maxc;i<=maxr && c<=x;i++)
            {
                matrix[i][j]=c;
                c++;
            }
            maxc--;
            for(int i=maxr,j=maxc;j>=minc && c<=x;j--)
            {
                matrix[i][j]=c;
                c++;
            }
            maxr--;
            for(int i=maxr,j=minc;i>=minr && c<=x;i--)
            {
                matrix[i][j]=c;
                c++;
            }
            minc++;
        }
        return matrix;
    }
}