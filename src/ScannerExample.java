import java.util.Scanner;

public class ScannerExample{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		String input = keyboard.nextLine();
		System.out.println("The input was: " + input);
		
		System.out.println("Please enter a number: ");
		int num = keyboard.nextInt();
		
		for (int count = 0; count <= 10; count++){
			System.out.println(num + " X " + count + " = " + (num*count));
		}
	}
}