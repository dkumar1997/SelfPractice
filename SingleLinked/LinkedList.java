import java.io.*;

public class LinkedList{
	private Node head;
	
	
	public LinkedList(){
		head = null;

	}
	public LinkedList(LinkedList something){
		this.head = something.head;
	}
		
	
	
	public void append(int data){
		Node current = new Node(data);
		if(head == null){
			head = current;
		}
		else{
			Node n = head;
			while(n.next != null){
				n = n.next;
			}
			n.next = current;
		}
	}
	
	public void printall(){
		Node n = head;
		while(n.next != null){
			System.out.println(n.data);
			n= n.next;

		}
		System.out.println(n.data);
	}
	public void delete(int data){
		Node n = head;
		if(n.data == data){
			head = n.next;
		}
		else{
			while(n.next.data != data){
				n= n.next;
			}
			n.next = n.next.next;
		
			System.out.println(n.data);
		}
	}
	public void prepend(int data){
		Node newnode = new Node(data);
		Node n = head;
		head = newnode;
		head.next = n;
		
		
	}
	
}