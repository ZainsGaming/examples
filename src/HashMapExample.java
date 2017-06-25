import java.util.Collection;
import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args){
		
		//Create the 5 person objects
		Person p1 = new Person();
		p1.setName("Alice");
		p1.setAge(28);
		
		Person p2 = new Person();
		p2.setName("Bob");
		p2.setAge(29);
		
		Person p3 = new Person();
		p3.setName("Claire");
		p3.setAge(30);
		
		Person p4 = new Person();
		p4.setName("Dan");
		p4.setAge(31);
		
		Person p5 = new Person();
		p5.setName("Eastman");
		p5.setAge(32);
		
		//Generat the map
		HashMap<Person, String> map = new HashMap<Person, String>();
		map.put(p1, "Hello");
		map.put(p2, "World!");
		map.put(p3, "Welcome");
		map.put(p4, "To");
		map.put(p5, "Java Games Programming");
		
		//Print the values based on desired order
		System.out.println("DESIRED ORDER:");
		System.out.print(map.get(p1) + " ");
		System.out.print(map.get(p2) + " ");
		System.out.print(map.get(p3) + " ");
		System.out.print(map.get(p4) + " ");
		System.out.print(map.get(p5) + " ");
		System.out.println("\n");
		
		//Print the values based on key set
		System.out.println("KEYSET ORDER:");
		for (Person p : map.keySet()){
			System.out.print(map.get(p) + " ");
		}
		System.out.println("\n");
		
		//Contains Key method
		System.out.println("CONTAINS KEY:");
		System.out.println("Does the map contain the key p1: " + map.containsKey(p1));
		
		Person p6 = new Person();
		p6.setName("Frank");
		p6.setAge(32);
		System.out.println("Does the map contain the key p6: " + map.containsKey(p6) + "\n");
		
		//Values method
		System.out.println("VALUES:");
		Collection<String> vals = map.values();
		for (String val : vals){
			System.out.print(val + " ");
		}
		System.out.println("\n");
		
		//Size
		System.out.println("SIZE:");
		System.out.println(map.size() + "\n");
		
		//Remove
		System.out.println("REMOVE:");
		System.out.println(map.remove(p1));
		System.out.println(map.remove(p3));
		System.out.println(map.remove(p6));
		System.out.println("New size: " + map.size() + "\n");
		
		//IS EMPTY
		System.out.println("IS EMPTY:");
		System.out.println("Is the map empty: " + map.isEmpty());
		map.remove(p2);
		map.remove(p4);
		map.remove(p5);
		System.out.println("Is the map empty now: " + map.isEmpty());
		
		//Put Return value
		System.out.println("PUT RETURN VALUE:");
		System.out.println("Put p1: " + map.put(p1, "Hello"));
		System.out.println("Update p1 value: " + map.put(p1, "World"));
		System.out.println("Check p1 value: " + map.get(p1));
		
		
	}
}
