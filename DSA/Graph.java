package DSA;

public class Graph {
	
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
	 
	public static void printGraph( Node root) {
		if(root == null) {
			System.out.println("Graph doesn't exist");
		}
		
		System.out.println();
		
	}
	 
	
	
//	 public void createTree(int node) {
//		 int idx ;
//		 if()
//	 }
	
	public static void main(String [] args) {
		
		Node root;
	
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		
		root  =a  ;
		root.left = b;
		root.right = c;
		b.left = d;
		b.right = e;
		c.left = f;

		System.out.println(b.right.data);
	
	}
	

}
