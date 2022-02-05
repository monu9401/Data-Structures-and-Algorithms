// { Driver Code Starts
import java.util.*;
import java.util.*;
import java.io.*;

class Node
{
    int data;
    Node next, prev;
    Node(int key)
    {
        data = key;
        next = prev = null;
    }
}

class Driverclass
{
    public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- > 0)
	    {
	        int n = sc.nextInt();
	        int a1 = sc.nextInt();
	        Node head = new Node(a1);
	        Node temp = head;
	        
	        for (int i = 1;i < n;i++)
	        {
	            int a = sc.nextInt();
	            Node n1 = new Node(a);
	            n1.prev = temp;
	            temp.next = n1;
	            temp = n1;
	        }
	        
	        head = new LinkedList().sortDoubly(head);
	        printList(head);
	    }
	}
	public static void printList(Node node)
	{
	    Node temp = node;
	    while(node != null)
	    {
	        System.out.print(node.data + " ");
	        temp = node;
	        node = node.next;
	    }
	    System.out.println();
	    while(temp != null)
	    {
	        System.out.print(temp.data + " ");
	        temp = temp.prev;
	    }
	    System.out.println();
	}
}
// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/
class LinkedList
{
    //Function to sort the given doubly linked list using Merge Sort.
    static Node sortDoubly(Node head)
    {
        Node tail=head;
        while(tail.next!=null)
        tail=tail.next;
        Node h = mergeSort(head,tail);
        return h;
    }
    static Node mergeSort(Node head,Node tail)
    {
        if(head==null || tail==null || head==tail)
        {
            return new Node(head.data);
        }
        Node mid = findMid(head,tail);
        Node x = mergeSort(head,mid);
        Node y = mergeSort(mid.next,tail);
        Node merged = mergeSorted(x,y);
        return merged;
    }
    static Node findMid(Node head,Node tail)
    {
        Node slow=head,fast=head;
        while(fast!=tail && fast.next!=tail)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    static Node mergeSorted(Node head1,Node head2)
    {
        Node H = new Node(1);
        Node temp1=head1,temp2=head2,temp=H;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.data<temp2.data)
            {
                temp.next=temp1;
                temp1.prev=temp;
                temp1=temp1.next;
                temp=temp.next;
                temp.next=null;
            }
            else
            {
                temp.next=temp2;
                temp2.prev=temp;
                temp2=temp2.next;
                temp=temp.next;
                temp.next=null;
            }
        }
        if(temp1!=null)
        {
            temp.next=temp1;
            temp1.prev=temp;
        }
        if(temp2!=null)
        {
            temp.next=temp2;
            temp2.prev=temp;
        }
        H = H.next;
        H.prev=null;
        return H;
    }
}