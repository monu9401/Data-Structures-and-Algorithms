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
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root,1));
        while(!stack.isEmpty())
        {
            Pair p = stack.peek();
            if(p.state==1)
            {
                p.state++;
                if(p.node.left!=null)
                    stack.push(new Pair(p.node.left,1));
            }
            else if(p.state==2)
            {
                p.state++;
                list.add(p.node.val);
                if(p.node.right!=null)
                    stack.push(new Pair(p.node.right,1));
            }
            else if(p.state==3)
            {
                stack.pop();
            }      
        }
        return list;
    }
}
class Pair
{
    TreeNode node;
    int state;
    Pair(TreeNode node,int state)
    {
        this.node=node;
        this.state=state;
    }
}