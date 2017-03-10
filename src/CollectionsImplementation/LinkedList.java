package CollectionsImplementation;

public class LinkedList {
	private Node head;

	private int size;

	public LinkedList() {
		head = new Node();
		head.setLink(null);

		size = 0;
	}

	public boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	public int getSize() {
		return this.size;
	}

	public void clearList() {
		head.setLink(null);
	}

	public void add(int data) {
		Node newNode = new Node(data);
		if (size == 0) {
			head.setLink(newNode);
			newNode.setLink(null);
			size++;
		} else {
			Node temp = head.getLink();
			Node currentNode = temp;
			while (temp != null) {
				currentNode = temp;
				temp = temp.getLink();
			}
			currentNode.setLink(newNode);
			newNode.setLink(null);
			size++;
		}
	}

	public void removeAtEnd() {

		if (size == 0) {
			System.out.println("List is empty");

		} else {

			Node current = head;
			Node link = head.getLink();
			while (link != null) {
				current = link;
				link = link.getLink();
				if (link.getLink().getLink() == null) {
					current = link;
					break;
				}

			}
			size--;
			current.setLink(null);
		}

	}

	public void printList() {
		if (size == 0)
			System.out.println("List is Empty");
		else {
			Node temp = head.getLink();
			System.out.println("Size of List is:\t" + size);
			while (temp != null) {
				System.out.println(temp.getData() + "->");
				temp = temp.getLink();
			}
		}
	}

	public void insertAtPos(int val, int pos) {
		Node nptr = new Node(val, null);
		Node ptr = head;
		pos = pos - 1;
		for (int i = 0; i < size; i++) {
			if (i == pos) {
				Node tmp = ptr.getLink();
				ptr.setLink(nptr);
				nptr.setLink(tmp);
				break;
			}
			ptr = ptr.getLink();
		}
		size++;
	}

	public void deleteAtPos(int pos) {
		Node current = head;
		if (pos == 1) {
			head = head.getLink();
			size--;
			return;
		}
		if (pos == size) {
			Node s = head;
			Node t = head;
			while (s != current) {
				t = s;
				s = s.getLink();
			}
			current = t;
			current.setLink(null);
			size--;
			return;
		}
		Node ptr = head;
		pos = pos - 1;
		for (int i = 0; i < size - 1; i++) {
			if (i == pos) {
				Node tmp = ptr.getLink();
				tmp = tmp.getLink();
				ptr.setLink(tmp);
				break;
			}
			ptr = ptr.getLink();
		}
		size--;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.printList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
      	list.add(5);
		list.printList();
		list.removeAtEnd();
		list.printList();
		list.insertAtPos(6, 3);
		list.printList();
		list.deleteAtPos(3);
		list.printList();
	}

}
