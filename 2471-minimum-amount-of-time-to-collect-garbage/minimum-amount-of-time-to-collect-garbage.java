class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int totaltime = 0;

        for (int i = 0; i < garbage.length; i++) {
            totaltime += garbage[i].length();

        }
        for (int x : travel) {
            totaltime += (x * 3);
        }
        for (int i = garbage.length - 1; i > 0; i--) {
            if (garbage[i].indexOf("G") == -1) {
                totaltime -= travel[i - 1];
            } else {
                break;
            }

        }
        for (int i = garbage.length - 1; i > 0; i--) {
            if (garbage[i].indexOf("P") == -1) {
                totaltime -= travel[i - 1];
            } else {
                break;
            }

        }
        for (int i = garbage.length - 1; i > 0; i--) {
            if (garbage[i].indexOf("M") == -1) {
                totaltime -= travel[i - 1];
            } else {
                break;
            }

        }
        return totaltime;
    }
}