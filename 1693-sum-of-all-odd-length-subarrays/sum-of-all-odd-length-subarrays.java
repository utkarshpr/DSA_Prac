class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n= arr.length;
        int res=0;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++)
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if ((j - i + 1) % 2 == 0) continue;
                if (i - 1 < 0) res += prefixSum[j];
                else res += (prefixSum[j] - prefixSum[i - 1]);
            }
        }
return res;
    }
}
// 1 5 7 12 15