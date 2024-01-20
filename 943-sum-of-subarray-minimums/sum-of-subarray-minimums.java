class Solution {
     private static final long MOD = 1000000007;
    public int sumSubarrayMins(int[] arr) {
       long result = printSubArray(arr, 0);
        result %= MOD;
        return (int) result;
        
    }
    public static long printSubArray(int [] arr, int currIndex){

        int n = arr.length;
        long sum = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || arr[i] < arr[stack.peek()])) {
                int index = stack.pop();
                int minValue = stack.isEmpty() ? -1 : stack.peek();
                sum += (long) arr[index] * (i - index) * (index - minValue);
                sum %= MOD;
            }
            stack.push(i);
        }
        return sum;
    }
}