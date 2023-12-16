class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0,r=matrix[0].length-1;
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][0] <= target && target<=matrix[i][r])
            {
                    while(l<=r)
                    {
                        int mid = (l+r)/2;
                        if(matrix[i][mid] == target)
                        {
                            return true;
                        }
                        else if(matrix[i][mid]< target)
                        {
                            l=mid+1;
                        }
                        else{
                            r=mid-1;
                        }
                    }
            }

        }
        return false;
    }
}