package milestone1.collections.lists;
public class LinkedList {
	Node head=null;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	public static LinkedList insert(LinkedList list, int data) {
		Node temp=new Node(data);
		if(list.head==null) {
			list.head=temp;
		}
		else {
			Node temp1=list.head;
			while(temp1.next!=null)
				temp1=temp1.next;
			temp1.next=temp;
		}
		return list;
	}
	public static void printList(LinkedList list) {
	    Node temp = list.head;
	    while (temp != null) {
	        System.out.print(temp.data + " -> ");
	        temp = temp.next;
	    }
	    System.out.println("NULL");
	}
	public static LinkedList reverse(LinkedList list) {
		Node temp=list.head;
		Node temp1=temp;
		list.head=list.head.next;
		temp.next=null;
		while(list.head!=null) {
			temp1=temp;
			temp=list.head;
			list.head=list.head.next;
			temp.next=temp1;
		}
		list.head=temp;
		return list;
	}
	public static void main(String args[]) {
		LinkedList ll=new LinkedList();
		ll=insert(ll, 1);
		ll=insert(ll, 2);
		ll=insert(ll, 3);
		ll=insert(ll, 4);
		ll=insert(ll, 5);
		printList(ll);
		ll=reverse(ll);
		printList(ll);
	}
}
