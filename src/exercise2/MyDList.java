package exercise2;

public class MyDList<E>
{

	private MyNode<E> head;
	private MyNode<E> tail;
	private int size;

	// Constructor
	public MyDList()
	{
		head = null;
		tail = null;
		size = 0;
	}

    // Getter for head
    public MyNode<E> getHead() {
        return head;
    }
	
    // void addLast(E item)
    public void addLast(E item) {
        MyNode<E> newNode = new MyNode<>(item);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    // void addFirst(E item)
    public void addFirst(E item) {
        MyNode<E> newNode = new MyNode<>(item);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        size++;
    }

	// E removeFirst()
	public E removeFirst()
	{
		if (isEmpty()) {
			return null;
		}
		E item = head.getElement();
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			head = head.getNext();
			head.setPrev(null);
		}
		size--;
		return item;
	}

	// E removeLast()
	public E removeLast()
	{
		if (isEmpty()) {
			return null;
		}
		E item = tail.getElement();
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			tail = tail.getPrev();
			tail.setNext(null);
		}
		size--;
		return item;
	}

	// int size()
	public int size()
	{
		return size;
	}

	// boolean isEmpty()
	public boolean isEmpty()
	{
		return size == 0;
	}


}
