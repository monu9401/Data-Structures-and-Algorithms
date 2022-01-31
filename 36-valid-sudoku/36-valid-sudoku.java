class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<9;i++)
        {
            HashSet<Character> hs1 = new HashSet<>();
            HashSet<Character> hs2 = new HashSet<>();
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.' && !hs1.add(board[i][j]))
                    return false;
                if(board[j][i]!='.' && !hs2.add(board[j][i]))
                    return false;
            }
        }
        for(int i=0;i<9;i=i+3)
        {
            for(int j=0;j<9;j=j+3)
            {
                HashSet<Character> hs = new HashSet<>();
                for(int k=i;k<i+3;k++)
                {
                    for(int l=j;l<j+3;l++)
                    {
                        if(board[k][l]!='.' && !hs.add(board[k][l]))
                            return false;
                    }
                }
            }
        }
        return true;
    }
}