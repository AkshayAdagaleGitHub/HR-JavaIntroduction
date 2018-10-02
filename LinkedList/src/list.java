public class list {

	Node head;
	
	static class Node{
		int data;
		Node next;
		Node prev = null;
		
		Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	
	public void printList(Node head) {
		Node n = head;
		while(n!=null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	public void printReverse() {
		Node current = head;
		Node next,previous,head1;
		previous = null;
		while(current!=null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;			
		}
		head1 = previous;
		printList(head1);
	}
	
	public void swap(int first,int second) {
		Node n = head;
		while(n.data !=first) {
			n = n.next;
		}
		Node s = head;
		while(s.data != second) {
			s=s.next;
		}
		int temp = s.data;
		s.data = n.data;
		n.data = temp;
		printList(head);
	}
	
	public void createList(int data) {
	
		if(head==null) {
			System.out.println("Inside head==null");
			head = new Node(data);	
			//head.prev = head;
		}else if(head.next == null) {
			System.out.println("Inside head.next==null");
			Node temp = new Node(data);
			temp.prev = head.next;
			head.next = temp;
			//head.prev = temp.next;
		}else if(head!=null) {
			Node t = head;
			while(t.next!=null) {
				t = t.next;	
			}
			Node pv = new Node(data);
			t.next = pv;
		}		
	}
}
