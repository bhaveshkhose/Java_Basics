package DSA;

import java.lang.Math;
import java.util.*;

public class Tree_DS {
	
	static Node root;
	static  int size;
	static class Node{
		int  data;
		Node left;
		Node right;
		static Node root;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	//Method for print the tree in pre-order
	public static void printTreePre(Node root) {
			 if(root == null)return;
			 System.out.print(root.data + " ");
			 printTreePre(root.left);
			 printTreePre(root.right);
			return;

	 }
	 
	//Method  for print th1e tree in in-order
	public static void printTreeIn(Node root) {
		 if(root == null) return;
		 
		 printTreeIn(root.left);
		 System.out.print(root.data +" ");
		 printTreeIn(root.right);
	 }
	 
	 //Method for print the tree in post-order
	public static void printTreePost(Node root) {
		 if(root == null ) return ;
		 printTreePost(root.left);
		 printTreePost(root.right);
		 System.out.print(root.data +" "); 
	 }

	//Method for finding the size of tree nodes
	public static int size(Node root){
		if(root == null){
			return 0;
		}
		size++;
		size(root.right);
		size(root.left);

		return size;
	}

	//Method for find the Maximum value of Node
	public static int maxNode(Node root){
		
		if(root == null){
			return Integer.MIN_VALUE;
		}
		int a = root.data;
		int b  = maxNode(root.left);
		int c = maxNode(root.right);
		 
		return Math.max(a , Math.max(c , b));
		
	}

	//Method for find the minimum number from the tree
	public static int minNode(Node root){
		if(root == null){
			return Integer.MAX_VALUE;
		}

		int a = root.data;
		int b = minNode(root.left);
		int c = minNode(root.right);

		return Math.min(a , Math.min(c, b));

	}
	
	//Method for Finding the sum of the tree
	public static int sumOfTree(Node root){
		if(root == null){
			return 0;
		}

		int sum = root. data + sumOfTree(root.left) + sumOfTree(root.right);
		return sum ;
	}

	//Method for finding the product of the node of the tree
	public static int productOfTree(Node root){
		if(root == null) return 1;

		return root.data * productOfTree(root.left) * productOfTree(root.right);
	}

	//Method for finding the height of the tree
	public static int treeHeight(Node root){
		if(root == null)return 0;
		if(root.right==null && root.left ==null)
		{
			return 1;
		}
		return 1+ Math.max(treeHeight(root.right ) , treeHeight(root.left));


	}

	//Method for finding the depth of the tree
	public static int treeDepth(Node root){
		if(root == null)return 0;

		int a = treeDepth(root.left);
		int b = treeDepth(root.right);

		return 1+ Math.max(a , b);

	}

	//Method for printing the level order of the tree
	public static void levelOrderTraversal(Node root , int level){

		if(root == null)return ;
		if(level == 1) {
			System.out.print(root.data+" ");
			return;
		}
		levelOrderTraversal(root.left, level -1);
		levelOrderTraversal(root.right, level -1);
		return;

	}
	
	//Method for traversing the tree using breadth first search(bfs)
	public static void levelOrder(Node root) {

        if(root == null){
            return ;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int levelnum = queue.size();
            

            for(int i =0 ; i < levelnum ; i++){
                Node currentNode = queue.poll();
                System.out.print(currentNode.data+ " ");

                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }

                
                if(currentNode.right != null){
                    queue.add(currentNode.right);
                }
            }
            System.out.println();
 
        } 

        return ;
        
        
    }

	
	//Method for printing the leaf nodes of the binary tree
	public static void printLeaf(Node root , List<Integer> leaf){
			if(root == null)return ;
	
			
	
			if(root.left == null && root.right == null){
				leaf.add(root.data);
			}
	
			printLeaf(root.left , leaf);
			printLeaf(root.right , leaf);

		return ;
	}

	//Method for finding the Node value in the tree
	private static boolean searchNode(Node root , int val){
        if(root == null ) return false;

		if(root . data == val )return true;

		return  searchNode(root.left, val)||
		searchNode(root.right, val);
    }

	//Method for adding the Node to the tree
	public static void addNode(int data , int rootSide){
		
		Node newNode = new Node(data);
		if(root == null){
			root = newNode;
		}
		else if(rootSide == 0){
			System.out.println("null");
		}
		else if(rootSide == 1){
			root.right = newNode;
		}
		else {
			root.left = newNode;
		}
	}
	static class tree{
		Node root;
		static int idx = -1 ;
		public static Node formation(int [] nums) {
			idx++;
			if(nums[idx] == -1)return null;
			
			Node newNode = new Node(nums[idx]);
			if(Node.root == null){
				
				Node.root = newNode;
				
			}
			return null;
		}
	}
	public static void main(String [] bhavesh) {

		Scanner sc = new Scanner(System.in);
		
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		Node g = new Node(7);
		Node h = new Node(8);
		Node i = new Node(9);
		Node j = new Node(10);
		
		root  =a  ;
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		e.left = f;
		e.right = g;
		f.right = i;
		f.left = h;
		c.right = j;

	

		
		System.out.print("Tree traversing pre-order :- ");
		printTreePre(root);
		
		System.out.println();
		
		System.out.print("Tree traversing in-order :- ");
		printTreeIn(root);
		
		System.out.println();
		
		System.out.print("Tree traversing Post-order :- ");
		printTreePost(root);

		System.out.println();
		

		System.out.println(size(root));

		System.out.println("The maximum value of the tree is :- "+maxNode(root));

		System.out.println("the sum of the tree is :=" +sumOfTree(root));

		System.out.println("The height of the tree is :- "+treeHeight(root));

		System.out.println("The depth of the tree is :-" +treeDepth(root));

		System.out.println("The product of the tree is :- "+productOfTree(root));

		System.out.println("The minimum node value of the tree is :-" + minNode(root));

		

		for(int k = 1 ; k <=treeDepth(root) ; k ++ ){
			levelOrderTraversal(root,k );

			System.out.println();

		}
		
		
		
		levelOrder(root);

		


	}
}
