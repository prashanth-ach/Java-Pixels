package CollectionsImplementation;

public class Queue {
	LinkedList l=new LinkedList();
	void enqueue(int data)
	{
		l.add(data);
	}
	void dequeue()
	{
		l.deleteAtPos(1);
	}
	void removeatend()
	{
		
	}
	void display()
	{
		l.printList();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Queue q=new Queue();
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    q.display();
    q.dequeue();
    q.display();
    q.dequeue();
    q.display();
	}

}
