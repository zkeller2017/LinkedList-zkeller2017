/**
	The Runner class tests out code in the Linked List class
	@author Zachary Keller
	@version final
*/
public class Runner
{
	public static void main(String [] args)
	{
		/*
		LinkedList<String> v = new LinkedList<String>();
		v.add("1");
		v.remove(0);
		System.out.println("head " + v.head);
		System.out.println("tail " + v.tail);
		System.out.println(v);
		*/
		
		LinkedList<String> v = new LinkedList<String>();
		v.add("1st");
		v.add("2nd");
		v.add(null);
		v.add("4th");
		v.add("5th");
		v.add(2,"6th");
		v.add(5,"7th");
		System.out.println(v);
		System.out.println("IndexOfNullThere " + v.indexOf(null));
		System.out.println(v);
		System.out.println("Get: " + v.get(3));
		System.out.println(v);
		System.out.println("RemoveIndex: " + v.remove(3));
		System.out.println(v);
		System.out.println("RemoveValue: " + v.remove("1st"));
		System.out.println(v);	
		System.out.println("IndexOfNullNotThere " + v.indexOf(null));
		System.out.println(v);
		System.out.println("Set: " + v.set(1, "New"));
		System.out.println(v);
		System.out.println("ContainsNo: " + v.contains("3rd"));
		System.out.println(v);
		System.out.println("ContainsYes: " + v.contains("2nd"));
		System.out.println(v);
		System.out.println("isEmptyNo: " + v.isEmpty());
		System.out.println(v);
		System.out.println("clear: ");
		v.clear();
		System.out.println(v);
		System.out.println("isEmptyYes: " + v.isEmpty());
		System.out.println(v);
		v.add("1st");
		System.out.println("Another 1: ");
		System.out.println(v);
		v.add("2nd");
		System.out.println("Another 2: ");
		System.out.println(v);
		LinkedList<String> n = new LinkedList<String>(v);
		System.out.println("N:");
		System.out.println(n);
		System.out.println("V:");
		System.out.println(n);
		n.add("3rd");
		System.out.println("N after adding a third:");
		System.out.println(n);
		System.out.println("The same V:");
		System.out.println(v);
		
		for (String iter : n)
		{
			System.out.println("For Each: " + iter);
		}
		System.out.println("\n");
		

		Queue<String> q = new LinkedList<String>();
		q.offer("1st");
		q.offer("2nd");
		q.offer("3rd");
		q.offer("4th");
		System.out.println("Poll: " + q.poll());
		System.out.println(q);
		System.out.println("Peek: " + q.peek());
		System.out.println(q);
		
		Stack<String> s = new LinkedList<String>();
		s.push("1st");
		s.push("2nd");
		s.push("3rd");
		s.push("4th");
		s.push("5th");
		System.out.println("Peek: " + s.peek());
		System.out.println(s);
		System.out.println("Pop: " + s.pop());
		System.out.println(s);
		
	}
}