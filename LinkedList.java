public class LinkedList<E> //implements Stack, Queue
{
	private ListNode<E> head;
	private ListNode<E> tail;
	private int size;
	
	public LinkedList()
	{
		head = null;
		tail = null;
		size = 0;
	}
	
	public LinkedList(ListNode<E> h)
	{
		this();
		add(h.getItem());
	}


	public LinkedList(LinkedList<E> l)
	{
		// Am I allowed to say l.head? I know it works, but why?
		ListNode<E> node = l.head;
		while (node != null)
		{
			add(node.getItem());
			node = node.getNext();
		}
	}

	
	public int size()
	{
		return size;
	}
	
	
	public boolean add( int index, E thing)
	{
		if (tail == null)
		{
			ListNode<E> newNode = new ListNode(thing);
			head = newNode;
			tail = newNode;
			return true;
		}
		ListNode<E> holder = head;
		int num = 0;
		while (num < index - 1)
		{
			holder = holder.getNext();
			num+=1;
		}
		if (index > 0)
		{			
			ListNode<E> l = new ListNode(thing, holder.getNext()); 
			holder.setNext(l);		
		}
		else
		{
			ListNode<E> l = new ListNode(thing, head); 
			head = l;
		}
		size+=1;
		return true;
	}
	
	public boolean add(E thing)
	{
		//System.out.println("1");
		ListNode<E> l = new ListNode(thing); 
		if (tail == null)
		{
			head = l;
			tail = l;
			size+=1;
			return true;
		}
		tail.setNext(l);
		tail = l;
		size+=1;
		return true;
	}
	
	public boolean remove(int index)
	{
		ListNode<E> node = head;
		int num = 0;
		while (num < index - 1)
		{
			node = node.getNext();
			num+=1;
		}
		if (index == 0)
		{
			head = head.getNext();	
		}
		else
		{
			node.setNext(node.getNext().getNext());
			if (index == size - 1)
			{
				tail = node;
			}
		}
		size -= 1;
		return true;		
	}
	
	public boolean remove(E item)
	{
		return remove(indexOf(item));		
	}
	
	public boolean contains(E o)
	{
		if (indexOf(o) == -1)
			return false;
		return true;
	}
	
	
	public int indexOf (E o)
	{
		ListNode<E> node = head;
		int num = 0;
		while (node != null && !( (o == null && node.getItem() == null) ||  node.getItem().equals(o)))
		{
			node = node.getNext();
			num +=1;
		}
		if (num == size)
			return -1;
		return num;
	}
	
	public void clear()
	{
		head = null;
		tail = null;
	}
	
	public E get(int i)
	{
		ListNode<E> node = head;
		int num = 0;
		while (num < i)
		{
			node = node.getNext();
			num+=1;
		}
		return node.getItem();
	}
	
	public E set(int i , E o)
	{
		add(i, o);
		E holder = get(i+1);
		remove(i + 1);
		return holder;
	}
	
	public boolean isEmpty()
	{
		if (head == null)
			return true;
		return false;
	}
	
	public String toString()
	{
		ListNode<E> node = head;
		String s = "";
		while (node != null)
		{
			s += node.toString();
			s+= "\n";
			node = node.getNext();
		}
		return s;
	
	}
	
	public void push(E item)
	{
		add(0, item);
		
	}
	
	public E pop()
	{
		E node = get(0);
		remove(0);
		return node;
	}
	
	public E peek()
	{
		return get(0);
	}
	
	public void offer(E item)
	{
		add(size, item);
	}
	
	public E poll()
	{
		E node = get(0);
		remove(0);
		return node;
	}
	
	public void addFirst(E item)
	{
		add(0, item);
	}
	
	public void addLast(E item)
	{
		add(item);
	}


	
}
