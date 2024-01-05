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
 /*nt diameter = 0;
        height(root, diameter);
        return diameter;
    }

private:
    int height(TreeNode* node, int& diameter) {
        if (!node) {
            return 0;
        }
        int lh = height(node->left, diameter);
        int rh = height(node->right, diameter);
        diameter = max(diameter, lh + rh);
        return 1 + max(lh, rh);
    }*/
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int dai[]=new int[1];
        helper(root,dai);
        return dai[0];
    }
    public int helper(TreeNode root,int[] dai){
        if(root == null)
        {
            return 0;
        }
        int l=helper(root.left,dai);
        int r=helper(root.right,dai);
        dai[0]=Math.max(dai[0],l+r);
        return Math.max(l,r)+1;
    }
}