class Solution {
    public int rob(int[] arr) {
        ArrayList<Integer> arr1=new ArrayList<>();
    ArrayList<Integer> arr2=new ArrayList<>();
    int n=arr.length;
    if(n==1)
       return arr[0];
    
    for(int i=0; i<n; i++){
        
        if(i!=0) arr1.add(arr[i]);
        if(i!=n-1) arr2.add(arr[i]);
    }
    
    long ans1 = solve(arr1);
    long ans2 = solve(arr2);
    
    return (int)Math.max(ans1,ans2);
    }
    static long solve(ArrayList<Integer> arr){
    int n = arr.size();
    long prev = arr.get(0);
    long prev2 =0;
    
    for(int i=1; i<n; i++){
        long pick = arr.get(i);
        if(i>1)
            pick += prev2;
        long nonPick = 0 + prev;
        
        long cur_i = Math.max(pick, nonPick);
        prev2 = prev;
        prev= cur_i;
        
    }
    return prev;
}
}