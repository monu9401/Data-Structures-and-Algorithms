// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java
import java.io.*;
import java.util.*;
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class insertion
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
	public static void main(String args[])throws IOException
    {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Scanner sc = new Scanner(System.in);
		 int t=Integer.parseInt(br.readLine());
		 while(t>0)
         {
            String S[] = br.readLine().split(" ");
			int N = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            int n = Integer.parseInt(S[2]);
		
		    String S1[] = br.readLine().split(" ");
			insertion llist = new insertion(); 
			int a1=Integer.parseInt(S1[0]);
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < N; i++) 
			{
				int a = Integer.parseInt(S1[i]);
				llist.addToTheLast(new Node(a));
			}
			
        Solution ob = new Solution();
		Node newhead=ob.reverseBetween(llist.head, m, n);
		llist.printList(newhead);
		
        t--;		
        }
    }}// } Driver Code Ends


//User function Template for Java

/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
class Solution
{
    public static Node reverseBetween(Node head, int m, int n)
    {
        int c=1;
        Node temp=head,tempPrev=head;
        while(c<m)
        {
            tempPrev=temp;
            temp=temp.next;
            c++;
        }
        Node temp1=temp;
        c=0;
        while(c<(n-m))
        {
            temp1=temp1.next;
            c++;
        }
        if(temp==temp1)
        return head;
        if(temp==head && temp1.next==null)
        {
            reverse(temp,temp1);
            return temp1;
        }
        else if(temp==head && temp1.next!=null)
        {
            Node x = temp1.next;
            temp1.next=null;
            reverse(temp,temp1);
            temp.next=x;
            return temp1;
        }
        else if(temp!=head && temp1.next==null)
        {
            reverse(temp,temp1);
            tempPrev.next=temp1;
            return head;
        }
        else
        {
            Node x = temp1.next;
            temp1.next=null;
            reverse(temp,temp1);
            tempPrev.next=temp1;
            temp.next=x;
            return head;
        }
    }
    static void reverse(Node head,Node tail)
    {
        Node temp=head,temp1=head,temp2=head.next;
        temp.next=null;
        while(temp2!=null)
        {
            temp1=temp2;
            temp2=temp2.next;
            temp1.next=temp;
            temp=temp1;
        }
    }
}