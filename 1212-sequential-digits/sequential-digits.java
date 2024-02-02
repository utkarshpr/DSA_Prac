class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list=new ArrayList<>();
		fun(low,high,0,list,1,1);
        Collections.sort(list);
        return list;
    }
    public static void fun(int low,int high,int val,List<Integer> list,int start,int index){
        if(index>9){
            return;
        }
        if(start>10){
            index=index+1;
            start=index;
            val=0;
        }
        if(val>=low && val<=high){
            list.add(val);
        }
        val=val*10+start;
        fun(low,high,val,list,start+1,index);
    }
}