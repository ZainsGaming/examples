import java.util.Scanner;

public class OddsEvens {
	public static void main(String[] args){
	
		Scanner keyboard =new Scanner(System.in);
		System.out.print("How many times do you want to play? ");

		boolean done = false;
		
		while (!done){
			
			System.out.print("Enter a value for numA: ");
			int numA = keyboard.nextInt();
			System.out.print("Enter a value for numB: ");
			int numB = keyboard.nextInt();
			int sum = numA + numB;
			
			System.out.println("numA = " + numA);
			System.out.println("numB = " + numB);
			System.out.println("sum = " + sum);
			
			if (sum % 2 == 0){
				System.out.println("Evens win!");
			} else {
				System.out.println("Odds win!");
			}
			
			System.out.print("Do you want to play again (1 = Yes, 2 = No)?");
			int response = keyboard.nextInt();
			
			if (response == 2){
				done = true;
			} else {
				done = false;
			}
			
		}
	
	}
}