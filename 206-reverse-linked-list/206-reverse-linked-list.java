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
    public ListNode reverseList(ListNode head) {
        
        if(head==null || head.next==null)
            return head;
        ListNode temp=head,temp1=head,temp2=head.next;
        temp.next=null;
        while(temp2!=null)
        {
            temp1=temp2;
            temp2=temp2.next;
            temp1.next=temp;
            temp=temp1;
        }
        head=temp;
        return head;
    }
}