// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int data;
    Node next;
    Node(int key) {
        data = key;
        next = null;
    }
}

class Partition {
    static Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail = tail.next;
            }

            int k = sc.nextInt();
            Solution ob = new Solution();
            Node res = ob.partition(head, k);
            printList(res);
            System.out.println();
        }
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}// } Driver Code Ends


// User function Template for Java

/*class Node
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

class Solution {
    public static Node partition(Node node, int x) {
        
        Node temp=node;
        Node lessHead=new Node(-1);
        Node moreHead=new Node(-10);
        Node temp1=lessHead,temp2=moreHead;
        int c=0;
        while(temp!=null)
        {
            if(x>temp.data)
            {
                temp1.next=temp;
                temp=temp.next;
                temp1=temp1.next;
                temp1.next=null;
            }
            else if(x<temp.data)
            {
                temp2.next=temp;
                temp=temp.next;
                temp2=temp2.next;
                temp2.next=null;
            }
            else
            {
                c++;
                temp=temp.next;
            }
        }
        while(c!=0)
        {
            Node last = new Node(x);
            temp1.next=last;
            temp1=temp1.next;
            c--;
        }
        moreHead=moreHead.next;
        temp1.next=moreHead;
        return lessHead.next;
        
    }
}