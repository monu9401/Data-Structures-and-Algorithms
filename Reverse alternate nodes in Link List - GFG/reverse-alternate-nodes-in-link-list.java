// { Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Rearr
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node temp = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                temp.next = new Node(a);
                temp = temp.next;
            }
            
            Solution ob = new Solution();
            ob.rearrange(head);
            printLast(head);
            System.out.println();
        }
    }
    
    public static void printLast(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
class Solution
{
    public static void rearrange(Node odd)
    {
        if(odd.next==null)
        return;
        
        Node temp=odd,temp1=odd.next;
        Node even=temp1;
        while(temp1!=null)
        {
            temp.next=temp1.next;
            if(temp1.next!=null)
            {
                temp1.next = temp.next.next;
            }
            temp=temp.next;
            temp1=temp1.next;
        }
        even=reverse(even);
        temp=odd;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=even;
    }
    static Node reverse(Node head)
    {
        if(head==null || head.next==null)
        return head;
        Node temp=head,temp1=head,temp2=head.next;
        temp.next=null;
        while(temp2!=null)
        {
            temp1=temp2;
            temp2=temp2.next;
            temp1.next=temp;
            temp=temp1;
        }
        return temp;
    }
}
