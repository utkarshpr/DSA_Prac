
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
       List<Integer> ar=new ArrayList<>();
      helper(root ,ar,0);
      return ar;
    }
    void helper(TreeNode root, List<Integer> ar,int c)
    {
        if(root == null)
            return ;
        if(ar.size()==c)    
        ar.add(root.val);
        
          helper(root.right,ar,c+1);
        
            helper(root.left,ar,c+1);
            
    }
}