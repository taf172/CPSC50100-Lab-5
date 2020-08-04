package lab_5;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadValues {

	public static void main(String[] args) {
		
		try {
			// Load file
			File f = new File("src/files/input.csv");
			
			// Print title
			System.out.println("Maximum values");
			
			// Count rows
			int row = 1;
			
			// Scan each line
			Scanner fileScan = new Scanner(f);
			while (fileScan.hasNext()) {
				
				// Read line as String[]
				String[] line = fileScan.nextLine().split(",");
				
				// Convert to int[]
				int[] intArr = new int[line.length];
				for (int i = 0; i < line.length; i++) {
					intArr[i] = Integer.parseInt(line[i]);
				}
				
				// Find max
				int max = intArr[0];
				for (int i = 0; i < intArr.length; i++) {
					if (intArr[i] > max) {
						max = intArr[i];
					}
				}
				
				// Print result
				System.out.println("ROW " + row + ": " + max);
				
				row++;
				
			}
			
			// Close scanner
			fileScan.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("FILE NOT FOUND");
		}

	}

}
