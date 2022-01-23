// { Driver Code Starts
import java.util.*;

class Node
{

    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


public class LinkedList
{
    
 

    /* Function to print linked list */
   public static void print(Node root)
    {
        Node temp = root;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }


    /* Driver program to test above functions */
    public static void main(String args[])
    {

        /* Constructed Linked List is 1.2.3.4.5.6.
         7.8.8.9.null */
        int value;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0 && sc.hasNextInt() )
        {
            int n = sc.nextInt();
            
            //int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;

            for (int i = 1; i < n && sc.hasNextInt() ; i++)
            {
                int a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }


            Node result = new Solution().compute(head);
            print(result);
            System.out.println();
            t--;
        }
    }
}// } Driver Code Ends


/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    Node compute(Node head)
    {
        if(head==null || head.next==null)
        return head;
        
        int val = 1;
        while(val==1)
        {
            head = removeGreater(head);
            int flag=0;
            Node temp=head,temp1=head.next;
            while(temp1!=null)
            {
                if(temp.data<temp1.data)
                {
                    flag=1;
                    break;
                }
                temp=temp.next;
                temp1=temp1.next;
            }
            val = flag==0 ? 0 : 1 ;
        }
        return head;
    }
    Node removeGreater(Node head)
    {
        Node temp = head,temp1=head.next;
        while(temp1!=null && temp.data<temp1.data)
        {
            head=head.next;
            temp=temp.next;
            temp1=temp1.next;
        }
        if(temp1==null)
        return head;
        
        temp=head;
        Node temp2 = head.next;
        while(temp2.next!=null)
        {
            temp1=temp2.next;
            if(temp2.data<temp1.data)
            {
                temp.next=temp1;
                temp2=temp1;
            }
            else
            {
                temp=temp2;
                temp2=temp2.next;
            }
        }
        return head;
    }
}
  