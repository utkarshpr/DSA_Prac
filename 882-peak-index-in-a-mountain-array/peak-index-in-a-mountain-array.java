class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int c=-1;
        if(arr.length<3)
            return 0;
         int max=Integer.MIN_VALUE;   
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
                c=i;
            }
        }
        return (c!=0 || c!=arr.length-1)?c:0;
    }
}