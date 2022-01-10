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
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        ListNode temp=head;
        int c=0;
        while(temp!=null)
        {
            temp=temp.next;
            c++;
        }
        int arr[]=new int[c];
        //System.out.println(c);
        stack1.push(head.val);
        stack2.push(0);
        temp=head.next;
        int p=1;
        while(temp!=null)
        {
            while(!stack1.isEmpty() && temp.val>stack1.peek())
            {
                stack1.pop();
                arr[stack2.pop()]=temp.val;
            }
            stack1.push(temp.val);
            stack2.push(p);
            p++;
            temp=temp.next;
        }
        return arr;
    }
}