// { Driver Code Starts
//Initial Template for Java


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
    
	public static void main (String[] args) throws Exception{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
            //Scanner sc = new Scanner(System.in);
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
        	    BST g = new BST();
        	    String X = br.readLine();
        	    String arr[] = X.split(" ");
        	    int x , y;
			    x = Integer.parseInt(arr[0]);
			    y = Integer.parseInt(arr[1]);
			    System.out.println(g.LCA(root,x,y).data);
                t--;
            
        }
    }
  
}

// } Driver Code Ends


//User function Template for Java



class BST
{   
    //Function to find the lowest common ancestor in a BST. 
	Node LCA(Node root, int n1, int n2)
	{
        ArrayList<Node> path1 = nodeToRootPath(root,n1);
        ArrayList<Node> path2 = nodeToRootPath(root,n2);
        int i=path1.size()-1,j=path2.size()-1;
        while(i>=0 && j>=0 && path1.get(i).data==path2.get(j).data)
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
        if(al.size()>0)
        {
            al.add(root);
            return al;
        }
        ArrayList<Node> al1 = nodeToRootPath(root.right,target);
        if(al1.size()>0)
        {
            al1.add(root);
            return al1;
        }
        return new ArrayList<>();
    }
    
}
