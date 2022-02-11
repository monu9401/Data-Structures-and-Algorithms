/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        Node temp=head,temp1;
        while(temp!=null)
        {
            temp1 = new Node(temp.val);
            temp1.next=temp.next;
            temp.next=temp1;
            temp=temp1.next;
        }
        Node hh = head.next;
        temp=head;
        while(temp!=null)
        {
            temp1=temp.next;
            Node r=temp.random;
            if(r==null)
                temp1.random=null;
            else
                temp1.random=r.next;
            temp=temp.next.next;
        }
        temp=head;
        while(temp!=null)
        {
            temp1=temp.next;
            temp.next=temp1.next;
            Node x = temp1.next;
            if(x!=null)
                temp1.next=x.next;
            else
                temp1.next=null;
            temp=temp.next;
        }
        return hh;
    }
}