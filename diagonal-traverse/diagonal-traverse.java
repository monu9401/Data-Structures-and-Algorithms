class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int arr[]=new int[mat.length*mat[0].length];
        int c=0;
        for(int i=0;i<mat.length;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<=Math.min(i,mat[0].length-1);j++)
                {
                    arr[c++]=mat[i-j][j];
                }
            }
            else
            {
                for(int j=Math.min(i,mat[0].length-1);j>=0;j--)
                {
                    arr[c++]=mat[i-j][j];
                }
            }
        }
        for(int j=1;j<mat[0].length;j++)
        {
            if(mat.length%2==0)
            {
                if(j%2==0)
                {
                    for(int i=0;i<mat.length;i++)
                    {
                        if((j+mat.length-1-i)<mat[0].length)
                        arr[c++]=mat[i][j+mat.length-1-i];
                    }
                }
                else
                {
                    for(int i=mat.length-1;i>=0;i--)
                    {
                        if((j+mat.length-1-i)<mat[0].length)
                        arr[c++]=mat[i][j+mat.length-1-i];
                    }
                }
            }
            else
            {
                if(j%2==1)
                {
                    for(int i=0;i<mat.length;i++)
                    {
                        if((j+mat.length-1-i)<mat[0].length)
                        arr[c++]=mat[i][j+mat.length-1-i];
                    }
                }
                else
                {
                    for(int i=mat.length-1;i>=0;i--)
                    {
                        if((j+mat.length-1-i)<mat[0].length)
                        arr[c++]=mat[i][j+mat.length-1-i];
                    }
                }
            }
        }
        return arr;
    }
}