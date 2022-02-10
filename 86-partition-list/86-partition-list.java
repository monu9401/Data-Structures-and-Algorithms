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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null)
            return head;
        ListNode temp=head;
        ListNode smallHead = new ListNode(-1000);
        ListNode largeHead = new ListNode(-1000);
        ListNode temp1=smallHead,temp2=largeHead;
        while(temp!=null)
        {
            if(temp.val<x)
            {
                temp1.next=temp;
                temp1=temp1.next;
                temp=temp.next;
                temp1.next=null;
            }
            else if(temp.val>=x)
            {
                temp2.next=temp;
                temp2=temp2.next;
                temp=temp.next;
                temp2.next=null;
            }
        }
        temp1.next=largeHead.next;
        smallHead=smallHead.next;
        return smallHead;
    }
}