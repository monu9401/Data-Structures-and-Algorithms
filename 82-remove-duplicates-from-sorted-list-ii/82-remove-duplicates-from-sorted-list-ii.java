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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode hh = new ListNode(-500);
        ListNode temp=hh;
        ListNode temp1=head;
        ListNode temp2=head.next;
        while(temp2!=null)
        {
            int count=0;
            while(temp2!=null && temp2.val==temp1.val)
            {
                temp2=temp2.next;
                count++;
            }
            if(count!=0)
            {
                temp1=temp2;
                if(temp2!=null)
                    temp2=temp2.next;
            }
            else
            {
                temp.next=temp1;
                temp=temp.next;
                temp.next=null;
                temp1=temp2;
                if(temp2!=null)
                    temp2=temp2.next;
            }
        }
        temp.next=temp1;
        hh = hh.next;
        return hh;
    }
}