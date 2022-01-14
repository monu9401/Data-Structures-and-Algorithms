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
    public int pairSum(ListNode head) {
        
        ListNode fast=head,slow=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode head2 = slow.next;
        slow.next=null;
        
        ListNode headS = reverse(head2);
        ListNode temp1=head,temp2=headS;
        int max=0;
        while(temp1!=null && temp2!=null)
        {
            int current = temp1.val+temp2.val;
            if(current>max)
                max=current;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return max;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode temp=head,temp1=head,temp2=head.next;
        temp.next=null;
        while(temp2!=null)
        {
            temp1=temp2;
            temp2=temp2.next;
            temp1.next=temp;
            temp=temp1;
        }
        return temp;
    }
}