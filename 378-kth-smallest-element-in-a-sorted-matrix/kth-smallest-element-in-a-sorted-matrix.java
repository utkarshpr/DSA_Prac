class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> ar=new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                ar.add(matrix[i][j]);
            }
        }
        Collections.sort(ar);
        System.out.println(ar);
        int xx=ar.get(k-1);
        return xx;
    }
}