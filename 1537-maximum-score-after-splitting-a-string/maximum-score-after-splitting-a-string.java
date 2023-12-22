class Solution {
    public int maxScore(String s) {
        int cone = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                cone++;
        }
        int czer = 0;
        int max = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                czer++;
            } else {
                cone--;
            }
           // System.out.println(czer + " " + cone);
            max = Math.max(cone + czer, max);
        }
        return max;
    }
}