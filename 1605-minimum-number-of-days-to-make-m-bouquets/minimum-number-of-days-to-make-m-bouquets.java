class Solution {
    public static int minDays(int[] arr, int b, int ro) {
        int l=1,r=Integer.MIN_VALUE;
        for(int i:arr)
        {
            r=Math.max(r, i);
        }
        int max=r;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(helper(mid,arr,b,ro))
            {
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }  
        return l>max?-1:l;  

    }

    private static boolean helper(int mid, int[] arr, int b, int ro) {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=mid)
            {
                c++;
            }
            else{
                c=0;
            }
            if(c==ro)
            {
                b--;
                c=0;
            }
            if(b==0)
                return true;
        }
        return false;
    }
}