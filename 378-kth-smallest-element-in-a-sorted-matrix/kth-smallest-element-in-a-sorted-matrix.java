class Solution {
    public int kthSmallest(int[][] matrix, int k) {
       int n=matrix.length;
        int low=matrix[0][0], high=matrix[n-1][n-1];
        while(low<high)
        {
            int mid=low+(high-low)/2;
            int count=count(matrix,mid);
            if(count<k)
                low=mid+1;
            else
                high=mid;

        }
        return low;
    }
    private static int count(int[][] matrix, int mid) {
        int c=0,n=matrix.length,i=n-1,j=0;
        while(i>=0 && j<n)
        {
            if(matrix[i][j]>mid)i--;
            else{
                c=c+i+1;
                j++;
            }

        }
        return c;
    }
}