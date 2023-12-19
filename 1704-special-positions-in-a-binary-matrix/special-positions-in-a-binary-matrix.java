class Solution {
    public int numSpecial(int[][] mat) {
        int rowone[]=new int[mat.length];
        int colone[]=new int[mat[0].length];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                rowone[i]+=mat[i][j];
                colone[j]+=mat[i][j];
            }
            
        }
        int c=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1 &&rowone[i]==1 && colone[j]==1)
                    c++;
            }
        }
        return c;
    }
}