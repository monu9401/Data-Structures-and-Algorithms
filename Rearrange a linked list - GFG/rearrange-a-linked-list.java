// { Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            new Solution().rearrangeEvenOdd(head);
            printList(head); 
            t--;
        }
    } 
} 
// } Driver Code Ends


/*

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
This is method only submission.
You only need to complete the below method.
*/
class Solution
{

   // Should rearrange given linked list such that all even
   // positioned Nodes are before odd positioned.
   // Returns nothing
    void rearrangeEvenOdd(Node head)
    {
          Node oddHead=new Node(-1);
          Node evenHead=new Node(-2);
          Node temp1=oddHead,temp2=evenHead;
          Node temp=head;
          int i=0;
          while(temp!=null)
          {
              i++;
              if(i%2==0)
              {
                  temp2.next=temp;
                  temp=temp.next;
                  temp2=temp2.next;
                  temp2.next=null;
              }
              else
              {
                  temp1.next=temp;
                  temp=temp.next;
                  temp1=temp1.next;
                  temp1.next=null;
              }
          }
          oddHead=oddHead.next;
          evenHead=evenHead.next;
          temp1.next=evenHead;
          head=oddHead;
     }
}
