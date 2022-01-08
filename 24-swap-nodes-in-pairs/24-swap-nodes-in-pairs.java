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
    public ListNode swapPairs(ListNode head) {
        
        if(head==null || head.next==null)
            return head;
        ListNode temp=head,temp1=head,temp2=null;
        int c=0;
        while(temp!=null && temp.next!=null)
        {
            temp1=temp.next;
            temp.next=temp1.next;
            temp1.next=temp;
            if(c==0)
                head=temp1;
            else
                temp2.next=temp1;
            temp2=temp;
            c++;
            temp=temp.next;
        }
        return head;
    }
}