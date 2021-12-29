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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode temp1=l1,temp2=l2,head=null,temp;
        int v = temp1.val+temp2.val+carry;
        if(v>=10)
        {
            int rem = v%10;
            ListNode current = new ListNode(rem);
            head = current;
            carry = v/10;
        }
        else
        {
            ListNode current = new ListNode(v);
            head = current;
            carry = 0;
        }
        temp1=temp1.next;
        temp2=temp2.next;
        temp = head;
        while(temp1!=null && temp2!=null)
        {
            v = temp1.val+temp2.val+carry;
            if(v>=10)
            {
                int rem = v%10;
                ListNode current = new ListNode(rem);
                temp.next = current;
                carry = v/10;
            }
            else
            {
                ListNode current = new ListNode(v);
                temp.next = current;
                carry = 0;
            }
            temp=temp.next;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        while(temp1!=null)
        {
            v = temp1.val+carry;
            if(v>=10)
            {
                int rem = v%10;
                ListNode current = new ListNode(rem);
                temp.next = current;
                carry = v/10;
            }
            else
            {
                ListNode current = new ListNode(v);
                temp.next = current;
                carry = 0;
            }
            temp=temp.next;
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            v = temp2.val+carry;
            if(v>=10)
            {
                int rem = v%10;
                ListNode current = new ListNode(rem);
                temp.next = current;
                carry = v/10;
            }
            else
            {
                ListNode current = new ListNode(v);
                temp.next = current;
                carry = 0;
            }
            temp=temp.next;
            temp2=temp2.next;
        }
        if(carry!=0)
        {
            ListNode current = new ListNode(carry);
            temp.next = current;
            temp=temp.next;
        }
        return head;
    }
}