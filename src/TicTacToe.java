import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		String[][] grid = new String[3][3];
		int count = 0;
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				grid[i][j] = count + "";
				count++;
			}
		}
		
		boolean finished = false;
		boolean xTurn = true;
		
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
		
		int turnCounter = 0;
		while (!finished){
				
			int userInput;
			boolean done = false;
			
			while (!done){
				
				if (xTurn){
					System.out.print("X ");
				} else {
					System.out.print("O ");
				}
				
				System.out.print("Enter location: ");
				userInput = scanner.nextInt();
				
				int row = userInput / 3;
				int col = userInput % 3;
				
				if (userInput < 9 && userInput > -1 && 
					! (grid[row][col].equals("X") || grid[row][col].equals("O"))){
					
					if (xTurn){
						grid[row][col] = "X";
					} else {
						grid[row][col] = "O";
					}
					
					turnCounter++;
					
					done = true;
				}
			}
			
			for (int i = 0; i < 3; i++){
				for (int j = 0; j < 3; j++){
					System.out.print(grid[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			
			if (grid[0][0].equals(grid[0][1]) && grid[0][0].equals(grid[0][2])){
				System.out.println(grid[0][0] + " wins");
				finished = true;
			} else if (grid[1][0].equals(grid[1][1]) && grid[1][0].equals(grid[1][2])){
				System.out.println(grid[1][0] + " wins");
				finished = true;
			} else if (grid[2][0].equals(grid[2][1]) && grid[2][0].equals(grid[2][2])){
				System.out.println(grid[2][0] + " wins");
				finished = true;
			} else if (grid[0][0].equals(grid[1][0]) && grid[0][0].equals(grid[2][0])){
				System.out.println(grid[0][0] + " wins");
				finished = true;
			} else if (grid[0][1].equals(grid[1][1]) && grid[0][1].equals(grid[2][1])){
				System.out.println(grid[0][1] + " wins");
				finished = true;
			} else if (grid[0][2].equals(grid[1][2]) && grid[0][2].equals(grid[2][2])){
				System.out.println(grid[0][2] + " wins");
				finished = true;
			} else if (grid[0][0].equals(grid[1][1]) && grid[0][0].equals(grid[2][2])){
				System.out.println(grid[0][0] + " wins");
				finished = true;
			} else if (grid[0][2].equals(grid[1][1]) && grid[0][2].equals(grid[2][0])){
				System.out.println(grid[0][2] + " wins");
				finished = true;
			} else if (turnCounter == 9){
				System.out.println("Draw!");
				finished = true;
			}
			
			xTurn = !xTurn;
			
		}
		
	}
}