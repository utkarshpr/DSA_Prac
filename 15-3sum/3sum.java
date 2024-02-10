class Solution {
    public List<List<Integer>> threeSum(int[] ar) {
         List<List<Integer>>  ans=new ArrayList<>();
        Arrays.sort(ar);
        for(int i=0;i<ar.length;i++)
        {
            if(i>0 && ar[i]==ar[i-1]){
                continue;
            }
            int target=-ar[i];
            int j=i+1;
            int k=ar.length-1;
            while(j<k){
                if(ar[j]+ar[k] ==  target){
                    ans.add(Arrays.asList(ar[i], ar[j], ar[k]));
                    j++;
                    k--;
                    //System.out.println(ans);
                    while(j<k && ar[j]==ar[j-1])j++;
                    while(j<k && ar[k]==ar[k+1])k--;
                }
                else if(ar[j]+ar[k] < target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return ans;
    }
}
