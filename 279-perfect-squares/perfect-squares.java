class Solution {
    public int numSquares(int n) {
        
        if (n < 4) 
            return n;
        
        int[] res = new int[n+1];
        
		// initialize the array values for all perfect squares
        for (int i = 1; i*i <= n; ++i) 
            res[i*i] = 1;
        
        return recNumSq(n, res);
    }
    
    private int recNumSq(int n, int[] cache) {
     
        if (cache[n] != 0)
            return cache[n];
        
        int min = n;
		// for each i*i less than n, add count of n/(i*i) and recurse over remainder
        for (int i = (int)Math.sqrt(n); i > 1 && min > 2; --i) {
            min = Math.min(min, n/(i*i) + recNumSq(n-i*i*(n/(i*i)), cache));
        }
        
        cache[n] = min;
        return min;
    }
}