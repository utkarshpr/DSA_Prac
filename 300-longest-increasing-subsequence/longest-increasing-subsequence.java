class Solution {
    public int lengthOfLIS(int[] arr) {
    //     int n=arr.length;
    //     int dp[][]=new int[n][n+1];//strt from -1 and goes  till n-1;
    //     for (int row[] : dp) {
    //         Arrays.fill(row, -1);
    //     }
    //    return helper(arr,0,(int)-1,dp);
     ArrayList<Integer> ar=new ArrayList<>();
        ar.add(arr[0]);
       int len=1;
       for(int i=1;i<arr.length;i++)
       {
        if(arr[i]>ar.get(ar.size()-1)){
            ar.add(arr[i]);
            len++;
        }
        else{
           // int id=Collections.binarySearch(ar, arr[i]);
            
            int ind=Collections.binarySearch(ar, arr[i]);
            if (ind < 0) {
                ind = -ind - 1;
            }
            ar.set(ind,arr[i]);
        }
       }
       return len;
    }

    private static int helper(int[] arr, int n, int prev,int dp[][]) {
        if(n == arr.length)
            return 0;
        int taken=Integer.MIN_VALUE;
        if( dp[n][prev+1] != -1) return dp[n][prev+1];
        if( prev == -1 || arr[prev]< arr[n])
        {
            taken= 1+helper(arr, n+1, n,dp);
        }
        int nottaken= 0+ helper(arr, n+1, prev,dp);

         dp[n][prev+1]=Math.max(taken, nottaken);

         return dp[n][prev+1];

    }
}