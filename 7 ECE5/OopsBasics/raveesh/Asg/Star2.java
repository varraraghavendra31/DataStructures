import java.util.Scanner;
class Star2{

	public static void main(String[] args) {
		System.out.println("enter size:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for (int i=1;i<=size;i++) {
			for(int j=size;j>=i;j--) {
				if(i<=j) System.out.print(" ");
				else System.out.print("* ");
				}
			System.out.println();
		}
			
	}

}
