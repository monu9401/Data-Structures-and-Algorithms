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
        ListNode temp = head,tempPrev=null;
        while(temp!=null && temp.next!=null)
        {
            ListNode temp1 = temp.next;
            ListNode temp2 = temp1.next;
            temp1.next=temp;
            temp.next=temp2;
            if(tempPrev!=null)
            {
                tempPrev.next=temp1;
            }
            else
            {
                head=temp1;
            }
            tempPrev=temp;
            temp=temp2;
        }
        return head;
    }
}