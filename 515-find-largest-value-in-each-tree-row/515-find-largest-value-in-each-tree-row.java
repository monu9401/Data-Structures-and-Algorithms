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
    public List<Integer> largestValues(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        Queue<TreeNode> mq = new LinkedList<>();
        Queue<TreeNode> sq = new LinkedList<>();
        mq.offer(root);
        while(!mq.isEmpty())
        {
            TreeNode temp = mq.poll();
            if(temp.left!=null)
                sq.offer(temp.left);
            if(temp.right!=null)
                sq.offer(temp.right);
            if(mq.isEmpty())
            {
                int maximum = Integer.MIN_VALUE;
                for(TreeNode i:sq)
                {
                    maximum = Math.max(i.val,maximum);
                }
                list.add(maximum);
                mq=sq;
                sq = new LinkedList<>();
            }
        }
        list.remove(list.size()-1);
        return list;
    }
}