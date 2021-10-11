class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length,i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n/2;j++)
            {
                int t=image[i][j];
                image[i][j]=image[i][n-1-j];
                image[i][n-1-j]=t;
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(image[i][j]==0)
                    image[i][j]=1;
                else
                    image[i][j]=0;
            }
        }
        return image;
    }
}