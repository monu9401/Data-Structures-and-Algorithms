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
        if(root==null)
            return new ArrayList<>();
        
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(new TreeNode(-500));
        int c=1;
        while(!q.isEmpty())
        {
            TreeNode temp = q.poll();
            if(temp.val!=-500)
            {
                l.add(temp.val);
                if(temp.left!=null)
                    q.offer(temp.left);
                if(temp.right!=null)
                    q.offer(temp.right);
            }
            else
            {
                if(!q.isEmpty())
                    q.offer(temp);
                if(c%2==0)
                {
                    Collections.reverse(l);
                }
                list.add(l);
                l = new ArrayList<>();
                c++;
            }
        }
        return list;
    }
}