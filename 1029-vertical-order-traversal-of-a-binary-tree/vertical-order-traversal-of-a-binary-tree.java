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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
       List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
        {
            return ans;
        }
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> hm=new TreeMap<>();
        Queue<Tuple> q=new LinkedList < Tuple > ();
        q.add(new Tuple(root, 0, 0));
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)

            {
                TreeNode temp=q.peek().x;
                int x_row=q.peek().row;
                int x_col=q.peek().col;
                if(!hm.containsKey(x_row))
                    hm.put(x_row, new TreeMap<>());
                if(!hm.get(x_row).containsKey(x_col))
                    hm.get(x_row).put(x_col, new PriorityQueue<>());    
                hm.get(x_row).get(x_col).offer(temp.val);
                if(temp.left!=null)
                    q.add(new Tuple(temp.left, x_row-1, x_col+1));
                if(temp.right!=null)
                    q.add(new Tuple(temp.right, x_row+1, x_col+1));    
                q.poll();    
            }
        }
        List < List < Integer >> list = new ArrayList < > ();
        for ( TreeMap<Integer,PriorityQueue<Integer>> ys: hm.values()) {
            list.add(new ArrayList < > ());
            for (PriorityQueue < Integer > nodes: ys.values()) {
                while (!nodes.isEmpty()) {
                    list.get(list.size() - 1).add(nodes.poll());
                }
            }
        }
        return list;
    
    }
}
 class Tuple {
    public Tuple(TreeNode x, int row, int col) {
        this.x = x;
        this.row = row;
        this.col = col;
    }
    TreeNode x;
    int row;
    int col;
    
    
}