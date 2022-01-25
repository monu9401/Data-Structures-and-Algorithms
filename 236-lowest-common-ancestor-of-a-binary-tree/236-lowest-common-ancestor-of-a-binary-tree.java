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
        
        ArrayList<TreeNode> path1 = nodeToRootPath(root,p);
        ArrayList<TreeNode> path2 = nodeToRootPath(root,q);
        int i=path1.size()-1,j=path2.size()-1;
        while(i>=0 && j>=0 && path1.get(i)==path2.get(j))
        {
            i--;
            j--;
        }
        i++;
        return path1.get(i);
        
    }
    public ArrayList<TreeNode> nodeToRootPath(TreeNode root,TreeNode p)
    {
        if(root==null)
            return new ArrayList<>();
        if(root==p)
        {
            ArrayList<TreeNode> al = new ArrayList<>();
            al.add(root);
            return al;
        }
        ArrayList<TreeNode> al = new ArrayList<>();
        al = nodeToRootPath(root.left,p);
        if(al.size()>0)
        {
            al.add(root);
            return al;
        }
        al = nodeToRootPath(root.right,p);
        if(al.size()>0)
        {
            al.add(root);
            return al;
        }
        return new ArrayList<>();
    }
}