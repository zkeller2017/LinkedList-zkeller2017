
public class Runner
{
	public static void main(String [] args)
	{
	/*
		LinkedList<String> v = new LinkedList<String>();
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.remove(0);
		System.out.println("head " + v.head);
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
		LinkedList<String> s = new LinkedList<String>(v);
		System.out.println("S:");
		System.out.println(s);
		
	}
}