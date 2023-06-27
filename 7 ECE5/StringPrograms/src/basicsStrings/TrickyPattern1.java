package basicsStrings;
import java.util.Scanner;

public class TrickyPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		** Printing the pattern... **
//		1 
//		1 4 
//		1 8 27 
//		1 16 81 256
				Scanner scanner = new Scanner(System.in);
				// Get the number of rows from the user
				System.out.println("Enter the number of rows to print the pattern ");
				int rows = scanner.nextInt();

				System.out.println("** Printing the pattern... **");

				for (int i = 1; i <= rows; i++)
				{
					for (int j = 1; j <= i; j++)
					{
						System.out.print((int) Math.pow(j, i) + " ");
					}
					System.out.println();
				}
			}
	}


