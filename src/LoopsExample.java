public class LoopsExample{
	public static void main(String[] args){
	
		for (int count = 1; count <= 100; count++){
			System.out.println(count);
		}
		
		int count = 0;
		while (count < 0){
			System.out.println("While Loop " + count);
			count++;
		}
		
		count = 0;
		do {
			System.out.println("Do While Loop " + count);
			count++;
		} while (count < 0);
	}
}