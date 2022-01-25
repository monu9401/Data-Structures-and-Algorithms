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
        if(root==null)
            return new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> l1 = new ArrayList<>();
        q.offer(root);
        q.offer(new TreeNode(-5000));
        while(!q.isEmpty())
        {
            TreeNode temp = q.poll();
            if(temp.val!=-5000)
            {
                l1.add(temp.val);
                if(temp.left!=null)
                    q.offer(temp.left);
                if(temp.right!=null)
                    q.offer(temp.right);
            }
            else
            {
                if(!q.isEmpty())
                {
                    q.offer(temp);
                }
                list.add(l1);
                l1=new ArrayList<>();
            }
        }
        return list;
    }
}