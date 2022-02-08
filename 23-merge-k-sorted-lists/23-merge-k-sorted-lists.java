/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return null;
        ListNode head = new ListNode(-1);
        ListNode temp=head;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i=0;i<lists.length;i++)
        {
            if(lists[i]!=null)
                pq.offer(new Pair(i,lists[i]));
        }
        while(!pq.isEmpty())
        {
            Pair p = pq.poll();
            temp.next=p.node;
            temp=temp.next;
            p.node=p.node.next;
            if(p.node!=null)
            {
                pq.offer(new Pair(p.li,p.node));
            }
            temp.next=null;
        }
        head = head.next;
        return head;
    }
}
class Pair implements Comparable<Pair>
{
    int li;
    ListNode node;
    public Pair(int li,ListNode node)
    {
        this.li=li;
        this.node=node;
    }
    public int compareTo(Pair p)
    {
    return this.node.val-p.node.val;
    }
}