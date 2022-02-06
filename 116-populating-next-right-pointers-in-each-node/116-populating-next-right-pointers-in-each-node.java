/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)
            return root;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        q.offer(new Node(-5000));
        while(!q.isEmpty())
        {
            Node temp = q.poll();
            if(temp.val!=-5000)
            {
                Node temp1 = q.peek();
                if(temp1.val==-5000)
                    temp.next=null;
                else
                    temp.next=temp1;
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
            }
        }
        return root;
    }
}