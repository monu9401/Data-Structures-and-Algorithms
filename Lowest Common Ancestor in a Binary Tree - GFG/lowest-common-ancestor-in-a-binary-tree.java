// { Driver Code Starts
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t-- > 0){
	            String input[] = br.readLine().trim().split(" ");
                int a = Integer.parseInt(input[0]);
                int b = Integer.parseInt(input[1]);
	            String s = br.readLine();
    	    	Node root = buildTree(s);
                Solution g = new Solution();
                Node k = g.lca(root,a,b);
    			System.out.println(k.data);
    	        
	        }
	}
}
// } Driver Code Ends


/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Solution
{
    //Function to return the lowest common ancestor in a Binary Tree.
	Node lca(Node root, int n1,int n2)
	{
		ArrayList<Node> path1 = nodeToRootPath(root,n1);
		ArrayList<Node> path2 = nodeToRootPath(root,n2);
		if(path1.isEmpty() || path2.isEmpty())
		{
		    return new Node(1);
		}
		int i=path1.size()-1,j=path2.size()-1;
		while(i>=0 && j>=0 && path1.get(i)==path2.get(j))
		{
		    i--;
		    j--;
		}
		i++;
		return path1.get(i);
	}
	ArrayList<Node> nodeToRootPath(Node root,int target)
	{
	    if(root==null)
	    return new ArrayList<>();
	    
	    if(root.data==target)
	    {
	        ArrayList<Node> al = new ArrayList<>();
	        al.add(root);
	        return al;
	    }
	    ArrayList<Node> al = nodeToRootPath(root.left,target);
	    if(al.size()!=0)
	    {
	        al.add(root);
	        return al;
	    }
	    ArrayList<Node> all = nodeToRootPath(root.right,target);
	    if(all.size()!=0)
	    {
	        all.add(root);
	        return all;
	    }
	    return new ArrayList<>();
	}
}

