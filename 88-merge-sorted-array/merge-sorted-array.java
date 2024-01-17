class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i=0,j=0;
        if(n==0)
        {

        }
        else if(m==0)
        {
            for( i=0;i<nums2.length;i++)
            {
                nums1[i]=nums2[i];
            }
        }
        else{
            while(i<m && j<n){
                if(nums1[i]<nums2[j])
                {
                    i++;
                }
                else{
                    int temp=nums1[i];
                    nums1[i]=nums2[j];
                    nums2[j]=temp;
                    i++;
                    Arrays.sort(nums2);
                }
            }
            int c=0;
            while(j<n)
            {
                nums1[m+c++]=nums2[j++];
            }

        }
    }
}
