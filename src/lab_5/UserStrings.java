package lab_5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.PrintWriter;

import java.util.Scanner;

public class UserStrings {

	public static void main(String[] args) {
		
		try {
			// Setup file writing
			FileWriter fw= new FileWriter("src/files/userStrings.txt");
			BufferedWriter bw= new BufferedWriter(fw);
			PrintWriter outFile = new PrintWriter(bw);
			
			// Ask for input
			System.out.println("Enter text (type DONE to quit): ");
			
			// Write to file
			Scanner scan = new Scanner(System.in);
			String line = scan.nextLine();
			while(!line.equals("DONE")) {
				outFile.print(line);
				outFile.println();
				
				System.out.println("test: " + line);
				line = scan.nextLine();
			}
			scan.close();
			
			// Close file
			System.out.println("Writting...");
			outFile.close();
			
		} catch (IOException e) {
			
		}
		
	}
}
