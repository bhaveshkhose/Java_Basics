package DSA;

public class Tree_DS {
	
	static  int size;
	
	 static class Node{
		int  data;
		Node left;
		Node right;
		
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
		 
		 
	 }
	 
	 //Method  for print the tree in in-order
	 public static void printTreeIn(Node root) {
		 if(root == null) return;
		 
		 printTreeIn(root.left);
		 System.out.print(root.data +" ");
		 printTreeIn(root.right);
	 }
	 
	 //Method for print the tree in post-order
	 public static void printTreePost(Node root) {
		 if(root == null ) return ;
		 
		 size++;
		 printTreePost(root.left);
		 printTreePost(root.right);
		 System.out.print(root.data +" ");
		 
	 }
	 

	
	public static void main(String [] args) {
		
		Node root;
	
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		Node g = new Node(7);
		
		root  =a  ;
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = f;
		c.right = g;
		
		System.out.print("Tree traversing pre-order :- ");
		printTreePre(root);
		
		System.out.println();
		
		System.out.print("Tree traversing in-order :- ");
		printTreeIn(root);
		
		System.out.println();
		
		System.out.print("Tree traversing Post-order :- ");
		printTreePost(root);

		System.out.println();
		System.out.println("Size of the tree " + size);
	
	}
}
