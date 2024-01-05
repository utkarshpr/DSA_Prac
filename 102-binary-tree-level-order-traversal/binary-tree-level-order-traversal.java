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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root == null)
            return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> ar=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                if(q.peek().left !=null)
                {
                    q.add(q.peek().left);
                }
                if(q.peek().right !=null)
                {
                    q.add(q.peek().right);
                }
                ar.add(q.poll().val);

            }
            res.add(ar);
        }
        return res;
    }
}