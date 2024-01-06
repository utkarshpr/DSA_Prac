/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> p1=new ArrayList<>();
        path(root, p,p1);
        List<TreeNode> p2=new ArrayList<>();
        path(root, q,p2);
        TreeNode ans=null;
        for(int i=0;i<((p1.size()<p2.size())?p1.size():p2.size());i++)
        {
                if(p1.get(i).val == p2.get(i).val)
                {
                        ans=p1.get(i);
                }
                else
                    break;
        }
        return ans;
        
    }
    public boolean path(TreeNode root,TreeNode x,List<TreeNode> ans)
    {
       
        if(root == null)
        {
            return false;
        }
        ans.add(root);
        if(root == x)
        {
            return true;
        }
        if(path(root.left, x, ans)||path(root.right, x, ans))
            return true;
        ans.remove(ans.size()-1);
        return false;       
    }
}