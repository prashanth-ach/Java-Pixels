package CollectionsImplementation;

public class Stack {
	LinkedList l=new LinkedList();
	void push(int data)
	{
		l.add(data);
	}
	void pop()
	{
		l.removeAtEnd();
	}
	void display()
	{
		l.printList();
	}
	void removeatpos(int data)
	{
			l.deleteAtPos(data);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.pop();
		s.pop();
		s.push(5);
		s.push(6);
		s.pop();
		s.display();

	}

}
