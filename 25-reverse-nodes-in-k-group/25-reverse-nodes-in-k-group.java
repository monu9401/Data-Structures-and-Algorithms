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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head.next==null || k==1)
            return head;
        int count=1;
        ListNode temp=head,temp1=head;
        while(count<k)
        {
            temp1=temp1.next;
            count++;
        }
        ListNode temp2=temp1.next;
        temp1.next=null;
        ListNode Head = reverse(temp,temp1);
        temp.next=temp2;
        while(temp2!=null)
        {
            count=1;
            ListNode temp0 = temp;
            temp=temp2;
            temp1=temp2;
            while(temp1.next!=null && count<k)
            {
                temp1=temp1.next;
                count++;
            }
            if(count<k)
                break;
            else
            {
                temp2=temp1.next;
                temp1.next=null;
                ListNode h1 = reverse(temp,temp1);
                temp0.next=h1;
                temp.next=temp2;
            }
        }
        return Head;
    }
    public ListNode reverse(ListNode head,ListNode tail)
    {
        if(head==tail)
            return head;
        ListNode temp=head,temp1=head,temp2=head.next;
        temp.next=null;
        while(temp2!=tail)
        {
            temp1=temp2;
            temp2=temp2.next;
            temp1.next=temp;
            temp=temp1;
        }
        temp2.next=temp1;
        return temp2;
    }
}