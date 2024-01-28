class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int ans=0;
        int sum[]=new int[n];
        for(int i=0;i<m;i++)
        {
                Arrays.fill(sum, 0);
                for(int j=i;j<m;j++)
                {
                    for(int k=0;k<n;k++)
                    {
                        sum[k]+=matrix[j][k];
                    }
                    ans+=subarray(sum,target);
                }
        }
        return (ans);





        // for (int i = 0; i < matrix.length; i++)
        //     for (int j = 1; j < matrix[0].length; j++)
        //         matrix[i][j] += matrix[i][j - 1];
        // int c = 0;

        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();  // Move to the next line after printing each row
        // }

        // for (int c1 = 0; c1 < n; c1++)
        //     for (int c2 = c1; c2 < n; c2++) {
        //         HashMap<Integer, Integer> map = new HashMap<>();
        //         map.put(0, 1);
        //         int su = 0;
        //         for (int r = 0; r < m; r++) {
        //             System.out.println(map);
        //             su += matrix[r][c2] - (c1 > 0 ? matrix[r][c1 - 1] : 0);
        //             c += map.getOrDefault(su - target, 0);
        //             map.put(su, map.getOrDefault(su, 0) + 1);
        //         }
               

        //     }
        //     System.out.println(c);



    }

    private static int subarray(int[] sum, int target) {
        int c=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int s=0;
        for(int i=0;i<sum.length;i++)
        {
                s+=sum[i];
                if(hm.containsKey(s-target))
                    c+=hm.getOrDefault(s-target, 0);
                 hm.put(s, hm.getOrDefault(s, 0)+1);   
        }
        return c;
    }

}
