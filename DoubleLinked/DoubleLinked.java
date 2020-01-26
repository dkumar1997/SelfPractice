public class DoubleLinked{
	private Node head;
	private Node rear;

	public DoubleLinked(DoubleLinked something){
		this.head = something.head;
		this.rear = something.rear;
	}
	public DoubleLinked(){
		head = null;
		rear = null;
	}

	public void append(int data){
		Node adding = new Node(data);
		if(head == null){
			head = adding;
			rear = adding;
		}
		else{
			Node n = rear;
			rear = adding;
			rear.prev = n;
			n.next = rear;  
		}
	}
	public void prepend(int data){
		Node adding = new Node(data);
		if(head == null){
			head = adding;
			rear = adding;
		}
		else{
			Node n = head;
			head = adding;
			n.prev = head;
			head.next = n;
		}

	}
	public void delete(int data){
		Node n = head;
		Node m = rear;
		while((n.next.data != data)){
			n = n.next;
			
		}
		System.out.println("----1");
		if(n.next.data == data){
			System.out.println("----2");
			n.next.next.prev = n;
			n.next = n.next.next;
		}
		else{
			n.next.next.prev = n;
			n.next = n.next.next;
		}
	}
	public void printall(){
		Node n = head;
		while(n!= null){
			System.out.println(n.data);
			n = n.next;
		}	

	}
	public void printrear(){
		Node n = rear;
		while(n != null){
			System.out.println(n.data);
			n = n.prev;
		}

	}
}