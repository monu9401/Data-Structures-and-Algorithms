class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        
        int n = grid.length;
        int maxInRow[] = new int[n];
        int maxInCol[] = new int[n];
        for(int i=0;i<n;i++)
        {
            int max = 0;
            for(int j=0;j<n;j++)
            {
                if(max<grid[i][j])
                    max=grid[i][j];
            }
            maxInRow[i]=max;
        }
        for(int j=0;j<n;j++)
        {
            int max = 0;
            for(int i=0;i<n;i++)
            {
                if(max<grid[i][j])
                    max=grid[i][j];
            }
            maxInCol[j]=max;
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int x = Math.min(maxInRow[i],maxInCol[j]);
                sum=sum+(x-grid[i][j]);
            }
        }
        return sum;
    }
}