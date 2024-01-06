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
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int ans=0;
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(root, 0));
        while (!q.isEmpty()) {
            int size=q.size();
            int mun=q.peek().id;
            int first=0,last=0;
            for(int i=0;i<size;i++)
            {
                int curr_id=q.peek().id-mun;
                TreeNode node = q.peek().n;
                q.poll();
                if(i ==0)first=curr_id;
                if(i==size-1)last=curr_id;  
                if(node.left!=null)
                    q.offer(new Pair(node.left, curr_id*2+1))      ;
                if(node.right!=null)
                    q.offer(new Pair(node.right, curr_id*2+2))      ;

            }
            ans=Math.max(ans, last-first+1);
          
    }
      return ans;

}
}
class Pair{
    TreeNode n;
    public Pair(TreeNode n, int id) {
        this.n = n;
        this.id = id;
    }
    int id;
}