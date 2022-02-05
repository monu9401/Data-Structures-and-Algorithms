// { Driver Code Starts
//Initial Template for Java

import java.util.*;
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class duplicates
{
    Node head;  
    Node tail;
	public void addToTheLast(Node node) 
	{
	  if (head == null) 
	  {
	   head = node;
	   tail = node;
	  } 
	  else 
	  {
	   tail.next = node;
	   tail = node;
	  }
	}
      void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	/* Drier program to test above functions */
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
         {
			int N = sc.nextInt();
			duplicates llist = new duplicates(); 
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < N; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
			
        Solution ob = new Solution();
		head = ob.removeAllDuplicates(llist.head);
		llist.printList(head);
		
        t--;		
        }
    }
    
}// } Driver Code Ends


//User function Template for Java

/* Linked List Node class

class Node
{
    int data;
    Node next;
}
    
*/

class Solution
{
    public static Node removeAllDuplicates(Node head)
    {
        if(head.next==null)
        return head;
        Node temp1 = head,temp2 = head.next;
        Node Head = new Node(-1);
        Node temp=Head;
        while(temp2!=null)
        {
            if(temp1.data==temp2.data)
            {
                while(temp2!=null && temp1.data==temp2.data)
                {
                    temp2=temp2.next;
                }
                if(temp2==null)
                {
                    temp.next=null;
                }
                else
                {
                    temp.next = temp2;
                    temp1=temp2;
                    temp2=temp2.next;
                }
            }
            else
            {
                temp.next=temp1;
                temp=temp.next;
                temp1=temp1.next;
                temp2=temp1.next;
            }
        }
        Head=Head.next;
        return Head;
    }
}