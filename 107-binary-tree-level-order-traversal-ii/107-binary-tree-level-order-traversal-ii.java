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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(new TreeNode(-5000));
        while(!q.isEmpty())
        {
            TreeNode temp = q.poll();
            if(temp.val!=-5000)
            {
                if(temp.left!=null)
                    q.offer(temp.left);
                if(temp.right!=null)
                    q.offer(temp.right);
                l.add(temp.val);
            }
            else
            {
                if(!q.isEmpty())
                {
                    q.offer(temp);
                }
                list.add(0,l);
                l=new ArrayList<>();
            }
        }
        return list;
    }
}