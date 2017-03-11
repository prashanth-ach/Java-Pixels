package CollectionsImplementation;

public class QueueUsingStack {
	Stack s=new Stack();
	void enqueue(int data)
	{
		s.push(data);
	}
	void dequeue()
	{
		s.removeatpos(1);
	}
	void show()
	{
		s.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingStack a=new QueueUsingStack();
		a.enqueue(1);
		a.enqueue(2);
		a.enqueue(3);
		a.show();
		a.dequeue();
		a.show();
	}
	

}
