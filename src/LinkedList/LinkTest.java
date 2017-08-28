package LinkedList;

public class LinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkList ll = new LinkList();
		
		Node nd = ll.add("Harshal");
		Node nd2 = ll.add("Shah");
		nd.next = nd2;
		nd2.next=ll.add(162);
		System.out.println(nd.value+" "+nd.next.value);
		System.out.println(ll.head.value);
		
	}

}
