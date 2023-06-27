package basicsStrings;
import java.util.Scanner;
public class TrickyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 	1 
//		   3 2 
//		  4 5 6 
//		 10 9 8 7 
//		11 12 13 14 15
				int currentRow = 1;
				int counter = 1;
				// Create a new Scanner object
				Scanner scanner = new Scanner(System.in);
				// Get the number of rows from the user
				System.out.println("Enter the number of rows to print the pattern ");
				int rows = scanner.nextInt();

				System.out.println("** Printing the pattern... **");
				for (int i = 1; i <= rows; i++)
				{ 
//					for (int l = rows; l > i; l--)
//					{
//						System.out.print(" ");
//					}
					if (i % 2 == 0)
					{
						int reverse = currentRow + counter - 1;
						for (int j = 1; j <= i; j++)
						{
							System.out.print(reverse-- + " ");
							counter++;
						}
					} else
					{
						for (int j = 1; j <= i; j++)
						{
							System.out.print(counter + " ");
							counter++;
						}
					}
					System.out.println();
					currentRow++;
				}
			}
		
	}


