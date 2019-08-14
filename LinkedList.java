package wrapper;

public class LinkedList {
	
	
	Node pointer;

	static class Node{
		int value;
		Node next;
		
		Node(int value){
			this.value = value;
			next = null;
		}
	}
	
	public static LinkedList insertion(LinkedList ll, int value){
		Node node = new Node(value);
		node.next = null;
		if(ll.pointer == null){
			ll.pointer = node;
		}
		else {
			Node last = ll.pointer;
			while(last.next != null){
				last = last.next;
			}
			last.next = node;
		}
		
		return ll;
		
		
	}

	public static void main(String[] args){
		int[] arr = {1, 2, 3 ,4 ,5};
		LinkedList ll = new LinkedList();
		for(int i=0; i<arr.length; i++){
			ll = insertion(ll, arr[i]);
		}
	}
}
