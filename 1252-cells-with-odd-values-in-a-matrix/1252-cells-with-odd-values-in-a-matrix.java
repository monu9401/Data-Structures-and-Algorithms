class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        
        int matrix[][]=new int[m][n];
        for(int i=0;i<indices.length;i++)
        {
            int x = indices[i][0];
            int y = indices[i][1];
            for(int j=0;j<n;j++)
            {
                matrix[x][j]++;
            }
            for(int j=0;j<m;j++)
            {
                matrix[j][y]++;
            }
        }
        int c=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]%2==1)
                    c++;
            }
        }
        return c;
    }
}