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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null || left==right)
            return head;
        ListNode tempLeft=head,tempX=head;
        int count=1;
        while(count<left)
        {
            tempX=tempLeft;
            tempLeft = tempLeft.next;
            count++;
        }
        ListNode temp = tempLeft,temp1=tempLeft,temp2=tempLeft.next;
        temp.next=null;
        while(temp2!=null && count<right)
        {
            temp1=temp2;
            temp2=temp2.next;
            temp1.next=temp;
            temp=temp1;
            count++;
        }
        tempLeft.next=temp2;
        if(left==1)
            head=temp;
        else
            tempX.next=temp;
        return head;
    }
}