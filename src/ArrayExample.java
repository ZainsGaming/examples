public class ArrayExample {
	
	public static void main(String[] args){
		
		int[] intArray = new int [5];
		intArray[0] = 10;
		intArray[1] = 11;
		intArray[2] = 12;
		intArray[3] = 13;
		intArray[4] = 14;
		
		for (int i = 0; i < 5; i++){
			System.out.println(intArray[i]);
		}
		
		String[] strArray = new String[2];
		strArray[0] = "Hello";
		strArray[1] = "World";
		
		for (int i = 0; i < 2; i++){
			System.out.println(strArray[i]);
		}
		
		int[][] newArray = new int [4][5];
		int counter = 100;
		
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 5; j++){
				newArray[i][j] = counter++;
			}
		}
		
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 5; j++){
				System.out.print(newArray[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}