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

class SortLL
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
            addToTheLast(head);
            
            for(int i = 1; i< n; i++)
            {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }
            
            GfG gfg = new GfG();
            Node node = gfg.quickSort(head);
            
            printList(node);
            System.out.println();
        }
    }
    public static void printList(Node head)
    {
        while(head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    
    public static void addToTheLast(Node node) 
{
  if (head == null) 
  {
    head = node;
  } else 
  {
   Node temp = head;
   while (temp.next != null)
          temp = temp.next;
         temp.next = node;
  }
}
}// } Driver Code Ends


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
    
}*/
// you have to complete this function
class GfG
{
    public static Node quickSort(Node node)
    {
        Node tail = node;
        while(tail.next!=null)
        tail=tail.next;
        quicksort(node,tail);
        return node;
    }
    public static void quicksort(Node head,Node tail)
    {
        if(head==tail || tail.next==head)
        return;
        Node pivot = partition(head,tail);
        quicksort(head,pivot);
        quicksort(pivot.next,tail);
    }
    public static Node partition(Node head,Node tail)
    {
        Node temp1=head,temp2=head,temp3=temp2,temp4=temp2;
        Node pivot = tail;
        while(temp1!=tail.next)
        {
            if(temp1.data>pivot.data)
            {
                temp1=temp1.next;
            }
            else
            {
                int x = temp1.data;
                temp1.data=temp2.data;
                temp2.data=x;
                temp1=temp1.next;
                temp4=temp3;
                temp3=temp2;
                temp2=temp2.next;
            }
        }
        return temp4;
    }
}