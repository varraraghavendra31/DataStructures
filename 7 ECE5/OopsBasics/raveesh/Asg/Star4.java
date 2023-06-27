import java.util.Scanner;
class Star4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter size:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for (int i=1;i<=size;i++) {
			for(int j=i;j<=size;j++) {
				//above line is important to do
					System.out.print("* ");
			}
			System.out.println();
		}
			
	}

}
