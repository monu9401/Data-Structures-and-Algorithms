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

class ReverseInSize
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail =tail.next;
            }
            
            int k = sc.nextInt();
            Solution ob = new Solution();
            Node res = ob.reverse(head, k);
            printList(res);
            System.out.println();
        }
    }
    
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
}

// } Driver Code Ends


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
}

*/

class Solution
{
    public static Node reverse(Node node, int k)
    {
        if(k==1)
        return node;
        Node head=new Node(-1);
        Node temp=head;
        Node temp1 = node,temp2=temp1;
        while(temp1!=null)
        {
            int count=1;
            temp2=temp1;
            while(temp1.next!=null && count<k)
            {
                temp1=temp1.next;
                count++;
            }
            Node x=temp1.next;
            temp1.next=null;
            reverse1(temp2,temp1);
            temp.next=temp1;
            temp=temp2;
            temp2.next=x;
            temp1=x;
        }
        head=head.next;
        return head;
    }
    public static void reverse1(Node h1,Node t1)
    {
        if(h1==t1)
        return;
        Node temp=h1,temp1=h1,temp2=h1.next;
        temp1.next=null;
        while(temp2!=null)
        {
            temp1=temp2;
            temp2=temp2.next;
            temp1.next=temp;
            temp=temp1;
        }
    }
}

