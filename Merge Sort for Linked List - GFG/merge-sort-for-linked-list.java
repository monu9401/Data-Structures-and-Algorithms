// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

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

class Driverclass
{
    
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().mergeSort(head);
		     printList(head);
		    System.out.println();
        }
    }
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}


// } Driver Code Ends


//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        if(head==null || head.next==null)
        return head;
        
        Node mid = findMid(head);
        Node half = mid.next;
        mid.next=null;
        Node lh = mergeSort(head);
        Node rh = mergeSort(half);
        Node sortedHead = merge(lh,rh);
        return sortedHead;
    }
    static Node findMid(Node head)
    {
        Node slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    static Node merge(Node head1,Node head2)
    {
        Node Head=new Node(0);
        Node temp1=head1,temp2=head2;
        if(temp1.data<temp2.data)
        {
            Head.data = temp1.data;
            temp1=temp1.next;
        }
        else
        {
            Head.data = temp2.data;
            temp2=temp2.next;
        }
        Node temp = Head;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.data<temp2.data)
            {
                Node last = new Node(temp1.data);
                temp.next=last;
                temp=temp.next;
                temp1=temp1.next;
            }
            else
            {
                Node last = new Node(temp2.data);
                temp.next=last;
                temp=temp.next;
                temp2=temp2.next;
            }
        }
        while(temp1!=null)
        {
            Node last = new Node(temp1.data);
            temp.next=last;
            temp=temp.next;
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            Node last = new Node(temp2.data);
            temp.next=last;
            temp=temp.next;
            temp2=temp2.next;
        }
        return Head;
    }
}


