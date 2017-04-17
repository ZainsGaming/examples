
public class PersonDriver {
	public static void main(String[] args){
			Person p1 = new Person();
			p1.setName("Alice");
			p1.setAge(21);
			
			Person p2 = new Person();
			p2.setName("Bob");
			p2.setAge(23);
			
			System.out.println("Person 1");
			System.out.println(p1.getName());
			System.out.println(p1.getAge());
			
			System.out.println("Person 2");
			System.out.println(p2.getName());
			System.out.println(p2.getAge());
	}
}
