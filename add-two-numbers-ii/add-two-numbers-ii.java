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
        
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while(l1!=null)
        {
            stack1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null)
        {
            stack2.push(l2.val);
            l2=l2.next;
        }
        int carry=0;
        ListNode head = null;
        while(!stack1.isEmpty() && !stack2.isEmpty())
        {
            int a = stack1.pop();
            int b = stack2.pop();
            int sum = a+b+carry;
            if(sum>=10)
            {
                carry=1;
                sum=sum-10;
            }
            else
                carry=0;
            ListNode temp = new ListNode(sum);
            head = addFirst(temp,head);
        }
        while(!stack1.isEmpty())
        {
            int a = stack1.pop();
            int sum = a+carry;
            if(sum>=10)
            {
                carry=1;
                sum=sum-10;
            }
            else
                carry=0;
            ListNode temp = new ListNode(sum);
            head = addFirst(temp,head);
        }
        while(!stack2.isEmpty())
        {
            int a = stack2.pop();
            int sum = a+carry;
            if(sum>=10)
            {
                carry=1;
                sum=sum-10;
            }
            else
                carry=0;
            ListNode temp = new ListNode(sum);
            head = addFirst(temp,head);
        }
        if(carry!=0)
        {
            ListNode temp = new ListNode(carry);
            head = addFirst(temp,head);
        }
        return head;
    }
    public ListNode addFirst(ListNode node,ListNode head)
    {
        node.next = head;
        head=node;
        return head;
    }
}