package DSA;

public class DoublyLL {
	
	Node head;
	public void add(int data) {
		Node newNode = new Node(data);
		Node current = head;
		if(head == null ) {
			current = newNode;
			current.prev = null;
			current.next=null;
		}
		else {
			current.prev= current;
			current = newNode;
			current.next = null;
		}
		current= current.next;
		
	}
	
	
	
	public static void main(String [] args) {
		Node a = new Node(29);
		Node b = new Node(10);
		Node c = new Node(4);
		Node d = new Node(9);
		Node e = new Node(2);
		Node f= new Node(49);

		a.prev=null;
		a.next= b;
		b.prev= a;
		b.next =c;
		c.prev = b;
		c.next = d;
		d.prev = c;
		d.next = e;
		e.prev = d;
		e.next = f;
		f.prev = e;
		f.next =null;
		
		Node current = a;
		while(current != null) {
			System.out.print(current.data +" ");
			current = current.next;
		}
		System.out.println();
		
		Node temp = f;
		
		while(temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.prev;
		}
		System.out.println();
		
		Node t = d;
		while(t.prev != null) {
			t = t.prev;
		}
		System.out.println(t.data);
		
		while(t != null) {
			System.out.print(t.data +" ");
			t = t.next;
		}
		
		DoublyLL listy = new DoublyLL();
		listy.add(4);
		listy.add(5);
		System.out.println(listy.head.data);
		//System.out.println(listy.head.next.data);
		
		System.out.println("Bhavesh is dumb");
		
	}
}
