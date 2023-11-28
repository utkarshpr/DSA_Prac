class Solution {
    public double findMedianSortedArrays(int[] n1, int[] n2) {
      int ar[]=new int[n1.length+n2.length];
		int i=0,j=0;
        int mid=(n1.length+n2.length)/2;
        int m1=0,m2=0;
        for (int c = 0;  (c) <= mid; c++) {
			m2 = m1;
			if (i != n1.length && j != n2.length) {
				if (n1[i] <= n2[j]) {
					m1 = n1[i++];
				} else {
					m1 = n2[j++];
				}
			} else if (i < n1.length) {
				m1 = n1[i++];
			} else {
				m1 = n2[j++];
			}
		}
        //System.out.println(m1+" "+m2);
		if((n1.length+n2.length)%2 !=0)
		{
			return(m1);
		}
		else
			return((m2+m1)*1.0/2.0);

	}
	
	private static double helper(int[] n1, int[] n2, int[] ar) {
		int i=0,j=0,k=0;
		while(i<n1.length && j<n2.length)
		{
			if(n1[i]<=n2[j])
			{
				ar[k++]=n1[i];
				i++;
			}
			else
			{
				ar[k++]=n2[j];
				j++;
			}
		}
		while (i < n1.length) {
            ar[k++] = n1[i++];
        }

        while (j < n2.length) {
            ar[k++] = n2[j++];
        }

        int mid=(n1.length+n2.length)/2;
     //   System.out.println(mid);
        if(ar.length%2 != 0)
        	return ar[mid];
        else
        	return ((ar[mid]+ar[mid-1])*1.0)/2.0;
		
		
	}
}