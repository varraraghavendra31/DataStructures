package basicsStrings;
import java.util.Scanner;
public class PascalPattern {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		** Printing the pattern... **
//		1 
//		1 1 
//		1 2 1 
//		1 3 3 1 
//		1 4 6 4 1
		 Scanner scanner = new Scanner(System.in);

	        // Get the number of rows from the user
	        System.out.println("Enter the number of rows to print the pattern ");

	        int rows = scanner.nextInt();
	        System.out.println("** Printing the pattern... **");
	        for (int i = 0; i < rows; i++)
	        {
	        	int num = 1;
	            for (int j = 0; j <= i; j++)
	            {
	            	if(i ==0 || j ==0||i==j)
	            		num = 1;
	            	else
	            		num = num * (i - j + 1)/ j;
	                System.out.print(num + " ");
	            }
	            System.out.println();
	        }
	    }

	}


