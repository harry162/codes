package LinkedList;

public class LinkList {

	private int counter;
	public Node head;
	private Node tail;
	
	public Node add(Object value){
		Node node = new Node(value,null);
		node.value=value;
		
		if (head == null) {
			head = node;	
			tail = node;
		}else{
			tail.next=node;
			tail = node;
		}
		
		counter++;
		return node;
	}
	
	/*public static Node add(Object value, Node next){
		Node node = new Node();
		node.value=value;
		node.next=next;

		if (head == null) {
			head = node;	
			tail = node;
		}else{
			tail.next=node;
			tail = node;
		}
		
		counter++;

		return node;
	}*/
	
	public int size(){
		return counter;
	}
}
