// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

class LinkedList
{
    static  Node head;  
    static  Node lastNode;
    
    public static void addToTheLast(Node node)
    {

        if (head == null)
        {
            head = node;
            lastNode = node;
        }
        else
        {
            Node temp = head;
            lastNode.next = node;
            lastNode = node;
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=  new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n, K;
            n = sc.nextInt();
            K = sc.nextInt();
            
            Node head = null;
            int val = sc.nextInt();
            head = new Node(val);
            addToTheLast(head);
            
            for(int i = 1; i< n; i++)
            {
                val = sc.nextInt();
                addToTheLast(new Node(val));
            }
            
            Node before[] = new Node[n];
            addressstore(before, head);
            GFG obj = new GFG();
            
            head = obj.swapkthnode(head, n, K);
        
           Node after[] = new Node[n];
          addressstore(after, head);
        
        if(check(before, after, n, K) == true)
            System.out.println("1");
        else
            System.out.println("0");
        
        }
    }
    
    static boolean check(Node before[], Node after[], int num, int K)
    {
          if(K > num)
           return true;
           
           return (before[K-1] == after[num - K]) && (before[num-K] == after[K-1]);
              
       
    }
    
    static void addressstore(Node arr[], Node head)
  {
      Node temp = head;
      int i = 0;
      while(temp != null){
        arr[i] = temp;
        i++;
        temp = temp.next;
    }
}
    
}// } Driver Code Ends


//User function Template for Java


/* Linked List Node class
   class Node  {
     int data;
     Node next;
     Node(int data)
     {
         this.data = data;
         next = null;
     }
  }
*/
class GFG
{
    //Function to swap Kth node from beginning and end in a linked list.
    Node swapkthnode(Node head, int num, int K)
    {
        if(K>num)
        return head;
        
        Node temp=head,tempPrev=head;
        int c=0;
        while(c<num-K)
        {
            tempPrev=temp;
            temp=temp.next;
            c++;
        }
        Node temp1=head,temp1Prev=head;
        c=1;
        while(c<K)
        {
            temp1Prev=temp1;
            temp1=temp1.next;
            c++;
        }
        if(K==1)
        {
            temp.next=temp1.next;
            tempPrev.next=temp1;
            temp1.next=null;
            head=temp;
        }
        else if(K==num)
        {
            temp1.next=temp.next;
            temp1Prev.next=temp;
            temp.next=null;
            head=temp1;
        }
        else
        {
            if(temp.next==temp1)
            {
                Node x = temp1.next;
                temp.next=x;
                temp1.next=temp;
                tempPrev.next=temp1;
            }
            else if(temp1.next==temp)
            {
                Node x = temp.next;
                temp1.next=x;
                temp.next=temp1;
                temp1Prev.next=temp;
            }
            else
            {
                Node x = temp.next;
                Node y = temp1.next;
                temp.next=y;
                temp1.next=x;
                tempPrev.next=temp1;
                temp1Prev.next=temp;
            }
        }
        return head;
    }
}
