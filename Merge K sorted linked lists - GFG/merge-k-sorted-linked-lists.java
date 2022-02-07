// { Driver Code Starts
import java.util.*;

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


class GfG
{
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {   
            int N = sc.nextInt();
            
            Node []a = new Node[N];
            
            for(int i = 0; i < N; i++)
            {
                int n = sc.nextInt();
                
                Node head = new Node(sc.nextInt());
                Node tail = head;
                
                for(int j=0; j<n-1; j++)
                {
                    tail.next = new Node(sc.nextInt());
                    tail = tail.next;
                }
                
                a[i] = head;
            }
            
            Solution g = new Solution();
             
            Node res = g.mergeKList(a,N);
            if(res!=null)
                printList(res);
            System.out.println();
        }
    }
}// } Driver Code Ends


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

// a is an array of Nodes of the heads of linked lists
// and N is size of array a


class Solution
{
    //Function to merge K sorted linked list.
    Node mergeKList(Node[]arr,int K)
    {
        Node head = new Node(-1);
        Node temp=head;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i=0;i<K;i++)
        {
            pq.offer(new Pair(i,arr[i]));
        }
        while(!pq.isEmpty())
        {
            Pair p = pq.poll();
            temp.next=p.node;
            temp=temp.next;
            p.node=p.node.next;
            if(p.node!=null)
            {
                pq.offer(new Pair(p.li,p.node));
            }
            temp.next=null;
        }
        return head.next;
    }
}
class Pair implements Comparable<Pair>
{
    int li;
    Node node;
    Pair(int li,Node node)
    {
        this.li=li;
        this.node=node;
    }
    public int compareTo(Pair p)
    {
        return this.node.data-p.node.data;
    }
}
