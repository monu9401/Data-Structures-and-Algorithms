/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head,slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
                return startingPoint(slow,head);
        }
        return null;
    }
    static ListNode startingPoint(ListNode temp1,ListNode head)
    {
        ListNode temp = head;
        while(temp!=temp1)
        {
            temp=temp.next;
            temp1=temp1.next;
        }
        return temp;
    }
}