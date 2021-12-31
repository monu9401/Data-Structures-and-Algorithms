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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return head;
        ListNode temp = head;
        int c=0;
        while(temp!=null)
        {
            temp=temp.next;
            c++;
        }
        k = k%c;
        if(k==0)
            return head;
        ListNode prev = head;
        temp=head;
        int count=0;
        while(count<(c-k))
        {
            prev=temp;
            temp=temp.next;
            count++;
        }
        prev.next=null;
        ListNode temp1 = temp;
        while(temp1.next!=null)
        {
            temp1=temp1.next;
        }
        temp1.next=head;
        head=temp;
        return head;
    }
}