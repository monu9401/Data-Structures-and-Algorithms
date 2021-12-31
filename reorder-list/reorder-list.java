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
    public void reorderList(ListNode head) {
        ListNode temp = head;
        int c=0;
        while(temp!=null)
        {
            temp=temp.next;
            c++;
        }
        if(c==1)
            return;
        reorder(head,head,c);
    }
    public void reorder(ListNode left,ListNode head,int n)
    {
        if(head==null)
            return;
        
        reorder(left,head.next,n-1);
        for(int i=1;i<n && left!=null && left.next!=null;i++)
            left=left.next.next;
        if(left==null || left.next==null)
        {
            return;
        }
        if(left.next==left || left==head)
        {
            left.next=null;
            return;
        }
        head.next = left.next;
        left.next = head;
    }
}