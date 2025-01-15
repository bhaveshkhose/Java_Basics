package DSA;

class ListNode{
	int val;
	ListNode next;
	
	ListNode(int val){
		this.val = val;
	}
}
class Stacky{
	
	ListNode head = null;
	int size =0 ;
	
	void push(int val) {
		ListNode newNode = new ListNode(val);
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
		size++;
		

	}
	
	int size() {
		
		return size;
	}
	
	int  peek() {
		if(head == null) {
			return -1;
		}
		else {
			return head.val;
			
		}
	}
	
	int pop() {
		if(head == null) {
			System.out.println("Can't pop the element ");
			return 0;
		}
		else {
			int i = head.val;
			head = head.next;
			size--;
			return i;
			
		}
		
	}
	
	public void reverse(ListNode h) {
		if(h == null)return;
		reverse(h.next);
		System.out.print(h.val+" ");
	}
	public void printStack(ListNode head) {
		ListNode temp = head;
		reverse(temp);
		System.out.println();
		
	}
	
	boolean isEmpty() {
		if(head == null)return true;
		else {
			return false;
		}
	}
	
	}

public class StackUsingLinkedList {
	
public static void main(String [] a) {
	Stacky st = new Stacky();
	st.push(10);
	st.push(9);
	st.push(8);
	
	st.push(7);
	st.printStack(st.head);	
}

}
