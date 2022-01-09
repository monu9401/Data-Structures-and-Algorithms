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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode oddHead=head,evenHead=head.next,temp=head.next.next;
        int count=3;
        ListNode temp1=oddHead,temp2=evenHead;
        while(temp!=null)
        {
            if(count%2==0)
            {
                temp2.next=temp;
                temp2=temp;
            }
            else
            {
                temp1.next=temp;
                temp1=temp;
            }
            temp=temp.next;
            count++;
        }
        temp2.next=null;
        temp1.next=evenHead;
        return oddHead;
    }
}