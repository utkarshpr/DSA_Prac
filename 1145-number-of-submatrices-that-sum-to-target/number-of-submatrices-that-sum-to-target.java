class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < matrix.length; i++)
            for (int j = 1; j < matrix[0].length; j++)
                matrix[i][j] += matrix[i][j - 1];
        int c = 0;

        for (int c1 = 0; c1 < n; c1++)
            for (int c2 = c1; c2 < n; c2++) {
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);
                int su = 0;
                for (int r = 0; r < m; r++) {
                    su += matrix[r][c2] - (c1 > 0 ? matrix[r][c1 - 1] : 0);
                    c += map.getOrDefault(su - target, 0);
                    map.put(su, map.getOrDefault(su, 0) + 1);
                }

            }
           return c;     
    }
}