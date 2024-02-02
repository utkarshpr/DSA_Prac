class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            generateSequentialDigits(low, high, i, result);
        }
        result.sort(null);
        return result;
    }

    private static void generateSequentialDigits(int low, int high, int current, List<Integer> result) {
        if (current >= low && current <= high) {
            result.add(current);
        }

        if (current % 10 < 9) {
            int nextDigit = current * 10 + (current % 10) + 1;
            if (nextDigit <= high) {
                generateSequentialDigits(low, high, nextDigit, result);
            }
        }
    }
}