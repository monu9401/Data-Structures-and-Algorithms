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
class DeleteAllOccuances
{
	Node head;
	public static void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
    public static int sizeofthelinkedlist(Node head)
    {
        int x=0;
        while(head!=null)
        {
            x+=1;
            head=head.next;
        }
        return x;
    }

	
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t  =sc.nextInt();
		 while(t>0)
         {
			int n = sc.nextInt();
			int a1 = sc.nextInt();
			Node head = new Node(a1);
			Node tail = head;
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				tail.next = new Node(a);
				tail = tail.next; 
			}
			int x = sc.nextInt();
			  GfG g = new GfG(); 
			Node result = g.deleteAllOccurances(head, x);
			System.out.println(sizeofthelinkedlist(result));
			printList(result);
		t--;
		}
	}
}// } Driver Code Ends


/* Linked list Node
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class GfG
{
    public static Node deleteAllOccurances(Node head, int x)
    {
        Node H = new Node(-500);
        H.next = head;
        Node temp=H,temp1=head;
        while(temp1!=null)
        {
            if(temp1.data==x)
            {
                temp.next=temp1.next;
                temp1=temp1.next;
            }
            else
            {
                temp1=temp1.next;
                temp=temp.next;
            }
        }
        return H.next;
    }
}