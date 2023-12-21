class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int l = 1;
        int r = (int) 1e7;
        boolean get1=false;
        // for (int i : dist)
        //     r = Math.max(i, r);
        while (l <= r) {
            int mid = (l + r) / 2;
            double h=ishelper(mid, dist, hour);
            if (h<=hour) {
                if(!get1)
                    get1=!get1;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return get1?l:-1;
    }

    private double ishelper(int mid, int[] dist, double hour) {
        double h = 0;
        for (int i = 0; i < dist.length; i++) {
            double x = dist[i] * (1.0) / mid * 1.0;
            if (i != dist.length - 1) {
                h += Math.ceil(x);
            } else {
                h += x;
            }
        }
        return h;
    }
}