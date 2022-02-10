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
    public ListNode[] splitListToParts(ListNode head, int k) {
        
        ListNode temp=head;
        int n=0;
        while(temp!=null)
        {
            temp=temp.next;
            n++;
        }
        ListNode[] arr = new ListNode[k];
        if(n<=k)
        {
            int c=0;
            temp=head;
            while(temp!=null)
            {
                arr[c]=temp;
                temp=temp.next;
                arr[c].next=null;
                c++;
            }
            while(c<n)
            {
                arr[c]=null;
                c++;
            }
        }
        else
        {
            int r = n%k;
            int q = n/k;
            temp=head;
            ListNode temp1=head;
            for(int i=1;i<=r;i++)
            {
                int c=1;
                while(c<q+1)
                {
                    temp1=temp1.next;
                    c++;
                }
                ListNode temp2=temp1.next;
                temp1.next=null;
                arr[i-1]=temp;
                temp1=temp2;
                temp=temp1;
            }
            for(int i=1;i<=k-r;i++)
            {
                int c=1;
                while(c<q)
                {
                    temp1=temp1.next;
                    c++;
                }
                ListNode temp2=temp1.next;
                temp1.next=null;
                arr[r-1+i]=temp;
                temp1=temp2;
                temp=temp1;
            }
        }
        return arr;
    }
}