/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int size1 = getSize(headA);
        int size2 = getSize(headB);
        ListNode temp1 = headA,temp2 = headB;
        int diff = Math.abs(size1-size2);
        if(size1>size2)
        {
            while(diff>0)
            {
                temp1=temp1.next;
                diff--;
            }
        }
        else if(size2>size1)
        {
            while(diff>0)
            {
                temp2=temp2.next;
                diff--;
            }
        }
        if(temp1==temp2)
            return temp1;
        while(temp1!=null && temp2!=null)
        {
            temp1=temp1.next;
            temp2=temp2.next;
            if(temp1==temp2)
                return temp1;
        }
        return null;
        
        
    }
    public int getSize(ListNode head)
    {
        ListNode temp = head;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        return c;
    }
}