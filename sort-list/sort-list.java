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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        ListNode tail = temp;
        ListNode sorted = sort(head,tail);
        return sorted;
    }
    public ListNode sort(ListNode head,ListNode tail)
    {
        if(head==tail)
        {
            ListNode dummyHead = new ListNode(head.val);
            return dummyHead;
        }
        
        ListNode mid = findMid(head,tail);
        ListNode fh = sort(head,mid);
        ListNode sh = sort(mid.next,tail);
        ListNode full = merge(fh,sh);
        return full;
    }
    public ListNode findMid(ListNode head,ListNode tail)
    {
        ListNode fast=head,slow=head;
        while(fast!=tail && fast.next!=tail)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode merge(ListNode head1,ListNode head2)
    {
        ListNode head0=null,temp1=head1,temp2=head2,temp;
        if(temp1.val<temp2.val)
        {
            head0=temp1;
            temp1=temp1.next;
        }
        else
        {
            head0=temp2;
            temp2=temp2.next;
        }
        temp=head0;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.val<temp2.val)
            {
                temp.next=temp1;
                temp1=temp1.next;
                temp=temp.next;
            }
            else
            {
                temp.next=temp2;
                temp2=temp2.next;
                temp=temp.next;
            }
        }
        while(temp1!=null)
        {
            temp.next=temp1;
            temp1=temp1.next;
            temp=temp.next;
        }
        while(temp2!=null)
        {
            temp.next=temp2;
            temp2=temp2.next;
            temp=temp.next;
        }
        return head0;
    }
}