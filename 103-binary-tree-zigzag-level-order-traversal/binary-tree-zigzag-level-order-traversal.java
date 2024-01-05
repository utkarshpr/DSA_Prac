/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new LinkedList<>();
       
        if(root == null)
            return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> res=new LinkedList<>();
            for(int i=0;i<size;i++)
            {
                
                    if(q.peek().left!=null)
                        q.add(q.peek().left);
                    
                    if(q.peek().right!=null)
                        q.add(q.peek().right);    
                
               
                res.add(q.poll().val);
            }
            ans.add(res);
           
        }  
        for(int i =0;i<ans.size();i++){
            if(!(i%2 == 0)){
              Collections.reverse(ans.get(i));
            }
        }
        //return ans;
        return ans;  
    }
}