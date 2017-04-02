import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args){
		//Initialize scanner
		Scanner scanner = new Scanner(System.in);
		
		//Initialize grid
		String[][] grid = new String[3][3];
		int count = 0;
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				grid[i][j] = count + "";
				count++;
			}
		}
		
		//initialize flags
		boolean finished = false;
		boolean xTurn = true;
		
		//Print the grid
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
		
		int turnCounter = 0;
		while (!finished){	//Keep looping until game is finished
			
			//Initialize user input variables
			int userInput;
			boolean done = false;
			
			while (!done){	//Keep looping until we have valid input
				
				//Print whose turn it is
				if (xTurn){
					System.out.print("X ");
				} else {
					System.out.print("O ");
				}
				
				//Prompting user for input
				System.out.print("Enter location: ");
				userInput = scanner.nextInt();
				
				//Translate input to row/col values
				int row = userInput / 3;
				int col = userInput % 3;
				
				//Checking if input is valid
				if (userInput < 9 && userInput > -1 && 
					! (grid[row][col].equals("X") || grid[row][col].equals("O"))){
					
					//Update grid
					if (xTurn){
						grid[row][col] = "X";
					} else {
						grid[row][col] = "O";
					}
					
					turnCounter++;//Increment counter
					done = true;
				}
			}
			
			//Print the grid after user input
			for (int i = 0; i < 3; i++){
				for (int j = 0; j < 3; j++){
					System.out.print(grid[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			
			//Checking for win conditions
			if (grid[0][0].equals(grid[0][1]) && grid[0][0].equals(grid[0][2])){
				//Check first row
				System.out.println(grid[0][0] + " wins");
				finished = true;
			} else if (grid[1][0].equals(grid[1][1]) && grid[1][0].equals(grid[1][2])){
				//Check second row
				System.out.println(grid[1][0] + " wins");
				finished = true;
			} else if (grid[2][0].equals(grid[2][1]) && grid[2][0].equals(grid[2][2])){
				//Check third row
				System.out.println(grid[2][0] + " wins");
				finished = true;
			} else if (grid[0][0].equals(grid[1][0]) && grid[0][0].equals(grid[2][0])){
				//Check first column
				System.out.println(grid[0][0] + " wins");
				finished = true;
			} else if (grid[0][1].equals(grid[1][1]) && grid[0][1].equals(grid[2][1])){
				//Check second column
				System.out.println(grid[0][1] + " wins");
				finished = true;
			} else if (grid[0][2].equals(grid[1][2]) && grid[0][2].equals(grid[2][2])){
				//Check third column
				System.out.println(grid[0][2] + " wins");
				finished = true;
			} else if (grid[0][0].equals(grid[1][1]) && grid[0][0].equals(grid[2][2])){
				//Check diagonal - top left to bottom right
				System.out.println(grid[0][0] + " wins");
				finished = true;
			} else if (grid[0][2].equals(grid[1][1]) && grid[0][2].equals(grid[2][0])){
				//Check diagonal - top right to bottom left
				System.out.println(grid[0][2] + " wins");
				finished = true;
			} else if (turnCounter == 9){
				// Game draw
				System.out.println("Draw!");
				finished = true;
			}
			
			//Switch the turn - X to O and vice-versa.
			xTurn = !xTurn;
			
		}
		
	}
}