class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        if(matrix.length==0)
            return ans;
        int top=0,left=0,right=matrix[0].length-1,bottom=matrix.length-1;
        int d=0;
        while(top<=bottom && left<=right)
        {
            if(d==0){
            for(int i=left ;i<=right;i++)
            {
                ans.add(matrix[top][i]);

            }
            top++;
            }
         //   System.out.println(ans);
         else if(d==1){
            for(int i=top;i<=bottom;i++)
            {
                ans.add(matrix[i][right]);
            }
            right--;
         }
           // System.out.println(ans);
           else if(d==2){
            for(int i=right; i>=left;i--)
            {
                ans.add(matrix[bottom][i]);
            }
            bottom--;
           }
          //  System.out.println(ans);
          else if(d==3){
            for(int i=bottom; i>=top;i--)
                ans.add(matrix[i][left]);
                left++; 
          }
            // System.out.println(ans); 
            d=(d+1)%4; 
        }
        return ans;
    }
}