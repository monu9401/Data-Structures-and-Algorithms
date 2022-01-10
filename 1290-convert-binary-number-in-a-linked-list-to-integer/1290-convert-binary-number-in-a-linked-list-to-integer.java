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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        temp=head;
        c--;
        int res=0;
        while(temp!=null)
        {
            if(temp.val==1)
                res = res+(int)Math.pow(2,c)*1;
            c--;
            temp=temp.next;
        }
        return res;
    }
}