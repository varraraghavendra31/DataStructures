import java.util.Scanner;
class Star5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter size:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for (int i=1;i<=size;i++) {
			for(int j=1;j<=i;j++) {
					System.out.print("* ");
			}
			System.out.println();
		}
			
	}

}
