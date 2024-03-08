package exercise1;

import java.util.ArrayList;
import java.util.Iterator;

public class MyAList<E> implements Iterable<E>
{
	private ArrayList<E> list;

	// Constructor
	public MyAList()
	{
		list = new ArrayList<E>();
	}

	// void add(E item)
	public void add(E item)
	{
		list.add(item);
	}

    // void addAll(MyAList<E> items)
    public void addAll(MyAList<E> items) {
        list.addAll(items.list);
    }

	// E get(int index)
	public E get(int index)
	{
		return list.get(index);
	}

	// void remove(int index)
	public void remove(int index)
	{
		list.remove(index);
	}

	// void set(int index, E item)
	public void set(int index, E item)
	{
		list.set(index, item);
	}

	// int size()
	public int size()
	{
		return list.size();
	}

	// boolean isEmpty()
	public boolean isEmpty()
	{
		return list.isEmpty();
	}

	// object[] toArray()
	public Object[] toArray()
	{
		return list.toArray();
	}

	// void clear()
	public void clear()
	{
		list.clear();
	}



	@Override
	public Iterator<E> iterator()
	{
		return list.iterator();
	}

}
