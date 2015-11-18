public class ListNode<E>
{
	private E item;
	private ListNode<E> next;
	
	public ListNode(E object, ListNode<E> pointer)
	{
		item = object;
		next = pointer;
	}
	
	public ListNode(E object)
	{
		this(object, null);
	}
	
	public E getItem()
	{
		return item;
	}
	
	public ListNode<E> getNext()
	{
		return next;
	}
	
	public void setItem(E object)
	{
		item = object;
	}
	
	public void setNext(ListNode<E> pointer)
	{
		next = pointer;
	}
	
	public String toString()
	{
		if (item != null)
			return item.toString();
		return "null";
	}

// two constructors, one with item one with both
// getters and setters




}