class Solution {
    public int findKthNumber(int m, int n, int k) {
        int low = 1, high = m * n;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = count(mid, m, n);

            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    private static int count(int mid, int m, int n) {
        int count = 0;
        int i = m;
        int j = 1;

        while (i > 0 && j <= n) {
            if (i * j <= mid) {
                count += i;
                j++;
            } else {
                i--;
            }
        }

        return count;
    }
}