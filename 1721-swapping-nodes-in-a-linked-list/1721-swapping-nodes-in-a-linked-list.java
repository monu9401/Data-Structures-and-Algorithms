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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int count=1;
        while(count<k)
        {
            count++;
            temp=temp.next;
        }
        ListNode temp1=temp,temp2=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            temp2=temp2.next;
        }
        int v = temp1.val;
        temp1.val=temp2.val;
        temp2.val=v;
        return head;
    }
}