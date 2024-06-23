package code;

public class LinkedList_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addLast(4);
		ll.addLast(5);
		ll.Display();
		ll.addIndex(3, 8);// index , element
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.getIndex(2));
		System.out.println(ll.removeIndex(4));
		ll.Display();
	}

}
